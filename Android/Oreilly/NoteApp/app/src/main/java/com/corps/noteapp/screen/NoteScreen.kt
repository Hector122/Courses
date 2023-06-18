package com.corps.noteapp.screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.corps.noteapp.R
import com.corps.noteapp.components.NoteButton
import com.corps.noteapp.components.NoteInputText
import com.corps.noteapp.model.Note
import com.corps.noteapp.ui.theme.NoteAppTheme
import com.corps.noteapp.util.fromDate
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(notes: List<Note>, onAddNote: (Note) -> Unit, onRemoveNote: (Note) -> Unit) {
    var title by remember {
        mutableStateOf("")
    }

    var description by remember {
        mutableStateOf("")
    }

    val context = LocalContext.current

    Column(modifier = Modifier.padding(6.dp)) {
        TopAppBar(title = { Text(text = stringResource(id = R.string.app_name)) }, actions = {
            Icon(imageVector = Icons.Rounded.Notifications, contentDescription = "Notifications")
        }, modifier = Modifier.background(Color.Red))

        // Content
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NoteInputText(
                modifier = Modifier.padding(top = 9.dp, bottom = 8.dp),
                text = title,
                label = "Title",
                onTextChange = {
                    if (it.all { char -> char.isLetter() || char.isWhitespace() }) title = it
                })

            NoteInputText(text = description, label = "Add a note", onTextChange = {
                if (it.all { char -> char.isLetter() || char.isWhitespace() }) description = it
            })

            NoteButton(text = "Save", onClick = {
                if (title.isNotEmpty() && description.isNotEmpty()) {
                    onAddNote(Note(title = title, description = description))

                    Toast.makeText(context, "Note save", Toast.LENGTH_LONG).show()
                }
            })
        }

        Divider(modifier = Modifier.padding(10.dp))

        LazyColumn {
            items(notes) { note ->
                NoteRow(note = note) {
                    onRemoveNote(note)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
    NoteScreen(notes = emptyList(), onAddNote = {}, onRemoveNote = {})
}


@Composable
fun NoteRow(note: Note, onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .clip(shape = RoundedCornerShape(topEnd = 30.dp, bottomStart = 20.dp)),
        color = Color(0xFFBEC0E9)
    ) {
        Column(modifier = Modifier
            .clickable { onClick.invoke() }
            .padding(horizontal = 14.dp, vertical = 6.dp)) {

            Text(text = note.title, style = MaterialTheme.typography.bodyLarge)

            Text(text = note.description, style = MaterialTheme.typography.bodySmall)

            Text(
                text = fromDate(note.entryDate.time), style = MaterialTheme.typography.labelSmall
            )
        }
    }
}


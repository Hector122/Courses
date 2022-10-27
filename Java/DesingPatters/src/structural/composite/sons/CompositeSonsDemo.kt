package structural.composite.sons

class CompositeSonsDemo {
    fun main() {
        // Make  empty "Study" playlist
        val studyPlaylist = Playlist("Study")

        // Make "Synth Pop" playlist and add 2 songs to it.
        val synthPopPlaylist = Playlist("Synth Pop")
        val synthPopSong1 = Song("Girl Like You", "Toro Y Moi")
        val synthPopSong2 = Song("Outside", "TOPS")
        synthPopPlaylist.add(synthPopSong1)
        synthPopPlaylist.add(synthPopSong2)

        // Make "Experimental" playlist and add 3 songs to it,
        // then set playback speed of the playlist to 0.5x
        val experimentalPlaylist = Playlist("Experimental")
        val experimentalSong1 = Song("About you", "XXYYXX")
        val experimentalSong2 = Song("Motivation", "Clams Casino")
        val experimentalSong3 = Song("Computer Vision", "Oneohtrix Point Never")
        experimentalPlaylist.add(experimentalSong1)
        experimentalPlaylist.add(experimentalSong2)
        experimentalPlaylist.add(experimentalSong3)
        val slowSpeed = 0.5f
        experimentalPlaylist.setPlaybackSpeed(slowSpeed)

        // Add the "Synth Pop" playlist to the "Experimental" playlist
        experimentalPlaylist.add(synthPopPlaylist)

        // Add the "Experimental" playlist to the "Study" playlist
        studyPlaylist.add(experimentalPlaylist)

        // Create a  song and set its playback speed to 1.25x, play this song,
        // get the name of glitchSong → "Textuell", then get the artist of this song → "Oval"
        val glitchSong = Song ("Textuell", "Oval")
        val fasterSpeed = 1.25f
        glitchSong.setPlaybackSpeed(fasterSpeed)
        glitchSong.play()
        val name = glitchSong.getName()
        val artist = glitchSong.getArtist ()
        System.out.println("The song name is " + name)
        System.out.println("The song artist is " + artist)

        // Add glitchSong to the "Study" playlist
        studyPlaylist.add(glitchSong)

        // Play "Study" playlist.
        studyPlaylist.play()

        // Get the playlist name of studyPlaylist → "Study"
        System.out.println("The Playlist's name is " + studyPlaylist.getName())
    }
}
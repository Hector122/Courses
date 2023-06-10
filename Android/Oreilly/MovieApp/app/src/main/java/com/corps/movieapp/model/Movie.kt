package com.corps.movieapp.model

data class Movie(
    val id: String,
    val year: String,
    val gene: String,
    val director: String,
    val actor: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String,
    val title: String
)


fun movieList(): List<Movie> {
    return listOf(
        Movie(
            "1",
            "2001",
            "Action",
            "Christopher Nolan",
            "Christian Bale",
            "The Dark Knight is a superhero film...",
            "https://m.media-amazon.com/images/I/41kTVLeW1CL._AC_.jpg",
            listOf(
                "https://m.media-amazon.com/images/I/41kTVLeW1CL._AC_.jpg",
                "https://m.media-amazon.com/images/I/71iDbsYyvfL._AC_SL1500_.jpg",
                "https://m.media-amazon.com/images/I/41kTVLeW1CL._AC_.jpg",
                "https://m.media-amazon.com/images/I/41kTVLeW1CL._AC_.jpg"
            ),
            "8.9",
            "The Dark Knight"
        ),
        Movie(
            "2",
            "1994",
            "Drama",
            "Frank Darabont",
            "Tim Robbins",
            "The Shawshank Redemption is a...",
            "https://example.com/poster2.jpg",
            listOf(
                "https://example.com/image2_1.jpg",
                "https://example.com/image2_2.jpg",
                "https://example.com/image2_3.jpg",
                "https://example.com/image2_4.jpg"
            ),
            "9.3",
            "The Shawshank Redemption"
        ),
        Movie(
            "3",
            "2010",
            "Science Fiction",
            "Christopher Nolan",
            "Leonardo DiCaprio",
            "Inception is a science fiction action...",
            "https://example.com/poster3.jpg",
            listOf(
                "https://example.com/image3_1.jpg",
                "https://example.com/image3_2.jpg"
            ),
            "8.8",
            "Inception"
        ),
        Movie(
            "4",
            "1999",
            "Drama",
            "David Fincher",
            "Edward Norton",
            "Fight Club is a psychological thriller...",
            "https://example.com/poster4.jpg",
            listOf(
                "https://example.com/image4_1.jpg",
                "https://example.com/image4_2.jpg"
            ),
            "8.8",
            "Fight Club"
        ),
        Movie(
            "5",
            "1993",
            "Drama",
            "Steven Spielberg",
            "Liam Neeson",
            "Schindler's List is a historical drama...",
            "https://example.com/poster5.jpg",
            listOf(
                "https://example.com/image5_1.jpg",
                "https://example.com/image5_2.jpg"
            ),
            "8.9",
            "Schindler's List"
        ),
        Movie(
            "6",
            "1972",
            "Crime",
            "Francis Ford Coppola",
            "Marlon Brando",
            "The Godfather is a crime film...",
            "https://example.com/poster6.jpg",
            listOf(
                "https://example.com/image6_1.jpg",
                "https://example.com/image6_2.jpg"
            ),
            "9.2",
            "The Godfather"
        ),
        Movie(
            "7",
            "1994",
            "Crime",
            "Quentin Tarantino",
            "John Travolta",
            "Pulp Fiction is a neo-noir crime...",
            "https://example.com/poster7.jpg",
            listOf(
                "https://example.com/image7_1.jpg",
                "https://example.com/image7_2.jpg"
            ),
            "8.9",
            "Pulp Fiction"
        ),
        Movie(
            "8",
            "2014",
            "Adventure",
            "Christopher Nolan",
            "Matthew McConaughey",
            "Interstellar is a science fiction...",
            "https://example.com/poster8.jpg",
            listOf(
                "https://example.com/image8_1.jpg",
                "https://example.com/image8_2.jpg"
            ),
            "8.6",
            "Interstellar"
        ),
        Movie(
            "9",
            "1977",
            "Science Fiction",
            "George Lucas",
            "Mark Hamill",
            "Star Wars is an epic space opera...",
            "https://example.com/poster9.jpg",
            listOf(
                "https://example.com/image9_1.jpg",
                "https://example.com/image9_2.jpg"
            ),
            "8.6",
            "Star Wars"
        ),
        Movie(
            "10",
            "1995",
            "Crime",
            "Bryan Singer",
            "Kevin Spacey",
            "The Usual Suspects is a neo-noir...",
            "https://example.com/poster10.jpg",
            listOf(
                "https://example.com/image10_1.jpg",
                "https://example.com/image10_2.jpg"
            ),
            "8.5",
            "The Usual Suspects"
        )
    )
}

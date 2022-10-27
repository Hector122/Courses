package structural.composite.sons

interface IComposite {
    fun play()
    fun setPlaybackSpeed(speed: Float)
    fun getName(): String
}

class Song(
    private val sonName: String,
    private val artist: String,
    var speed: Float = 1.0f // default speed.
) : IComposite {


    override fun play() {
        TODO("Not yet implemented")
        //implement play son
    }

    override fun setPlaybackSpeed(speed: Float) {
        this.speed = speed
    }

    override fun getName(): String {
        return sonName
    }

    fun getArtist(): String {
        return artist
    }
}

class Playlist(private val playListName: String) : IComposite {
    val playList = ArrayList<IComposite>()


    override fun play() {
        for (song in playList) {
            song.play()
        }
    }

    override fun setPlaybackSpeed(speed: Float) {
        for (song in playList) {
            song.setPlaybackSpeed(speed)
        }
    }

    override fun getName(): String {
        return playListName
    }

    fun add(value: IComposite) {
        playList.add(value)
    }

    fun delete(value: IComposite) {
        playList.remove(value)
    }
}
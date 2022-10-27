package structural.facade.store

class ComplexSystemStore(private val filePath: String) {
    private val cache: HashMap<String, String>

    init {
        println("Reading data form file: $filePath")
        cache = HashMap()
        //simulate read properties from file and put in cache
    }

    fun store(key: String, value: String) {
        cache[key] = value
    }

    fun read(key: String): String {
        return cache[key] ?: ""
    }

    fun commit(){
        println("store the cache data to file: $filePath")
    }
}

//Data class user
data class User(val login: String)

/** Facade **/
class UserRepository{
    private val systemPreferences = ComplexSystemStore("/data/defaults.prefs")

    fun save(user: User){
        systemPreferences.store("USER_KEY", user.login)
        systemPreferences.commit()
    }

    fun findFirst(): User = User(systemPreferences.read("USER_KEY"))
}
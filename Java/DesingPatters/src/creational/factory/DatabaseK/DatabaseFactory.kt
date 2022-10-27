package creational.factory.DatabaseK





// common interface available for clients
interface DataBase {
    fun save(item: Any)
    fun getItem(id: Int)
}


class MySqlConfig : DataBase {
    override fun save(item: Any) {
        println("Save $item in MySql")
    }

    override fun getItem(id: Int) {
        println("get $id from MySql")
    }
}

class Realm() : DataBase {
    override fun save(item: Any) {
        println("Save $item in Realm")
    }

    override fun getItem(id: Int) {
        println("get $id from Realm")
    }
}

class MongoDb : DataBase {
    override fun save(item: Any) {
        println("Save $item in MongoDb")
    }

    override fun getItem(id: Int) {
        println("get $id from MongoDb")
    }
}
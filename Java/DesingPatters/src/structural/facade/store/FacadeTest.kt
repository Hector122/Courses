package structural.facade.store

import org.junit.Assert
import org.junit.Test


class FacadeTest {
    @Test
    fun testFacade(){
        val repository = UserRepository()
        val user = User("John")

        repository.save(user)

        val retrieveUser = repository.findFirst()

        Assert.assertEquals(retrieveUser.login, "John")
    }
}
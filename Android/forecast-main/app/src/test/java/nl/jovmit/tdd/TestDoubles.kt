package nl.jovmit.tdd

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test


class TestDoubles {

    interface EmailValidator {
        fun validator(email: String): Boolean
    }

    class AuthorizationSystem(private val emailValidator: EmailValidator) {
        fun authorizedUsersCount(): Int {
            return 0
        }

        fun authorize(email: String, password: String): Boolean {
            if (emailValidator.validator(email)) {
                return email.isNotBlank() && password.isNotBlank()
            }
            return false
        }
    }

    @Test
    fun noAuthorizedUsersInitially() {
        val system = AuthorizationSystem(DummyEmailValidator())

        val authorizedUsersCount = system.authorizedUsersCount()

        assertThat(authorizedUsersCount).isEqualTo(0)
    }

    @Test
    fun successfullyAuthorization() {
        val email = "an email"
        val password = "a password"
        val emailValidator = AcceptingEmailValidationSpy()
        val system = AuthorizationSystem(emailValidator)

        val authorizationResult = system.authorize(email, password)

        assertThat(authorizationResult).isTrue()
        assertThat(emailValidator.validationWasCalled).isTrue()
    }

    class AcceptingEmailValidationSpy : EmailValidator {

        var validationWasCalled = false

        override fun validator(email: String): Boolean {
            validationWasCalled = true
            return true
        }

    }

    //Stub test double
    class AcceptingEmailValidator : EmailValidator {
        override fun validator(email: String): Boolean {
            return true
        }
    }

    class DummyEmailValidator : EmailValidator {
        override fun validator(email: String): Boolean {
            TODO("Not yet implemented")
        }
    }
}















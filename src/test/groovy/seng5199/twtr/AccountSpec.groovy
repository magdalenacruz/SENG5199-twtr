package seng5199.twtr

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Account)
class AccountSpec extends Specification {

    def setup() {

    }

    void "Account saves name"() {
        when:
        def name = new Account(handle: 'mikeg008', email: 'galvi024@umn.edu', password: 123456789, name: 'Mike')

        then:
        name.validate()
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }
}

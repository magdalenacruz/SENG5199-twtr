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

    void "User enters everything correctly"() {
        when: 'should pass when all parameters are created as expected'
        def name = new Account(handle: 'mikeg008', email: 'galvi024@umn.edu', password: 'abcdefgH1', name: 'Mike')

        then: 'validation should pass'
        name.validate()
    }
    void "Handle is blank"() {
        when: 'should fail when handle is blank'
        def name = new Account(handle: '', email: 'galvi024@umn.edu', password: 123456789, name: 'Mike')

        then: 'validation should fail'
        !name.validate()
    }

    void "Email is blank"() {
        when: 'should fail when email is blank'
        def name = new Account(handle: 'mikeg008', email: '', password: 123456789, name: 'Mike')

        then: 'validation should fail'
        !name.validate()
    }
    void "Password is blank"() {
        when: 'should fail when password is blank'
        def name = new Account(handle: 'mikeg008', email: 'galvi024@umn.edu', password: '', name: 'Mike')

        then: 'validation should fail'
        !name.validate()
    }
    void "Name is blank"() {
        when: 'should fail when name is blank'
        def name = new Account(handle: 'mikeg008', email: 'galvi024@umn.edu', password: 123456789, name: '')

        then: 'validation should fail'
        !name.validate()
    }
    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }
}

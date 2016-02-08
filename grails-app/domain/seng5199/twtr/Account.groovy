package seng5199.twtr

class Account {
    String handle
    String email
    String password
    String name


    static constraints = {
        handle nullable: false, unique: true
        email nullable: false, email: true, unique:true
        password nullable: false, size: 8..16
        name nullable: false
    }
}

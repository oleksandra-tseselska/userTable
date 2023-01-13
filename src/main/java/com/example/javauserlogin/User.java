package User;/*
        Create a user profile management system
        User.User (firstname, lastname, email, phone, address, gender, age, password, USERNAME(firstname + lastname + last 2 digits of phone))
        SIGNUP, LOGIN(username, password), UPDATE(id), DELETE(id) [CRUD]
     */


public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private String address;
    private Gender gender;
    private Integer age;
    private String password;
    private String USERNAME;

    public User (String firstName, String lastName, String email, int phone, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public User (String firstName, String lastName, String email, int phone, String address,
                 Gender gender, Integer age, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }




    @Override
    public String toString() {
        return "User{ "+ firstName + " " + lastName + " " + phone + " " + "}";
    }
}


package mmn.poepartone;


public class Login {

    //getters and setters for the variables
    private String name;
    private String Lastname;
    private String Username;
    private String password;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //a boolean method that checks the username complexity
    public boolean checkUsernameComplexity(String username) {

        return username.contains("_") && username.length() <= 5;
    }

    //a boolean method that checks the password complexity
    public boolean CheckPasswordComplexity(String password) {

        return password.length() >= 8 && password.length() <= 25 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*().]*");

    }

     //a boolean method that checks the if the usersname and password are found
    public boolean LoginUser(String Username, String password) {
        return Username.equals(this.Username) && password.equals(this.password);
    }

    // a method that checks if the user has registered successfully
    public String RegisterUser(String username, String Password) {

        if (!checkUsernameComplexity(username) && CheckPasswordComplexity(Password)) {
            return "Username is not correctly formatted";
        } else if (checkUsernameComplexity(username) && !CheckPasswordComplexity(Password)) {
            return "password is not correctly formatted";
        } else {
            return "Registration successful";
        }

    }

     //a boolean method that checks the Phonenumber complexity
    public boolean CheckPhoneNumberComplexity(String phone_number) {
        return phone_number.matches("^\\+27\\d{9}$");
    }

    // a method that returns a successfull message is the user has loged in successfully
    public String ReturnLoginStatus(boolean loginSuccessful) {
        if (loginSuccessful) {
            return "Welcome " + getName() + " " + getLastname() + " it is great to see you again";
        } else {
            return "Username or password incorrect please try again";
        }
    }

}


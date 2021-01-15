package model;

public class User {

    private int id;
    private String name;
    private String email;
    private String phoneNumber;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String s) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

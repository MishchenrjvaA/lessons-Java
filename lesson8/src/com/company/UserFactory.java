package com.company;

public class UserFactory {
    private boolean isBlocked = false;

    public UserFactory signIn(String login) {
        System.out.println("User sign in as" + login);
        return this; //указатель на текущи йобъект
    }

    public UserFactory sentMessage(String message) {
        if (this.isBlocked) {
        System.out.println("Usre is blocked");
    } else {
        System.out.println("User recived a message :"  + message);
        }
        return this;
    }

    public UserFactory activate() {
        this.isBlocked = false;
        return this;
    }

    public UserFactory deactivate() {
        this.isBlocked = true;
        return this;

    }
    public void signOut(){
        System.out.println("user sign out");
    }

}
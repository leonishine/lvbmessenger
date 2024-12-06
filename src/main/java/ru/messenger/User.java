package ru.messenger;

public class User {
    private String nickname;
    private String name;
    private int password;
    private int phonenumber;

    public User(String nickname, String name, int phonenumber, int password) {
        this.nickname = nickname;
        this.name = name;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }
    public void setPassword(int password){
        this.password = password;

    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

}


 
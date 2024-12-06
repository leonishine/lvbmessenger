package ru.messenger;

public class User {
    private String nickname;
    private String name;
    private String password;
    private String phonenumber;

    public User(String nickname, String name, String phonenumber, String password) {
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

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;

    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

}


 
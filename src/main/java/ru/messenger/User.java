package ru.messenger;

public class User {
    public static void main(String[] args) {

    }
    public class Userinformation{
        private String nickname;
        private String name;
        private int phonenumber;
        private int password;

        public Userinformation(){}

        public Userinformation(String nickname, String name,int phonenumber, int password){
            this.nickname = nickname;
            this.name = name;
            this.password = password;
            this.phonenumber = phonenumber;


        }

        public String getNickname() {
            return nickname;

        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPassword() {
            return password;
        }

        public void setPhonenumber(int phonenumber) {
            this.phonenumber = phonenumber;
        }
    }
}
 
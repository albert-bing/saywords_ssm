package com.lxb.say.po;

public class User {
    private int id;
    private String useraccount;
    private String userpass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", useraccount='" + useraccount + '\'' +
                ", userpass='" + userpass + '\'' +
                '}';
    }
}

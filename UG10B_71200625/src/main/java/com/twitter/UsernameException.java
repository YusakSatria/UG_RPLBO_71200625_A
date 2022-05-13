package com.twitter;

public class UsernameException extends Exception{
    private int error_code ;
    private String error_message;
    public UsernameException (int error_code) {
        super();
        this.error_code = error_code;
        if(error_code==1) {
            this.error_message = "Username tidak boleh kosong!";
        }
        else if (error_code==2) {
            this.error_message = "Password minimal terdiri dari 6 karakter";
        }
        else if (error_code==3) {
            this.error_message = "Username hanya boleh terdiri dari huruf, angka, dan simbol underscore";
        }
    }
    public UsernameException (String error_message) {
        super (error_message);
    }
    public int geterror_code(){
        return this.error_code;
    }
    public String geterror_message() {
        return this.error_message;
    }
}
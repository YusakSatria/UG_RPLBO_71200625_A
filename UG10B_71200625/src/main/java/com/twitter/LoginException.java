package com.twitter;

public class LoginException extends Exception{
    private int error_code;
    private String error_message;
    public LoginException (int error_code) {
        super() ;
        this.error_code = error_code ;
        if(error_code==1) {
            this.error_message = "Username tidak boleh kosong!";
        }
        else if (error_code==2) {
            this.error_message = "Password tidak boleh kosong!";
        }
        else if(error_code==3) {
            this.error_message = "Username dan Password  harus sesuai dengan yang telah dibuat di awal program!";
        }
    }
    public LoginException (String error_message) {
        super(error_message);
    }
    public int geterror_code() {
        return this.error_code;
    }
    public String geterror_message() {
        return this.error_message;
    }
}
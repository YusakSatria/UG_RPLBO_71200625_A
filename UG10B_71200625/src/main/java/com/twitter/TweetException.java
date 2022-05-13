package com.twitter;

public class TweetException extends Exception{
    private int error_code;
    private String error_message;
    public TweetException (int error_code) {
        super() ;
        this.error_code = error_code ;
        if(error_code==1) {
            this.error_message = "Tweet tidak boleh kosong!";
        }
        else if(error_code==2) {
            this.error_message = "Tweet minimal harus terdiri dari 8 karakter dan maksimal 140 karakter";
        }
    }
    public TweetException (String error_message) {
        super(error_message);
    }
    public int geterror_code() {
        return this.error_code;
    }
    public String geterror_message() {
        return this.error_message;
    }
}
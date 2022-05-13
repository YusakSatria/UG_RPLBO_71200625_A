package com.twitter;

public class BioException extends Exception{
    private int error_code;
    private String error_message;

    public BioException(int error_code){
        super();
        this.error_code=error_code;
        if(error_code==1){
            this.error_message="Maaf, bio tidak boleh kosong";
        }
        else if(error_code==2){
            this.error_message="Maaf, bio minimal 5 karakter dan maksimal 30 karakter";
        }
        else if(error_code==3){
            this.error_message="Maaf, bio tidak boleh mengandung karakter spesial selain ., @, dan spasi";
        }
    }
    public String getError_message(){
        return error_message;
    }
}

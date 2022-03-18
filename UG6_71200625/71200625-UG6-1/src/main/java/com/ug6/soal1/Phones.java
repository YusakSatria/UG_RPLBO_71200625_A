package com.ug6.soal1;

public class Phones
{
    private String phoneName;
    private String phoneCode;
    private String companyCode;
    private String androidCode;
    private int ramCapacity;
    private int romCapacity;
    private float screenSize;
    private int cameraResolution;


    public Phones(final String phoneName, final String phoneCode, final String companyCode, final String androidCode) {
        this.setPhoneName(phoneName);
        this.setPhoneCode(phoneCode);
        this.setCompanyCode(companyCode);
        this.setAndroidCode(androidCode);
        this.ramCapacity = 0;
        this.romCapacity = 0;
        this.cameraResolution = 0;
    }

    public Phones(final String phoneName, final String phoneCode, final String companyCode, final String androidCode, final int ramCapacity, final int romCapacity, final int cameraResolution, final float screenSize) {
        this.setPhoneName(phoneName);
        this.setPhoneCode(phoneCode);
        this.setCompanyCode(companyCode);
        this.setAndroidCode(androidCode);
        this.setRamCapacity(ramCapacity);
        this.setRomCapacity(romCapacity);
        this.setScreenSize(screenSize);
        this.setCameraResolution(cameraResolution);
    }

    public String getPhoneName() {

        return this.phoneName;
    }

    public void setPhoneName(final String phoneName) {

        this.phoneName = phoneName;
    }

    public String getPhoneCode() {
        return
                this.phoneCode;
    }

    public void setPhoneCode(final String phoneCode) {

        this.phoneCode = phoneCode;
    }

    public String getCompanyCode() {
        return
                this.companyCode;
    }

    public void setCompanyCode(final String companyCode) {

        this.companyCode = companyCode;
    }

    public String getAndroidCode() {
        return
                this.androidCode;
    }

    public void setAndroidCode(final String androidCode) {

        this.androidCode = androidCode;
    }

    public int getRamCapacity() {

        return this.ramCapacity;
    }

    public void setRamCapacity(final int ramCapacity) {

        this.ramCapacity = ramCapacity;
    }

    public int getRomCapacity() {
        return this.romCapacity;
    }

    public void setRomCapacity(final int romCapacity) {

        this.romCapacity = romCapacity;
    }

    public float getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(final float screenSize) {
        this.screenSize = screenSize;
    }

    public int getCameraResolution() {

        return this.cameraResolution;
    }

    public void setCameraResolution(final int cameraResolution) {

        this.cameraResolution = cameraResolution;
    }




}
package com.example.CloudVendorAPI.models;

public class CloudVendor {
    String vendorId;
    String vendorName;
    String vendorAddress;
    String phoneNumber;



    public CloudVendor(String vendorId,String phoneNumber , String vendorName,String vendorAddress) {
        this.vendorId = vendorId;
        this.phoneNumber = phoneNumber;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
    }
    public CloudVendor() {
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}

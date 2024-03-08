/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.companyinfo;

/**
 *
 * @author LENOVO
 */
public class CompanyInfo {

    private static CompanyInfo instance;
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;
    private String owner;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private CompanyInfo() {
        this.companyName = "MyCompany";
        this.address = "123 Main Street, City, Country";
        this.phoneNumber = "123-456-789";
        this.email = "info@eiu.edu.vn";
        this.owner = "Nguyen Van A";
    }

    public static synchronized CompanyInfo getInstance() {
        if (instance == null) {
            instance = new CompanyInfo();
        }
        return instance;
    }

    public void displayInfo() {
        System.out.println("Companu Name: " + companyName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Owner: " + owner);
    }

}

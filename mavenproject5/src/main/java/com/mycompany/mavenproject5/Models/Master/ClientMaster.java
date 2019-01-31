/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialschedule.Models.Master;

import com.mycompany.socialschedule.Models.Base.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 *
 * @author Tabassum Naaz
 */
@Entity
@Table(name="ClientMaster")
public class ClientMaster extends BaseEntity{
    
    private String name;
    private String emailId;
    private String mobileNumber;
    private String address;
    private String dateOfBirth;
    private String lastEmailSent;
    private String lastSmsSent;
    @OneToOne
    private ClientType clientType;
    public String getLastEmailSent() {
        return lastEmailSent;
    }

    public void setLastEmailSent(String lastEmailSent) {
        this.lastEmailSent = lastEmailSent;
    }

    public String getLastSmsSent() {
        return lastSmsSent;
    }

    public void setLastSmsSent(String lastSmsSent) {
        this.lastSmsSent = lastSmsSent;
    }
    
    
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    /**
     * @return the email
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @return the mobileNumber
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * @param mobileNumber the mobileNumber to set
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the clientType
     */
    public ClientType getClientType() {
        return clientType;
    }

    /**
     * @param clientType the clientType to set
     */
    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }
    
    
}

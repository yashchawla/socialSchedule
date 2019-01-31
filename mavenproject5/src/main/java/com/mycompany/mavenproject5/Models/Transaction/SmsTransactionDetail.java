/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialschedule.Models.Transaction;

import com.mycompany.socialschedule.Models.Master.ClientMaster;
import com.mycompany.socialschedule.Models.Master.SmsMaster;
import com.mycompany.socialschedule.Models.Transaction.SmsTransaction;
import java.util.Date;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Tabassum Naaz
 */
public class SmsTransactionDetail {
    private String mobileNumber;
    
    @OneToOne
      private SmsMaster smsMaster;
    
    private String content;
      
      @OneToOne
      private ClientMaster clientId;
      
      
      private Boolean isScheduled;
      private String scheduledType;
      private Date scheduledTime;
      
      @ManyToOne(fetch=FetchType.EAGER)
      @JoinColumn(name="smsTransactionId",nullable=false)
      private SmsTransaction smsTransactionId;
      

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public boolean isIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public String getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(String scheduledType) {
        this.scheduledType = scheduledType;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
      
      
      
      
      


    public SmsMaster getSmsMaster() {
        return smsMaster;
    }

    public void setSmsMaster(SmsMaster smsMaster) {
        this.smsMaster = smsMaster;
    }

    public ClientMaster getClientId() {
        return clientId;
    }

    public void setClientId(ClientMaster clientId) {
        this.clientId = clientId;
    }

    public SmsTransaction getSmsTransactionId() {
        return smsTransactionId;
    }

    public void setSmsTransactionId(SmsTransaction smsTransactionId) {
        this.smsTransactionId = smsTransactionId;
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
      
     
}

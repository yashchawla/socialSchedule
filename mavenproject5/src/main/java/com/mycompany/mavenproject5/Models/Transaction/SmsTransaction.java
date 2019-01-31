/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialschedule.Models.Transaction;

import com.mycompany.socialschedule.Models.Master.UserMaster;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Tabassum Naaz
 */
public class SmsTransaction {
    private Date sendDate;
    private Boolean isScheduled;
    
    
    @OneToMany
    private List<SmsTransaction> smsDetails = new ArrayList();
    
    public List<SmsTransaction> getSmsDetails() {
        return smsDetails;
    }

    public void setSmsDetails(List<SmsTransaction> smsDetails) {
        this.smsDetails = smsDetails;
    }
    
        @OneToOne
    private UserMaster createdUser;
    
    

   
    public boolean isIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    

    public UserMaster getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(UserMaster createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * @return the sendDate
     */
    public Date getSendDate() {
        return sendDate;
    }

    /**
     * @param sendDate the sendDate to set
     */
    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
  
      
}

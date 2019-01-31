/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialschedule.Models.Transaction;

import com.mycompany.socialschedule.Models.Base.BaseEntity;
import com.mycompany.socialschedule.Models.Master.UserMaster;
import com.mycompany.socialschedule.Models.Master.UserMaster;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Tabassum Naaz
 */
@Entity
@Table(name="EmailTransaction")
public class EmailTransaction extends BaseEntity {
  
    
    private Date sendDate;
     private Boolean isScheduled;
    
    @OneToMany
    private List<EmailTransaction> emailDetails = new ArrayList();
    
    @OneToOne
    private UserMaster createdUser;

    public List<EmailTransaction> getEmailDetails() {
        return emailDetails;
    }

    public void setEmailDetails(List<EmailTransaction> emailDetails) {
        this.emailDetails = emailDetails;
    }

    public UserMaster getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(UserMaster createdUser) {
        this.createdUser = createdUser;
    }
   

    /**
     * @return the emailId
     */
   

    

    /**
     * @return the isScheduled
     */
    public boolean isIsScheduled() {
        return isScheduled;
    }

    /**
     * @param isScheduled the isScheduled to set
     */
    public void setIsScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
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

    /**
     * @return the scheduledTime
 */
    
}

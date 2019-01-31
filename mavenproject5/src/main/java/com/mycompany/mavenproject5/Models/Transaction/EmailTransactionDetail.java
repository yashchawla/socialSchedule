/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialschedule.Models.Transaction;

import com.mycompany.socialschedule.Models.Transaction.EmailTransaction;
import com.mycompany.socialschedule.Models.Base.BaseEntity;
import com.mycompany.socialschedule.Models.Master.ClientMaster;
import com.mycompany.socialschedule.Models.Master.EmailMaster;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Tabassum Naaz
 */
@Entity
@Table(name = "EmailTransactionDetail")
public class EmailTransactionDetail extends BaseEntity {

    private String emailId;

    @OneToOne
    private EmailMaster emailMaster;

    @OneToOne
    private ClientMaster clientId;
    
    private String content;
    private String subject;
    private String filePath;
    
    private Boolean isScheduled;
    private String scheduledType;   //create enum
    
    private Date scheduledTime;
     
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "emailTransactionId", nullable = false)
    private EmailTransaction emailTransactionId;
    
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public EmailMaster getEmailMaster() {
        return emailMaster;
    }

    public void setEmailMaster(EmailMaster emailMaster) {
        this.emailMaster = emailMaster;
    }

    public ClientMaster getClientId() {
        return clientId;
    }

    public void setClientId(ClientMaster clientId) {
        this.clientId = clientId;
    }

    public EmailTransaction getEmailTransactionId() {
        return emailTransactionId;
    }

    public void setEmailTransactionId(EmailTransaction emailTransactionId) {
        this.emailTransactionId = emailTransactionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
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

   
    

  

   

}

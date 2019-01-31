/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialschedule.Models.Master;

import com.mycompany.socialschedule.Models.Base.BaseEntity;
import com.mycompany.socialschedule.Models.ModelEnums;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Tabassum Naaz
 */
@Entity
@Table(name="EmailMaster")
public class EmailMaster extends BaseEntity {
   
    private String subject;
    private String content;
    private String signature; 
    
    private ModelEnums.EmailType emailType;

    public ModelEnums.EmailType getEmailType() {
        return emailType;
    }
   

    public void setEmialType(ModelEnums.EmailType emailType) {
        this.emailType = emailType;
    }

    /**
     * @return the emailId
     */
    

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @param signature the signature to set
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * @return the attachment
     */
   
  
    
    
}

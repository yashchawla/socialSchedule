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
@Table(name="SmsMaster")
public class SmsMaster extends BaseEntity {
   
    
    private String content;
    private ModelEnums.SmsType smsType;

    public ModelEnums.SmsType getSmsType() {
        return smsType;
    }

    public void setSmsType(ModelEnums.SmsType smsType) {
        this.smsType = smsType;
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
    
    
}

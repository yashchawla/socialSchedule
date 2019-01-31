/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialschedule.Models;

/**
 *
 * @author Tabassum Naaz
 */
public class ModelEnums {
    
    public enum EmailType{
        FESTIVAL_WISHES,
        SOCIAL,
        WELCOME,
        OFFER,
        SURVEY,
        ANNIVERSARY,
        BIRTHDAY
    }
    
    public enum SmsType{
        FESTIVAL_SMS,
        SOCIAL,
        WELCOME,
        OFFER,
        BIRTHDAY,
        ANNIVERSARY
    }
     
    
    public enum scheduledType{
        DAILY,
        WEEKLY,
        MONTHLY,
        ONE_IN_FIFTEEN_DAY
    }
}

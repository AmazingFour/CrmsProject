package com.crms.po;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Operation entity. @author MyEclipse Persistence Tools
 */

public class Operation  implements java.io.Serializable {


    // Fields    

     private Long operationId;
     private String funName;
     private String action;
     private String fun;
     private Set roles = new HashSet(0);


    // Constructors

    /** default constructor */
    public Operation() {
    }

	/** minimal constructor */
    public Operation(String funName, String action, String fun) {
        this.funName = funName;
        this.action = action;
        this.fun = fun;
    }
    
    /** full constructor */
    public Operation(String funName, String action, String fun, Set roles) {
        this.funName = funName;
        this.action = action;
        this.fun = fun;
        this.roles = roles;
    }

   
    // Property accessors

    public Long getOperationId() {
        return this.operationId;
    }
    
    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public String getFunName() {
        return this.funName;
    }
    
    public void setFunName(String funName) {
        this.funName = funName;
    }

    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }

    public String getFun() {
        return this.fun;
    }
    
    public void setFun(String fun) {
        this.fun = fun;
    }

    public Set getRoles() {
        return this.roles;
    }
    
    public void setRoles(Set roles) {
        this.roles = roles;
    }
   








}
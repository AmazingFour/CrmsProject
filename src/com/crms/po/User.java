package com.crms.po;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Long userId;
     private Role role;
     private String username;
     private String password;
     private String userDescript;
     private Short userState;
     private Set userFiles = new HashSet(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    /** full constructor */
    public User(Role role, String username, String password, String userDescript, Short userState, Set userFiles) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.userDescript = userDescript;
        this.userState = userState;
        this.userFiles = userFiles;
    }

   
    // Property accessors

    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserDescript() {
        return this.userDescript;
    }
    
    public void setUserDescript(String userDescript) {
        this.userDescript = userDescript;
    }

    public Short getUserState() {
        return this.userState;
    }
    
    public void setUserState(Short userState) {
        this.userState = userState;
    }

    public Set getUserFiles() {
        return this.userFiles;
    }
    
    public void setUserFiles(Set userFiles) {
        this.userFiles = userFiles;
    }
   








}
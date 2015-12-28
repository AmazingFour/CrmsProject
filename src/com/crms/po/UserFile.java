package com.crms.po;
// default package



/**
 * UserFile entity. @author MyEclipse Persistence Tools
 */

public class UserFile  implements java.io.Serializable {


    // Fields    

     private Long id;
     private User user;
     private File file;
     private Short checkState;
     private String checkContent;
     private Short state;


    // Constructors

    /** default constructor */
    public UserFile() {
    }

	/** minimal constructor */
    public UserFile(User user, File file) {
        this.user = user;
        this.file = file;
    }
    
    /** full constructor */
    public UserFile(User user, File file, Short checkState, String checkContent, Short state) {
        this.user = user;
        this.file = file;
        this.checkState = checkState;
        this.checkContent = checkContent;
        this.state = state;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public File getFile() {
        return this.file;
    }
    
    public void setFile(File file) {
        this.file = file;
    }

    public Short getCheckState() {
        return this.checkState;
    }
    
    public void setCheckState(Short checkState) {
        this.checkState = checkState;
    }

    public String getCheckContent() {
        return this.checkContent;
    }
    
    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public Short getState() {
        return this.state;
    }
    
    public void setState(Short state) {
        this.state = state;
    }
   








}
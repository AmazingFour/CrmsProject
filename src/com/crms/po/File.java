package com.crms.po;
// default package

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * File entity. @author MyEclipse Persistence Tools
 */

public class File  implements java.io.Serializable {


    // Fields    

     private Long fileId;
     private String fileName;
     private String fileUrl;
     private Timestamp fileDate;
     private String fileDescript;
     private Short fileState;
     private Set userFiles = new HashSet(0);


    // Constructors

    /** default constructor */
    public File() {
    }

    
    /** full constructor */
    public File(String fileName, String fileUrl, Timestamp fileDate, String fileDescript, Short fileState, Set userFiles) {
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.fileDate = fileDate;
        this.fileDescript = fileDescript;
        this.fileState = fileState;
        this.userFiles = userFiles;
    }

   
    // Property accessors

    public Long getFileId() {
        return this.fileId;
    }
    
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }
    
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Timestamp getFileDate() {
        return this.fileDate;
    }
    
    public void setFileDate(Timestamp fileDate) {
        this.fileDate = fileDate;
    }

    public String getFileDescript() {
        return this.fileDescript;
    }
    
    public void setFileDescript(String fileDescript) {
        this.fileDescript = fileDescript;
    }

    public Short getFileState() {
        return this.fileState;
    }
    
    public void setFileState(Short fileState) {
        this.fileState = fileState;
    }

    public Set getUserFiles() {
        return this.userFiles;
    }
    
    public void setUserFiles(Set userFiles) {
        this.userFiles = userFiles;
    }
   








}
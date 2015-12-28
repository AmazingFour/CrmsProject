package com.crms.po;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role  implements java.io.Serializable {


    // Fields    

     private Long roleId;
     private String roleName;
     private String roleDescript;
     private Set operations = new HashSet(0);
     private Set users = new HashSet(0);
     private Set menus = new HashSet(0);


    // Constructors

    /** default constructor */
    public Role() {
    }

	/** minimal constructor */
    public Role(String roleName) {
        this.roleName = roleName;
    }
    
    /** full constructor */
    public Role(String roleName, String roleDescript, Set operations, Set users, Set menus) {
        this.roleName = roleName;
        this.roleDescript = roleDescript;
        this.operations = operations;
        this.users = users;
        this.menus = menus;
    }

   
    // Property accessors

    public Long getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescript() {
        return this.roleDescript;
    }
    
    public void setRoleDescript(String roleDescript) {
        this.roleDescript = roleDescript;
    }

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }

	public Set getOperations() {
		return operations;
	}

	public Set getMenus() {
		return menus;
	}

	public void setOperations(Set operations) {
		this.operations = operations;
	}

	public void setMenus(Set menus) {
		this.menus = menus;
	}


}
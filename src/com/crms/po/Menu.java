package com.crms.po;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu  implements java.io.Serializable {


    // Fields    

     private Long menuId;
     private Menu menu;
     private String menuName;
     private String menuUrl;
     private Short menuType;
     private Set menus = new HashSet(0);
     private Set roles = new HashSet(0);


    // Constructors

    /** default constructor */
    public Menu() {
    }

    
    /** full constructor */
    public Menu(Menu menu, String menuName, String menuUrl, Short menuType, Set menus, Set roles) {
        this.menu = menu;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuType = menuType;
        this.menus = menus;
        this.roles = roles;
    }

   
    // Property accessors

    public Long getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Menu getMenu() {
        return this.menu;
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getMenuName() {
        return this.menuName;
    }
    
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return this.menuUrl;
    }
    
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Short getMenuType() {
        return this.menuType;
    }
    
    public void setMenuType(Short menuType) {
        this.menuType = menuType;
    }

    public Set getMenus() {
        return this.menus;
    }
    
    public void setMenus(Set menus) {
        this.menus = menus;
    }

    public Set getRoles() {
        return this.roles;
    }
    
    public void setRoles(Set roles) {
        this.roles = roles;
    }
   








}
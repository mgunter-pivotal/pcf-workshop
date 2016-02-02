package com.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyInfo
 */
@Stateless
@LocalBean
public class MyInfo implements MyInfoLocal {

    /**
     * Default constructor. 
     */
    public MyInfo() {
        // TODO Auto-generated constructor stub
    }
    
    
    public String getMyInfo() {
    	return "EJB architecture was designed 20 yrs ago when we were using 100BaseT networks";
    }

}

package com.beans;

import javax.ejb.Local;

@Local
public interface MyInfoLocal {

	public String getMyInfo();
}

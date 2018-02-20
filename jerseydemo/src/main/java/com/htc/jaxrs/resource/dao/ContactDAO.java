package com.htc.jaxrs.resource.dao;

import java.util.ArrayList;

import com.htc.jaxrs.bo.ContactInfo;

public interface ContactDAO {

	public ContactInfo findContactById(String contactId);
	public ArrayList<ContactInfo> findContactByOrganization(String organization);
}
 
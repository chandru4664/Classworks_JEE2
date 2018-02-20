package com.htc.jaxrs.bo;

import java.io.Serializable;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@SuppressWarnings("serial")
public class ContactInfo implements Serializable{

	private String contactId;
	private String contactName;
	private String organization;
	private String address;
	private String landlineNo;
	private String mobileno;
	private String emailid;
	
	public ContactInfo(){}

	public ContactInfo(String contactId, String contactName, String organization, String address, String landlineNo,
			String mobileno, String emailid) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.organization = organization;
		this.address = address;
		this.landlineNo = landlineNo;
		this.mobileno = mobileno;
		this.emailid = emailid;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLandlineNo() {
		return landlineNo;
	}

	public void setLandlineNo(String landlineNo) {
		this.landlineNo = landlineNo;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "ContactInfo [contactId=" + contactId + ", contactName=" + contactName + ", organization=" + organization
				+ ", address=" + address + ", landlineNo=" + landlineNo + ", mobileno=" + mobileno + ", emailid="
				+ emailid + "]";
	}
	
}

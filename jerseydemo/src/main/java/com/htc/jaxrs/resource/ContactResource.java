package com.htc.jaxrs.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.htc.jaxrs.bo.ContactInfo;
import com.htc.jaxrs.resource.dao.ContactDAO;
import com.htc.jaxrs.resource.dao.ContactDAOImpl;

@Path("/contactService")
public class ContactResource {
	
	@GET
	@Path("/msg")
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLMessage() {
		return "<h2> Welcome to JAX-RS Web Application </h2>";
	} 
	
	@GET
	@Path("/findContactByIdXML/{contactId}")
	@Produces(MediaType.APPLICATION_XML)
	public ContactInfo findContactByIdXML(@PathParam("contactId") String contactId) {
		ContactDAO contactDAO = new ContactDAOImpl();
		return contactDAO.findContactById(contactId);
	}

	@GET
	@Path("/findContactByIdJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public ContactInfo findContactByIdJSON(@QueryParam("contactId") String contactId) {
		ContactDAO contactDAO = new ContactDAOImpl();
		return contactDAO.findContactById(contactId);
	}
}
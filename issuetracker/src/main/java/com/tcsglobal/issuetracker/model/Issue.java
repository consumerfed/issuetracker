/**
 * 
 */
package com.tcsglobal.issuetracker.model;

import java.util.Calendar;

/**
 * @author Apple
 *
 */
public class Issue {
	
	
	private Long id;
	
	private String title;
	
	private String environment;
	
	private String module;
	
	private String devStatus;
	
	private Calendar reportedDate;
	
	private Long reportedBy;
	
	private String description;
	
	
	private String RCA;
	private String assignedTo; 
	private String initialAnalysis;
	private String actionTaken;
	private Calendar plannedETAToclose;
	private Calendar ClosedOn;
	private String CommunicationsLog;
	
	private boolean isAttachment;
//	Attachments - (Attachment pin symbol to upload pic and doc)  
	
	
	
	
	

}

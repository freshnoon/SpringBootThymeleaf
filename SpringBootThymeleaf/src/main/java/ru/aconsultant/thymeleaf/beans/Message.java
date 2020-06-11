package ru.aconsultant.thymeleaf.beans;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Message {

	private String sender;
	private String reciever;
	private String text;
	private String filePath;
	private long milliseconds;
	private String fileName;
	
	private int code;
	// null or 0: Plain text message
	// 1: Image uploading
	// 2: Image is ready
	// 3: Plain text is successfully sent
	// 4: File uploading
	// 5: File is ready
	
	private String id;
	
	// --- CONSTRUCTORS --- //
	
	public Message() {}
	
	public Message(String sender, String reciever, Calendar date, String text) {
		this.sender = sender;
		this.reciever = reciever;
		this.text = text;
		this.milliseconds = date.getTimeInMillis();
	}
	
	public Message(String sender, String reciever, long milliseconds, String text) {
		this.sender = sender;
		this.reciever = reciever;
		this.text = text;
		this.milliseconds = milliseconds;
	}
	
	public Message(String sender, String reciever, Calendar date, String text, String filePath, String fileName, int code, String id) {
		this.sender = sender;
		this.reciever = reciever;
		this.text = text;
		this.filePath = filePath;
		this.milliseconds = date.getTimeInMillis();
		this.fileName = fileName;
		this.code = code;
		this.id = id;
	}
	
	public Message(String sender, String reciever, long milliseconds, String text, String filePath, String fileName, int code, String id) {
		this.sender = sender;
		this.reciever = reciever;
		this.text = text;
		this.filePath = filePath;
		this.milliseconds = milliseconds;
		this.fileName = fileName;
		this.code = code;
		this.id = id;
	}

	// --- GET --- //
	
	public String getText() {
		return text;
	}
	
	public String getSender() {
		return sender;
	}
	
	public String getReciever() {
		return reciever;
	}
	
	public String getFilePath() {
		return filePath;
	}
	
	public long getMilliseconds() {
		
		return milliseconds;	
	}
	
	public Date getDateTime() {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(this.getMilliseconds());
		return calendar.getTime();
	}
	
	public int getCode() {
		return code;
	}
	
	public String getId() {
		return id;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	// --- SET --- //
	
	public void setSender(String st) {
		this.sender = st;
	}
	
	public void setReciever(String st) {
		this.reciever = st;
	}
	
	public void setText(String st) {
		this.text = st;
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public void setMilliseconds(long milliseconds) {
		this.milliseconds = milliseconds;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	// --- OTHER --- //
	
	@Override
	public String toString() {
		return text;
	}
	
}
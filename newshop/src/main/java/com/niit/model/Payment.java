package com.niit.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Controller;
@Controller
@Entity
public class Payment {
	
	
	@Id
	@GeneratedValue
	private String pymtname;
	private String pymtemail;
	private int pymtphone;
	private String pymtdeliveryaddress;
	private int pymtpostcode;
	private String pymtcountry;
	private String pymtcardtype;
	private int pymtsecuritycode;
	private String pymtnameoncard;
	private int pymtcardnumber;
	public int getPymtcardnumber() {
		return pymtcardnumber;
	}
	public void setPymtcardnumber(int pymtcardnumber) {
		this.pymtcardnumber = pymtcardnumber;
	}
	public String getPymtname() {
		return pymtname;
	}
	public void setPymtname(String pymtname) {
		this.pymtname = pymtname;
	}
	public String getPymtemail() {
		return pymtemail;
	}
	public void setPymtemail(String pymtemail) {
		this.pymtemail = pymtemail;
	}
	public int getPymtphone() {
		return pymtphone;
	}
	public void setPymtphone(int pymtphone) {
		this.pymtphone = pymtphone;
	}
	public String getPymtdeliveryaddress() {
		return pymtdeliveryaddress;
	}
	public void setPymtdeliveryaddress(String pymtdeliveryaddress) {
		this.pymtdeliveryaddress = pymtdeliveryaddress;
	}
	public int getPymtpostcode() {
		return pymtpostcode;
	}
	public void setPymtpostcode(int pymtpostcode) {
		this.pymtpostcode = pymtpostcode;
	}
	public String getPymtcountry() {
		return pymtcountry;
	}
	public void setPymtcountry(String pymtcountry) {
		this.pymtcountry = pymtcountry;
	}
	public String getPymtcardtype() {
		return pymtcardtype;
	}
	public void setPymtcardtype(String pymtcardtype) {
		this.pymtcardtype = pymtcardtype;
	}
	public int getPymtsecuritycode() {
		return pymtsecuritycode;
	}
	public void setPymtsecuritycode(int pymtsecuritycode) {
		this.pymtsecuritycode = pymtsecuritycode;
	}
	public String getPymtnameoncard() {
		return pymtnameoncard;
	}
	public void setPymtnameoncard(String pymtnameoncard) {
		this.pymtnameoncard = pymtnameoncard;
	}
	

}

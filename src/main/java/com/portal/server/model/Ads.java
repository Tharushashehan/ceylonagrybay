package com.portal.server.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

public class Ads implements Serializable {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "USER_SEQ")
	private long id;

	private String  code  ;
	private long year_id  ;
	private String company  ;
	private String  address  ;
	private String contact ; 
	private String  mobile  ;
	private String office_tp  ;
	private String email  ;
	private String website  ;
	private String medium  ;
	private String payment_basis  ;
	private long agent_id  ;
	private long user_id  ;
	private long type_id  ;
	private double amount  ;
	private String data_form  ;
	private long  linked_ad_id  ;
	private String artwork_file_path  ;
	private String artwork_file_name  ;
	private String artwork_file_size  ;
	private String artwork_content_type ;
	private Date artwork_date ;
	private String artwork_uploaded ; 
	private Date artwork_uploaded_date ;
	private String keywords ;
	private String payment_mode  ;
	private long status_id  ;
	private String approved  ;
	private String reject_reason  ;
	
	@Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name = "updated_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
    
    @Column(name = "status_code", nullable = false)
    @Value("${some.key:true}")
    private boolean status_code;


}

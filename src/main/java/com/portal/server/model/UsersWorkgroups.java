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

public class UsersWorkgroups implements Serializable {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "USER_SEQ")
	private long id;
	
	private String name  ;
	private String level  ;
	private String redirect;  
	private String perm_type;  
	private Date created  ;
	private Date modified  ;
	private String indexes;
	private long user_id ;
	private long work_group_id; 
	private long year_id ;
	private String admission_year; 
	private String code;
	private String ad_count; 
	private long group_id ;
	private String f_name  ;
	private String l_name  ;
	private String oba_id ;
	
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

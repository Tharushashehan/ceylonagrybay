package com.portal.server.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="Users")
@Data
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class User implements Serializable {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "USER_SEQ")
	private long id;  
	
	@Column(name = "f_name", nullable = false)
	private String   f_name;
	@Column(name = "passwd", nullable = false)
	private String passwd; 
	@Column(name = "txt_passwd", nullable = false)
	private String txt_passwd  ;
	@Column(name = "l_name", nullable = false)
	private String l_name ;
	@Column(name = "email", nullable = false)
	private String email;  
	@Column(name = "last_visit", nullable = true)
	private Date last_visit;  
	@Column(name = "group_id", nullable = true)
	private int group_id ; 
	@Column(name = "active", nullable = true)
	private boolean active  ;
	@Column(name = "notified", nullable = true)
	private boolean notified  ;
	@Column(name = "reset_pwd", nullable = true)
	private boolean reset_pwd ; 
	@Column(name = "nic", nullable = false)
	private String nic  ;
	@Column(name = "oba_id", nullable = false)
	private String oba_id  ;
	@Column(name = "old_oba_id", nullable = true)
	private String old_oba_id  ;
	@Column(name = "work_group_id", nullable = true)
	private int work_group_id  ;
	@Column(name = "code", nullable = true)
	private String code  ;
	@Column(name = "added_by", nullable = true)
	private String added_by  ;
	@Column(name = "mobile_1", nullable = false)
	private String mobile_1  ;
	@Column(name = "mobile_2", nullable = true)
	private String mobile_2  ;
	@Column(name = "office_tel", nullable = true)
	private String office_tel  ;
	@Column(name = "resi_tel", nullable = true)
	private String resi_tel  ;
	@Column(name = "fax", nullable = true)
	private String fax  ;
	@Column(name = "address", nullable = false)
	private String address  ;
	@Column(name = "city", nullable = true)
	private String city ; 
	@Column(name = "ad_count", nullable = true)
	private int ad_count  ;
	@Column(name = "max_ad_code", nullable = true)
	private int max_ad_code  ;
	@Column(name = "admission_year", nullable = true)
	private int admission_year  ;
	
	@Column(name = "created_at", nullable = true, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name = "updated_at", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
    
    @Column(name = "status_code", nullable = true)
    @Value("${some.key:true}")
    private boolean status_code;
	
	}
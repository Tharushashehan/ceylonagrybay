package com.portal.model;

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
	
	@Column(name = "userId", nullable = false)
	private String   userId;
	@Column(name = "firstName", nullable = false)
	private String   firstName;
	@Column(name = "userAvatar", nullable = false)
	private String   userAvatar;
	@Column(name = "lastName", nullable = false)
	private String   lastName;
	@Column(name = "fullName", nullable = false)
	private String   fullName;
	@Column(name = "emailAddress", nullable = false)
	private String emailAddress;
	@Column(name = "userName", nullable = false)
	private String userName ;
	@Column(name = "userPassword", nullable = false)
	private String userPassword; 
	@Column(name = "primaryPhoneNumber", nullable = false)
	private String primaryPhoneNumber;  
	@Column(name = "country", nullable = true)
	private String country;  
	@Column(name = "addressLineOne", nullable = true)
	private String addressLineOne ; 
	@Column(name = "addressLineTwo", nullable = true)
	private String addressLineTwo  ;
	@Column(name = "addressProvince", nullable = true)
	private String addressProvince  ;
	@Column(name = "addressZipCode", nullable = true)
	private String addressZipCode ; 
	
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
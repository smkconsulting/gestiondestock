package com.smkconsulting.gestiondestock.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable{

	@Id
	@GeneratedValue	
	private Integer id;
	
	@CreatedDate
	@Column(name="creationDate", nullable = false,  updatable = false)
	private Instant creationDate;
	
	@LastModifiedDate
	@Column(name="lastModifiedDate")
	@JsonIgnore
	private Instant lastUpdateDate;
}

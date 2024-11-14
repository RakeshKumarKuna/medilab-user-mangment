package com.medilab.preclinic.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author Rakeh Kumar Kuna
 *
 */
@Entity
@Table(name = "UserPermission")
@Data
@RequiredArgsConstructor
public class UserPermission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column()
	@NonNull
	private String name;
	/**
	 * audit info
	 */
	@Column
	@NonNull
	private String createdBy;
	@Column
	@NonNull
	private Date createDate;
	@Column
	@NonNull
	private String updatedBy;
	@Column
	@NonNull
	private Date updatedDate;

}

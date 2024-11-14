package com.medilab.preclinic.bean;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;
/**
 * 
 * @author Rakesh Kumar Kuna
 *
 */
@Data
@RequiredArgsConstructor
public class UserTypeBean implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String userType;
	
}

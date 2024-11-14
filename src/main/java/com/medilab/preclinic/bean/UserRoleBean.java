package com.medilab.preclinic.bean;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
/**
 * 
 * @author Rakesh Kumar Kuna
 *
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class UserRoleBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	@NonNull
	private String name;
	@NonNull
	private Set<UserRoleBean> permissionSet;

}

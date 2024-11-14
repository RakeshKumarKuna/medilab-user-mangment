package com.medilab.preclinic.domain;

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
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
/**
 * 
 * @author Rakesh Kumar Kuna
 *
 */
@Entity
@Table(name = "UserRole")
@Data
@RequiredArgsConstructor
public class UserRole implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column()
	@NonNull
	private String name;
	@NonNull
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "userRole")
	private Set<UserRoleToPermission> permissionSet;

}

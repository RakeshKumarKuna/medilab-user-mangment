/**
 * 
 */
package com.medilab.preclinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.preclinic.domain.UserRole;

/**
 * @author Rakesh Kumar Kuna
 *
 */
public interface IUserRoleRepository extends JpaRepository<UserRole, Integer> {

}

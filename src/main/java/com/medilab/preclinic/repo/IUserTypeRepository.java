/**
 * 
 */
package com.medilab.preclinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.preclinic.domain.UserType;

/**
 * @author Rakesh Kumar Kuna
 *
 */
public interface IUserTypeRepository extends JpaRepository<UserType, Integer> {

}

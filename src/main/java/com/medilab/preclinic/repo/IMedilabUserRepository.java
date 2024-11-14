/**
 * 
 */
package com.medilab.preclinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.preclinic.domain.MedilabUser;

/**
 * @author Rakesh Kumar Kuna
 *
 */
public interface IMedilabUserRepository extends JpaRepository<MedilabUser, Integer> {

}

package com.medilab.preclinic;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.medilab.preclinic.domain.UserPermission;
import com.medilab.preclinic.repo.IUserPermissionRepository;

public class UserPermissionTest extends MedilabUserMangmentApplicationTests {
	@Autowired
	private IUserPermissionRepository permissionrepo;

	@Test
	public void createPermission() {
		String name = "add";
		String createdBy = "admin";
		LocalDate localDate = LocalDate.now();
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		UserPermission permission = new UserPermission(name, createdBy, date, createdBy, date);
		int id = permissionrepo.save(permission).getId();
		assertNotNull(permission);
		assertNotNull(id);
	}
	

}

package com.medilab.preclinic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.medilab.preclinic.domain.UserPermission;
import com.medilab.preclinic.repo.IUserPermissionRepository;
import com.medilab.preclinic.repo.IUserRoleRepository;

public class UserRoleTest extends MedilabUserMangmentApplicationTests {
	@Autowired
	private IUserPermissionRepository permissionrepo;
	@Autowired
	private IUserRoleRepository userRoleRepo;

	public void createUserRole() {
	 List<UserPermission>	role=permissionrepo.findAll();

	}

}

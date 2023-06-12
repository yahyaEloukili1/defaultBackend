package com.dsic.project.services;

import com.dsic.project.enetities.AppRole;
import com.dsic.project.enetities.AppUser;

public interface AccountService {

	public AppUser save(AppUser user);
	public AppRole saveRole(AppRole role);
	public void addRoleToUser(String username,String roleName);
	public AppUser finduserByUsrname(String username);
}

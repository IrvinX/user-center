package com.footprint.service;


import com.footprint.entity.Permission;

public interface PermissionService {

	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);
}

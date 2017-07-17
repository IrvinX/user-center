package com.footprint.entity;

import java.io.Serializable;

public class UserRole implements Serializable {

	/** 序列化 */
	private static final long serialVersionUID = 1L;

	private Long userId;
	private Long roleId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UserRole userRole = (UserRole) o;

		if (roleId != null ? !roleId.equals(userRole.roleId) : userRole.roleId != null)
			return false;
		if (userId != null ? !userId.equals(userRole.userId) : userRole.userId != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result = userId != null ? userId.hashCode() : 0;
		result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
		return result;
	}

	public String toString() {
		return "UserRole{" + "userId=" + userId + ", roleId=" + roleId + '}';
	}
}

package kr.co.db.vo;

import java.sql.Date;
import java.util.Objects;

public class DepartmentVO {
	private int managerId;
	private int deptId;
	private String deptName;
	private int locationId;
	
	public int getManagerId() {
		return managerId;
	}
	
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	public int getDeptId() {
		return deptId;
	}
	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	@Override
	public String toString() {
		return "DepartmentVO [managerId=" + managerId + ", deptId=" + deptId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentVO other = (DepartmentVO) obj;
		return deptId == other.deptId;
	}

}

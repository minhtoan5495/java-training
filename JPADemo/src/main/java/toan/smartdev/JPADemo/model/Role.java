package toan.smartdev.JPADemo.model;

import javax.persistence.*;

/**
 * The persistent class for the role database table.
 * 
 */
@Entity
public class Role extends AbstractAuditableEntity {
	private static final long serialVersionUID = 7851794269407495684L;

	private String role;

	public Role() {
	}

	public Role(String role) {
		super();
		this.role = role;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName() + "-");
        sb.append("  id=" + getId());
        sb.append("role= " + role);
        sb.append("  lastUpdated= " + getLastUpdated());
        sb.append("  lastUpdateBy= " + getLastUpdateUser());
        sb.append("  created= " + getCreated());
        sb.append("  createdBy= " + getCreateUser());
        return sb.toString();
    }
}
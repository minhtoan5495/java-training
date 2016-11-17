package toan.smartdev.JPADemo.model;

import javax.persistence.*;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.INTEGER)
public class User extends AbstractAuditableEntity {
	private static final long serialVersionUID = -2175150694352541150L;

	private String password;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="role_id", nullable = false)
	private Role role = null;

	private String username;

	public User() {
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName() + "-");
        sb.append("  id=" + getId());
        sb.append("  username= " + username);
        sb.append("  password= " + password);
        sb.append("  role= " + role);
        sb.append("  lastUpdated=" + getLastUpdated());
        sb.append("  lastUpdateBy=" + getLastUpdateUser());
        sb.append("  created=" + getCreated());
        sb.append("  createdBy=" + getCreateUser());
        return sb.toString();
    }
}
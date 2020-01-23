package com.lti.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credentials")
public class Credentials {

	@Id
	@Column(name="credential_id")
	private int credentialId;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="passenger_id")
	private int passengerId;
	
	public Credentials(){
		super();
	}
	
	public Credentials(int credentialId, String username, String password, int passengerId) {
		super();
		this.credentialId = credentialId;
		this.username = username;
		this.password = password;
		this.passengerId = passengerId;
	}

	public int getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(int credentialId) {
		this.credentialId = credentialId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	@Override
	public String toString() {
		return "Credentials [credentialId=" + credentialId + ", username=" + username + ", password=" + password
				+ ", passengerId=" + passengerId + "]";
	}
	
	
	
	
}

/*create table credentials
(credential_id number(5) primary key,
 username varchar2(15) not null,
 password varchar2(16) not null,
 passenger_id number(5),
 constraint credentials_passenger_id_fk foreign key(passenger_id) references passenger(passenger_id)
 );*/
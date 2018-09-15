package com.cg.entities;

import javax.persistence.*;


@Entity
@Table(name="trainee_157445")

@NamedQueries(
		@NamedQuery(name="selectAll", query="select t from Trainee t") )
public class Trainee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TRAINEE_ID")
	int id;
	
	@Column(name="TRAINEE_NAME")
	String name;
	@Column(name="TRAINEE_LOC")
	String loc;
	@Column(name="TRAINEE_DOMAIN")
	String domain;
	
	public Trainee() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", loc=" + loc
				+ ", domain=" + domain + "]";
	}
	
	
	
}

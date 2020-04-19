/**
 * 
 */
package com.amsidh.mvc.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author VIRU
 * 
 */
@Entity
@Table(name = "USERDETAILS")
public class UserDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2245700289831106815L;

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "DOB")
	private Date dateOfBirth;

	@Column(name = "ADDRESS")
	private Address address;

	/*
	 * As default this column name is vechile_vechileId.
	 */
	@ManyToMany(mappedBy="userDetails")
	private List<Vechile> vechiles;

	/**
	 * 
	 */
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userName
	 * @param dateOfBirth
	 * @param address
	 * @param vechile
	 */
	public UserDetails(String userName, Date dateOfBirth,
			Address address, List<Vechile> vechiles) {
		super();
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.vechiles = vechiles;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the vechiles
	 */
	public List<Vechile> getVechiles() {
		return vechiles;
	}

	/**
	 * @param vechiles the vechiles to set
	 */
	public void setVechiles(List<Vechile> vechiles) {
		this.vechiles = vechiles;
	}


}

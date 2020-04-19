/**
 * 
 */
package com.amsidh.mvc.dtos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author VIRU
 * 
 */
@Embeddable
public class Address {

	@Column(name = "STREET")
	private String street;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "PINCODE")
	private Long pinCode;

	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param pinCode
	 */
	public Address(String street, String city, String state, Long pinCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pinCode
	 */
	public Long getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode
	 *            the pinCode to set
	 */
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}

}

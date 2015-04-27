package com.mastek.innovation.apps.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.NaturalId;

@Entity
public class Parcel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@NaturalId
	@Column(nullable = false)
	private String packageId;
	
	@Column(nullable = false)
	private String dimensions;
	
	@Column(nullable = false)
	private long weight;
	
	@Column(nullable = false)
	private long scheduledDateTime;

	@Column(nullable = false)
	private String addressLine1;
	
	@Column(nullable = false)
	private String addressLine2;
	
	@Column(nullable = false)
	private String addressLine3;
	
	@Column(nullable = true)
	private String addressLine4;
	
	@Column(nullable = false)
	private String pincode;
	
	@Column(nullable = false)
	private String paymentType;
	
	@ManyToOne(optional = false)
	@NaturalId
	private PickupLocations pickupLocations;

	
	public Parcel(){
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPackageId() {
		return packageId;
	}


	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}


	public String getDimensions() {
		return dimensions;
	}


	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}


	public long getWeight() {
		return weight;
	}


	public void setWeight(long weight) {
		this.weight = weight;
	}


	public long getScheduledDateTime() {
		return scheduledDateTime;
	}


	public void setScheduledDateTime(long scheduledDateTime) {
		this.scheduledDateTime = scheduledDateTime;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getAddressLine3() {
		return addressLine3;
	}


	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}


	public String getAddressLine4() {
		return addressLine4;
	}


	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}


	public PickupLocations getPickupLocations() {
		return pickupLocations;
	}


	public void setPickupLocations(PickupLocations pickupLocation) {
		this.pickupLocations = pickupLocation;
	}

	
	


}

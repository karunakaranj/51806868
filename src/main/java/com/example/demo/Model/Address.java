package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Addressid;
	private String BuildingNo;
	private String StreetName;
	private int Pincode;
	private String City ;
	private String State ;
	
	public int getAddressid() {
		return Addressid;
	}
	public void setAddressid(int id) {
		this.Addressid = id;
	}
	public String getBuildingNo() {
		return BuildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		BuildingNo = buildingNo;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [Addressid=" + Addressid + ", BuildingNo=" + BuildingNo + ", StreetName=" + StreetName + ", Pincode="
				+ Pincode + ", City=" + City + ", State=" + State + "]";
	}
	
	
	

}

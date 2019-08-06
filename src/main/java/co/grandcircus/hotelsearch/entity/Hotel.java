package co.grandcircus.hotelsearch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel_listing")
public class Hotel {

@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="hotel_id")
private Long id;

@Column(name="hotel_name", length=40)
private String name;

//The @Column here is unnecessary because column name matches field 
//names/instance variables.
//@Column(name="city", length=40)
private String city;

@Column(name="price_per_night")
private Integer pricePerNight;



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Integer getPricePerNight() {
	return pricePerNight;
}

public void setPricePerNight(Integer pricePerNight) {
	this.pricePerNight = pricePerNight;
}

public Hotel(Long id, String name, String city, Integer pricePerNight) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.pricePerNight = pricePerNight;
}

public Hotel() {
	super();
}

@Override
public String toString() {
	return "Hotel [id=" + id + ", name=" + name + ", city=" + city + ", pricePerNight=" + pricePerNight + "]";
}





}

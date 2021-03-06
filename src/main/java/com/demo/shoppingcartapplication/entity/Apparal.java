package com.demo.shoppingcartapplication.entity;

import javax.persistence.Entity;

@Entity
public class Apparal extends Product {

	private String type;

	private String brand;

	private String design;

	private String apparalPictureURL;

	public Apparal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apparal(int productId, String productName, float price, int productQuant, String type, String brand,
			String design, String apparalPictureURL) {
		super(productId, productName, price, productQuant);
		this.type = type;
		this.brand = brand;
		this.design = design;
		this.apparalPictureURL = apparalPictureURL;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((apparalPictureURL == null) ? 0 : apparalPictureURL.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((design == null) ? 0 : design.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apparal other = (Apparal) obj;
		if (apparalPictureURL == null) {
			if (other.apparalPictureURL != null)
				return false;
		} else if (!apparalPictureURL.equals(other.apparalPictureURL))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (design == null) {
			if (other.design != null)
				return false;
		} else if (!design.equals(other.design))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getApparalPictureURL() {
		return apparalPictureURL;
	}

	public void setApparalPictureURL(String apparalPictureURL) {
		this.apparalPictureURL = apparalPictureURL;
	}

	@Override
	public String toString() {
		return "Apparal [type=" + type + ", brand=" + brand + ", design=" + design + ", apparalPictureURL="
				+ apparalPictureURL + "]";
	}

}

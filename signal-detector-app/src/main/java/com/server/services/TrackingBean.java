package com.server.services;

public class TrackingBean {

	private Long vechileId;

	
	private String customerName;
	

	private String customerAddress;


	public TrackingBean() {
		// TODO Auto-generated constructor stub
	}


	public Long getVechileId() {
		return vechileId;
	}


	public void setVechileId(Long vechileId) {
		this.vechileId = vechileId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((vechileId == null) ? 0 : vechileId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrackingBean other = (TrackingBean) obj;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (vechileId == null) {
			if (other.vechileId != null)
				return false;
		} else if (!vechileId.equals(other.vechileId))
			return false;
		return true;
	}


	public TrackingBean(Long vechileId, String customerName, String customerAddress) {
		super();
		this.vechileId = vechileId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}


	
    
	
	
}

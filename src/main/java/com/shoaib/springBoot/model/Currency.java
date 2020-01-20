package com.shoaib.springBoot.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Size;

public class Currency {
    private int id;
    private String name;
    private BigDecimal exchnageRate;
    private BigDecimal exchangeAmount;
    
    public Currency() {
    		super();
    }

	public Currency(int id, String name, BigDecimal exchnageRate, BigDecimal exchangeAmount) {
		super();
		this.id = id;
		this.name = name;
		this.exchnageRate = exchnageRate;
		this.exchangeAmount = exchangeAmount;
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

	public BigDecimal getExchnageRate() {
		return exchnageRate;
	}

	public void setExchnageRate(BigDecimal exchnageRate) {
		this.exchnageRate = exchnageRate;
	}

	public BigDecimal getExchangeAmount() {
		return exchangeAmount;
	}

	public void setExchangeAmount(BigDecimal exchangeAmount) {
		this.exchangeAmount = exchangeAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exchangeAmount == null) ? 0 : exchangeAmount.hashCode());
		result = prime * result + ((exchnageRate == null) ? 0 : exchnageRate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Currency other = (Currency) obj;
		if (exchangeAmount == null) {
			if (other.exchangeAmount != null)
				return false;
		} else if (!exchangeAmount.equals(other.exchangeAmount))
			return false;
		if (exchnageRate == null) {
			if (other.exchnageRate != null)
				return false;
		} else if (!exchnageRate.equals(other.exchnageRate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Currency [id=" + id + ", name=" + name + ", exchnageRate=" + exchnageRate + ", exchangeAmount="
				+ exchangeAmount + "]";
	}
    
    

}
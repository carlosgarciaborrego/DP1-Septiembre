
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class CreditCard extends DomainEntity {

	private String	holderName;
	private String	brandName;
	private String	number;
	private Integer	expireMonth;
	private Integer	expireYear;
	private Integer	cvv;


	@NotBlank
	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(final String holderName) {
		this.holderName = holderName;
	}

	@NotBlank
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(final String brandName) {
		this.brandName = brandName;
	}

	@NotNull
	public String getNumber() {
		return this.number;
	}

	public void setNumber(final String number) {
		this.number = number;
	}

	@Range(min = 1, max = 12)
	public Integer getExpireMonth() {
		return this.expireMonth;
	}

	public void setExpireMonth(final Integer expireMonth) {
		this.expireMonth = expireMonth;
	}

	@Range(min = 2019)
	public Integer getExpireYear() {
		return this.expireYear;
	}

	public void setExpireYear(final Integer expireYear) {
		this.expireYear = expireYear;
	}

	@Range(min = 0, max = 999)
	public Integer getCvv() {
		return this.cvv;
	}

	public void setCvv(final Integer cvv) {
		this.cvv = cvv;
	}
}


package domain;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Reviewer extends Actor {

	private List<String>	expertise;


	@NotBlank
	public List<String> getExpertise() {
		return this.expertise;
	}

	public void setExpertise(final List<String> expertise) {
		this.expertise = expertise;
	}
}

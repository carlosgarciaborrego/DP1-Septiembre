
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Administrator extends Actor {

	private Collection<Conference>	conferences;


	@Valid
	@OneToMany
	public Collection<Conference> getConferences() {
		return this.conferences;
	}

	public void setConference(final Collection<Conference> conferences) {
		this.conferences = conferences;
	}

}

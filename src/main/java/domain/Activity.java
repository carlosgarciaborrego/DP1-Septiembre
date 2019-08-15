
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Activity extends DomainEntity {

	private String	title;
	private Date	startMoment;
	private Integer	duration;
	private String	room;
	private String	summary;
	private String	attachments;
	private Actor	speaker;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartMoment() {
		return this.startMoment;
	}

	public void setStartMoment(final Date startMoment) {
		this.startMoment = startMoment;
	}

	@Min(0)
	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(final Integer duration) {
		this.duration = duration;
	}

	@NotBlank
	public String getRoom() {
		return this.room;
	}

	public void setRoom(final String room) {
		this.room = room;
	}

	@NotBlank
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	@URL
	public String getAttachements() {
		return this.attachments;
	}

	public void setAttachements(final String attachements) {
		this.attachments = attachements;
	}

	@NotNull
	public Actor getSpeaker() {
		return this.speaker;
	}

	public void setSpeaker(final Actor speaker) {
		this.speaker = speaker;
	}

}

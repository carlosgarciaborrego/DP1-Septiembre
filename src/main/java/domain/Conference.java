
package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Conference extends DomainEntity {

	private String				title;
	private String				acronym;
	private String				venue;
	private Date				submissionDeadLine;
	private Date				notificacionDeadLine;
	private Date				cameraReadyDeadLine;
	private Date				startDate;
	private Date				endDate;
	private String				summary;
	private Double				fee;

	private List<Submission>	submissions;
	private List<Activity>		activities;
	private Administrator		administrator;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getAcronym() {
		return this.acronym;
	}

	public void setAcronym(final String acronym) {
		this.acronym = acronym;
	}

	@NotBlank
	public String getVenue() {
		return this.venue;
	}

	public void setVenue(final String venue) {
		this.venue = venue;
	}

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getSubmissionDeadLine() {
		return this.submissionDeadLine;
	}

	public void setSubmissionDeadLine(final Date submissionDeadLine) {
		this.submissionDeadLine = submissionDeadLine;
	}

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getNotificacionDeadLine() {
		return this.notificacionDeadLine;
	}

	public void setNotificacionDeadLine(final Date notificacionDeadLine) {
		this.notificacionDeadLine = notificacionDeadLine;
	}

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCameraReadyDeadLine() {
		return this.cameraReadyDeadLine;
	}

	public void setCameraReadyDeadLine(final Date cameraReadyDeadLine) {
		this.cameraReadyDeadLine = cameraReadyDeadLine;
	}

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	@NotBlank
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	@NotNull
	@Min(0)
	@Digits(integer = 9, fraction = 2)
	public Double getFee() {
		return this.fee;
	}

	public void setFee(final Double fee) {
		this.fee = fee;
	}

	@OneToMany(cascade = CascadeType.ALL)
	public List<Submission> getSubmissions() {
		return this.submissions;
	}

	public void setSubmissions(final List<Submission> submissions) {
		this.submissions = submissions;
	}

	@OneToMany(cascade = CascadeType.ALL)
	public List<Activity> getActivities() {
		return this.activities;
	}

	public void setActivities(final List<Activity> activities) {
		this.activities = activities;
	}

	@ManyToOne(optional = false)
	public Administrator getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(final Administrator administrator) {
		this.administrator = administrator;
	}

}


package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Submission extends DomainEntity {

	private String	ticker;
	private Date	momentToSent;
	private String	status;

	private Paper	reviewPaper;
	private Paper	cameraReadyPaper;
	private Author	authors;


	@NotBlank
	@Pattern(regexp = "^([A-Z]{3}-[A-Z0-9]{4})$")
	@Column(unique = true)
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMomentToSent() {
		return this.momentToSent;
	}

	public void setMomentToSent(final Date momentToSent) {
		this.momentToSent = momentToSent;
	}

	@NotBlank
	@Pattern(regexp = "^UNDER-REVIEW$|^REJECTED$|^ACCEPTED$")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	@NotNull
	public Paper getReviewPaper() {
		return this.reviewPaper;
	}

	public void setReviewPaper(final Paper reviewPaper) {
		this.reviewPaper = reviewPaper;
	}

	@NotNull
	public Paper getCameraReadyPaper() {
		return this.cameraReadyPaper;
	}

	public void setCameraReadyPaper(final Paper cameraReadyPaper) {
		this.cameraReadyPaper = cameraReadyPaper;
	}

	@ManyToOne(optional = false)
	@NotNull
	@Valid
	public Author getAuthors() {
		return this.authors;
	}

	public void setAuthors(final Author authors) {
		this.authors = authors;
	}
}

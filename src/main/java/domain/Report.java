
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Report extends DomainEntity {

	private Double		originalityScore;
	private Double		qualityScore;
	private Double		readabilityScore;
	private String		decision;

	private Reviewer	reviewer;
	private Submission	submission;


	@Min(0)
	@Max(10)
	@Digits(fraction = 2, integer = 2)
	public Double getOriginalityScore() {
		return this.originalityScore;
	}

	public void setOriginalityScore(final Double originalityScore) {
		this.originalityScore = originalityScore;
	}

	@Min(0)
	@Max(10)
	@Digits(fraction = 2, integer = 2)
	public Double getQualityScore() {
		return this.qualityScore;
	}

	public void setQualityScore(final Double qualityScore) {
		this.qualityScore = qualityScore;
	}

	@Min(0)
	@Max(10)
	@Digits(fraction = 2, integer = 2)
	public Double getReadabilityScore() {
		return this.readabilityScore;
	}

	public void setReadabilityScore(final Double readabilityScore) {
		this.readabilityScore = readabilityScore;
	}

	@NotBlank
	@Pattern(regexp = "^BORDER-LINE$|^REJECT$|^ACCEPT$")
	public String getDecision() {
		return this.decision;
	}

	public void setDecision(final String decision) {
		this.decision = decision;
	}

	@NotNull
	@ManyToOne(optional = false)
	public Reviewer getReviewer() {
		return this.reviewer;
	}

	public void setReviewer(final Reviewer reviewer) {
		this.reviewer = reviewer;
	}

	@NotNull
	@ManyToOne(optional = false)
	public Submission getSubmission() {
		return this.submission;
	}

	public void setSubmission(final Submission submission) {
		this.submission = submission;
	}

}

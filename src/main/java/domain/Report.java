
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
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

	private Reviewer	reviewers;
	private Submission	submissions;


	@NotNull
	@Min(0)
	@Max(10)
	@Digits(fraction = 2, integer = 2)
	public Double getOriginalityScore() {
		return this.originalityScore;
	}

	public void setOriginalityScore(final Double originalityScore) {
		this.originalityScore = originalityScore;
	}

	@NotNull
	@Min(0)
	@Max(10)
	@Digits(fraction = 2, integer = 2)
	public Double getQualityScore() {
		return this.qualityScore;
	}

	public void setQualityScore(final Double qualityScore) {
		this.qualityScore = qualityScore;
	}

	@NotNull
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

	public void setDecicion(final String decision) {
		this.decision = decision;
	}

	@ManyToOne(optional = false)
	@NotNull
	@Valid
	public Reviewer getReviewers() {
		return this.reviewers;
	}

	public void setReviewers(final Reviewer reviewers) {
		this.reviewers = reviewers;
	}

	@ManyToOne(optional = false)
	@NotNull
	@Valid
	public Submission getSubmissions() {
		return this.submissions;
	}

	public void setSubmissions(final Submission submissions) {
		this.submissions = submissions;
	}

}

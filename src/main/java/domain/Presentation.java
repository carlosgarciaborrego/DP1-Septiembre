
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Presentation extends Activity {

	private Paper	cameraReadyVersion;


	@NotNull
	public Paper getCameraReadyVersion() {
		return this.cameraReadyVersion;
	}

	public void setCameraReadyVersion(final Paper cameraReadyVersion) {
		this.cameraReadyVersion = cameraReadyVersion;
	}
}

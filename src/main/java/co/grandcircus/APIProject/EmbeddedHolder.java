package co.grandcircus.APIProject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmbeddedHolder {
	
	Holder _embedded;

	public EmbeddedHolder() {
		super();
	}

	public EmbeddedHolder(Holder _embedded) {
		super();
		this._embedded = _embedded;
	}

	public Holder get_embedded() {
		return _embedded;
	}

	public void set_embedded(Holder _embedded) {
		this._embedded = _embedded;
	}
	
	

}

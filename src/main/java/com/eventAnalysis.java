package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class eventAnalysis implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("eventEffectiveness")
	private java.lang.String eventEffectiveness;
	@org.kie.api.definition.type.Label("eventResponsePayload")
	private java.lang.String eventResponsePayload;

	private java.lang.String ruleFired;

	public eventAnalysis() {
	    
	    
	}

	public java.lang.String getEventEffectiveness() {
		return this.eventEffectiveness;
	}

	public void setEventEffectiveness(java.lang.String eventEffectiveness) {
		this.eventEffectiveness = eventEffectiveness;
	}

	public java.lang.String getEventResponsePayload() {
		return this.eventResponsePayload;
	}

	public void setEventResponsePayload(java.lang.String eventResponsePayload) {
		this.eventResponsePayload = eventResponsePayload;
	}

	public java.lang.String getRuleFired() {
		return this.ruleFired;
	}

	public void setRuleFired(java.lang.String ruleFired) {
		this.ruleFired = ruleFired;
	}

	public eventAnalysis(java.lang.String eventEffectiveness,
			java.lang.String eventResponsePayload, java.lang.String ruleFired) {
		this.eventEffectiveness = eventEffectiveness;
		this.eventResponsePayload = eventResponsePayload;
		this.ruleFired = ruleFired;
	}
	
	

}
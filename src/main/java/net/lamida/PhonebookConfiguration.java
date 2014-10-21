package net.lamida;

import io.dropwizard.Configuration;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhonebookConfiguration extends Configuration {
	@JsonProperty
	@NotEmpty
	private String message;

	@JsonProperty
	@Max(10)
	private int messageRepetitions;

	@JsonProperty
	private String additionalMessage = "This is optional";

	public String getMessage() {
		return message;
	}

	public int getMessageRepetitions() {
		return messageRepetitions;
	}

	public String getAdditionalMessage() {
		return additionalMessage;
	}

}
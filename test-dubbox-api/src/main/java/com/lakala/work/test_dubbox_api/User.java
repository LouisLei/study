package com.lakala.work.test_dubbox_api;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonProperty;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@NotNull
	@Min(1L)
	private Long id;

	@JsonProperty("username")
	@XmlElement(name = "username")
	@NotNull
	@Size(min = 6, max = 50)
	private String name;

	public User() {
	}

	public User(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User (" + "id=" + id + ", name='" + name + '\'' + ')';
	}
}

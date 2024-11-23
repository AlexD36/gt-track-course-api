package com.example.model;

public class Activitate {
    private String name;
    private String description;

    public Activitate(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

    
}

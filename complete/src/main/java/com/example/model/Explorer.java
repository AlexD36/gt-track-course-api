package com.example.model;

public class Explorer {
    private String name;
    private String id;

    public Explorer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

    
}

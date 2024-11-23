package com.example.model;

import java.util.List;

public class Curs {
    private String name;
    private Trainer trainer;
    private List<Explorer> exploreri;
    private List<Activitate> activitati;

    public Curs(String name, Trainer trainer, List<Explorer> exploreri, List<Activitate> activitati) {
        this.name = name;
        this.trainer = trainer;
        this.exploreri = exploreri;
        this.activitati = activitati;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public List<Explorer> getExploreri() {
		return exploreri;
	}

	public void setExploreri(List<Explorer> exploreri) {
		this.exploreri = exploreri;
	}

	public List<Activitate> getActivitati() {
		return activitati;
	}

	public void setActivitati(List<Activitate> activitati) {
		this.activitati = activitati;
	}

    
}

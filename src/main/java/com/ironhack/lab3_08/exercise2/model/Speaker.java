package com.ironhack.lab3_08.exercise2.model;

import com.ironhack.lab3_08.exercise1.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "speakers")
public class Speaker extends Guest {

    private double presentationDuration;

    public Speaker(String name, Status status, double expertee) {
        super(name, status);
        this.presentationDuration = expertee;
    }

    public Speaker() {
        super();
    }

    public double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(double duration) {
        this.presentationDuration = duration;
    }
}

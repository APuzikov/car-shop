package com.mera.carshop.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    public Car() {
    }

    public Car(CarModel carModel, CarOption option, CarColor color, boolean available) {
        this.carModel = carModel;
        this.option = option;
        this.color = color;
        this.available = available;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @ManyToOne
    @JoinColumn(name = "car_model_id", nullable = false)
    private CarModel carModel;

    @ManyToOne
    @JoinColumn(name = "option_id", nullable = false)
    private CarOption option;

    @ManyToOne
    @JoinColumn(name = "color_id", nullable = false)
    private CarColor color;

    @Column
    private boolean available;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public CarOption getOption() {
        return option;
    }

    public void setOption(CarOption option) {
        this.option = option;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carModel=" + carModel +
                ", option=" + option +
                ", color=" + color +
                ", available=" + available +
                '}';
    }
}

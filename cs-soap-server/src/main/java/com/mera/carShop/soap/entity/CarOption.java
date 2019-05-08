package com.mera.carShop.soap.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "car_options")
public class CarOption {

    public CarOption() {
    }

    public CarOption(boolean aerodynamicCarKit, boolean leatherInterior, boolean heatedSeats, boolean heatedSteeringWheel, boolean heatedWindshield, boolean winterTireKit) {
        this.aerodynamicCarKit = aerodynamicCarKit;
        this.leatherInterior = leatherInterior;
        this.heatedSeats = heatedSeats;
        this.heatedSteeringWheel = heatedSteeringWheel;
        this.heatedWindshield = heatedWindshield;
        this.winterTireKit = winterTireKit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "aerodynamic_car_kit")
    private boolean aerodynamicCarKit;

    @Column(name = "leather_interior")
    private boolean leatherInterior;

    @Column(name = "heated_seats")
    private boolean heatedSeats;

    @Column(name = "heated_steering_wheel")
    private boolean heatedSteeringWheel;

    @Column(name = "heated_windshield")
    private boolean heatedWindshield;

    @Column(name = "winter_tire_kit")
    private boolean winterTireKit;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "option")
    private Set<Car> cars;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAerodynamicCarKit() {
        return aerodynamicCarKit;
    }

    public void setAerodynamicCarKit(boolean aerodynamicCarKit) {
        this.aerodynamicCarKit = aerodynamicCarKit;
    }

    public boolean isLeatherInterior() {
        return leatherInterior;
    }

    public void setLeatherInterior(boolean leatherInterior) {
        this.leatherInterior = leatherInterior;
    }

    public boolean isHeatedSeats() {
        return heatedSeats;
    }

    public void setHeatedSeats(boolean heatedSeats) {
        this.heatedSeats = heatedSeats;
    }

    public boolean isHeatedSteeringWheel() {
        return heatedSteeringWheel;
    }

    public void setHeatedSteeringWheel(boolean heatedSteeringWheel) {
        this.heatedSteeringWheel = heatedSteeringWheel;
    }

    public boolean isHeatedWindshield() {
        return heatedWindshield;
    }

    public void setHeatedWindshield(boolean heatedWindshield) {
        this.heatedWindshield = heatedWindshield;
    }

    public boolean isWinterTireKit() {
        return winterTireKit;
    }

    public void setWinterTireKit(boolean winterTireKit) {
        this.winterTireKit = winterTireKit;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}

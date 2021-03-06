package com.smoothstack.utopia.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @NotNull
    @Column(name = "departure_time")
    private Timestamp timeOfDeparture;

    @NotNull
    @Column(name = "reserved_seats")
    private Integer reservedSeats;

    @NotNull
    @Column(name = "seat_price")
    private Float seatPrice;

    public Integer getId() {
        return id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    public Route getRoute() {
        return route;
    }
    public void setRoute(final Route route) {
        this.route = route;
    }
    public Airplane getAirplane() {
        return airplane;
    }
    public void setAirplane(final Airplane airplane) {
        this.airplane = airplane;
    }
    public Timestamp getTimeOfDeparture() {
        return timeOfDeparture;
    }
    public void setTimeOfDeparture(final Timestamp timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }
    public Integer getReservedSeats() {
        return reservedSeats;
    }
    public void setReservedSeats(final Integer reservedSeats) {
        this.reservedSeats = reservedSeats;
    }
    public Float getSeatPrice() {
        return seatPrice;
    }
    public void setSeatPrice(final Float seatPrice) {
        this.seatPrice = seatPrice;
    }
}

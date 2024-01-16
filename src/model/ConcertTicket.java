/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author n.m.borisova
 */
public class ConcertTicket {
    private String concertTitle;
    private String location;
    private double regularPrice;
    private String photoName;

    public ConcertTicket(String concertTitle, String location, double regularPrice, String photoName) {
        this.concertTitle = concertTitle;
        this.location = location;
        this.regularPrice = regularPrice;
        this.photoName = photoName;
    }

    public ConcertTicket() {
    }

    @Override
    public String toString() {
        return "Concert: " + concertTitle + " at " + location + " with price: " + regularPrice;
    }

    public String getConcertTitle() {
        return concertTitle;
    }

    public void setConcertTitle(String concertTitle) {
        this.concertTitle = concertTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }
    
    
}

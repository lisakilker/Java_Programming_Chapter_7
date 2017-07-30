/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W4HW;

import W4HW.*;
import W4HW.EventDemo;
import java.util.Scanner;

/**
 *
 * @author Lisa
 */
class Event {

    public double PRICE_PER_GUEST_LOW = 32.00;
    public double PRICE_PER_GUEST_HIGH = 35.00;
    public int CUT_OFF_AMOUNT = 50;
    private String eventNumber;
    boolean isLarge = false;
    public int guests;
    public double price;
    public double pricePerGuest;
    private String contactPhoneNumber;
    public int eventType;
    public static String EVENT_TYPE_NAMES[] = {"Wedding", "Baptism", "Birthday", "Corporate", "Other"};

    public Event() {
        this("A000", 0);
    }

    public Event(String eventNum, int guestAmount) {
        eventNumber = eventNum;
        guests = guestAmount;
    }

    public void setEventNumber(String eventNum) {
        eventNumber = eventNum;

        if (((eventNum.length() == 4)
                && ((Character.isAlphabetic(eventNum.charAt(0)))
                && (Character.isDigit(eventNum.charAt(1)))
                && (Character.isDigit(eventNum.charAt(2)))
                && (Character.isDigit(eventNum.charAt(3)))))) {
            eventNumber = eventNum;
            eventNumber = Character.toUpperCase(eventNum.charAt(0)) + eventNum.substring(1);
        } else {
            eventNumber = "A0000";
        }
    }

    public void setGuests(int guestAmount) {
        guests = guestAmount;

        if (isLargeEvent()) {
            pricePerGuest = PRICE_PER_GUEST_LOW;
        } else {
            pricePerGuest = PRICE_PER_GUEST_HIGH;
        }
        price = guests * pricePerGuest;
    }

    public void setContactPhoneNumber(String phoneNum) {
        contactPhoneNumber = phoneNum;
        String phoneFormat = "";

        for (int i = 0; i < phoneNum.length(); i++) {
            if (Character.isDigit(phoneNum.charAt(i))) {
                phoneFormat += phoneNum.charAt(i);
            }
        }
        if (phoneNum.length() < 10 || phoneNum.length() < 10) {
            contactPhoneNumber = "0000000000";
        } else {
            contactPhoneNumber = phoneFormat;
        }
    }

    public void setEventType(int eventTypeNum) {
        eventType = eventTypeNum;
        if (eventTypeNum < EVENT_TYPE_NAMES.length) {
            eventType = eventTypeNum;
        } else {
            eventType = EVENT_TYPE_NAMES.length;
        }
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public String getEventName(int i) {
        return EVENT_TYPE_NAMES[i];
    }

    public int getNumberOfGuests() {
        return guests;
    }

    public String getContactPhone() {
        {
      String phone;
      phone = "(" + contactPhoneNumber.substring(0, 3) + ") " +
         contactPhoneNumber.substring(3, 6) + "-" +
         contactPhoneNumber.substring(6, 10);
      
   
        return phone;
    }
    }

    public Boolean isLargeEvent() {
        if (guests >= CUT_OFF_AMOUNT) {
            isLarge = true;
        } else {
        }
        return isLarge;
    }

    public int getEventType() {
        return eventType;
    }

    public double getPricePerGuest() {
        return pricePerGuest;
    }

    public double getPrice() {
        return price;
    }
}
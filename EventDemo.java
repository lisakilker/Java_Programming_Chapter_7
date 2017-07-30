/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W4HW;

import W4HW.*;
import java.util.Scanner;
import W4HW.Event;

/**
 *
 * @author Lisa
 */
public class EventDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Event eventArray[] = new Event[3];

        for (int i = 0; i < eventArray.length; i++) {
            Event eventOne = new Event();
            System.out.println("*****New Event*****");
            eventOne.setEventNumber(getEventNumber());
            eventOne.setGuests(getGuests());
            eventOne.setContactPhoneNumber(getContactPhone());
            eventOne.setEventType(getEventType());
            eventArray[i] = eventOne;
            
        }
        for(Event eventOne:eventArray){
            displayEventDetails(eventOne);
        }
    }

    public static String getEventNumber() {
        String num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the event number: ");
        num = input.nextLine();
        return num;
    }

    public static int getGuests() {
        int guests;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the amount of guests: ");
            guests = input.nextInt();
            input.nextLine();
        } while (guests < 5 || guests > 100);
        return guests;
    }

    public static String getContactPhone() {
        String phone;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your phone number? ");
        phone = input.nextLine();
        return phone;
    }

    public static int getEventType() {
        int eventType;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the event type: ");
        eventType = input.nextInt();
        return eventType;
    }

    public static void displayEventDetails(Event eventOne) {
        System.out.println();
        System.out.println("--EVENT DETAILS--");
        System.out.println("Event number is: " + eventOne.getEventNumber());
        System.out.println("Number of guests is: " + eventOne.getNumberOfGuests());
        System.out.println("Phone number is:  " + eventOne.getContactPhone());
        System.out.println("Event type number is: " + eventOne.getEventType() + ". The event type is: "+ eventOne.getEventName(eventOne.getEventType()-1));
        System.out.println("Is this a large event? " + eventOne.isLargeEvent() + "." + " The price per guest is $" + eventOne.getPricePerGuest() + ". The total cost is: $" + eventOne.getPrice());
        System.out.println();
    }

}

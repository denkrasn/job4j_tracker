package ru.job4j.tracker.poly;

import com.sun.jdi.connect.TransportTimeoutException;

public class Bus implements Transport {
    double pricePerLiter = 3.45;
    int passengersMax;
    int gas;

    @Override
    public void go() {
        if (gas > 0) {
            gas--;
            System.out.println("Transport GO");
        } else {
            System.out.println("Transport STOP");
        }
    }

    @Override
    public void passengers(int quantity) {
        passengersMax += quantity;
        if (passengersMax >= 100) {
            System.out.println("Transport is full");
        } else System.out.println("There are seats");

    }


    @Override
    public double gasUp(int amountOfFuel) {

        return amountOfFuel * pricePerLiter;
    }
}

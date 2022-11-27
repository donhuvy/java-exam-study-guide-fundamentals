package com.readlearncode.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    @SuppressWarnings("resource")
    public void exmple1() {
        try {
            new FileReader("customer-sales.csv");
        } catch (IOException ex) {
            System.out.println("The file does not exist.");
        }
    }

    public void exmple2() throws Exception {

        String result = "";
        try {
            obtainLiveStockPrices();
            result = "Live";
        } finally {
            System.out.println("Processing: " + result + " data");
        }

    }

    private void obtainLiveStockPrices() {
        // TODO Auto-generated method stub
    }

}

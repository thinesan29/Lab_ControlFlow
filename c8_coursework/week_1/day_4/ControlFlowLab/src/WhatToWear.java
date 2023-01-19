public class WhatToWear {
    public static void main(String[] args) {

        int temperature = 33;
        String condition = "Rainy";


        if (temperature <= 3 || condition == "Snow") {
            System.out.println("Wear a winter insulated jacket!");
        } else if ((temperature > 4 && temperature <= 15) && (condition == "Cloudy" || condition == "Rainy" || condition == "Sunny")) {
            System.out.println("Wear a normal jacket!");
        } else if ((temperature > 16 && temperature <= 25) && (condition == "Cloudy" || condition == "Rainy" || condition == "Sunny")) {
            System.out.println("Wear a rain jacket");
        } else if (temperature > 26 || (condition == "Cloudy" || condition == "Sunny" || condition == "Rainy")) {
            System.out.println("No jacket needed !");
        } else {
            System.out.println("System Error");
        }
    }
}

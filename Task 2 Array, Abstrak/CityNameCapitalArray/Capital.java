package CityNameCapitalArray;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Capital {
    public static void main(String[] args) {
        City[] cities = {
                new City("Salatiga","Central java"),
                new City("Semarang","Central java"),
                new City("Bekasi","West java"),
                new City("Jakarta","West java")
        };

        String filename = "ArrayCity.txt";

        try {
            String Print = "";
            File file = new File("ArrayCity.txt");
            FileOutputStream output = new FileOutputStream(file);
            for (City city : cities) {
                Print = Print +"City Name : "+ city.getCity_name()+" || "+"Capital Name : "+ city.getCapital()+"\n";
            }
            output.write(Print.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
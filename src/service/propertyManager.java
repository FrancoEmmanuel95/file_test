package service;

import model.Property;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class propertyManager<T> {
    private Map<Integer,T> list = new HashMap<>();

    public propertyManager(String fileName) {

    }

    public void loadDataFromFile(String fileName){
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int id = 0;
            while((line = br.readLine()) != null){
                id ++;
                String[] part = line.split(",");
                String owner = part[0];
                String address = part[1];
                Double area = Double.parseDouble(part[2]);
                Double salePrice = Double.parseDouble(part[3]);
                Double rentalPrice = Double.parseDouble(part[4]);
                Boolean rented = Boolean.parseBoolean(part[5]);
                Boolean sold = Boolean.parseBoolean(part[6]);
                list.put(id,new Property(owner,address,area,salePrice,rentalPrice,rented,sold));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

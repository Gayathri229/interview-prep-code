package com.gayathri.interview.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Coimbatore");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        System.out.println(cities);

        cities.remove("Hyderabad");

        System.out.println(cities);
        cities.set(1, "Bengaluru");
        System.out.println(cities);
        System.out.println(cities.get(0));


        List<Integer> cityTemp = new LinkedList<>();
        cityTemp.add(43);
        cityTemp.add(34);
        cityTemp.add(25);

        ObjectsInList cityObject1 = new ObjectsInList();
        cityObject1.setCityName("Delhi");
        cityObject1.setCityTemp(45);


        ObjectsInList cityObject2 = new ObjectsInList();
        cityObject2.setCityName("Mumbai");
        cityObject2.setCityTemp(32);

        ObjectsInList cityObject3 = new ObjectsInList();
        cityObject3.setCityName("Kolkata");
        cityObject3.setCityTemp(33);


        List<ObjectsInList> cityTempName = new ArrayList<>(); // List contains data of type Object - ObjectsInList
        cityTempName.add(cityObject1);
        cityTempName.add(cityObject2);
        cityTempName.add(cityObject3);
//        cityTempName.add(new ObjectsInList("meh", 21));

//        System.out.println(cityTempName.get(0).getCityName() + " " +cityTempName.get(0).getCityTemp());

        for(int i=0; i<cityTempName.size()-1; i++){
            System.out.println(cityTempName.get(i).getCityName() + " " + cityTempName.get(i).getCityTemp());
        }


    }
}

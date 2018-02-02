package FullFieldGame;

import java.util.ArrayList;

public class DotComBust {

    int numOfHits = 0;
    private ArrayList<String> locationCells;
    String name;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {

        int index = locationCells.indexOf(stringGuess);
        String result = "Мимо";
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            }
            else {
                result = "Попал";
            }
        }
        System.out.println(result);
        return result;
    }

}

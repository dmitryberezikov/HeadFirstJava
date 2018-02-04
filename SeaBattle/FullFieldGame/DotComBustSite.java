package FullFieldGame;

import java.util.ArrayList;

public class DotComBustSite {

    int numOfHits = 0;
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String givingName) {
        name = givingName;
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

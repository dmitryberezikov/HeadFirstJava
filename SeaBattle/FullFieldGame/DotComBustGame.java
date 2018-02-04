package FullFieldGame;

import java.util.ArrayList;

public class DotComBustGame {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        BustGameHelper helper = new BustGameHelper();

        DotComBust site1 = new DotComBust();
        DotComBust site2 = new DotComBust();
        DotComBust site3 = new DotComBust();

        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> locations = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            locations.add(Integer.toString(randomNum + i));
        }

        site1.setName("pets.com");
        site2.setName("go2.com");
        site3.setName("google.com");

        site1.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число: ");
            String result = site1.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток");
            }

        }

    }


}

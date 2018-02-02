import java.util.ArrayList;

public class DotComBust {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom site = new DotCom();
        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> locations = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            locations.add(Integer.toString(randomNum + i));
        }

        site.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число: ");
            String result = site.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток");
            }

        }

    }


}

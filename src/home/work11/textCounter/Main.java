package home.work11.textCounter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus "
                + "at faucibus. Donec @@mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit "
                + "blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget "
                + "vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Integer vel odio nec mi tempor dignissim. 15 15 15 15";

        TextCounter.printMostPopularWord(inputString);

//        this code need to solve task in stepic, code above to test
//        Scanner scanner = new Scanner(System.in);
//        String inputStringTwo = scanner.nextLine();
    }
}

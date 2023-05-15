import java.util.Arrays;

public class Wiederholung {
    public static void main(String[] args) {
        int counter = 0;
        while (true) {
            System.out.println("ich kann zaehlen: " + counter);
            counter++;
            if (counter <= 10) {
                continue;
            } else {
                break;
            }
        }


        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray[" + i + "]= " + myArray[i]);
        }
    }
}


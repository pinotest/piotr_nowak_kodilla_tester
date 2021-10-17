import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class RandomNumbers {
    private List<Integer> drawing = new ArrayList<Integer>();

    public void drawing() {
        Random number = new Random();
        int end = 50000;
        while (end > 0){
            int drawNumber = number.nextInt(31);
            end = end - drawNumber;
            this.drawing.add(drawNumber);
          //  System.out.println(drawNumber);
        }

    }
    public int getMaxNumber(){
        int max = 0;
        for (Integer i: this.drawing) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public int getMinNumber(){
        int min = 31;
        for (Integer i: this.drawing) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public static void main(String[] args) {

        RandomNumbers losowanie = new RandomNumbers();
        losowanie.drawing();
        System.out.println("losowanie.getMaxNumber(los): "+losowanie.getMaxNumber());
        System.out.println("losowanie.getMinNumber(los): "+losowanie.getMinNumber());


    }
}

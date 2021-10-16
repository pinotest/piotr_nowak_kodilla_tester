import java.util.Random;

public class Loops {
    public static void main(String[] args){
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        for (String name : names) {
            System.out.println(name);
        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        int[] listOfNumbers = {1,2,3,4};
        System.out.println("SUMA: "+ sumOfElements(listOfNumbers))    ;

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        Loops loop = new Loops();
        int a = loop.getCountOfRandomNumber(10);
        System.out.println("A:  "+ a);

    }
    public static int sumOfElements(int[] counting){
        int sum = 0 ;
        for (int j : counting) {
            sum = sum + j;
            System.out.println(j);
        }
        return sum;
    }
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}

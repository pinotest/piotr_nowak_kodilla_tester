public class SimpleArray {
    public static void main(String[] args) {
        String [] petsType = new String [5];
        petsType[0] = "dog";
        petsType[1] = "cat";
        petsType[2] = "bird";
        petsType[3] = "golden fish";
        petsType[4] = "snake";

        String elementWithIndexThree = petsType[3];
        System.out.println(elementWithIndexThree);

        int numberOfPetsTypeElements = petsType.length;
        System.out.println("Moja tablica z rodzajami zwierzaków zawiera "+numberOfPetsTypeElements+" elementów" );
    }
}

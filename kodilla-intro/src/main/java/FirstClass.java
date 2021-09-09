public class FirstClass {
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(600, 100, 2001);
        System.out.println(notebook.weight);
        System.out.println(notebook.price);
        notebook.checkPrice();
        Notebook heavynotebook = new Notebook(3600, 20000, 1999);
        System.out.println(heavynotebook.weight);
        System.out.println(heavynotebook.price);
        heavynotebook.checkPrice();
        Notebook newnotebook = new Notebook(300, 990, 2020);
        System.out.println(newnotebook.weight);
        System.out.println(newnotebook.price);
        System.out.println(newnotebook.weight+newnotebook.price);
        System.out.println(newnotebook.weight+" "+ newnotebook.price);
        newnotebook.checkPrice();
    }

}

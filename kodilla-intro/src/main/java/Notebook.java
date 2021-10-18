public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600 && this.year > 2010) {
            System.out.println("This notebook is cheap and brand new");
        } else if (this.price < 1000 && this.year > 2010) {
            System.out.println("The notebook has good price but brand new.");
        } else if (this.price < 1000 && this.year < 2010) {

        System.out.println("The notebook hah good price but is not modern.");
    }
        else {
            System.out.println("Notebook is expensive");
        }
    }
    public void checkWeight(){
        if (this.weight < 1000){
            System.out.println("This notebook is very cheap");
        }else if (this.weight <2000){
            System.out.println("The price is good.");
        }

        else {
            System.out.println("Notebook is expensive");
        }
    }

}

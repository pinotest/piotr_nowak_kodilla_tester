public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title){

        Book object = new Book();
        object.author = author;
        object.title = title;
        return object;

    }
}

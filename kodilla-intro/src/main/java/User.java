public class User {
    private String userName;
    private int userAge;
    public User(String name, int age){
        this.userAge = age;
        this.userName = name;
    }
    public String getUserName(){
        return this.userName;
    }
    public int getUserAge(){
        return this.userAge;
    }
    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna,betty,carl,david,eva,frankie};

        double ageSum = 0 ;
        for (int i =0; i <users.length;i++){
            ageSum = ageSum + users[i].userAge;
        }
        double averageAge = ageSum / users.length;
        System.out.println("averageAge: " + averageAge);
        for (int i =0; i <users.length;i++) {
            if (users[i].getUserAge() < averageAge){
            System.out.println("User with age below averageAge: " + users[i].getUserName() +" age: "+users[i].getUserAge());
        }}

    }}


public class LeapYear {
    public static void main(String[] args) {
        int year1 = 1900;
        int year2 = 2016;
        int year3 = 1976;
        System.out.println(year1 + " :" + isLeapYear(year1));
        System.out.println(year2 + " :" + isLeapYear(year2));
        System.out.println(year3 + " :" + isLeapYear(year3));
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}

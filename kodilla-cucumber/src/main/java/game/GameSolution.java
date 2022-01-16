package game;

public class GameSolution {
    public String checkIfDivided(int number){
        if (number % 3 == 0){
            if (number %5 == 0){
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if (number %5 == 0){
            return "Buzz";
        }
        return "None";
    }
}

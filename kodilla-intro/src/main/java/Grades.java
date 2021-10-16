public class Grades {
    private int[] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }
    public void addGrades(int grade) {
        if (this.size == 10) {
            return;}
        this.grades[this.size] = grade;
        this.size++;
    }
    public int getLastGrade(){
        if (this.size > 0){
            //System.out.println("ooo:  "+this.grades[this.size - 1 ]);
        return this.grades[this.size - 1 ];
        }else {
        return 0;
    }}
    public int getAverageGrades(){
        int sum = 0;
        int avg;
        if (this.size==0)
            {return 0;
        }
        else {
            for (int j : this.grades) {
                sum = sum + j;
                //System.out.println("sum: "+sum);

            }
            avg = sum / this.size;
            return avg;
        }
    }

}

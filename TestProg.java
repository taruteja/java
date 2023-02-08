public class TestProg {
    public static void main(String[] args){
        int marks1=95;
        gradecheck(marks1);
    }
    public static char gradecheck(int marks){
        char grade;
        if (marks>90 && marks<=100){
            grade='S';
        }
        else  if (marks>80 && marks<=90){
            grade='A';
        }
        else  if (marks>70 && marks<=80){
            grade='B';
        }
        else {
            grade='F';
        }
        return grade;
    }

    public static void dispaly(){
        String name="tarun";

    }
}

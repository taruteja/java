public class throwjava {
    public static void validate(int age){
        age=23;
        if (age<18){
            throw new ArithmeticException("Not eligible to Vote");
        }
        else {
            System.out.println("You are eligible for Vote");
        }
    }
    public static void main(String[] args){
        validate(23);
    }
}

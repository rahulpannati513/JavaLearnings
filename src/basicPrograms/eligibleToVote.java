import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class eligibleToVote {
    public static void main(String []args){
        System.out.println("Enter The Age of the Person :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if ( age > 18 ){
            System.out.println("Eligilbe To vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }

    }

}

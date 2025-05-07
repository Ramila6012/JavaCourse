package org.Exception;

public class AssignmentException {

    public void display(int age) throws UserDefinedException
    {
        if(age < 18){
            throw new UserDefinedException(" You are less than 18 years old");
        }
    }

    public static void main(String[] args) {
        AssignmentException a = new AssignmentException();
        try {
            a.display( 29);
        } catch (UserDefinedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("You are of right age");
    }

}

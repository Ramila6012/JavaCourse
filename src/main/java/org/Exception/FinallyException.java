package org.Exception;

public class FinallyException {
    int num[]= {1,2,3,4,5};

    public void display(){
        System.out.println(num[2]);
    }

    public static void main(String[] args) {
        FinallyException f = new FinallyException();
        try {
            f.display();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("This is from finally clause");
        }
    }

}

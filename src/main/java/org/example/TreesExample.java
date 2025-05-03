package org.example;

 public class TreesExample {
    int treesCount;
    String color= "Green";
    Branches bran = null;

    public void display(){
        System.out.println("I am first method");
    }

    /*public String display(int number){
        return "There are "  + number + " leaves";
    }*/

    public int display(int count){
        return count;
    }

     public int display(int count, int cost){
         return count+cost;
     }

     public static void main(String[] args) {
         TreesExample t = new TreesExample();
         System.out.println(t.color);
    t.bran= new Branches(3, "Wood");
    System.out.println(t.bran.color);
    t.display();
    System.out.println(t.display(5));
    System.out.println(t.display(9,12));
     }
}



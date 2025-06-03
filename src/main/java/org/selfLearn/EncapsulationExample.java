package org.selfLearn;

public class EncapsulationExample {

    private int age ;
    private String name;
    public String gender= "Male";

    public int getAge(){
        //System.out.println(age);
        return age;
    }
    public String getName(){
        // System.out.println(name);
        return name;
    }

    public void setAge(int a){
        a= age;
    }

    public void setName(String n){
        name= n;
    }

}

    class People{
        public static void main(String[] args) {
            EncapsulationExample e = new EncapsulationExample();
            System.out.println(e.gender);
            e.setAge(12);
            e.setName("Ramila");
            System.out.println(e.getAge() + " : "+ e.getName());
        }


}

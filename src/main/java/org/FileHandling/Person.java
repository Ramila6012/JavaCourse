package org.FileHandling;

public class Person implements Cloneable{
    String personName;
    int personId;


    public Person(String personName, int personId) {
        this.personName = personName;
        this.personId = personId;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person("Niranjan", 5);
        Person p1 = new Person("Ramila", 7);
        Person p2 = new Person("Niranjan", 5);
        Person p3= (Person)p1.clone();
        System.out.println(p.equals(p2));
        System.out.println(p3.personId + " " +p3.personName);
        /*System.out.println(p.toString());
        System.out.println(p.hashCode());*/
    }

    @Override
    public String toString() {
        return "personName is : " + personName;
    }


    @Override
    public int hashCode() {
        return this.personId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
            if(obj== null || this.getClass() != obj.getClass()){
                return false;
            }

            Person p1 = (Person) obj;
            return p1.personName == this.personName && this.personId == p1.personId;
}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



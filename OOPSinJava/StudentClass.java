package OOPSinJava;

public class StudentClass {
     static class Student{
        int roll;
        String name;
        float marks;
        Student(int roll,String name,float marks){
            this.roll = roll;
            this.name= name;
            this.marks=marks;
        }
    }
    public static void main(String[] args) {
        Student aftab = new Student(13,"aftab",88.9f);
        Student preeti = new Student(17,"preeti",65.0f);
        System.out.println(aftab.roll);
        System.out.println(aftab.marks);
        System.out.println(aftab.name);
        System.out.println(preeti.roll);
        System.out.println(preeti.name);
        System.out.println(preeti.marks);




    }
}

package exercitiul1;

public class Student {
    String name = "Unknown";
    int age = -1 ;
    String course = "Unknown";
    int mark = -1 ;

    void Learning (){
        System.out.println(this.name + "is learning something ");
    }
    void Working(){
        System.out.println(this.name + "started to work on a new project");
    }
    void Swimming (){
        System.out.println(this.name + "is swimming for 30 minutes ");
    }

    String showCourse(){
        return this.course;
    }

    void setStudentCourse(String course){
        this.course = course ;
    }
    Student(){

    }
    Student(String name, int age, String course, int mark){
        this.name = name;
        this.course = course;
        this.mark = mark;
        this.age = age;


    }

}

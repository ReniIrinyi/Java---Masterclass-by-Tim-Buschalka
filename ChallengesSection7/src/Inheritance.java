public class Inheritance {

    public static void main(String[] args) {
        Student2 max=new Student2("max", 21);
        System.out.println(max.toString());
        PrimarySchoolStudent jimmy=new PrimarySchoolStudent("jimmy", 8, "Carol");
        System.out.println(jimmy);

    }

}


class Student2 {
    private String name;
    private int age;
    Student2 (String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
        /*return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'; */
    }
}

 class PrimarySchoolStudent extends Student2{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName=parentName;
    }

    @Override
    public String toString() {
        return parentName+"s "+ "kid " + super.toString();
    }
}

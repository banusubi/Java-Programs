package inheritance;

//Multilevel
public class College {
    void CollegeData(){
        System.out.println("Welcome to the college");
    }
}
class ClassRoom extends College{
    void ClassMethod(){
        System.out.println("It's our new ClassRoom");
    }
}
class Students extends ClassRoom{
    void StudentsName(){
        System.out.println("Students Keep Quite");
    }
}
class Staffs{
    public static void main(String[] args) {
        Students s = new Students();
        s. CollegeData();
        s.ClassMethod();
        s.StudentsName();
    }
}
package inheritance;

public class CareerLadder {
    void CareeLadderMain(){
        System.out.println("Welcome To Career Ladder");
    }
}
class StaffOne extends CareerLadder{
    void Meghana(){
        System.out.println("This is staff one");
    }
}
class StaffTwo extends CareerLadder{
    void Janani(){
        System.out.println("This is staff two");
    }
}
class StudentOne extends StaffOne{
    void Batch1(){
        System.out.println("We Are staff one students ");
    }
}
class StudentTwo extends StaffTwo{
    void Batch2(){
        System.out.println("We are Staff two Student");
    }
}

class Main1{
    public static void main(String[] args) {
        StudentOne s = new StudentOne();
        s.Meghana();
        s.Batch1();
        s.CareeLadderMain();
        StudentTwo s1 = new StudentTwo();
        s1.Janani();
        s1.Batch2();
        s1.CareeLadderMain();
    }
}

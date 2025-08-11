package inheritance;

//Herarchical
public class Friends {
    void FriendsNames(){
        System.out.println("Your Friend name");
    }
}

class Neha extends Friends{
    void NehaR (){
        System.out.println("She is neha");
    }
}

class Priya extends Friends{
    void PriyaS (){
        System.out.println("I'm Priya Neha's Friend ");
    }
}
class Banu extends Friends{
    void BanuR (){
        System.out.println("And This is Banu Priya's Friend");
    }
}

class Details{
    public static void main(String[] args) {
        Neha n = new Neha();
        n.NehaR();
        n.FriendsNames();
        Priya p = new Priya();
        p.PriyaS();
        p.FriendsNames();
        Banu b = new Banu();
        b.BanuR();


    }
}
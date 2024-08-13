public class Inheritance {
    public static void main(String[] args) {
        
    
    son s=new son();
    System.out.println(s.gender);
    s.display();
    System.out.println(s.age);
    }
}

    class GrandFather{
        char gender='M';
    void display(){
        System.out.println("print parent class");

    }
    

    
}
class Father extends GrandFather{
    char gender='N';
    
    }

class son extends Father{
    String Name="varshini";
    int age=34;

}

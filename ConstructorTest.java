import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee(400,"harry");
        staff[1] = new Employee(400);
        staff[2] = new Employee();
        for(Employee e : staff)
            System.out.println("name"+ e.getName()+" id:"+ e.getId()+"salary:"+ e.getSalary());
    }
}

class Employee{
    private static int nextId;

     private int id;
     private String name = "";
     private double salary;

     static{ //静态初始化块
         Random generator = new Random();
         nextId = generator.nextInt(1000);
     }

    {//初始化块
        id = nextId;
        nextId++;
    }

    public Employee(double salary, String name){
         this.salary = salary;
         this.name = name;
    }

    public Employee(double salary){
         this(salary,"Employee #"+nextId);
    }

    public Employee(){

    }

    public  String getName() {
        return name;
    }

    public double getSalary(){
         return salary;
    }

    public int getId(){
         return id;
    }
}

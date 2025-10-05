import java.util.*;

/*

Object oriented programming is a paradigm that oganises code into classes which act as blueprint
of a required functionality and objects which are instances of them 

class is the blueprint of an object that defines the properties and functionalities 
it is a template that outlines the structure 

constructor is a special method in a class that is used to initialise the attributes of the class

resuablity , modularity , scalability abstraction are main features of oops 

*/

class Car{
    int id;
    String engine;
    
    Car(int id,String engine){
        this.id = id;
        this.engine = engine;
    }
    
    void display(){
        System.out.println("The car with ID:"+id+" has engine:"+engine);
    }
};

public class oops1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car(1,"v8");
        Car car2 = new Car(2,"v12");
        car1.display();
    }
}

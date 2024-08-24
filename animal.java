import java.util.Scanner;


abstract class animal{

    public abstract void animalEats();
    
}


class Dog extends animal{
    public void animalEats(){
        System.out.println("A eats kibble");
    }
}

class Cat extends animal{
    public void animalEats(){
        System.out.println("A cat eats wet food");
    }
}

class main{
    public static void main(String[] args) {
        animal dog1 = new Dog ();
        animal cat1 = new Cat();

        Scanner S = new Scanner(System.in);
        System.out.println("Enter 'D' for Dog or 'C' for Cat");
        char animal = S.next().charAt(0);

        if(animal == 'D' || animal =='d')
        {
            dog1.animalEats();
        }
        else if(animal == 'C' || animal =='c')
        {
            cat1.animalEats();
        }
        else
        {
            System.out.println("Incorrect Input Please Enter a D or C");
        }



        
        
        

    }
}

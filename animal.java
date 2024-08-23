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

    dog1.animalEats();
    cat1.animalEats();

    }
}

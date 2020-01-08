
//abstract parent class
abstract class Animal{
   //abstract method
   public abstract void sound();
}

class Cat extends Animal{

   public void sound(){
	System.out.println("Meow");
   }
   public static void main(String args[]){
	Animal cA = new Cat();
	cA.sound();
   }
}
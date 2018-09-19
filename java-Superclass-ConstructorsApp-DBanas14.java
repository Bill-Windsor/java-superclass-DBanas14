public class ConstructorsApp {

public static void main(String[] args) {

// We create an Animals object named genericAnimal
	Animals genericAnimal = new Animals();
	System.out.println(genericAnimal.getName());
	System.out.println(genericAnimal.favFood);

// New Cat class: Morris
Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
	System.out.println();
	System.out.println(morris.getName());
	System.out.println(morris.favFood);
	System.out.println(morris.favToy);

// "Every Cat is an Animal; but not every Animal is a Cat"
Animal tabby = new Cat("Tabby", "Salmon", "Ball");

// We pass the object 'tabby' just like any other field
acceptAnimal(tabby);
}

public static void acceptAnimal(Animal randAnimal) {
	System.out.println();
	System.out.println(randAnimal.getName());
	System.out.println(randAnimal.favFood);
	System.out.println();

// Polymorphism: the Java interpreter determines what type of Animal is
// declared: whenever an object is passed or a method is called for a specific object, 
// the Java interpreter checks to make sure if the current method overwrites the 
// superclass method, to call the new method instead
// Polymorphism: Java interpreter can find any methods that both exist in the 
// Animals class as well as the Cats class. However, the Java interpreter 
// cannot find any fields or methods that are defined only in the Subclass.

	randAnimal.walkAround();

// If you want to access fields or methods only found in the Cats Subclass, 
// you have to cast the Object to that specific Class first.
	Cats tempCat = (Cats) randAnimal;
	System.out.println(tempCat.favToy);

	// Or ^ cast the Object directly to the Subclass first [better]
	System.out.println(((Cats)randAnimal).favToy);

	if (randAnimal instanceof Cats) {
		System.out.println(randAnimal.getName() + " is a Cat.");
	}
	if (randAnimal instanceof Animals) {
		System.out.println(randAnimal.getName() + " is an Animal.");
	}
}

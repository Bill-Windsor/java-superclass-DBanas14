public class Cats extends Animals {
// Inheritance: Cats is a subclass of Animals; 
// inherits all the methods and fields defined in Animals

	private String favToy = "Yarn";

	public void playWith() {
		System.out.println("Yeah " + favToy);
}

	public void walkAround() {
		System.out.println(this.getName() + " stalks around and then sleeps.");
	}

	public String getToy() {
		return this.favToy;
	}

	public Cats() {

	}

	public Cats(String name, String favFood, String favToy) {
// super calls the constructor for the Superclass Animal
		super(name, favFood);

// We set the favToy in Cats because it doesn't exist in the Animals class
		this.favToy = favToy;
	}
}

import java.util.*;

class Animal {
    public String name;
    int legs;
    public int getLegs() {
	return legs;
    }
}
class Dog extends Animal {
    public Dog(String n, int l) {
	name = n;
	legs = l;
    }
    public String toString() {
	return name + ", " + legs;
    }
    public static void main(String[] args) {
	ArrayList<Dog> pack = new ArrayList<>();
	pack.add(new Dog("john", 4));
	pack.add(new Dog("jim", 7));
	pack.add(new Dog("john", 5));
	System.out.println(pack);
	Collections.sort(pack, new AnimalCompare());//has to pass in comparator
	System.out.println(pack);
    }
    
}
class AnimalCompare implements Comparator<Animal> {
        public int compare(Animal a1, Animal a2) {
	if (a1.name.compareTo(a2.name) == 0) {
	    return a1.legs-a2.legs;
	}
	return a1.name.compareTo(a2.name);
	}
    
	}

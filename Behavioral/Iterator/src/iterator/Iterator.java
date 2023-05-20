package iterator;

//Iterátor interfész. Ezt fogja implementálni a konrét iterátor osztály.
public interface Iterator {
	
	public boolean hasNext();
	
	public Object next();

}

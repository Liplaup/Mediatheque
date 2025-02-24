package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();
	
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		ItemPrinter m = new ItemPrinter();
		for(Item i : items){
			i.accept(m);
		}
	}
	
	public void printOnlyBooks() {
		BookPrinter m = new BookPrinter();
		for(Item i : items){
			i.accept(m);
		}
	}

	public void printOnlyCDs() {
		CDPrinter m = new CDPrinter();
		for(Item i : items){
			i.accept(m);
		}
	}

}
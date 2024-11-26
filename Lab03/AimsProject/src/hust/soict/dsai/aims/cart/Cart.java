package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full.");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added!");
			qtyOrdered++;
		}
	}
	
/*	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (DigitalVideoDisc disc : dvdList) {
			addDigitalVideoDisc(disc);
		}
	}
*/	
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for (DigitalVideoDisc disc : dvdList) {
			addDigitalVideoDisc(disc);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty!");
		}
		else {
			boolean found = false;
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i] == disc) {
					found = true;
					for (int j = i; j < qtyOrdered - 1; j++) {
						itemsOrdered[j] = itemsOrdered[j+1];
					}
					itemsOrdered[qtyOrdered-1] = null;
					qtyOrdered--;
					System.out.println("The disc is successfully removed!");
					break;
				}
			}
			if (!found) {
				System.out.println("Removed Failed. The disc '" + disc.getTitle() + "' is not in the cart.");
			}
		}
	}
	
	public float totalCost() {
		float cost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for(int i = 0; i < qtyOrdered; ++i) {
			DigitalVideoDisc disc = itemsOrdered[i];
			System.out.println((i + 1) + ". " + disc);
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	// Search by Id
	public boolean search(int id) {
		for(int i = 0; i < qtyOrdered; ++i) {
			DigitalVideoDisc disc = itemsOrdered[i];
			if(disc.getId() == id) {
				System.out.println("Found in cart: " + disc);
				return true;
			}
		}
		System.out.println("Not found!");
		return false;
	}

    // Search by title
    public boolean search(String title) {
		for(int i = 0; i < qtyOrdered; ++i) {
			DigitalVideoDisc disc = itemsOrdered[i];
			if(disc.isMatch(title)) {
				System.out.println("Found in cart: " + disc);
				return true;
			}
		}
		System.out.println("Not found!");
		return false;
	}
}

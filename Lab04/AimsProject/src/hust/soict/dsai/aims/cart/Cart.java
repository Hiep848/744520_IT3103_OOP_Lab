package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;
import java.util.*;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public Cart() {
        itemsOrdered = new ArrayList<>(MAX_NUMBERS_ORDERED);
    }
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(itemsOrdered.size() > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
            return;
        } else {
            itemsOrdered.add(disc);
            System.out.println("The disc has been added to the cart!");
        }
        return;
    }
	
	public boolean addMedia(Media m) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            return false;
        } else {
            itemsOrdered.add(m);
            return true;
        }
    }
	
	public boolean removeMedia(Media m) {
        if (itemsOrdered.contains(m)) {
            itemsOrdered.remove(m);
            System.out.println("Media removed successfully");
            return true;
        } else {
            System.out.println("This media has not been added to the cart");
            return false;
        }
    }
	
	public int numberDVDsInCart() {
		int count = 0;
		for (Media m: itemsOrdered) {
			if (m instanceof DigitalVideoDisc) {
				count++;
			}
		}
		return count;
	}
	
	public void displayItemsOrdered() {
		for (Media item: this.itemsOrdered) {
			System.out.print(item.getTitle() + ", ");
		}
		System.out.println();
	}
	public float totalCost() {
		float cost = 0;
		for (Media item: this.itemsOrdered) {
			cost += item.getCost();
		}
		return cost;
	}
	
	public void displayCart() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (Media m: this.itemsOrdered) {
			System.out.println(m.toString());
		}
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("**************************************************");
	}
	
	public Media searchInCart(String title) {
		for (Media m: itemsOrdered) {
			if (m.isMatch(title)) {
				return m;
			}
		}
		return null;
	}
	
	public Media searchInCart(int id) {
		for (Media m: itemsOrdered) {
			if (m.getId() == id) {
				return m;
			}
		}
		return null;
	}
	
	public void sortCartByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	public void sortCartByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
}
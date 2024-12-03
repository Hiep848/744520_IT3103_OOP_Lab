package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;


public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public Cart() {
		itemsOrdered = new ArrayList<>(MAX_NUMBERS_ORDERED);
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
	public float totalCost() {
		float cost = 0;
		for (Media item: this.itemsOrdered) {
			cost += item.getCost();
		}
		return cost;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (Media m : this.itemsOrdered) {
			System.out.println(m.toString());
		}
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	public Media search(int id) {
		for (int i = 0; i < itemsOrdered.size(); ++i) {
			Media media = itemsOrdered.get(i);
			if (media.getId() == id) {
				System.out.println("Found in cart: " + media);
				return media;
			}
		}
		System.out.println("Not found!");
		return null;
	}

	public Media search(String title) {
		for (int i = 0; i < itemsOrdered.size(); ++i) {
			Media media = itemsOrdered.get(i);
			if (media.getTitle().equals(title)) {
				System.out.println("Found in cart: " + media);
				return media;
			}
		}
		System.out.println("Not found!");
		return null;
	}
}

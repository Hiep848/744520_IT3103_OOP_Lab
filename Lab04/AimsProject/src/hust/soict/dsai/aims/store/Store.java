package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    private final int MAX_SIZE = 100000;


    private DigitalVideoDisc[] itemsInStore;
    private int qtyStore = 0;

    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_SIZE];
    }

    public void addDVD(DigitalVideoDisc disc) {
        // Check if the DVD is already in the store
        for (int i = 0; i < qtyStore; i++)
        {
            if (itemsInStore[i].equals(disc)) {
                System.out.println("This disc is already in the store!");
                return;
            }
        }

        // Add to the store
        itemsInStore[qtyStore++] = disc;
    }

    public void removeDVD(DigitalVideoDisc disc) {
        // Find position  of the disc
        int discPosition = -1;
        for (int i = 0; i <qtyStore; i++)
        {
            if (itemsInStore[i].equals(disc)) {
                discPosition = i;
                break;
            }
        }

        if (discPosition == -1) {
            System.out.println("This disc does not exist in the store");
            return;
        }

        for (int i = discPosition; i < qtyStore - 1; i++) {
            itemsInStore[i] = itemsInStore[i + 1];
        }
        itemsInStore[qtyStore - 1] = null;
        qtyStore -= 1; 
        
        System.out.println("The disc has been removed successfully");
    }

    public void print() {
		System.out.println("***********************STORE***********************");
		System.out.println("Store list:");
		for (int i = 0; i < qtyStore; ++i) {
			DigitalVideoDisc disc = itemsInStore[i];
			System.out.println((i + 1) + ". " + disc);
		}
		System.out.println("****************************************************");
	}
}

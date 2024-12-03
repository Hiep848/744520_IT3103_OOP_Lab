package hust.soict.dsai.aims.media;

import java.util.*;

public class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	
	
	public Media(int id, String title, String category, float cost) {
        super();
		this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Media other = (Media) obj;
		return Objects.equals(title, other.title);
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public String toString() {
		String res = this.getId() + ".Media: ";
		if (this.getTitle()!=null) {
			res += "Title: " + this.getTitle() + "\n";
		}
		if (this.getCategory()!=null) {
			res += "Category: " + this.getCategory() + "\n";
		}
		if (this.getCost() != 0.0f) {
			res = "Cost: " + res + this.getCost();
		}
		return res;
	}
	
	
}

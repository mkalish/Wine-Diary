package com.wine;

import org.w3c.dom.Text;


public class WineEntry {
	private String img_name;
	private int rating;
	private Text description;
	
	public void setImage(String image){
		img_name = image;
	}
	
	public String getImage(){
		return img_name;
	}
	
	public void setRating(int rate){
		rating = rate; 
	}
	
	public int getRating(){
		return rating;
	}
	
	public void setDescription(Text desc){
		description = desc;
	}
	
	public Text getDescription(){
		return description;
	}
}

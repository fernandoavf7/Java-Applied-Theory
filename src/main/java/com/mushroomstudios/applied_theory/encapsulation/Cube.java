package com.mushroomstudios.applied_theory.encapsulation;

public class Cube {

	/* A public access modifier means that you can access to the property or method from any place */
	public String material;
	/* A protected access modifier means that you can access to the property or method only from same package */
	protected double weight;
	/* A private access modifier means that you can access to the property or method only from same class */
	private Integer height;
	private Integer width;
	private Integer deep;
	
	//* If you do not specify a visibility modifier, the default visibility scope is assigned
	
		/*
		 * You can set private for your attributes and access to they through your access and modifiers 
		 * methods (Getters and Setters)
		 */
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getDeep() {
		return deep;
	}
	public void setDeep(Integer deep) {
		this.deep = deep;
	}
	
	/*
	 * ToString method can be overrided for return the result of our object in a specific time,
	 * its useful for to know in a visible way the state of attributes
	 */
	@Override
	public String toString() {
		return "Cube [material=" + material + ", weight=" + weight + ", height=" + height + ", width=" + width
				+ ", deep=" + deep + "]";
	}
	
	
	//own method, retur the cube type
	public String getCubeType() {
		return "I am a Generic Cube";
	}
	
}

package com.masai;

public class Player {
private int age ;
private float weight;
 private String name;
public Player(int age, float weight, String name) {
	super();
	this.age = age;
	this.weight = weight;
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public float getWeight() {
	return weight;
}
public void setWeight(float weight) {
	this.weight = weight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Player [age=" + age + ", weight=" + weight + ", name=" + name + "]";
}
 
}

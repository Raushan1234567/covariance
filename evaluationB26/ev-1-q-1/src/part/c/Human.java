package part.c;

class Human {
    private double weight;
    private double height;
    private double bodyMassIndex;

    public Human(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    

    public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getBodyMassIndex() {
		return bodyMassIndex;
	}



	public void setBodyMassIndex(double bodyMassIndex) {
		this.bodyMassIndex = bodyMassIndex;
	}



	@Override
    public String toString() {
        return "Weight: " + weight + " kg, Height: " + height + " m, BMI: " + bodyMassIndex;
    }
}

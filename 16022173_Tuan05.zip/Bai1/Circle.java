class Circle    {
    double pi = 3.14;
    private double radius;
    String color;
    
    void setRadius(double radius)   {
        this.radius = radius;
    }
    double getRadius()  {
        return this.radius;
    }

	public String toString() {
		return "radius = " + radius + ", color: " + color;
	}

    Circle()  {
        radius = 1.0;
        color = "red";
    }

    Circle(double radius)   {
        this.radius = radius;
    }

    double getArea()    {
        return getRadius()*getRadius()*pi;
    }

}

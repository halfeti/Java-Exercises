class Cylinder extends Circle {
    private double height;

    void setHeight(double height)   {
        this.height = height;
    }
    double getHeight()  {
        return this.height;
    }

    Cylinder()    {
        this.height = 1.0;
    }

    Cylinder(double radius) {
        this.setRadius(radius);
    }

    Cylinder(double radius, double height)  {
        this.height = height;
        this.setRadius(radius);
    }

    double getVolume()  {
        return this.getArea() * this.getHeight();
    }
}
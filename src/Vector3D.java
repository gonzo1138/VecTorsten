public class Vector3D implements myVector {

    //Fields
    private Point origin;
    private Point destination;
    private double length;
    private double height;
    private double width;
    private double depth;

    //Constructor
    Vector3D(Point from, Point to){
        this.origin = from;
        this.destination = to;

        this.width = Math.abs(destination.getX() - origin.getX());
        this.height = Math.abs(destination.getY() - origin.getY());
        this.depth = Math.abs(destination.getZ() - origin.getZ());

        length = Math.abs(Math.sqrt( Math.pow(this.width, 2) + Math.pow(this.height, 2) + Math.pow(this.depth, 2) ));
    }

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public String toString(){
        return String.format("Die Vektor-Länge beträgt: %s, x: %s, y: %s, z:%s", this.length, this.width, this.height, this.depth);
    }
}
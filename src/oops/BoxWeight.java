package oops;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight =-1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // super keyWord -> call the parent class constructor
        // used to initialise the values in present in parent class
        this.weight = weight;
    }
}

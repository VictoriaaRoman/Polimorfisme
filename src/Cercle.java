public class Cercle extends Figura {
    private double r;
    public Cercle(double r){
    super();
    this.r= r;
    }
    public double area(){
        return Math.PI*this.r*this.r;
    }
}

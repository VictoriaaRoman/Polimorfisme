import java.util.Arrays;
import java.util.Comparator;
public class GestorFigures {

    public static void main (String[] args){
        Figura[] vector = new Figura[4];
        vector[0]= new Cercle(2);
        vector[1]= new Rectangle(5,10);
        vector[2]= new TriangleEQ(5,4);
        vector[3]= new Quadrat(4);
        double resultat = suma(vector);
        System.out.println("El resultat de la suma és: "+ resultat);
        System.out.println(vector);
        sort(vector);
        System.out.println(vector);
    }
    public static double suma (Figura[] vector){
        double suma = 0;
        for (Figura v: vector){
            suma += v.area();
        }
        return suma;
    }
    public static void sort (Figura[] vector){
        Arrays.sort(vector);
    }

}

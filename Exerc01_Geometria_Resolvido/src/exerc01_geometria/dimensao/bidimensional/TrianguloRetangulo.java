// package dimensao.bidimensional;

public class TrianguloRetangulo{

    double cateto1;
    double cateto2;
    double hipotenusa;
    double alturaHipotenusa;

    public TrianguloRetangulo(){}

    public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa, double alturaHipotenusa){

        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
        this.alturaHipotenusa = alturaHipotenusa;

    }


    double areaTriangulo (double cateto1, double cateto2){

        return (cateto1 * cateto2) / 2;

    }

    double perimetroTriangulo (double cateto1, double cateto2, double hipotenusa){

        return cateto1 + cateto2 + hipotenusa;

    }

}
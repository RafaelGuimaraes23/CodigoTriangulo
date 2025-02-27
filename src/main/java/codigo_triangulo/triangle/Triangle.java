package codigo_triangulo.triangle;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
/*
A outra opcao era de se inserir o tipo de variavel por exemplo
double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
return result;

Essa maneira tbm funciona mas o melhor 'e o de cima por evita quantidades enormes de codigos.
*/

    public String maiorValor(double areaX, double areaY) {
        String resposta ;
        if(areaX > areaY){
            resposta = "Larger area: X";

        }else {

            resposta = "Larger area: Y";
        }
        return resposta;
    }
}


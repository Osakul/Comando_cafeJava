
package exerc02_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc02_Geometria {

    public static void main(String[] args) {
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        
        // TODO 4 apague as linhas de acesso direto aos atributos
        ///////// sabemos que este tipo de acesso é prejudical para o projeto, porque quebra o encapsulamento, burlando validações e deixa o objeto vulnerável.
        //tr1.cateto1 = 6;
        //tr1.cateto2 = 5;
        //tr1.hipotenusa = 7;
        //tr1.alturaHipotenusa = 4.5;

        // TODO 5 através do set, atribua valor 14.5 para o atributo cateto1
        // TODO 6 através do set, atribua valor 48.1 para o atributo cateto2
        // TODO 7 através do set, atribua valor 51.2 para o atributo hipotenusa
        // TODO 8 através do set, atribua valor 12.3 para o atributo alturaHipotenusa
        tr1.setCateto1(14.5); 
        tr1.setCateto2(48.1);
        tr1.setHipotenusa(51.2);
        tr1.setAlturaHipotenusa(12.3);
        // TODO 9 comente: as atribuições deram certo? Por quê?
        //eles deram certo, porque agora estão públicos e com validação. Caso fosse direto, daria erro e ignoraria a regra da validação.
        
        
        // TODO 10 crie aqui uma variável double de nome areaTr1
        // TODO 11 através do objeto tr1, acesse o método calcArea() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do método na variável areaTr1
        // TODO 12 imprima o valor da área da seguinte forma: "Área do triângulo tr1: <VALOR>"
        // TODO 13 comente: por que está dando erro?
        // TODO 14 comente: o que pode ser feito para resolver este erro?
        double areaTr1;
        areaTr1 = tr1.calcArea();
        System.out.println("Área do triângulo tr1 : " + areaTr1);


        // TODO 16 crie aqui uma variável double de nome perimetroTr1
        // TODO 17 através do objeto tr1, acesse o método calcPerimetro() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do método na variável perimetroTr1
        // TODO 18 imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo tr1: <VALOR>"
        double perimetroTr1;
        perimetroTr1 = tr1.calcPerimetro();
        System.out.println("Perímetro do triângulo tr1 : "  + perimetroTr1);
        
        // TODO 19 comente: por que está dando erro?
        // Está tendo erro de acesso caso não for públic. 

        // TODO 20 comente: o que pode ser feito para resolver este erro?
        // porque o processo main está outro pacote.

        // TODO 21 crie um outro objeto através do construtor, passando um valor inválido
        // TODO 22 através do objeto da tarefa anterior, chame os métodos calcArea() e calcPerimetro()
        // TODO 23 imprima os valores dos cálculos
        TrianguloRetangulo tr2 = new TrianguloRetangulo(-3, 4, 5, 2);
        System.out.println("Área do triângulo tr2 : " + tr2.calcArea());
        System.out.println("Perímetro do triângulo tr2 : " + tr2.calcPerimetro());

        // TODO 24 comente: o que acontece? o que fazer para consertar este problema?
        // Para resolvermos o problema, em vez de usarmos System.exit (eu manti o System.exit por causa do TODO 2-3)
        // Podermos lançar exceção nos settes e tratar com try/catch 
        
    }
    
}

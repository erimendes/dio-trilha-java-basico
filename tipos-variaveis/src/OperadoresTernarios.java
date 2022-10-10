public class OperadoresTernarios {
    
    public static void main(String[] args){
        // classe Operadores.java
    int a, b;

    a = 5;
    b = 6;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        resultado = a!=b ? "verdadeiro" : "falso";
        System.out.println(resultado);


    }
}

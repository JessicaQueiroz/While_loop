package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] postagens = {
	            "Bom dia",
                "Boa tarde",
                "Boa noite"
	    };
	    System.out.println(postagens.length);
	    int numero = 0;
	    int totalPostagens = postagens.length;
	    while (numero < totalPostagens){
            System.out.println(postagens[numero]);
            System.out.println("#####");
            numero += 1;
        }
    }
}

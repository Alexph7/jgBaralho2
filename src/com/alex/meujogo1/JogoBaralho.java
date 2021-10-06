package com.alex.meujogo1;

import java.security.SecureRandom;

public class JogoBaralho {

    private final String[] numeros = {"Az", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private final String[] nipes = {"Copas", "Ouros", "Paus", "Espadas"};
    private final String carta[] = new String[52];
    SecureRandom random = new SecureRandom();
         
    public JogoBaralho() {

        for (int i = 0; i < carta.length; i++) {
            this.carta[i] = this.numeros[random.nextInt(13)] + " de " + this.nipes[random.nextInt(4)];
        }
    }
    public String cartaAtual(){
        
       String cartaAt = carta[random.nextInt(1)];
        return cartaAt;
    }
}

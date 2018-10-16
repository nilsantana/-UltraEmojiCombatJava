/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Nil
 */
public class Luta {
    
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2){
     if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2 ){
         this.aprovada   = true;
         this.desafiado  = l1;
         this.desafiante = l2;
     }else{
         this.aprovada   = false;
         this.desafiado  = null;
         this.desafiante = null;
     }
    }
    public void lutar(){
        if (this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch(vencedor){
                case 0: //empate
                    System.out.println("Luta empatada");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();       
                    break;
                case 1: //vitoria desafiado
                    System.out.println("Vitoria de "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //vitoria desafiante
                    System.out.println("Vítoria de "+this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            
            }
        }else{
        System.out.println("Luta não Aprovada");
        }
    }
    //Métodos especiais
    //getters & setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}

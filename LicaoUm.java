/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class LicaoUm {
    public static void main (String [] args){
        //entrada
    double mediaUm = 4.8;
    double mediaDois = 8.9;
    double mediaTres = 9.6;
    
    //processamento
    double media = (mediaUm + mediaDois + mediaTres) / 3;
    
    //saída
        if (media>= 7){
        System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}


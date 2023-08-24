package pedro.projetoaula;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1091392313013
 */
public class Soma {
    public static void main(String[] args){
        //Scanner input de dados
        
        Scanner input = new Scanner(System.in);
        int number1, number2, sum;
        
        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        System.out.printf("A soma é %d%n", sum);
       
    }
}

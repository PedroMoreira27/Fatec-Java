/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.projetoaula;

import java.util.Scanner;

/**
 *
 * @author 1091392313013
 */
public class Comparacao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int number1, number2;
        
        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();
        
        if(number1 == number2)
            System.out.printf("Os numeros são iguais %d == %d%n",number1,number2);
        if(number1 != number2){
            System.out.printf("O segundo numero é diferente do segundo %d != %d%n",number1,number2);
        }
        if(number1 > number2){
            System.out.printf("O primeiro numero é maior %d > %d%n",number1,number2);
        }
        if(number1 < number2){
            System.out.printf("O primeiro numero é menor %d < %d%n",number1,number2);
        }
        if(number1 > number2){
            System.out.printf("O primeiro numero é maior ou igual %d >= %d%n",number1,number2);
        }
        if(number1 < number2){
            System.out.printf("O primeiro numero é menor ou igual %d <= %d%n",number1,number2);
        }
    }
}

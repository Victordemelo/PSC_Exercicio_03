/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author victo
 */import java.util.Scanner;
public class PSC_Exercicio_03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double ano_nasc, ano_atual;
        double calc_ano;
        
        System.out.println("Digite o Ano de Nascimento: ");
        ano_nasc = leitor.nextDouble();
        System.out.println("Digite o Ano Atual: ");
        ano_atual = leitor.nextDouble();
        
        
        if (ano_nasc > ano_atual){ 
            System.out.println("Ano de Nascimento inválido");
        } else { 
            calc_ano = ano_atual - ano_nasc;
            System.out.printf("A idade do indíviduo é: %.0f%n" , calc_ano);
        }      
    }
}

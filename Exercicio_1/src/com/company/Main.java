package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao;
        boolean repetir;
        Scanner in = new Scanner(System.in);

        do
        {
            System.out.println("---------------------------------");
            System.out.println(" SISTEMA DE CONSULTA DE VEÍCULOS ");
            System.out.println("---------------------------------");

            System.out.println("\nEscolha uma das opções abaixo: ");
            System.out.println("(1) Consultar por placa");
            System.out.println("(2) Consultar por marca");
            System.out.println("(3) Consultar por ano");
            System.out.println("(4) Consultar por tipo");
            
            opcao = in.nextInt();
            repetir = false;

            switch(opcao)
            {
                case 1: consultaPorPlaca();
                        break;
                case 2: consultaPorMarca();
                        break;
                case 3: consultaPorAno();
                        break;
                case 4: consultaPorTipo();
                        break;
                default: System.out.println("\nOpção inválida. Tente novamente usando algum dos números relacionados com opções do menu (1,2,3 ou 4).");
                         repetir = true;
                         break;
            }
        } while(repetir);

        in.close();
    }

    public static void consultaPorPlaca()
    {
        // write your code here
    }

    public static void consultaPorMarca()
    {
        // write your code here
    }

    public static void consultaPorAno()
    {
        // write your code here
    }

    public static void consultaPorTipo()
    {
        // write your code here
    }
}

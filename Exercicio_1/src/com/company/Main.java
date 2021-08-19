/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

import java.util.Scanner;

/**
 *
 * @author Marcio
 */
public class Main {
    
    public static void novaBusca() {
        System.out.println("---------------------------------------------");
        System.out.println("Deseja fazer uma nova busca? 1 = Sim, 2 = Não");
    }
    
    public static void main(String[] args) {
        catalogo c = new catalogo();
        Scanner in = new Scanner(System.in);
        int menu = 0;
        System.out.println("Bem-vindo(a) à Loja de Carros, digite abaixo a opção desejada");
        while (menu == 0) {

            System.out.println("1 - Apresentar todos os dados do inventário");
            System.out.println("2 - Procurar dados de um produto por seu código");
            System.out.println("3 - Apresentar valor total de todos os carros do catalogo");
            System.out.println("4 - Buscar por Modelo");
            System.out.println("5 - Encerrar o programa");
            menu = in.nextInt();
            int buscaCod;
            novaBusca:
            switch (menu) {
                case 1:
                    c.todosDados();
                    novaBusca();
                    menu = in.nextInt();
                    switch (menu) {
                        case 1:
                            menu = 0;
                            break novaBusca;
                        case 2:
                            System.out.println("Obrigado por utilizar o software, até breve");
                            System.exit(0);
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Digite o código do veiculo");
                    buscaCod = in.nextInt();
                    c.buscaCodigo(buscaCod);
                    novaBusca();
                    menu = in.nextInt();
                    switch (menu) {
                        case 1:
                            menu = 0;
                            break novaBusca;
                        case 2:
                            System.out.println("Obrigado por utilizar o software, até breve");
                            System.exit(0);
                        default:
                            break;
                    }
                    break;
                case 3:
                    c.valorTotal();
                    novaBusca();
                    menu = in.nextInt();
                    switch (menu) {
                        case 1:
                            menu = 0;
                            break novaBusca;
                        case 2:
                            System.out.println("Obrigado por utilizar o software, até breve");
                            System.exit(0);
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Digite o modelo do veiculo");
                    String modelo = in.nextLine();
                    c.buscaModelo(modelo);
                    novaBusca();
                    menu = in.nextInt();
                    switch (menu) {
                        case 1:
                            menu = 0;
                            break novaBusca;
                        case 2:
                            System.out.println("Obrigado por utilizar o software, até breve");
                            System.exit(0);
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o software, até breve");
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida");
                    menu = 0;
                    System.out.println("--------------------------------------------");
                    break;
            }      
        }
    }
}

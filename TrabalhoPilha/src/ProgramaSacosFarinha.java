import java.util.*;

public class ProgramaSacosFarinha {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int opcao = 0;
            
            do {
                System.out.println("\n1. Carregar saco de farinha");
                System.out.println("2. Descarregar saco de farinha");
                System.out.println("3. Sair");
                
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o peso do saco (kg): ");
                          int peso = sc.nextInt();
                         System.out.print("Digite o ano de fabrico do saco: ");
                       int data = sc.nextInt();

                        
                           //Tratando sacos fabricados recentemente e os mais antigos    
                       
                         if (data >= 2019 && data<=2023){
                              fila.add("Saco de farinha de " + peso + "kg");
                             System.out.print(" O saco e recente, bom estado para consumo ");
                             
                        }if (data<2019){
                              fila.add("Saco de farinha de " + peso + "kg");
                         System.out.print("O saco pode ja ter expirado");
                        }
                         
                         if (data>2023){
                          System.out.print("Não é possivel ter um saco fabricado depois de 2023");
                           break;
                         }
                      
                        System.out.println("\n Saco de farinha adicionado à fila de descarregamento.");
                                           
                                                                      
                        
                        break;
                        
                    case 2:
                        if (fila.isEmpty()) {
                            System.out.println("\n Não há sacos de farinha na fila de descarregamento.");
                        } else {
                          
                            String saco = fila.poll();
                            System.out.println("\n Saco de farinha descarregado: " + saco);
                            
                        }
                        break;
                        
                    case 3:
                        System.out.println("Encerrando o programa.");
                        break;
                        
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (opcao != 3);
        }
    }

}

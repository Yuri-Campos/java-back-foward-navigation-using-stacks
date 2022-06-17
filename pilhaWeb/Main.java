package pilhaWeb;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PilhaGenerica<String> pilhaWeb = new PilhaGenerica<>(5);
		Scanner scanner = new Scanner(System.in);
		String paginaUm = "home";
		String paginaDois = "Pagina de Pesquisa";
		String paginaTres = "Pagina Acessada";
		String paginaQuatro = "Outra Pagina relacionada a pesquisa";
		String paginaAtual = paginaUm;
		int navegador = -1;
		do {
			
			
			switch(paginaAtual) {
			  case "home":
				 System.out.println("Pagina atual: " + paginaAtual);
				 System.out.println("1 - Pesquisar");
				 System.out.println("0 - Fechar Navegador");
				 navegador = scanner.nextInt();
				 if(navegador == 1)
				 {
					 pilhaWeb.push(paginaAtual);
					 paginaAtual = paginaDois;
				 }
				 
			    break;
			  case "Pagina de Pesquisa":
				  navegador = -1;
				  System.out.println("Pagina atual: " + paginaAtual);
				  System.out.println("1 - Acessar primeira pagina");
				  System.out.println("2 - Acessar segunda pagina");
				  System.out.println("3 - Voltar");
				  System.out.println("0 - Fechar navegador");
				
				  navegador = scanner.nextInt();
				  if(navegador == 1)
				  {
					  pilhaWeb.push(paginaAtual);
					  paginaAtual = paginaTres;
				  }
				  else if(navegador == 2)
				  {
					  pilhaWeb.push(paginaAtual);
					  paginaAtual = paginaQuatro;
				  }
				  if(navegador == 3)
					{
						paginaAtual  = pilhaWeb.pop();
					}
				  
			    break;
			  case "Pagina Acessada":
				  navegador = -1;
				  System.out.println("Pagina atual: " + paginaAtual);
				  System.out.println("3 - Voltar");
				  System.out.println("0 - Fechar navegador");
				  navegador = scanner.nextInt();
				  
				  if(navegador == 3)
					{
						paginaAtual  = pilhaWeb.pop();
					}
				 
				  break;
			  case "Outra Pagina relacionada a pesquisa":
				  navegador = -1;
				  System.out.println("Pagina atual: " + paginaAtual);
				  System.out.println("3 - Voltar");
				  System.out.println("0 - Fechar navegador");
				  navegador = scanner.nextInt();
				  
				  if(navegador == 3)
					{
						paginaAtual  = pilhaWeb.pop();
					}
				  break;
			  default:
			    navegador = 0;
			}
			
		}while(navegador != 0);
		
		scanner.close();
	}
}

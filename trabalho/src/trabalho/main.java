package trabalho;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Ingresso> ingressos = new ArrayList<>();
		ficharioIngresso fi = new ficharioIngresso(ingressos);
		
		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			
		System.out.println("1 - Incluir");
		System.out.println("2 - Alterar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Consultar ");
		System.out.println("5 - Relatorio");
		System.out.println("6 - Encerrar ");
		op = Integer.parseInt(sc.nextLine());
		
		switch(op) {
		
		case 1:
			fi.incluirIngresso();
			break;
		case 2:
			fi.alterarIngresso();
			break;
		case 3:
			fi.excluirIngresso();
			break;
		case 4:
			fi.consultarIngresso();
			break;
		case 5:
			fi.relatorioIngresso();
			break;
		case 6:
			System.out.println("Encerrando programa.");
			break;
		}
		}while(op != 6);
		
		
sc.close();
	}

}

package ex02;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		Aluno p = new Aluno();
		int a = 0;
		
		while(a != 3) {
			System.out.println("-- Menu --");
			System.out.println("Digite o numero para selecionar");
			System.out.println("1 - Criar aluno");
			System.out.println("2 - Mostrar aluno criado");
			System.out.println("3 - Sair");
			a = l.nextInt();
			
			switch(a) {
			case 1:
				System.out.println("Digite seu RA: ");
				p.setRa(l.next());
				System.out.println("Digite seu Nome: ");
				p.setNome(l.next());
				System.out.println("Digite a nota da sua AC1: ");
				p.setAc1(l.nextFloat());
				System.out.println("Digite a nota da sua AC2: ");
				p.setAc2(l.nextFloat());
				System.out.println("Digite a nota da sua AG: ");
				p.setAg(l.nextFloat());
				System.out.println("Digite a nota da sua AF: ");
				p.setAf(l.nextFloat());
				break;
			case 2:
				p.imprimir();
				break;
			case 3:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção invalida");
				System.out.println(" ");
			}
		}
		
		
	}
}

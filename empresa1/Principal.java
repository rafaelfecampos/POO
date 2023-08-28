import java.util.Scanner;

public class Principal
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("### EMPRESA XPTO ###");
        
        System.out.println("# Informe o nome da empresa #");
        Empresa emp = new Empresa(leia.next());
        
        System.out.println("# empresa: " + emp.getNome());
        
        while(true){
            Funcionario f = new Funcionario();
            System.out.println("## nome do Funcionario? #");
            f.setNome(leia.next());
            System.out.println("## Salario bruto? #");
            f.setSalarioBruto(leia.nextDouble());
            System.out.println("## numero de filhos? #");
            f.setNFilhos(leia.nextInt());
            System.out.println("## usa Vale transporte? #");
            f.setUsaValeTransporte(leia.nextBoolean());
            System.out.println("## eh gerente? (Sim ou Nao)#");
            f.setEhGerente(leia.next().equalsIgnoreCase("S"));
            
            System.out.println("## Nome " + f.getNome() + " Salario R$" + f.salarioLiquido());
            
            
            System.out.println("Deseja cadastrar outro? (S/N)");
            if(leia.next().equalsIgnoreCase("N")){ //como String eh uma classe, nao tem como compara-la diretamente
                break;
            }
        }
    }
}
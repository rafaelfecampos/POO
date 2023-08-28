public class Funcionario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome; //todos sao public se nao for especificado
    private double salarioBruto;
    private boolean usaValeTransporte, ehGerente;
    private int nFilhos;

    //construtor
    public Funcionario()
    {
    }
    
    //Metodos de acesso
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        //this.nome = nome; //this utiliza a variavel da classe
        if (!nome.toUpperCase().equals("")){
            this.nome = nome;
        }
    }
    
    public int getNFilhos(){
        return nFilhos;
    }
    public void setNFilhos(int nFilhos){
        if(nFilhos >=0){
            this.nFilhos = nFilhos;
        }
    }
    
    public double getSalarioBruto(){
        return salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto){
        if(salarioBruto>=0){
            this.salarioBruto = salarioBruto;
        }
    }
    
    public boolean getUsaValeTransporte(){
        return usaValeTransporte;
    }
    public void setUsaValeTransporte(boolean usaValeTransporte){
        this.usaValeTransporte=usaValeTransporte;
    }
    
    public boolean getEhGerente(){
        return ehGerente;
    }
    public void setEhGerente(boolean ehGerente){
        this.ehGerente=ehGerente;
    }
    
    //Metodos
    public double salarioLiquido()
    {
        // escreva seu código aqui
        double salario = salarioBruto - inss()- descontoVale() + bonusFilhos() + bonusGerente();
        return salario;
    }
    public double inss()
    {
        return 0.13*salarioBruto;
    }
    public double descontoVale()
    {
        /*if(usaValeTransporte == true){
            return salarioBruto*0.03;
        }
        else{
            return 0;
        }*/
        return (usaValeTransporte)?(salarioBruto*0.03):0;
    }
    public double bonusFilhos()
    {
        /*if(nFilhos>=0 && nFilhos <= 3){
            return 115.00*nFilhos;
        }
        else{
            return 115.00*3;
        }*/
        return (nFilhos >=0 && nFilhos <=3)?(nFilhos*115):3*115;
    }
    public double bonusGerente()
    {
        /*if(ehGerente == true){
            return salarioBruto*0.1;
        }
        else{
            return 0;
        }*/
        return (ehGerente)?(salarioBruto*0.1):0;
    }
}

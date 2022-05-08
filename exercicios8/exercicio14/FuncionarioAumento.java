public class FuncionarioAumento {
    String nome;
    Double salario;

    public FuncionarioAumento (String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public Double getSalario(){
        return salario;
    }

    public Double aumentarSalario(Double taxaAumento) {
        this.salario = this.salario + (this.salario * taxaAumento/100);
        return 0.0;
    }

    public static void main(String[] args) {
        FuncionarioAumento funcionario1 = new FuncionarioAumento("leonardo",1200.0);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());
        funcionario1.aumentarSalario(10.0);
        System.out.println();
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());
    }
}

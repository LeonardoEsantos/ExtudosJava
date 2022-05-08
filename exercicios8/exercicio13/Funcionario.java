public class Funcionario {
    String nome;
    Double salario;

    public Funcionario (String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public Double getSalario(){
        return salario;
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("leonardo",1200.0);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());
    }
}

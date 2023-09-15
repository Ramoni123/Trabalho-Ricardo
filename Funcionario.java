
package OO;

public class Funcionario {
    private double altura;
    private String nome;
    private String cpf;
    private double salario;


    public Funcionario() {
    }

    public Funcionario(double altura, String nome, String cpf, double salario) {
        this.altura = altura;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double aplicarbonus(double valor) {
        return this.salario * 0.2;

    }
}
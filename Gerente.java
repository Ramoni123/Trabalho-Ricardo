package OO;

public class Gerente extends Funcionario {
    private String cargo;
    private String senha;

    @Override
    public double getSalario() {
        return 0;
    }

    public Gerente(String cargo, String senha) {
        this.cargo = cargo;
        this.senha = senha;
    }


    public Gerente(double altura, String nome, String cpf, double salario, String cargo, String senha) {
        super(altura, nome, cpf, salario);
        this.cargo = cargo;
        this.senha = senha;
    }


    public String getCargo(){
        return cargo;

    }


    public Gerente() {

    }

}

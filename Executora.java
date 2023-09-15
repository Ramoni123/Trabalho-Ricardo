package OO;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class Executora {

    private static Scanner leitura = new Scanner(System.in);
    private static List<Funcionario> funcs = new ArrayList<>();
    private static Gerente gerente;

    private static boolean sair = false;

    public static void main(String[] args) {

        int opc;

        while (!sair) {

            System.out.println("Escolha uma opção:");
            System.out.println("0: Fechar o menu");
            System.out.println("1: Registrar Funcionário ");
            System.out.println("2: Registrar Gerente");
            System.out.println("3: Excluir Gerente ");
            System.out.println("4: Excluir Funcionário ");
            System.out.println("5: Aplicar Bônus ao Funcionário ");
            System.out.println("6: Visualizar Func/Ger");
            opc = leitura.nextInt();
            leitura.nextLine();

            switch (opc) {
                case 0:
                    System.out.println("Fechando o Menu.");
                    sair = true;
                    break;

                case 1:
                    System.out.print("Escreva o nome do Funcionário: ");
                    String nomeFunc = leitura.next();
                    System.out.print("Escreva o CPF do Funcionário: ");
                    String cpfFunc = leitura.next();
                    System.out.print("Escreva a Altura do Funcionário: ");
                    double altFunc = leitura.nextDouble();
                    System.out.print("Escreva o Salário do Funcionário: ");
                    double salFunc = leitura.nextDouble();

                    Funcionario novoFunc = new Funcionario(altFunc, nomeFunc, cpfFunc, salFunc);
                    funcs.add(novoFunc);
                    System.out.println("Funcionario Registrado");

                    System.out.println("Escolha uma opção:");
                    System.out.println("0: Voltar ao menu principal");
                    System.out.println("1: Encerrar o programa");
                    opc = leitura.nextInt();
                    leitura.nextLine();

                    switch (opc) {
                        case 0:
                            break;

                        case 1:
                            System.out.println("Encerrando o programa.");
                            sair = true;
                            break;

                        default:
                            System.out.println("Opção inválida. Encerrando o programa.");
                            sair = true;
                            break;
                    }
                    break;

                case 2:
                    if (gerente == null) {
                        leitura.nextLine();
                        System.out.print("Escreva o nome do Gerente: ");
                        String nomeGer = leitura.nextLine();
                        System.out.print("Escreva o CPF do Gerente: ");
                        String cpfGer = leitura.nextLine();
                        System.out.print("Escreva a Altura do Gerente: ");
                        double altGer = leitura.nextDouble();
                        System.out.print("Escreva o Salário do Gerente: ");
                        double salGer = leitura.nextDouble();
                        System.out.print("Escreva o Cargo do Gerente: ");
                        String carGer = leitura.next();
                        System.out.print("Escreva a Senha do Gerente: ");
                        String senGer = leitura.next();

                        gerente = new Gerente(altGer, nomeGer, cpfGer, salGer, carGer, senGer);
                        System.out.println("Gerente Registrado com sucesso");
                        System.out.println("Escolha uma opção:");
                        System.out.println("0: Voltar ao menu ");
                        System.out.println("1: Encerrar o programa");
                        opc = leitura.nextInt();
                        leitura.nextLine();

                        switch (opc) {
                            case 0:
                                break;

                            case 1:
                                System.out.println("Encerrando o programa.");
                                sair = true;
                                break;

                            default:
                                System.out.println("Opção inválida!");
                                sair = true;
                                break;
                        }
                    } else {
                        System.out.println("Já existe um gerente registrado");

                    }


                    break;


                case 3:
                    leitura.nextLine();

                    if (gerente != null) {
                        System.out.print("Digite o CPF do Gerente que deseja excluir: ");
                        String cpfExcluir = leitura.nextLine();

                        if (cpfExcluir.equals(gerente.getCpf())) {

                            gerente = null;
                            System.out.println("Gerente excluído ");

                        } else {
                            System.out.println("Não foi encontrado o CPF");
                        }
                    } else {
                        System.out.println("Nenhum gerente para ser excluído");

                    }
                    break;


                case 4: leitura.nextLine();

                    if (!funcs.isEmpty()) {
                        System.out.print("Digite o CPF do Funcionário que deseja excluir: ");
                        String cpfExcluir = leitura.nextLine();

                        boolean encontrar = false;
                        for (Funcionario func : funcs) {
                            if (cpfExcluir.equals(func.getCpf())) {
                                funcs.remove(func);
                                encontrar = true;
                                System.out.println("Funcionário excluído");
                                break;
                            }
                        }

                        if (!encontrar) {
                            System.out.println("CPF não existe");
                        }
                    } else {
                        System.out.println("Nenhum funcionário para ser excluído");
                    }


                    System.out.println("Escolha uma opção:");
                    System.out.println("0: Voltar ao menu principal");
                    System.out.println("1: Encerrar o programa");
                    opc = leitura.nextInt();
                    leitura.nextLine();

                    switch (opc) {
                        case 0:
                            break;

                        case 1:
                            System.out.println("Encerrando o programa.");
                            sair = true;
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            sair = true;
                            break;
                    }
                    break;

                case 5:
                    leitura.nextLine();

                    if (!funcs.isEmpty()) {
                        System.out.print("Digite o CPF do Funcionário: ");
                        String cpfBonus = leitura.nextLine();

                        boolean encontrar = false;
                        for (Funcionario func : funcs) {
                            if (cpfBonus.equals(func.getCpf())) {
                                System.out.print("Digite o valor do bônus: ");
                                double valor = leitura.nextDouble();

                                double novoSalario = func.getSalario() + valor;
                                func.setSalario(novoSalario);

                                encontrar = true;
                                System.out.println("Bônus aplicado com sucesso.");
                                break;
                            }
                        }

                        if (!encontrar) {
                            System.out.println("Não foi encontrado o CPF.");
                        }
                    } else {
                        System.out.println("Nenhum funcionário para aplicar o bônus.");
                    }


                    System.out.println("Escolha uma opção:");
                    System.out.println("0: Voltar ao menu principal");
                    System.out.println("1: Encerrar o programa");
                    opc = leitura.nextInt();
                    leitura.nextLine();

                    switch (opc) {
                        case 0:
                            break;

                        case 1:
                            System.out.println("Encerrando o programa.");
                            sair = true;
                            break;

                        default:
                            System.out.println("Opção inválida");
                            sair = true;
                            break;
                    }
                    break;

                case 6:
                    for (Funcionario func : funcs) {
                        System.out.println("Informações do Funcionário");
                        System.out.println("Nome " + func.getNome());
                        System.out.println("CPF " + func.getCpf());
                        System.out.println("Altura " + func.getAltura());
                        System.out.println("Salário " + func.getSalario());
                    }
                    System.out.println();

                    if (gerente != null) {
                        System.out.println("Informações do Gerente");
                        System.out.println("Nome: " + gerente.getNome());
                        System.out.println("CPF: " + gerente.getCpf());
                        System.out.println("Salário: " + gerente.getSalario());
                        System.out.println("Cargo: " + gerente.getCargo());
                    }


                    System.out.println("Escolha uma opção:");
                    System.out.println("0: Voltar ao menu principal");
                    System.out.println("1: Encerrar o programa");
                    opc = leitura.nextInt();
                    leitura.nextLine();
                    switch (opc) {
                        case 0:
                            break;

                        case 1:
                            System.out.println("Encerrando o programa.");
                            sair = true;
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            sair = true;
                            break;
                    }


            }
        }
        leitura.close();
    }
}


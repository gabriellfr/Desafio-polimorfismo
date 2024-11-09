package sistema.pagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario funcionario = new Funcionario("João", 3000.0);
        Gerente gerente = new Gerente("Maria", 5000.0, 2000.0);
        Diretor diretor = new Diretor("Carlos", 7000.0, 5000.0);

        funcionarios.add(funcionario);
        funcionarios.add(gerente);
        funcionarios.add(diretor);

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.calcularFolhaPagamento(funcionarios);
    }
}

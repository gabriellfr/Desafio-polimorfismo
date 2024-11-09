package sistema.pagamento;

public class Diretor extends Funcionario {
    private double participacaoLucros;

    public Diretor(String nome, double salarioBase, double participacaoLucros) {
        super(nome, salarioBase);
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + participacaoLucros;
    }
}

package br.ufg.inf.ex6;

public class TestaFabrica {

    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        for (int i = 1; i <= 5; i++) {
            Operario operario = new Operario(i + "", i * 5, 'M');
            operario.setCategoria();
            operario.setSalario();
            fabrica.contrataOperario(operario);
        }

        for (int i = 6; i <= 10; i++) {
            Operario operario = new Operario(i + "", i * 10, 'F');
            operario.setCategoria();
            operario.setSalario();
            fabrica.contrataOperario(operario);
        }

        for (Operario operario : fabrica.getFuncionarios()) {
            System.out.println("Operário " + operario.getMatricula() + ": " + operario.getSalario());
        }

        System.out.println("Total da folha de pagamento do mês: " + fabrica.getTotalFolhaPagamento());
        System.out.println("Total de peças fabricadas no mês: " + fabrica.getTotalPecasFabricadas());
        System.out.println("Média de peças fabricadas pelos homens da categoria A: " + fabrica.getMediaPecasHomensCategoriaA());
        System.out.println("Média de peças fabricadas pelos mulheres da categoria C: " + fabrica.getMediaPecasMulheresCategoriaC());
        System.out.println("Matrícula do(a) operário(a) com maior salário: " + fabrica.getOperarioMaiorSalario().getMatricula());
    }
}

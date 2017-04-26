package br.ufg.inf.ex5;

public class TestaEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        for (int i = 1; i <= 35; i++) {
            Comerciario comerciario = new Comerciario(i, i * 2, i * 3, (double) (i * 500));
            comerciario.setSalarioBruto();
            comerciario.setSalarioLiquido();
            empresa.contrataComerciario(comerciario);
        }

        for (Comerciario comerciario : empresa.getFuncionarios()) {
            System.out.println("Comerciário " + comerciario.getNumeroInscricao());
            System.out.println("\t\tSalário bruto: " + comerciario.getSalarioBruto());
            System.out.println("\t\tSalário líquido: " + comerciario.getSalarioLiquido() + "\n");
        }
    }
}

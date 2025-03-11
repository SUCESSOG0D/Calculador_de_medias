
public class Aluno {

    private String nome;
    private String codMat;
    private String cpf;
    private char sexo;
    private double notaP1;
    private double notaP2;
    private double notaP3;


    public Aluno(String nome, String codMat, String cpf, char sexo,
                 double notaP1, double notaP2, double notaP3) {
        this.nome = nome;
        this.codMat = codMat;
        this.cpf = cpf;
        this.sexo = sexo;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaP3 = notaP3;
    }


    public void ImprimeAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Código de Matrícula: " + codMat);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo (char): " + sexo);
        System.out.println("Nota P1: " + notaP1);
        System.out.println("Nota P2: " + notaP2);
        System.out.println("Nota P3: " + notaP3);
    }


    public void ImprimeSexo() {
        System.out.print("Aluno: " + nome + " - Sexo: ");
        if (sexo == 'M') {
            System.out.println("Masculino");
        } else if (sexo == 'F') {
            System.out.println("Feminino");
        } else {
            System.out.println("Desconhecido");
        }
    }


    public double MediaAluno() {
        double menorNota = Math.min(notaP1, Math.min(notaP2, notaP3));
        double somaNotas = notaP1 + notaP2 + notaP3;
        double somaDasDuasMaiores = somaNotas - menorNota;
        return somaDasDuasMaiores / 2.0;
    }


    public String Resultado() {
        double media = MediaAluno();
        return (media >= 6.0) ? "Aprovado" : "Reprovado";
    }
}


public class TesteAluno {
    public static void main(String[] args) {
        Aluno A1 = new Aluno(
                "Paulo",
                "66666",
                "26724837107",
                'M',
                7.0,
                8.0,
                9.0
        );

        Aluno A2 = new Aluno(
                "Ana",
                "26737",
                "37794762702",
                'F',
                1.0,
                2.7,
                10.0
        );

        System.out.println("=== Dados do Aluno A1");
        A1.ImprimeAluno();

        System.out.println("Média de A1: " + A1.MediaAluno());
        System.out.println("Resultado de A1: " + A1.Resultado());

        A1.ImprimeSexo();

        System.out.println();

        System.out.println("=== Dados do Aluno A2");
        A2.ImprimeAluno();

        System.out.println("Media do A2" + A2.MediaAluno());
        System.out.println("Resultado de A1: " + A2.Resultado());

        A2.ImprimeSexo();
    }
}

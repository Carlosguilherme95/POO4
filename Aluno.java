import java.util.Scanner;

public class Aluno {
    private String nome;
    private String curso;

    private String disciplina;
    private Double matricula;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome, String curso, String disciplina, Double matricula) {
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
        this.matricula = matricula;
    }
    public void cadastroNotas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota1:");
        nota1 = Double.valueOf(scanner.nextLine());
        System.out.println("Digite sua nota2:");
        nota2 = Double.valueOf(scanner.nextLine());
        calcmedia();
    }
    public void calcmedia(){
        if((nota1 + nota2) / 2 >= 7){
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }
    }
    public void mostrarDados(){
        Double media = (nota1 + nota2) / 2;
        System.out.println(nome +" sua primeira nota foi " + nota1 + " Sua segunda nota foi " +nota2 + "sua média é " + media);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getMatricula() {
        return matricula;
    }

    public void setMatricula(Double matricula) {
        this.matricula = matricula;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
}

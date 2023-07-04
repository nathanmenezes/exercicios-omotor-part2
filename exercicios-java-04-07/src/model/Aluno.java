package model;

import java.util.List;

public class Aluno {
    private String nome;

    private Float nota;

    public static Float calcularMediaAlunos(List<Aluno> alunos) {
        Float somaNotas = 0f;

        for (Aluno aluno : alunos) {
            somaNotas += aluno.nota;
        }

        return somaNotas / alunos.size();
    }
}

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;
import br.com.dio.desafio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIzabella = new Dev();
        devIzabella.setNome("Izabella");
        devIzabella.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Izabella: " + devIzabella.getConteudosIncritos());
        devIzabella.progredir();
        devIzabella.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Izabella: " + devIzabella.getConteudosIncritos());
        System.out.println("Conteudo Concluidos Izabella: " + devIzabella.getConteudosConcluidos());
        System.out.println("XP: " + devIzabella.calcularTotalXP());

    }
}
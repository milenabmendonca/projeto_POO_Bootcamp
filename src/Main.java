import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMilena = new Dev();
        devMilena.setNome("Milena");
        devMilena.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Milena:" + devMilena.getConteudosInscritos());
        devMilena.progredir();
        devMilena.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Milena:" + devMilena.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Milena:" + devMilena.getConteudosConcluidos());
        System.out.println("XP:" + devMilena.calcularTotalXp());

        System.out.println("-------");

        Dev devRoberto = new Dev();
        devRoberto.setNome("Roberto");
        devRoberto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Roberto:" + devRoberto.getConteudosInscritos());
        devRoberto.progredir();
        devRoberto.progredir();
        devRoberto.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Roberto:" + devRoberto.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Roberto:" + devRoberto.getConteudosConcluidos());
        System.out.println("XP:" + devRoberto.calcularTotalXp());
    }
}

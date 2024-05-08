import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("git");
        curso.setDescricao("aprendendo git");
        curso.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Programaçao é o futuro");
        mentoria.setDescricao("Aprenda a transformar o seu futuro");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Satander Bootcamp");
        bootcamp.setDescricao("Aprenda backend em Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println(devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos:");
        System.out.println(devGabriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos");
        System.out.println(devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());
    }




}

import br.com.bootcamp.dominio.Bootcamp;
import br.com.bootcamp.dominio.Curso;
import br.com.bootcamp.dominio.Dev;
import br.com.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

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

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vitor:" + devVitor.getConteudosInscritos());
        devVitor.progredir();
        devVitor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vitor:" + devVitor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vitor:" + devVitor.getConteudosConcluidos());
        System.out.println("XP:" + devVitor.calcularTotalXp());
    }
}

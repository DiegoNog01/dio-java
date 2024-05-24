package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Main {
	public static void main(String[] args) {

		Curso curso1 = new Curso("curso java", "descricao curso java", 8);
		Curso curso2 = new Curso("curso js", "descricao curso js", 4);
		
		Mentoria mentoria = new Mentoria("mentoria de java", "descricao mentoria java", LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev("Camila");
		Dev devJoao = new Dev("Joao");
		
		devCamila.inscreverBootcamp(bootcamp);
		devJoao.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos inscritos camila " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos inscritos joao" + devJoao.getConteudosInscritos());
		
		devCamila.progredir();
		devJoao.progredir();
		System.out.println();
		System.out.println("Conteudos concluidos camila " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXP());
		System.out.println("Conteudos concluidos joao " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXP());
		
		devCamila.progredir();
		System.out.println();
		System.out.println("Conteudos inscritos camila " + devCamila.getConteudosInscritos());
		System.out.println("XP: " + devCamila.calcularTotalXP());
		System.out.println("Conteudos inscritos joao" + devJoao.getConteudosInscritos());
		System.out.println("XP: " + devJoao.calcularTotalXP());
	}
}

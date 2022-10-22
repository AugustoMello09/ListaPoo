package loja;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Catalogo {
	public static void main(String[] args) {

		Plataforma plataforma1 = new Plataforma(1, "PC");
		Plataforma plataforma2 = new Plataforma(2, "PS4");
		Plataforma plataforma3 = new Plataforma(3, "XBOX");

		Jogo jogo1 = new Jogo(1, "PC", "Rainbow Six Siege", "Ação", 280, LocalDate.parse("2022-12-14"));
		Jogo jogo2 = new Jogo(2, "PC", "Valorante", "Ação", 0, LocalDate.parse("2022-10-15"));
		Jogo jogo3 = new Jogo(3, "PS4", "God of War", "Aventura", 350, LocalDate.parse("2019-05-09"));
		Jogo jogo4 = new Jogo(4, "XBOX", "Forza 4", "Corrida", 394, LocalDate.parse("2009-08-10"));
		Jogo jogo5 = new Jogo(5, "PC", "League Of Legends", "MMO", 0, LocalDate.parse("2013-09-25"));
		Jogo jogo6 = new Jogo(6, "XBOX", "Fifa 2023", "Futebool", 250, LocalDate.parse("2023-05-06"));
		Jogo jogo7 = new Jogo(7, "PS4", "F1 2021", "Corrida", 298, LocalDate.parse("2021-07-07"));
		Jogo jogo8 = new Jogo(8, "PC", "Cs Go", "Ação", 64, LocalDate.parse("2012-08-26"));
		Jogo jogo9 = new Jogo(9, "PC", "Cs 1.6", "Ação", 0, LocalDate.parse("1999-05-26"));
		Jogo jogo10 = new Jogo(10, "XBOX", "Farming Simulator 15", "Aventura", 0, LocalDate.parse("2019-09-29"));

		plataforma1.getListaJogos().add(jogo1);
		plataforma1.getListaJogos().add(jogo2);
		plataforma1.getListaJogos().add(jogo5);
		plataforma1.getListaJogos().add(jogo8);
		plataforma2.getListaJogos().add(jogo3);
		plataforma2.getListaJogos().add(jogo7);
		plataforma1.getListaJogos().add(jogo9);
		plataforma3.getListaJogos().add(jogo6);
		plataforma3.getListaJogos().add(jogo4);
		plataforma3.getListaJogos().add(jogo10);

		LocalDateTime nowDateTime = LocalDateTime.now();

		System.out.println("--------------LISTA DE JOGOS DE CADA PLATAFORMA--------------------");
		plataforma1.getListaJogos().stream().forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
		plataforma2.getListaJogos().stream().forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
		plataforma3.getListaJogos().stream().forEach(System.out::println);
		System.out.println("--------------LISTA DE JOGOS ORDENADA POR DATA DE PUBLICAÇÃO---------");
		System.out.println("-----------------------PC-------------------------------------");
		plataforma1.listaJogos.stream().sorted((j1, j2) -> j2.getDataDePublicacao().compareTo(j1.getDataDePublicacao()))
				.forEach(System.out::println);
		System.out.println("-----------------------PS4-------------------------------------");
		plataforma2.listaJogos.stream().sorted((j1, j2) -> j2.getDataDePublicacao().compareTo(j1.getDataDePublicacao()))
				.forEach(System.out::println);
		System.out.println("-----------------------XBOX-------------------------------------");
		plataforma3.listaJogos.stream().sorted((j1, j2) -> j2.getDataDePublicacao().compareTo(j1.getDataDePublicacao()))
				.forEach(System.out::println);

		System.out.println("-----------------------------------------------------------------------------------");

		plataforma1.listaJogos.stream().map(j -> j.getDataDePublicacao().until(nowDateTime, ChronoUnit.YEARS))
				.forEach(System.out::println);

		plataforma1.listaJogos.stream().forEach((Jogo j) -> {
			if (j.getDataDePublicacao().isBefore(nowDateTime.toLocalDate())) {
				System.out.println(ChronoUnit.DAYS.between(j.getDataDePublicacao(), nowDateTime));
			} else {
				System.out.println("Jogo vai lançar " + j.getNomeJogo());
			}
		});

		plataforma2.listaJogos.stream().map(j -> j.getDataDePublicacao().until(nowDateTime, ChronoUnit.YEARS))
				.forEach(System.out::println);

		plataforma2.listaJogos.stream().forEach((Jogo j) -> {
			if (j.getDataDePublicacao().isBefore(nowDateTime.toLocalDate())) {
				System.out.println(ChronoUnit.DAYS.between(j.getDataDePublicacao(), nowDateTime));
			} else {
				System.out.println("Jogo vai lançar " + j.getNomeJogo());
			}
		});

		plataforma3.listaJogos.stream().map(j -> j.getDataDePublicacao().until(nowDateTime, ChronoUnit.YEARS))
				.forEach(System.out::println);

		plataforma3.listaJogos.stream().forEach((Jogo j) -> {
			if (j.getDataDePublicacao().isBefore(nowDateTime.toLocalDate())) {
				System.out.println(ChronoUnit.DAYS.between(j.getDataDePublicacao(), nowDateTime));
			} else {
				System.out.println("Jogo vai lançar " + j.getNomeJogo());
			}
		});

	}
}

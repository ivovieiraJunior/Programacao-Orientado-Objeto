package Testes;

public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
//------ Exercicio da folha ------
	//== 1)
		//== a)
		List<String> list2 = Arrays.asList("java8", "Lambdas", "Steam API", "Default","Method" , "Data/time API");
		
		list2.forEach(item->{System.out.println(item);
			});
		
		//== b)
		
		new Thread(()->{System.out.println("lo");}).start();
		
	//== 2 
		//== a)
		List<Integer> listaCusto = Arrays.asList(100,200,300,400,500);
		List<Double> listaDouble =
		listaCusto.stream()
				.map(custo -> new Double(custo + (custo * 0.8)))
				.collect(Collectors.toList());
		
		System.out.println("Lista de N + seu 0.8% \n" + listaDouble + "\n");
		
		//== b)
		Double valor =
		listaDouble.stream()
		.map((custo) -> custo + 0.8*custo)
		.reduce((cust, sum) -> sum + cust).get();
		
		
	//== 3
		//== a)
		List<Integer> listaNumeros = Arrays.asList(7,9,2,5,6,4,5,10,12,13,18);
		List<Integer> quadrado = 
			listaNumeros.stream()
			.map(custo -> new Integer(custo *custo ))
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println("Lista de quadrado\n" + quadrado + "\n");
		
		//== b)
		List<Integer> pareImpar = 
			listaNumeros.stream()
			.filter(n -> n%2==0 && n % 3 == 0 )
			.collect(Collectors.toList());
		
		System.out.println("Lista de par e Impar \n " + pareImpar + "\n");
		
		//== c)
		Optional<Integer> primeiroDiv =
				listaNumeros.stream()
				.filter(n -> n % 2 ==0 || n % 3 ==0)
				.findFirst();
		
		System.out.println("Primeiro par ou Impar\n" + primeiroDiv + "\n");
		
		
	//== 4
		//== a)
		List<String> list4 = Arrays.asList("BATCH", "RDOS", "MS-DOS", "RISC BOS","linux" , "Solatis", "FreeBSD", "Debiaon","SlachWare", "Redhat", "OpenBsd", "Windows", "reactOS");
		
		List<String> nome = 
				list4.stream()
				.filter(s -> s.length() > 10)
				.collect(Collectors.toList());
		
		System.out.println("Lista de nomes\n" + nome + "\n");
		
		//== b)
		List<String> nomeComE = 
				list4.stream()
				.filter(s -> s.contains("e"))
				.collect(Collectors.toList());
		
		System.out.println("Lista de nomes com e\n" + nomeComE + "\n");
		
		//== c)
		List<String> nome2 = 
				list4.stream()
				.filter(s -> s.contains("R") && s.length() > 5)
				.collect(Collectors.toList());
		
		System.out.println("Lista de nomes com R e maior de 5\n" + nome2 + "\n");
		
	//------- Sorted -------

		//Retorna uma visualização ordenada do fluxo. Os elementos são
		//classificados em ordem natural, a menos que você passe por
		//um Comparador personalizado.

		//--- Exemplo 2 ---

		List<Passageiro> pass = list.stream()

		.sorted((e1, e2) -> e1.getPrimeiroNome().compareTo(e2.getPrimeiroNome()))

		.collect(Collectors.toList());

		pass.stream().forEach(e -> System.out.println(e.getPrimeiroNome()));
		
	//------ Sum, max, min ----
		//--- Sum ----
		
		Integer soma = list.stream()
				
		.filter(p -> p.getPrimeiroNome()

		.startsWith(""))

		.mapToInt(p -> p.getTotalMilhas())

		.sum();
		
		//-- max ---
		
		Integer maior = list.stream()

		.mapToInt(p-> p.getTotalMilhas())

		.max()

		. getAsInt();

		//-- min ---
		Integer menor = list.stream()

		.mapToInt(p -> p.getTotalMilhas())

		.min()

		.getAsInt();

		System.out.println(soma +" "+ maior + " "+ menor);
		
	//----- Count -----

		//Retorna a quantidade de elementos presentes em uma stream.

		long qt = list.stream()

		.filter(p -> p.getNacionalidade().equals("Br"))

		.count();

		System.out.println(qt);
	//------ Average ------

		//Permite calcular a média dos valores dos elementos.

		double media = list.stream().

		filter(p -> p.getNacionalidade().equals("Br")).

		mapToInt(p -> p.getTotalMilhas()).

		average().

		getAsDouble();

		System.out.println(media);

	//--------- Distinct() -------

		//---Exemplo 2

		list.stream()

		.map(str -> str.getPrimeiroNome().length())

		.distinct()

		.forEach(System.out::println);
		

		//--- Exemplo 1: --------

		List<Integer> distinctMilhas = list.stream()

		.map(e -> e.getTotalMilhas())

		.distinct()

		.collect(Collectors.toList());

		System.out.println(distinctMilhas);
		
		//------Exemplo 2 filter + map---------
		list.stream().

		filter(p -> p.getPrimeiroNome()

		.startsWith("j")).

		map(Passageiro::getTotalMilhas)

		.forEach(System.out::println);
		
		//------- Exemplo filter + colect ----------
		
		List<Passageiro> filtered =

				list .stream()

				.filter(p -> p.getPrimeiroNome().startsWith("L"))

				.collect(Collectors.toList());

		filtered.stream().forEach(e ->
			System.out.println(e.getPrimeiroNome()));
		
		//System.out.println(p3.getPrimeiroNome() 
		//+ " Milhas:" + p3.getTotalMilhas()
		//		+ " Nacionalidade" +p3.getNacionalidade());

		//----- Exemplo Peek ------
	 
		list.stream()

		.peek(e -> e.addMilhas(20))

		.peek(e -> System.out.println(e.getTotalMilhas()))

		.collect(Collectors.toList());
		 
	//----- Exemplo Stream -----	 
		
		list.stream().forEach(e -> e.addMilhas(20));

		list.stream().forEach(e ->
		System.out.println(e.getTotalMilhas()));
		
		
		daoArryList.cadastrarPassageiro(p1);
		daoArryList.cadastrarPassageiro(p2);
		daoArryList.cadastrarPassageiro(p3);
		daoArryList.cadastrarPassageiro(p3);
		daoArryList.cadastrarPassageiro(p3);
		
		
		List<Passageiro> lista = daoArryList.ListarTodosPassageiros();
		for(Passageiro p: lista) {
			System.out.println(p.getPrimeiroNome());
		}
		
		System.out.println("\nBusca por nome\n");
		
		List<Passageiro> listaNome = daoArryList.ListarPassgeiroPorNome("joao");
		for(Passageiro p: listaNome) {
			System.out.println(p.getPrimeiroNome());
		}
		
		System.out.println("\nBusca por id\n");
		
		Passageiro listadoPorId = daoArryList.listarPorId(1);
	
		System.out.println(listadoPorId.getPrimeiroNome());
		System.out.println();
//		MainPassageiroMap
		
		PassageiroMapRepositorio passMap = new PassageiroMapRepositorio();
	
		passMap.cadastrarPassageiro(p1);
		passMap.cadastrarPassageiro(p2);
		passMap.cadastrarPassageiro(p3);
		
		System.out.println("Lista nome");
		listaNome = passMap.ListarPassgeiroPorNome("carlos");//.ListarTodosPassageiros();
		for(Passageiro p: listaNome) {
			System.out.println(p.getPrimeiroNome());
		}
		
		passMap.deletarPassageiro(p1);
		System.out.println("\nlistar todos");
		listaNome = passMap.ListarTodosPassageiros();
		for(Passageiro p: listaNome) {
			System.out.println(p.getPrimeiroNome());
		}
	
		*/
		
	}

}

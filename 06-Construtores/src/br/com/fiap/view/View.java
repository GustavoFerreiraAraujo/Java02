package br.com.fiap.view;

import br.com.fiap.bicicleta.Bicicleta;
import br.com.fiap.bicicleta.Fabricante;

public class View {
	
	public static void main(String[] args) {
// classe bicicleta
		
		// istaciado
		
		Bicicleta b = new Bicicleta (29 ) ;
		
		//set dados
		
		b.setAro(29);
		b.setModelo("Aro56265");
		b.setPeso(10.2f);

		// classe fab

		
		// istaciado
		Fabricante f = new Fabricante();
        //set dados
		f.setCnpj("25252555855285");
		f.setNome("Caloi");

		// Metodo

		System.out.println(b.retornarDetalhes() + f.getNome() );
	}

}

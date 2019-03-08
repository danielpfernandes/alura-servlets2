package br.alura.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(Banco.chaveSequencial++);
		empresa.setNome("Beurinha");
		Empresa empresa2 = new Empresa();
		empresa.setId(Banco.chaveSequencial++);
		empresa2.setNome("Gatinho");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while (it.hasNext()) {
			Empresa empresa = it.next();
			if (empresa.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		
		for (Empresa empresa: lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public void alteraEmpresa(Integer id, String nomeEmpresa, Date dataAbertura) {
		Empresa empresa = buscaEmpresaPelaId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
	}
}

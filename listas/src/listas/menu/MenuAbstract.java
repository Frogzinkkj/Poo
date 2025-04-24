package listas.menu;

import java.util.List;

import listas.CadastroAbstract;

public abstract class MenuAbstract {

	public abstract void cadastrar(CadastroAbstract cadastro);
	public abstract void excluir(CadastroAbstract cadastro);
	public abstract void localizar(CadastroAbstract cadastro);
	
}

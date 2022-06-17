package pilhaWeb;

import java.util.ArrayList;
import java.util.List;

public class PilhaGenerica<TIPO> {
	private int n;
	private List<TIPO> vetor;
	private int topo;
	public PilhaGenerica(int tam)
	{
		n = tam;
		vetor = new ArrayList<TIPO>(tam);
		topo = -1;
	}
	
	
	public boolean peekTopo()
	{
		if(!isVazia())
		{
			System.out.println("Elemento do topo: " + vetor.get(topo));
			return true;
		}
		return false;
	}

	public boolean isVazia()
	{
		return topo == -1;
	}
	
	public boolean isCheia()
	{
		return topo == n - 1;
	}
	
	public TIPO pop()
	{
		TIPO elem;
		if(!isVazia())
		{
		elem = vetor.get(topo--);
		return elem;
		}
		System.out.println("Pop falhou. Pilha vazia");
		return null;
	}
	
	
	public boolean push(TIPO elem)
	{
		if(!isCheia())
		{
		vetor.add(++topo, elem);
		return true;
		}
		System.out.println("Push nao funcionou. Pilha cheia");
		return false;
	}
}

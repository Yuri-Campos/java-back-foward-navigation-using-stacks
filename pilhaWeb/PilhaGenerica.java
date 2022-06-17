package pilhaWeb;

import java.util.ArrayList;
import java.util.List;

public class PilhaGenerica<TIPO> {
	//private int n;
	private List<TIPO> vetor;
	private int topo;
	public PilhaGenerica(int tam)
	{
		//n = tam;
		vetor = new ArrayList<TIPO>(tam);
		topo = -1;
	}
	
	public TIPO pop()
	{
		TIPO elem;
		
		elem = vetor.get(topo--);
		return elem;
	}
	
	
	public boolean push(TIPO elem)
	{
		vetor.add(++topo, elem);
		return true;
	}
}

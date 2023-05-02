
public class Sala {
	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;
	
	Sala(){
		sala = 101;
		bloco = 6;
		capacidade = 50;
		acessivel = true;
		
		
	}

	Sala(int novoBloco, int novaSala, int novaCapacidade, boolean novoAcessivel){
		this.bloco =  novoBloco;
		this.sala = novaSala;
		this.capacidade = novaCapacidade;
		this.acessivel = novoAcessivel;
	}
	
	String getDescricao(){
		String acessibilidade = "";
		if (this.acessivel == true) {
			acessibilidade = "acessível";
			
		} else {
			acessibilidade = "não acessível";
		}
		return "Bloco " + this.bloco +", Sala " + this.sala + " (" + this.capacidade+" lugares, "+acessibilidade+")";
		
	}
}

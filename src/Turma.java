import java.util.ArrayList;

public class Turma {
	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios;
	
	Turma(){
		nome = "Algoritmos e Estrutura de Dados I";
		professor = "Edleno Silva";
		numAlunos = 60;
		acessivel = true;
		this.horarios = new ArrayList<>();
		
	}
	
	Turma(String novoNome, String novoProfessor, int novoNumAlunos, boolean novoAcessivel){
		this.nome = novoNome;
		this.professor = novoProfessor;
		this.numAlunos = novoNumAlunos;
		this.acessivel = novoAcessivel;
		this.horarios = new ArrayList<>();
		
	}
	
	void addHorario(int novoHorario) {
		
		this.horarios.add(novoHorario);		
	}
	
	String getHorariosString() {
		
		String texto = "";
		
		for (var i = 0; i < this.horarios.size();i++) {
			if(this.horarios.get(i) == 1 || this.horarios.get(i) == 15 || this.horarios.get(i) == 29) {
				texto = "segunda 8hs, quarta 8hs, sexta 8hs";
				return (texto);
			} else if (this.horarios.get(i)==8 || this.horarios.get(i) == 22) {
				texto = "Terça 8hs, quinta 8hs";
				return (texto);
			} else if (this.horarios.get(i) == 2 || this.horarios.get(i) == 16 || this.horarios.get(i) == 30) {
				texto = "segunda 10hs, quarta 10hs, sexta 10hs";
				return (texto);
			} else if (this.horarios.get(i)==9 || this.horarios.get(i) == 23) {
				texto = "Terça 10hs, quinta 10hs";
				return (texto);
			} else if (this.horarios.get(i) == 3 || this.horarios.get(i) == 17 || this.horarios.get(i) == 31) {
				texto = "segunda 12hs, quarta 12hs, sexta 12hs";
				return (texto);
			} else if (this.horarios.get(i)== 10 || this.horarios.get(i) == 24) {
				texto = "Terça 12hs, quinta 12hs";
				return (texto);
			} else if (this.horarios.get(i) == 4 || this.horarios.get(i) == 18 || this.horarios.get(i) == 32) {
				texto = "segunda 14hs, quarta 14hs, sexta 14hs";
				return (texto);
			} else if (this.horarios.get(i)==11 || this.horarios.get(i) == 25) {
				texto = "Terça 14hs, quinta 14hs";
				return (texto);
			}else if (this.horarios.get(i) == 5 || this.horarios.get(i) == 19 || this.horarios.get(i) == 33) {
				texto = "segunda 16hs, quarta 16hs, sexta 16hs";
				return (texto);
			} else if (this.horarios.get(i)==12 || this.horarios.get(i) == 26) {
				texto = "Terça 16hs, quinta 16hs";
				return (texto);
			}else if (this.horarios.get(i) == 6 || this.horarios.get(i) == 20 || this.horarios.get(i) == 34) {
				texto = "segunda 18hs, quarta 18hs, sexta 18hs";
				return (texto);
			} else if (this.horarios.get(i)==13 || this.horarios.get(i) == 27) {
				texto = "Terça 18hs, quinta 18hs";
				return (texto);
			}else if (this.horarios.get(i) == 7 || this.horarios.get(i) == 21 || this.horarios.get(i) == 35) {
				texto = "segunda 20hs, quarta 20hs, sexta 20hs";
				return (texto);
			} else if (this.horarios.get(i)==14 || this.horarios.get(i) == 28) {
				texto = "Terça 20hs, quinta 20hs";
				return (texto);
			}
			
			
			
		}
		return "caralho " + this.horarios;
}
	

		
		
		
	
	String getDescricao() {
		String acessibilidade = "";
		if (this.acessivel == true) {
			acessibilidade = "sim";
		} else {
			acessibilidade = "não";
		}
		return ("Turma: "+this.nome+"\n"
				+ "Professor: "+this.professor+" \n"
				+ "Número de Alunos: "+this.numAlunos+"\n"
				+ "Horário: " + this.getHorariosString()+ "\n"
				+ "Acessível: "+acessibilidade);
	}

}

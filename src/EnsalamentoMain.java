
public class EnsalamentoMain {
	public static void main (String args[]) {
		Sala sala1 = new Sala();
		System.out.println(sala1.getDescricao());
		
		
		Turma turma1 = new Turma();
		turma1.addHorario(1);
		System.out.println(turma1.getDescricao());
		
		
		
		}
	

}

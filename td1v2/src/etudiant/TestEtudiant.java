package etudiant;

public class TestEtudiant {
	
	public static void main(String[] args){
		
		Etudiant etudiant1 = new Etudiant(args[0]);
		
		etudiant1.travailler();
		etudiant1.seReposer();
		
		System.out.println(etudiant1.getName());
	}
}
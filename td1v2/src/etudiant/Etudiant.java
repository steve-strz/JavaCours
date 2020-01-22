package etudiant;

/**
 * 
 * @author steve jobs
 *
 */

public class Etudiant {
	private String name;
	
	public Etudiant(String n){
		name = n;
	}
	public void travailler(){
		System.out.println(this.name + " se met au travail !");
	}
	public void seReposer(){
		System.out.println(this.name + " se repose !");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

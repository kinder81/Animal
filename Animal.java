abstract class Animal {
	protected String color;
	protected int poids;
	protected void manger(){
		System.out.println("Je mange de la viande");
	}
	protected void boire() {
	System.out.println("je bois de l'eau");
	}
	abstract void deplacement();
	abstract void crier();
	public String toString() {	
		String str = "Je suis un objet de la "+ this.getClass() + ", je suis " + this.color + ", je pèse " + this.poids;
		return str;
 	}
}

package Business.Entity;

public class todo {
	String nom;
	int importance;

	public todo(String nom, int importance) {
        this.nom = nom;
        this.importance = importance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }
}





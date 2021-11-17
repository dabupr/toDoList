package Business.Entity;

public class MyTodo {
	String nom;
	int importance;

	public MyTodo(String nom, int importance) {
        this.nom = nom;
        this.importance = importance;
    }

    public String getName() {
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





package Presentation.View;

import java.util.Scanner;

public class menu {
	public menu() {
	}

	//Función que muestra el menú principal con 4 opciones
    public int menuPrincipal() {
        System.out.println("1. Create a new todo");
        System.out.println("2. Show all todos");
        System.out.println("3. Delete a todo");
        System.out.println("4. Exit.");
	    Scanner sc = new Scanner(System.in);
		String aux = sc.nextLine();
		int numero = aToiManual(aux);
		if (numero == 0) {menuPrincipal();}
		return numero;





	}
	//Funcion that recive a string and returns a number between 1 and 4
	public int aToiManual(String aux) {
        int numero = 0;
        try {
            numero = Integer.parseInt(aux);
        } catch (NumberFormatException e) {
            System.out.println("Error, introduce un número entre 1 y 4");
            return 0;
        }
        return numero;
    }

	public void createNewTodo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Importance (1-4): ");
		String importance = sc.nextLine();
		int importanNum = aToiManual(importance);
		if (importanNum == 0) {createNewTodo();}



	}

}

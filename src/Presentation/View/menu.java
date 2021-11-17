package Presentation.View;

import Business.Entity.MyTodo;

import java.util.LinkedList;
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
		System.out.print("Select an option: ");
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
            System.out.println("Error, introduce un número...");
            return 0;
        }
        return numero;
    }

	public MyTodo createNewTodo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Importance (1-4): ");
		String importance = sc.nextLine();
		int importanNum = aToiManual(importance);
		if (importanNum == 0) {createNewTodo();}
		return  new MyTodo(name, importanNum);
	}

	public void showAllTodos(LinkedList<MyTodo> llista) {
		for (MyTodo todo : llista) {
			switch (todo.getImportance()) {
				case 1:
					System.out.print(Color.WHITE);
					//System.out.print(Color.BLUE_BACKGROUND);
					System.out.println(llista.indexOf(todo) + "|   " + todo.getName() + " " + todo.getImportance());
					System.out.print(Color.RESET);
					break;
				case 2:
					System.out.print(Color.YELLOW);
					System.out.print(Color.BLUE_BACKGROUND);
					System.out.println(llista.indexOf(todo) + "|   " + todo.getName() + " " + todo.getImportance());
					System.out.print(Color.RESET);
					break;
				case 3:
					System.out.print(Color.CYAN);
					System.out.print(Color.BLUE_BACKGROUND);
					System.out.println(llista.indexOf(todo) + "|   " + todo.getName() + " " + todo.getImportance());
					System.out.print(Color.RESET);
					break;
				case 4:
					System.out.print(Color.RED);
					System.out.print(Color.WHITE_BACKGROUND);
					System.out.println(llista.indexOf(todo) + "|   " + todo.getName() + " " + todo.getImportance());
					System.out.print(Color.RESET);
					break;
			}
		}
	}

	public int selectOneToDelete(LinkedList<MyTodo> llistaTodos) {
		System.out.print("Select the todo you want to delete: ");
		Scanner sc = new Scanner(System.in);
		String aux = sc.nextLine();
		int numero = aToiManual(aux);
		if (llistaTodos.get(numero) == null) {
			System.out.println("Error no existe...");
			selectOneToDelete(llistaTodos);
		}
		return numero;

	}












	enum Color {
		//Color end string, color reset
		RESET("\033[0m"),

		// Regular Colors. Normal color, no bold, background color etc.
		BLACK("\033[0;30m"),    // BLACK
		RED("\033[0;31m"),      // RED
		GREEN("\033[0;32m"),    // GREEN
		YELLOW("\033[0;33m"),   // YELLOW
		BLUE("\033[0;34m"),     // BLUE
		MAGENTA("\033[0;35m"),  // MAGENTA
		CYAN("\033[0;36m"),     // CYAN
		WHITE("\033[0;37m"),    // WHITE

		// Bold
		BLACK_BOLD("\033[1;30m"),   // BLACK
		RED_BOLD("\033[1;31m"),     // RED
		GREEN_BOLD("\033[1;32m"),   // GREEN
		YELLOW_BOLD("\033[1;33m"),  // YELLOW
		BLUE_BOLD("\033[1;34m"),    // BLUE
		MAGENTA_BOLD("\033[1;35m"), // MAGENTA
		CYAN_BOLD("\033[1;36m"),    // CYAN
		WHITE_BOLD("\033[1;37m"),   // WHITE

		// Underline
		BLACK_UNDERLINED("\033[4;30m"),     // BLACK
		RED_UNDERLINED("\033[4;31m"),       // RED
		GREEN_UNDERLINED("\033[4;32m"),     // GREEN
		YELLOW_UNDERLINED("\033[4;33m"),    // YELLOW
		BLUE_UNDERLINED("\033[4;34m"),      // BLUE
		MAGENTA_UNDERLINED("\033[4;35m"),   // MAGENTA
		CYAN_UNDERLINED("\033[4;36m"),      // CYAN
		WHITE_UNDERLINED("\033[4;37m"),     // WHITE

		// Background
		BLACK_BACKGROUND("\033[40m"),   // BLACK
		RED_BACKGROUND("\033[41m"),     // RED
		GREEN_BACKGROUND("\033[42m"),   // GREEN
		YELLOW_BACKGROUND("\033[43m"),  // YELLOW
		BLUE_BACKGROUND("\033[44m"),    // BLUE
		MAGENTA_BACKGROUND("\033[45m"), // MAGENTA
		CYAN_BACKGROUND("\033[46m"),    // CYAN
		WHITE_BACKGROUND("\033[47m"),   // WHITE

		// High Intensity
		BLACK_BRIGHT("\033[0;90m"),     // BLACK
		RED_BRIGHT("\033[0;91m"),       // RED
		GREEN_BRIGHT("\033[0;92m"),     // GREEN
		YELLOW_BRIGHT("\033[0;93m"),    // YELLOW
		BLUE_BRIGHT("\033[0;94m"),      // BLUE
		MAGENTA_BRIGHT("\033[0;95m"),   // MAGENTA
		CYAN_BRIGHT("\033[0;96m"),      // CYAN
		WHITE_BRIGHT("\033[0;97m"),     // WHITE

		// Bold High Intensity
		BLACK_BOLD_BRIGHT("\033[1;90m"),    // BLACK
		RED_BOLD_BRIGHT("\033[1;91m"),      // RED
		GREEN_BOLD_BRIGHT("\033[1;92m"),    // GREEN
		YELLOW_BOLD_BRIGHT("\033[1;93m"),   // YELLOW
		BLUE_BOLD_BRIGHT("\033[1;94m"),     // BLUE
		MAGENTA_BOLD_BRIGHT("\033[1;95m"),  // MAGENTA
		CYAN_BOLD_BRIGHT("\033[1;96m"),     // CYAN
		WHITE_BOLD_BRIGHT("\033[1;97m"),    // WHITE

		// High Intensity backgrounds
		BLACK_BACKGROUND_BRIGHT("\033[0;100m"),     // BLACK
		RED_BACKGROUND_BRIGHT("\033[0;101m"),       // RED
		GREEN_BACKGROUND_BRIGHT("\033[0;102m"),     // GREEN
		YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),    // YELLOW
		BLUE_BACKGROUND_BRIGHT("\033[0;104m"),      // BLUE
		MAGENTA_BACKGROUND_BRIGHT("\033[0;105m"),   // MAGENTA
		CYAN_BACKGROUND_BRIGHT("\033[0;106m"),      // CYAN
		WHITE_BACKGROUND_BRIGHT("\033[0;107m");     // WHITE

		private final String code;

		Color(String code) {
			this.code = code;
		}

		@Override
		public String toString() {
			return code;
		}
	}

}

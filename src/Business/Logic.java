package Business;

import Presentation.View.menu;

public class Logic {

	public Logic() {
	}

	public void startProgram() {
		menu vistaMenu = new menu();
		int numero = 10;
		while (numero!=4) {
			 numero = vistaMenu.menuPrincipal();
			switch (numero) {
				case 1:
					vistaMenu.createNewTodo();
					break;
				case 2:
					System.out.println("Showing all todos");

					break;
				case 3:
					System.out.println("Delete a todo");
					break;
				case 4:
					System.out.println("Exit");
					break;
			}


		}
	}
}

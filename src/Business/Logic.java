package Business;

import Business.Entity.MyTodo;
import Presentation.View.menu;

import java.util.LinkedList;

public class Logic {
	LinkedList<MyTodo> llistaTodos;

	public Logic(LinkedList<MyTodo> llista) {
		this.llistaTodos = llista;
	}

	public void startProgram() {
		menu vistaMenu = new menu();
		int numero = 10;
		while (numero!=4) {
			 numero = vistaMenu.menuPrincipal();
			switch (numero) {
				case 1:
					addTodo(vistaMenu.createNewTodo());
					break;
				case 2:
					vistaMenu.showAllTodos(llistaTodos);
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

	void addTodo(MyTodo todo) {
        llistaTodos.add(todo);
    }



}

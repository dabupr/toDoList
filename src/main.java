import Business.Entity.MyTodo;
import Business.Logic;
import Presentation.View.menu;

import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		LinkedList<MyTodo> llistaTodos = new LinkedList<MyTodo>();
		Logic logic = new Logic(llistaTodos);
		logic.startProgram();

	}

}

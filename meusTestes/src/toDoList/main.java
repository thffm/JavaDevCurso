package toDoList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entityWork.Task;

public class main {

	public static void main(String[] args) throws IOException {
		
		
		
		
		int confirm = 3;
		List<Task> tasks = new ArrayList<>();
		Task task1 = new Task("Gym", LocalDateTime.now(), 8);
		Task task2 = new Task("Ve Vitoria", LocalDateTime.now(), 10);
		Task task3 = new Task("Ver filme com vi", LocalDateTime.now(), 10);
		Task task4 = new Task("Estudar", LocalDateTime.now(), 7);
		Task task5 = new Task("Cagar", LocalDateTime.now(), 3);
		Task task6 = new Task("cuidar de mim", LocalDateTime.now(), 9);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		task6.setCheck(true);
		task1.setCheck(true);
		tasks.add(task6);
		tasks.add(task5);
		tasks.add(task4);
		tasks.add(task3);
		tasks.add(task2);
		tasks.add(task1);
		writeTask(task4);
		writeTask(task4);
		
		System.out.println("Bem vindo vi\nSistema criado por thiago o cachorrao.");
		while (confirm != 0) {
			confirm = Integer.parseInt( JOptionPane.showInputDialog("Digite um numero:\n [0]Sair| [1]Mostrar lista"));
			
			if(confirm == 1) {
				showTasks(tasks);
			}
		}
		
		
		
		

	}
	
	public static void showTasks(List<Task> works) {
		for(Task taskUnity: works) {
			taskUnity.info();
		}
		System.out.println("---------------------------------------------------------");
	}
	
	public static void writeTask(Task task )throws IOException {
		File lista = new File("/home/ltth/eclipse-workspace/meusTestes/src/toDoList/lista.txt"); 
		
		if(!lista.exists()) {
			try {
				System.out.println("Nao existe");
				lista.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
		}
		}
		
		
		FileWriter escrever = new FileWriter(lista,true);
		escrever.write(task.getName()+";"+task.getDate()+":"+task.getPriority()+";"+task.getCheck()+"\n");
		escrever.flush();
		escrever.close();
	}

}

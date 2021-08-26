package aula03.pkg01monotarefa;

	class Tarefa{
	    private final String tarefa;
	    private final String nome; 

	    //construtor da classe
	    public Tarefa(String tarefa, String nome){
	        this.tarefa = tarefa;
	        this.nome = nome;
	    }

	    //método que "executa" o processo "Tarefa"
	    
	    public void run(){
	        System.out.println("A tarefa é: " + nome);
	        System.out.println("Tarefa executada: " + tarefa);

	    }
	}

	public class Monotarefa{
	    public static void main(String[] args) {
	        
	        //criando a tarefa
	        Tarefa t = new Tarefa("Listar", "Produtos");

	        //executando a tarefa
	        t.run();
	        
	    }
	}
	/*
	 * executando via terminal:
	 * digite: javac Monotarefa.java
	 * 
	 * depois: java Monotarefa 
	 */
	



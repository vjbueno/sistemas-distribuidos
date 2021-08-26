package aula03.pkg02multitarefa;

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

	public class Multitarefa{
    public static void main(String[] args) {
        
        //criando a tarefa
        Tarefa t1 = new Tarefa("Listar", "Produtos");
        Tarefa t2 = new Tarefa("Atualizar", "Produtos");
        
        //executando a tarefa
        t1.run();
        t2.run();
    }
}
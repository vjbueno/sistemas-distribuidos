package aula03.pkg03monotarefa;

class MeuThread extends java.lang.Thread {
    private final String tarefa;
    private final String nome;

    public MeuThread(String tarefa, String nome) {
        this.tarefa = tarefa;
        this.nome = nome;
    }

     //m�todo que executa o processo MeuThread
    @Override
    public void run() {  //correr
        System.out.println("\nA tarefa �: "  + nome);
        System.out.println("\nTarefa executada: "  + tarefa);
    }
}

	public class Monothread {
    public static void main(String[] args) {
         //criar a tarefa
        MeuThread t1 = new MeuThread("Listar", "Produtos");
        MeuThread t2 = new MeuThread("Atualizar", "Produtos");

         //executar a tarefa
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
    }
}
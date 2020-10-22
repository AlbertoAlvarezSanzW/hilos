


public class hilo1  extends Thread{

    public void run(){
        try {
            System.out.println("inicio hilo 1");
            sleep(4000);
            principal.variableStatic = (int)(Math.random()*(20-4+1)+4);  //<- Esto lo busque porque realmente no me pasaban los valores de 20

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

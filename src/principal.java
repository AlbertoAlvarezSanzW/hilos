public class principal {

    static int variableStatic = 0;
    public principal() throws InterruptedException {


        hilo1 th = new hilo1();
        hilo2 th1 = new hilo2(this);
        th.start();
        th.join();
        th1.start();




    }



    public void pruebadellamadapordios(String nombre, String nombre2){
        System.out.println(nombre);
        System.out.println(nombre2);
    }
}

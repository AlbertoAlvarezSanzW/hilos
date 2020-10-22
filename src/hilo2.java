


public class hilo2 extends Thread{

//***************************************************
    principal claseP;  //creación de objeto de la clase Principal

    public hilo2(principal claseP) {
        this.claseP = claseP;       // creación de callback
    }
//***************************************************



    public void run(){
        int h = principal.variableStatic;
        Long empieza = System.currentTimeMillis(); // <- soplo de javi XD

        for (int i = 0; i<h; i++){
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Long acaba = (System.currentTimeMillis()-empieza)/1000;

        String cadena = "Se ha ejecutado "+h+" veces el programa";
        String tiempo = "Ha tardado "+acaba+ " segundos";


        claseP.pruebadellamadapordios(cadena,tiempo);


    }
}

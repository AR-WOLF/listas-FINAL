package clase_listas;
//ALVARO RAFAEL RODRIGUEZ SANCHEZ
//ESTRUCTURA DE DATOS 
//11/01/2016


public class Main {
	 /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        
        System.out.println("*********************PROGRAMA DE LISTA SIMPLE******************\n");
        
// Agregar in inicio de la lista
        
        lista.agregarAlInicio(37);
        lista.agregarAlInicio(4);
        
        // Agregar al final de la lista
        
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(16);
        lista.agregarAlFinal(4);
        
        
        
        
        System.out.println("Lista:");
        lista.listar();
        
        System.out.println("\n\nTamaño:");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nObtener el valor del nodo en la posicion 3");
        System.out.println(lista.getValor(3));
        
        System.out.println("\nInsrta un nodo con valor 17 despues del 16:");
        lista.insertarPorReferencia(16, 17);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n\nInsrta un nodo con valor 44 en la posición 3");
        lista.insrtarPorPosicion(3, 44);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nActualiza el valor 20 del tercer nodo por 13");
        lista.editarPorReferencia(20, 13);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nActualiza el valor nodo en la posición 0 por 22");
        lista.editarPorPosicion(0, 22);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nElimina el nodo con el valor 37");
        lista.removerPorReferencia(37);        
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nElimina el nodo en la posición 5");
        lista.removerPorPosicion(5);        
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(lista.buscar(30));
        
        System.out.println("\nConsulta la posicion del valor 17");
        System.out.println(lista.getPosicion(17));
        
        System.out.println("\nElimina la lista");
        lista.eliminar();
        
        
        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(lista.esVacia());
        
    }   

}

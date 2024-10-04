public class MetodoOrdenamiento {
    public int[] sortBumbbleAva(int[] arreglo){
        int n = arreglo.length;
        boolean intercambio = false;

        for(int i =0; i < n; i++){
            System.out.println("Pasada" +i );

            for(int j =0; j < n-1-i; j++){
                System.out.println("j="+j+"[j]="+ arreglo[j]+"j+1="+j+1+"[j+1]="+arreglo[j+1]);
                if(arreglo[j] > arreglo[j+1]){
                    System.out.println("Si hay cambio");
                //  Intercambio
                int aux = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo [j+1] = aux;
                intercambio = true;
        }
    }
    //Si no hubo ningun intercambio deberia finalizar el codigo si ya esta ordenado
    if (!intercambio){
        break;
    }
    }
    return arreglo;
}

    public void printlnArreglo(int[] arreglo) {
        for (int elemento : arreglo){ //for each el arreglo va instanciando cada elemento del arreglo se va almacenando
            System.out.print(elemento + ",");
    }   
}
}
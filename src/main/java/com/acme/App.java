package com.acme;

public class App {
    public String getGreeting() {
        int i,j = 0;
        for (i = 0; j< 10; i++) {
            j++;
        }

        return "Hello world.";
    }

//    public String getGreeting() {
//    	indexToInsert = Math.abs(indexToInsert) - 1;
//    	int elementIndex = elementos.size() - 1;
//
//    	for (int i = firstIndex; (i <= lastIndex) && (elementIndex >= 0); i++, indexToInsert++) {
//    		final CalendarioFotosBean element = elementos.get(elementIndex);
//    		element.setOrden(i);
//    		linea.getDatos().add(indexToInsert, element);
//    		elementos.remove(elementIndex);
//    		elementIndex--;
//    	}
//    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Creating an array of objects
        // declared with initial values
        Object[] javaObjectArray
                = { "Maruti", 2019, "Suzuki",
                2019};

        // Printing the values
        System.out.println(javaObjectArray[0]);
        System.out.println(javaObjectArray[1]);
        System.out.println(javaObjectArray[2]);
        System.out.println(javaObjectArray[3]);
    }
}

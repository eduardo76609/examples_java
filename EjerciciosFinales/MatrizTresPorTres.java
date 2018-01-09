// En el ejemplo Crear una matriz en Java veíamos como se define una matriz de números en Java. En ese ejemplo rellenábamos los valores de la matriz directamente en la instanciación de la matriz.

int [][] matriz = {{2,4,4},{6,6,9},{8,10,12}};

// Una de las preguntas que nos presentabais ante ese artículo es cómo poder cargar una matriz por teclado en Java. Es decir, que el usuario vaya introduciendo los valores uno a uno.
//
// Para este caso lo primero que haremos será instanciar la matriz vacía. Por ejemplo una matriz de 3x3:

int matriz[][] = new int[3][3];

// Ahora vamos a rellenarla. Para ello vamos a utilizar la misma técnica que si la quisiésemos recorrer. Es decir, dos bucles anidados que iteraran por el número de elementos que tenga la matriz en cada índice. El tamaño de la matriz que nos sirve para definir el bucle lo conseguimos mediante la propiedad .length. Algo así:

for (int x=0; x < matriz.length; x++) {
  for (int y=0; y < matriz[x].length; y++) {...}
}

// Si bien, en cada una de las iteraciones, vamos a rellenar el elemento en el que estemos. Para leer los datos de la consola utilizaremos la clase Scanner. La clase Scanner la instanciaremos al principio del programa:

Scanner consola = new Scanner(System.in);

// En cada ciclo del bucle utilizamos el método .nextInt() de la clase Scanner para leer un entero de teclado. Y directamente se lo asignamos a la matriz.

for (int x=0; x < matriz.length; x++) {
  for (int y=0; y < matriz[x].length; y++) {
    System.out.println("Introduzca el elemento [" + x + "," + y + "]");
    matriz[x][y] = consola.nextInt();
  }
}

// Ya solo nos quedará mostrar el contenido de la matriz para validar que coincide con el insertado:

for (int x=0; x < matriz.length; x++) {
  for (int y=0; y < matriz[x].length; y++) {
    System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
  }
}

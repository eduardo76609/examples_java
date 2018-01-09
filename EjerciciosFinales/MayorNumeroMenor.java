// El saber cuál es el mayor de dos números es uno de los primeros ejemplos que hacemos cuándo empezamos a aprender un lenguaje de programación.
//
// La idea es muy simple. Pedimos al usuario dos números y nuestro código tiene que determinar cuál de los dos números es más grande.
//
// Lo primero será pedir los números al usuario. Para esto nos apoyamos en la clase Scanner.

Scanner reader = new Scanner(System.in);
int iNumero1, iNumero2;

System.out.println("Dame el primer número");
iNumero1 = reader.nextInt();

// El método .nextInt() nos devolverá lo que el usuario haya introducido en un valor entero. Si quieres más detalle sobre cómo obtener lo que el usuario ha introducido puedes leerte "Lectura de datos en Java con Scanner"
//
// Ahora vamos con el centro del problema. Saber qué numero es mayor. Para ello vamos a utilizar la estructura de selección if. La idea es muy sencilla:

// si numero1 es mayor que numero 2
// entonces numero1 es el mayor
// si no numero2 es el mayor
// Que en nuestro código Java quedaría de la siguiente forma con la estructura if:

if (iNumero1>iNumero2)
  System.out.println(iNumero1 + " es mayor que " + iNumero2);
else
  System.out.println(iNumero2 + " es mayor que " + iNumero1);

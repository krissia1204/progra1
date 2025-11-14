Contenido del programa

El programa incluye los siguientes algoritmos:

Algoritmos de búsqueda
1. Búsqueda Lineal (linearSearch)

Recorre el arreglo elemento por elemento hasta encontrar el número buscado.

2. Búsqueda Binaria (binarySearch)

Busca un número dividiendo el arreglo por la mitad en cada paso.
Requiere que el arreglo esté previamente ordenado.

Algoritmos de ordenamiento
3. Bubble Sort (bubbleSort)

Compara pares adyacentes y los intercambia si están desordenados.

4. Selection Sort (selectionSort)

Selecciona repetidamente el elemento más pequeño y lo coloca al inicio.

5. Insertion Sort (insertionSort)

Inserta cada elemento en su posición correcta dentro de la parte ya ordenada.

Estructura principal (main)

El programa:

Presenta un menú con las opciones:

Búsqueda lineal

Búsqueda binaria

Selection sort

Bubble sort

Insertion sort

Salir

Solicita al usuario un número para buscar o ejecuta el algoritmo de ordenamiento elegido.

Muestra el resultado o el arreglo ordenado.

Repite el menú hasta que el usuario decida salir.

 Nota importante sobre Binary Search

Antes de ejecutar la búsqueda binaria, el programa ordena el arreglo automáticamente usando Bubble Sort, ya que la búsqueda binaria solo funciona correctamente si el arreglo está ordenado.

Ejecución del programa

En la clase main:

int arr[]= {12,10,70,35,74,32,1,0};
Algoritmos agrt= new Algoritmos();


El usuario elige la acción a realizar, y el programa gestiona las llamadas a cada algoritmo.

Salida esperada

Dependiendo de la opción, el programa puede mostrar:

El índice donde se encontró un número.

Un mensaje indicando que el número no está en el arreglo.

El arreglo antes y después de ordenarse.

 Autor

Este programa fue desarrollado para practicar algoritmos fundamentales de programación y estructuras de datos en Java.

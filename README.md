# Estructuras de Datos

Repositorio académico que reúne ejemplos prácticos desarrollados en Java para estudiar y comprender las principales estructuras de datos lineales y no lineales.

El proyecto organiza los ejercicios por tipo de estructura. Cada tema cuenta con una carpeta propia, un archivo `notas.txt` con explicaciones teóricas y tres programas Java que muestran su funcionamiento mediante ejemplos.

## Objetivo

Comprender cómo se almacenan, organizan, recorren, buscan, insertan y eliminan datos utilizando diferentes estructuras, identificando sus características y posibles aplicaciones.

## Organización del proyecto

El repositorio se divide en dos categorías principales:

- **Estructuras lineales:** organizan los elementos de manera secuencial.
- **Estructuras no lineales:** organizan los elementos mediante relaciones jerárquicas o conexiones.

```text
Estructurasdedatos/
│
├── README.md
│
├── lineales/
│   ├── 1arreglos/
│   │   ├── BusquedaBinaria.java
│   │   ├── PromedioNotas.java
│   │   ├── InvertirArreglo.java
│   │   └── notas.txt
│   │
│   ├── 2listasenlazadas/
│   │   ├── ListaSimple.java
│   │   ├── EliminarNodo.java
│   │   ├── InvertirLista.java
│   │   └── notas.txt
│   │
│   ├── 3pilas/
│   │   ├── BalanceParentesis.java
│   │   ├── InvertirCadena.java
│   │   ├── DeshacerTexto.java
│   │   └── notas.txt
│   │
│   └── 4colas/
│       ├── TurnosBanco.java
│       ├── ColaImpresion.java
│       ├── PapaCaliente.java
│       └── notas.txt
│
└── nolineales/
    ├── 5arboles/
    │   ├── ArbolBinarioBusqueda.java
    │   ├── RecorridosArbol.java
    │   ├── ArbolCarpetas.java
    │   └── notas.txt
    │
    ├── 6grafos/
    │   ├── GrafoAmigos.java
    │   ├── RecorridoBFS.java
    │   ├── RecorridoDFS.java
    │   └── notas.txt
    │
    └── 7tablashash/
        ├── ContarPalabras.java
        ├── DosSuma.java
        ├── AgendaContactos.java
        └── notas.txt
```

## 1. Estructuras lineales

Son aquellas en las que los elementos se organizan de manera secuencial. Cada estructura tiene una forma particular de almacenar y acceder a los datos.

### 1.1 Arreglos

Almacenan elementos del mismo tipo en posiciones identificadas por índices. Su tamaño se establece al momento de crearlos.

**Ejercicios:**
- `PromedioNotas.java`: recorre un arreglo para calcular la suma, el promedio, la nota mayor y la menor.
- `InvertirArreglo.java`: invierte el orden de los elementos mediante el intercambio de posiciones.
- `BusquedaBinaria.java`: busca un elemento en un arreglo ordenado dividiendo el rango de búsqueda a la mitad.

### 1.2 Listas enlazadas

Están compuestas por nodos. Cada nodo almacena un dato y una referencia al siguiente nodo, lo que permite modificar dinámicamente la lista.

**Ejercicios:**
- `ListaSimple.java`: crea una lista e inserta elementos al inicio y al final.
- `EliminarNodo.java`: elimina un nodo de acuerdo con su valor.
- `InvertirLista.java`: invierte el orden de la lista modificando las referencias entre nodos.

### 1.3 Pilas

Funcionan bajo el principio LIFO (*Last In, First Out*): el último elemento que ingresa es el primero que sale.

**Ejercicios:**
- `BalanceParentesis.java`: verifica si los paréntesis de una expresión están correctamente balanceados.
- `InvertirCadena.java`: utiliza una pila para invertir un texto.
- `DeshacerTexto.java`: simula la función de deshacer acciones en un editor de texto.

### 1.4 Colas

Funcionan bajo el principio FIFO (*First In, First Out*): el primer elemento que ingresa es el primero que sale.

**Ejercicios:**
- `TurnosBanco.java`: simula la atención de clientes según su orden de llegada.
- `ColaImpresion.java`: administra documentos pendientes de impresión.
- `PapaCaliente.java`: representa un juego de eliminación circular utilizando una cola.

## 2. Estructuras no lineales

Organizan los datos mediante relaciones que no siguen necesariamente una secuencia. Permiten representar jerarquías, conexiones y asociaciones entre elementos.

### 2.1 Árboles

Son estructuras jerárquicas formadas por nodos relacionados mediante conexiones entre padres e hijos. Tienen una raíz y pueden contener nodos hoja.

**Ejercicios:**
- `ArbolBinarioBusqueda.java`: permite insertar y buscar elementos, además de calcular la altura de un árbol binario de búsqueda.
- `RecorridosArbol.java`: implementa los recorridos preorden, inorden, postorden y por niveles.
- `ArbolCarpetas.java`: representa una estructura jerárquica de carpetas mediante un árbol con varios hijos.

### 2.2 Grafos

Están formados por vértices o nodos conectados mediante aristas. Se utilizan para representar relaciones entre elementos.

**Ejercicios:**
- `GrafoAmigos.java`: representa una red de amigos mediante una lista de adyacencia.
- `RecorridoBFS.java`: realiza un recorrido en anchura y busca caminos con el menor número de conexiones.
- `RecorridoDFS.java`: realiza un recorrido en profundidad y cuenta grupos conectados.

### 2.3 Tablas hash

Almacenan información mediante pares de clave y valor. Utilizan una función hash para ubicar los datos y facilitar operaciones de búsqueda, inserción y eliminación.

**Ejercicios:**
- `ContarPalabras.java`: cuenta cuántas veces aparece cada palabra utilizando un `HashMap`.
- `DosSuma.java`: busca dos números cuya suma sea igual a un valor objetivo.
- `AgendaContactos.java`: permite almacenar, buscar y eliminar contactos mediante su nombre.

## Archivos de apoyo

Cada una de las siete carpetas temáticas contiene un archivo `notas.txt`. Estos documentos complementan los ejercicios con:

- Definición y funcionamiento de la estructura.
- Características y operaciones principales.
- Formas de recorrido, cuando corresponda.
- Complejidad de operaciones relevantes.
- Aplicaciones y ejemplos de uso.
- Un ejercicio propuesto para practicar.

## Tecnologías y herramientas

- **Lenguaje:** Java.
- **Bibliotecas utilizadas:** clases de Java como `Stack`, `Queue`, `LinkedList`, `ArrayList`, `HashMap` y `Map`, según el ejercicio.
- **Control de versiones:** Git.
- **Formato de los ejercicios:** archivos Java independientes.

## Requisitos

- Tener instalado el JDK de Java 11 o una versión superior.
- Contar con una terminal o un entorno de desarrollo compatible con Java.

## Cómo ejecutar los ejercicios

Cada archivo Java es un programa independiente y contiene su propio método `main`. Por eso, se puede ejecutar un ejercicio sin necesidad de ejecutar los demás.

### Opción 1. Ejecutar directamente

Desde la terminal, ingresar a la carpeta del ejercicio. Por ejemplo:

```bash
cd lineales/3pilas
java InvertirCadena.java
```

### Opción 2. Compilar y ejecutar

```bash
cd lineales/3pilas
javac InvertirCadena.java
java InvertirCadena
```

Para ejecutar otro ejercicio, basta con ingresar a su carpeta y reemplazar el nombre del archivo por el correspondiente.

## Conclusión

Este repositorio reúne ejemplos prácticos de siete estructuras de datos fundamentales. Su organización permite estudiar cada tema por separado, comparar sus características y observar cómo se aplican en situaciones concretas mediante programas desarrollados en Java.

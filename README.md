# Estructuras de datos en Java

Colección de ejercicios en Java para aprender estructuras de datos. Cada estructura tiene sus **notas teóricas** y **3 ejemplos ejecutables** con comentarios en español.

![Java](https://img.shields.io/badge/Java-11%2B-orange)
![Ejemplos](https://img.shields.io/badge/ejemplos-21-blue)

## Estructura del repositorio

```
Estructurasdedatos/
├── lineales/
│   ├── 1arreglos/
│   ├── 2listasenlazadas/
│   ├── 3pilas/
│   └── 4colas/
└── nolineales/
    ├── 5arboles/
    ├── 6grafos/
    └── 7tablashash/
```

Cada carpeta contiene un `notas.txt` (teoría, operaciones, cuándo usarla y un ejercicio propuesto) y los archivos `.java` de los ejemplos.

## Estructuras lineales

Los datos van uno detrás de otro, en secuencia.

| Estructura | Cómo funciona | Ejemplos |
|---|---|---|
| [Arreglo](lineales/1arreglos) | Tamaño fijo, acceso por posición | `PromedioNotas`, `InvertirArreglo`, `BusquedaBinaria` |
| [Lista enlazada](lineales/2listasenlazadas) | Cada elemento apunta al siguiente | `ListaSimple`, `EliminarNodo`, `InvertirLista` |
| [Pila](lineales/3pilas) | Último en entrar, primero en salir (LIFO) | `BalanceParentesis`, `InvertirCadena`, `DeshacerTexto` |
| [Cola](lineales/4colas) | Primero en entrar, primero en salir (FIFO) | `TurnosBanco`, `ColaImpresion`, `PapaCaliente` |

## Estructuras no lineales

Los datos se organizan en jerarquías o conexiones, no en fila.

| Estructura | Cómo funciona | Ejemplos |
|---|---|---|
| [Árbol](nolineales/5arboles) | Jerarquía de padres e hijos (carpetas, menús) | `ArbolBinarioBusqueda`, `RecorridosArbol`, `ArbolCarpetas` |
| [Grafo](nolineales/6grafos) | Nodos conectados entre sí (redes sociales, mapas) | `GrafoAmigos`, `RecorridoBFS`, `RecorridoDFS` |
| [Tabla hash](nolineales/7tablashash) | Pares clave → valor con búsqueda muy rápida | `ContarPalabras`, `AgendaContactos`, `DosSuma` |

## Resumen de complejidad

| Estructura | Acceso / búsqueda | Inserción | Eliminación |
|---|---|---|---|
| Arreglo | O(1) por índice, O(n) por valor | O(n) | O(n) |
| Lista enlazada | O(n) | O(1) al inicio | O(n) |
| Pila | O(1) al tope | O(1) | O(1) |
| Cola | O(1) al frente | O(1) | O(1) |
| Árbol binario de búsqueda | O(log n) promedio | O(log n) promedio | O(log n) promedio |
| Grafo (recorridos BFS/DFS) | O(V + E) | — | — |
| Tabla hash | O(1) promedio | O(1) promedio | O(1) promedio |

## Cómo ejecutar

Necesitas tener **Java 11 o superior** instalado. Cada archivo es independiente.

```bash
cd lineales/3pilas
java InvertirCadena.java
```

O compilando primero:

```bash
javac InvertirCadena.java
java InvertirCadena
```

> `BalanceParentesis` pide una cadena por teclado, por ejemplo `(())()`.

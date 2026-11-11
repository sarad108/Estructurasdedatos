# Estructuras de datos

Ejercicios en Java con anotaciones sobre estructuras de datos lineales y no lineales.
Cada carpeta tiene un `notas.txt` (teoría, operaciones y cuándo usarla) y 3 ejemplos.

## Estructuras lineales
Los datos van uno detrás de otro, en secuencia.

| Estructura | Cómo funciona | Carpeta |
|---|---|---|
| Arreglo (array) | Tamaño fijo, acceso por posición | [`lineales/1arreglos`](lineales/1arreglos) |
| Lista enlazada | Cada elemento apunta al siguiente | [`lineales/2listasenlazadas`](lineales/2listasenlazadas) |
| Pila (stack) | Último en entrar, primero en salir (LIFO) | [`lineales/3pilas`](lineales/3pilas) |
| Cola (queue) | Primero en entrar, primero en salir (FIFO) | [`lineales/4colas`](lineales/4colas) |

## Estructuras no lineales
Los datos se organizan en jerarquías o conexiones, no en fila.

| Estructura | Cómo funciona | Carpeta |
|---|---|---|
| Árbol | Jerarquía de padres e hijos (carpetas, menús) | [`nolineales/5arboles`](nolineales/5arboles) |
| Grafo | Nodos conectados entre sí (redes sociales, mapas) | [`nolineales/6grafos`](nolineales/6grafos) |
| Tabla hash / mapa | Pares clave → valor con búsqueda muy rápida | [`nolineales/7tablashash`](nolineales/7tablashash) |

## Cómo ejecutar
Cada archivo `.java` es independiente. Con Java 11 o superior:

```bash
cd lineales/3pilas
java InvertirCadena.java
```

O compilando:

```bash
javac InvertirCadena.java
java InvertirCadena
```

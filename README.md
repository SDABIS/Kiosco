# INTRODUCCIÓN
Simulación de un Kiosco interactivo de un teatro, para la asignatura Interacción Persona-Ordenador. Realizado en Java-Swing. El objetivo es lograr la máxima usabilidad posible, haciéndolo fácil de utilizar y accesible a todo el mundo.
El programa puede ejecutarse mediante el comando:
```
java -jar Kiosco.jar
```

# NAVEGACIÓN

Al usuario se le presentará con una ventana de bienvenida. A partir de aquí podrá acceder a las obras de la portada, y a todas las demás pulsando el botón correspondiente. Hacer clic en una de las obras mostrará más información sobre esta, y permitirá comprar entradas.
Un caso especial es la improvisación: esta actuación permite a los usuarios inscribirse para participar. Esto los introducirá en una cola. En el caso de que esté vacía, se le indicará que debe prepararse para actuar.

# VENTA DE ENTRADAS

En estas ventanas se permitirá al cliente seleccionar la zona, la cantidad de entradas (con sus respectivos descuentos) e introducir códigos de descuento. En todo momento se mostrará el precio actual de la operación. 
Al confirmar, existe una posibilidad aleatoria de que el sistema falle (es un fallo simulado, como si las entradas se hubiesen atascado). Esto cancelará la operación.
La navegación permite en cualquier momento volver atrás manteniendo la información introducida, o cancelar la operación entera. Los botones tienen colores que identifican sus acciones fácilmente.

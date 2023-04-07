# Ejercicio 1:
Identifica las características principales de los patrones de diseño más conocidos, indica para qué valen y un caso de uso para cada uno de ellos.
 
1. Singleton
   - Es un patrón de diseño creacional que hace que solo exista un objeto de su tipo y para otro código solo es accesible por un único punto.
   - Uso: El patrón singleton se usa comúnmente para el sistema de registros (login).
2. Factory
   - El patrón factory es usado para crear una jerarquía de clases y utilizarlo de forma transparente.
   - Uso: Cuando una clase no sabe qué subclases se requerirán para crear.
3. Builder
   - Este patrón permite construir objetos complejos paso a paso.
   - Uso: el patrón builder se puede usar cuando necesitamos preparar una receta, los ingredientes se tienen que agregar paso a paso para que queden bien.
4. Prototype
   - El patrón prototype lo que hace es clonarse a sí mismo y también a los métodos y las propiedades que contenga.
   - Uso: Si tengo una hoja de cálculo que contiene muchas celdas usaría un patrón de prototipo para crear una celda de plantilla y clonar esa celda al crear nuevas celdas.
5. Decorador
   - La función del patrón decorador es que añade una funcionalidad a una clase ya creada sin modificarla.
   - Uso: Si tengo un determinado texto, con el patrón decorador puedo aplicarle varios formatos como: cursiva, negrita, subrayado...
6. Adaptador
   - El patrón adaptador consiste en crear una clase que permite que clases parecidas pero con una implementación diferente funcionen coherentemente.
   - Uso: Cuando una aplicación tiene funcionalidades similares (por ejemplo: calculadora de impuestos, módulo de contabilidad), pero tienen APIs diferentes. En este caso aplicaría usar un patrón adaptador.
7. Fachada
   - Sirve como un envoltorio con la finalidad de siplificar un código complejo.
   - Uso: Cuando encendemos una computadora, lo único que hacemos es darle al botón de encender, pero por detrás se encuentra tódo el código que permite que eso funcione, ese es el ejemplo de una fachada.

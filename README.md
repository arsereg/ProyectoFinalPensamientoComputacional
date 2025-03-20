# ProyectoFinalPensamientoComputacional

## Descripción

Usted ha sido contratado para desarrollar un código para manejar el acceso a un sistema de ATM. El sistema tiene actualmente 1000 tarjetas y pines registrados. El sistema debe permitir a los usuarios ingresar su tarjeta y pin para poder acceder a su cuenta. Si el usuario ingresa un pin incorrecto 3 veces, la tarjeta será bloqueada y no podrá ser utilizada.

## Requerimientos

1. El sistema debe permitir a los usuarios ingresar su tarjeta y pin para poder acceder a su cuenta.
2. Si el usuario ingresa un pin incorrecto 3 veces, la tarjeta será bloqueada y se le mostrará al usuario un mensaje indicando que la tarjeta ha sido bloqueada.
3. Si el usuario ingresa una tarjeta que no existe en el sistema, deberá mostrar un mensaje indicando que la tarjeta no existe.
4. Si el usuario ingresa una tarjeta que si existe en el sistema, el sistema deberea solicitar el pin. Si el pin ingresado coincide con el pin registrado en el sistema, el sistema deberá mostrar un mensaje indicando que el acceso ha sido exitoso.
5. Si el usuario ingresa una tarjeta que si existe en el sistema, el sistema deberea solicitar el pin. Si el pin ingresado no coincide con el pin registrado en el sistema, el sistema deberá mostrar un mensaje indicando que el pin es incorrecto y deberá solicitar nuevamente el pin. Máximo 3 intentos.

En el archivo Cards.java encontrará dos arreglos, uno con las tarjetas y otro con los pines. Estos arreglos representan las tarjetas y pines registrados en el sistema.
Ambos arreglos tienen 1000 elementos, y cada elemento en la posición i del arreglo de tarjetas corresponde al pin en la posición i del arreglo de pines.

Este proyecto cuenta con un archivo `Main.java`, en el cual usted deberá escribir su código.

Dentro del código podrá encontrar un ciclo que le permitirá visualizar algunas tarjetas y sus combinaciones. Este código está solo para que usted pueda visualizar las tarjetas y pines registrados en el sistema y cómo están relacionados a partir de su índice i. Debe removerlo antes de entregar su proyecto.:

```java
    for(int i = 0; i < tarjetas.length; i++){
        System.out.println("-----------------");
        System.out.println("Tarjeta: " + tarjetas[i]);
        System.out.println("Pin: " + pines[i]);
        System.out.println("-----------------");
    }
```


## Entrega

Deberá crear un `Diagrama de Flujo` que describa el funcionamiento de su solución. El diagrama de flujo deberá ser entregado en formato JPG, PNG o PDF.

La entrega deberá realizarse en un archivo `.zip` en la plataforma Moodle. El archivo .zip deberá contener el proyecto completo, incluyendo el archivo Main.java con el código desarrollado y la clase `Cards.java` con los arreglos de tarjetas y pines. Se recomiende que el archivo `.zip` contenga todas las carpetas producidas por `IntelliJ IDEA` al crear el proyecto.

El archivo .zip deberá contener el diagrama de flujo y el código del proyecto.




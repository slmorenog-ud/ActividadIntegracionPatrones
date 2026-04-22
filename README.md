# Actividad Integración Patrones

# Integrantes

David Mauricio Pardo - 20241020181

Juliana Sofía Lopez Guerrero - 20241020001

Sergio Leonardo Moreno Granado - 20242020091

## Descripción

Una empresa de entregas a domicilio quiere desarrollar un sistema que:

- Monitoree el estado de los pedidos en tiempo real.
- Aplique diferentes estrategias para calcular el costo de envío.
- Notifique automáticamente a diferentes partes interesadas cuando cambie el estado del pedido.
- Permita extender dinámicamente las funcionalidades de las notificaciones (ej. agregar cifrado, logging, o reintentos).
- Centralice la configuración global del sistema

El sistema debe ser flexible, extensible y desacoplado, utilizando obligatoriamente los siguientes patrones de diseño: strategy, observer, singleton, decorator y factory method.

## Entregables

- Diagrama de clases UML donde se evidencien los cinco patrones.

Implementación básica en Java que:

- - Use todos los patrones solicitados.
- - Demuestre al menos un cambio de estado del pedido.
- - Muestre el cambio dinámico de estrategia de envío.
- - Aplique al menos un decorador a una notificación.

# Conversor de Monedas

Este proyecto es una aplicación de consola en Java que permite convertir entre diferentes monedas utilizando la API de ExchangeRate-API.

## Requisitos

- JDK 11 o superior
- Biblioteca Gson

## Instalación

1. Clona este repositorio.
2. Asegúrate de tener instalado JDK 11, 17 o superior.
3. Agrega la biblioteca Gson a tu proyecto. Puedes descargarla desde [aquí](https://mvnrepository.com/artifact/com.google.code.gson/gson).
4. En Intellij Ide agregar el archivo jar de la biblioteca json con el atajo Ctrl + Alt + Shift + S
5. seleccionar modulos -> dependencias -> ubicar el directorio o ubicacion del JAR

## Uso

Ejecuta la clase `Main.java` para iniciar la aplicación. Sigue las instrucciones en la consola para realizar conversiones de monedas.

## API Key

Este proyecto utiliza una API Key para acceder a la API de ExchangeRate-API. La API Key utilizada es `3af4d1637c8bf6e6a6799317`.

## Monedas Soportadas

- ARS - Peso argentino
- BOB - Boliviano boliviano
- BRL - Real brasileño
- CLP - Peso chileno
- COP - Peso colombiano
- USD - Dólar estadounidense

## Ejemplo de Uso

1. Selecciona la moneda base (ejemplo: USD).
2. Selecciona la moneda objetivo (ejemplo: ARS).
3. Ingresa la cantidad a convertir.
4. Obtén el resultado de la conversión.

## Notas

- El proyecto realiza solicitudes a la API de ExchangeRate-API para obtener las tasas de cambio.
- Los datos JSON obtenidos de la API se analizan utilizando la biblioteca Gson.
- Se utiliza la clase `HttpClient` para realizar las solicitudes HTTP.
- La interfaz de usuario es una consola que permite al usuario seleccionar opciones y proporcionar datos para la conversión.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request para discutir cualquier cambio.

## Licencia

Este proyecto está bajo la Licencia MIT.
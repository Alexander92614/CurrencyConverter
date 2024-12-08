
# Currency Converter

## Descripción
El **Currency Converter** es una aplicación desarrollada en Java que permite convertir cantidades entre diferentes monedas utilizando la API de ExchangeRate. El programa es interactivo y permite al usuario seleccionar la conversión deseada y proporcionar la cantidad a convertir.

---

## Tecnologías Utilizadas
- **Java**: Lenguaje principal de programación.
- **Gson**: Biblioteca para procesar JSON.
- **HTTP Client**: Para realizar solicitudes a la API de tipo REST.
- **ExchangeRate API**: Fuente de datos de tasas de cambio de moneda.

---

## Características
- Conversión entre las siguientes monedas:
  - Dólar (USD) y Peso Argentino (ARS).
  - Dólar (USD) y Real Brasileño (BRL).
  - Dólar (USD) y Peso Colombiano (COP).
- Soporte bidireccional (de ida y vuelta entre las monedas).
- Uso de una API en tiempo real para obtener las tasas de cambio.

---

## Requisitos Previos
1. **Java Development Kit (JDK)** 11 o superior.
2. Una conexión a Internet (para acceder a la API de ExchangeRate).
3. Biblioteca Gson (añadirla a tu gestor de dependencias o incluir el archivo `gson.jar` en tu proyecto).

---

## Instalación y Configuración
1. Clona el repositorio:
   ```bash
   git clone https://github.com/Alexander92614/CurrencyConverter.git
   cd CurrencyConverter
   ```

2. Asegúrate de tener configurado un entorno Java y añade Gson a tu proyecto.

3. Verifica que el paquete `org.example` en los archivos Java coincida con la estructura de tu proyecto.

4. Actualiza la API Key en la URL de la API (si es necesario):
   ```java
   final String endpoint = "https://v6.exchangerate-api.com/v6/<API_KEY>/pair/" + baseCode + "/" + targetCode + "/" + amount;
   ```

---

## Uso
1. Compila y ejecuta el programa:
   ```bash
   javac -d bin src/org/example/*.java
   java -cp bin org.example.Main
   ```

2. Sigue las instrucciones en pantalla para seleccionar la conversión deseada y proporcionar la cantidad.

3. El resultado será mostrado en la consola.

---

## Ejemplo de Uso
### Entrada
```text
==================================================
Seleccione una opción:
1. Dólar => Peso Argentino
2. Peso Argentino => Dólar
3. Dólar => Real Brasileño
4. Real Brasileño => Dólar
5. Dólar => Peso Colombiano
6. Peso Colombiano => Dólar
7. Salir
==================================================
Opción: 1
Ingrese la cantidad a convertir: 100
```

### Salida
```text
==================================================
Usted ha seleccionado: Dólar => Peso Argentino
El valor 100 [USD] corresponde al valor final de => 25,000 [ARS]
==================================================
```

---

## Estructura del Proyecto
```
CurrencyConverter/
│
├── src/
│   └── org/example/
│       ├── ExchangeRate.java
│       ├── Main.java
│       └── MyRecord.java
│
├── README.md
├── gson.jar (si no usas un gestor de dependencias)
└── bin/ (carpeta para archivos compilados)
```

---

## API Utilizada
Este proyecto utiliza la [ExchangeRate API](https://www.exchangerate-api.com/) para obtener tasas de cambio. 

---

## Contribuciones
Si deseas contribuir:
1. Haz un fork del repositorio.
2. Crea una rama para tu nueva característica o corrección:
   ```bash
   git checkout -b nueva-rama
   ```
3. Haz un pull request.

---

## Autor
- **Alexander Rico**

# Java L3 Support - Challenge Técnico

¡Bienvenido/a al proceso de evaluación técnica para el rol de **Ingeniero de Soporte Avanzado / Desarrollador Java L3**! 

El objetivo de este ejercicio es evaluar tus habilidades analíticas, capacidad para diagnosticar problemas y resolverlos y tus conocimientos de desarrollo sobre el ecosistema Java y Spring Boot.

---

## 📌 Misiones

* **Incidente Productivo:** Se han reportado errores, en apariencia aleatorios, en llamados al endpoint `/customer/{id}/summary`. Necesitaríamos que investigues qué puede estar sucediendo y si identificás algún problema, apliques los fixes necesarios para resolverlo.

* **Nuevo Requerimiento:** Se nos ha solicitado desarrollar un endpoint `/refund` para procesar devoluciones. El endpoint debe recibir un ID de transacción, verificar que la misma exista, que su estado sea `APPROVED` y que no tenga una devolución ya asociada. Si las precondiciones se cumplen, se debe generar una nueva transacción asociada al mismo cliente, con el monto en negativo de la original y estado `REFUNDED`.

*(Nota: En nuestro día a día valoramos mucho la seguridad y la calidad. Si durante tu investigación detectas fugas de datos o código mejorable, siéntete libre de corregirlo).*

---

## 🚀 Requisitos Previos y Ejecución

Para levantar y trabajar en este proyecto necesitarás:
* **Java 17** (o superior).
* **Maven 3.8+**.
* Tu IDE de preferencia (IntelliJ, Eclipse, VS Code, etc.).

### Ejecución de la aplicación:
Puedes clonar el repositorio y correr el proyecto usando tu IDE o mediante la terminal con el siguiente comando:

```bash
./mvnw spring-boot:run
```

---

## 🛠️ Análisis, Pruebas y Scripts (¡Importante!)

Como parte de este rol, el análisis, la automatización y el registro de pruebas son fundamentales. 
Te pedimos que incluyas en la raíz del repositorio un archivo **`NOTES.md`** que contenga:

* Los comandos `curl`, *one-liners* de terminal o pequeños *shell scripts* (`.sh`) que hayas utilizado para reproducir los errores y probar tus soluciones.
* Una breve explicación (un párrafo) sobre cada hallazgo y el *fix* aplicado.
* Si evaluaste distintas alternativas de solución antes de decidirte por una, coméntalas brevemente. Conocer tu proceso de análisis nos será de muchísima utilidad.

---

## 📥 Mecánica de Entrega

1. Realiza los cambios necesarios directamente sobre el código base utilizando tu IDE preferida.
2. Asegúrate de que el proyecto compila correctamente y que los endpoints funcionan según lo esperado.
3. Para la entrega, enviar un archivo comprimido `.zip` con el proyecto (excluyendo las carpetas `/target`, `.idea`, etc.).

¡Mucho éxito en el desafío!

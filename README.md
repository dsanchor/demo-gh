# Documentación de la API

## Endpoints

### 1. Reverse Text

Este endpoint invierte el texto proporcionado.

**URL:** `/reverse`

**Método:** `GET`

**Parámetros de consulta:**

- `text`: El texto que se va a invertir.

**Ejemplo de petición curl:**

```bash
curl -X GET 'http://localhost:8080/reverse?text=HelloWorld'
```

### 2. Remove Vowels

Este endpoint elimina todas las vocales del texto proporcionado.

**URL:** `/disemvowel`

**Método:** `GET`

**Parámetros de consulta:**

- `text`: El texto del cual se eliminarán las vocales.

**Ejemplo de petición curl:**

```bash
curl -X GET 'http://localhost:8080/disemvowel?text=HelloWorld'
```

## Containarización

### Construir la imagen

```bash
docker build -t api .
```

### Ejecutar el contenedor

```bash
docker run -p 8080:8080 api
```
## Dependencias
* Jflex >= 1.6.1 
* cup >= 0.11a 
* java >= 1.8.0_201

```
sudo apt-get install jflex cup
```
## ¿Cómo ejecutar?

Para compilar todos los archivos ejecute el comando:

```
make
```

Para leer archivos con formato .txt

```
java Main <nombre_archivo.txt> 
```
En nuestro caso tendŕía que ejecutar
```
cd test/
java Main java.txt 
```
Para introducir texto directamente en la entrada estándar
```
java Main -E
```

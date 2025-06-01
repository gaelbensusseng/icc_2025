INTEGRANTES: BENSUSSEN GONZALEZ GAEL

## Instrucciones de ejecución: 
1.- javac *.java
2.- java Main
## Diseño de `toString()`
Erick y yo decidimos declarar `toString()` como método abstracto en `FiguraGeometrica` porque cada figura debe presentar información específica (número de lados, base, altura etc...). si lo hubieramos definido con una implementación, no podría cubrir las distintas firmas de las subclases. Al obligar a cada hija a sobreescribirlo, se mejora la coherencia y simplicidad del codigo 

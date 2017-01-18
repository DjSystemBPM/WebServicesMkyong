Para generar estos WS utilize la libreria JAX-WS RI 2.1.10
https://jax-ws.java.net/2.1.10/

y para generar las clases con wsimport utilizas el siguiente comando dentro de la carpeta donde tienes tu proyecto
wsimport -keep http://localhost:9999/ws/hello?wsdl

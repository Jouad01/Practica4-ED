# Practica 4 - Versionado semántico

### Por: Bruno Golomb Durán y Jouad el ouardi

---

1. Primero clonamos el repositorio original en la versión **v1.1.0**
```shell
$ git clone -b v1.1.0 https://github.com/JuanLlado/Practica4.git
```

2. Una vez ya tenemos el repositorio clonado, 
cambiamos el remoto a nuestro nuevo repositorio
```shell
$ git remote set-url origin https://github.com/user/new-repository.git
```

3. Ahora podemos comenzar a hacer cambios. Empezaremos por
hacer una nueva rama llamada "developer"

```shell
$ git branch -b developer
```

4. Realizaremos las refactorizaciones que necesitamos y las vamos
_commiteando_ para más adelante _pushear_ los cambios.
```shell
$ git add . # o filename
$ git commit -m "refactor: descripción del commit"
```

5. Es importante que al realizar cambios indiquemos en que versión
del proyecto nos encontramos, para ello utilizaremos las _tags_.
```shell
$ git tag -a v1.0.0 -m "Inicializacion proyecto" ee9c6ae
```

6. Al final los cambios de una versión y sea estable
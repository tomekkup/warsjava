Warsjava 2012 - warsztat Qooxdoo
========

# Wstęp

## Do pobrania

* Qooxdoo SDK [http://sourceforge.net/......] (http://sourceforge.net/projects/qooxdoo/files/qooxdoo-current/2.0.2/qooxdoo-2.0.2-sdk.zip/download?use_mirror=ignum)
* Python 2.x [http://www.python.org/download/] (http://www.python.org/download/)

Polecam edytor [Sublime Text 2] (http://www.sublimetext.com/2)

## Szybki start

* Pobierz projekt z repozytorium git@github.com:tomekkup/helenos.git i brancha __master__
* Pobrane sdk rozpakuj do katalogu głównego w którym znajduje się Twój workspace i tenże katalog nazwij po prostu __qooxdoo__
* Zainstaluj Python-a (pamiętaj, Qx nie jest kompatybilne z Python 3)
* Rozpakuj plik bazy danych (ten z brancha __materialy__) i skopiuj do swojego katalogu domowego


# Przydatne narzędzia

* API Browser [http://demo.qooxdoo.org/current/apiviewer/#qx] (http://demo.qooxdoo.org/current/apiviewer/#qx)
* Demo Browser [http://demo.qooxdoo.org/current/demobrowser/#] (http://demo.qooxdoo.org/current/demobrowser/#)
* Playground [http://demo.qooxdoo.org/current/playground/index.html] (http://demo.qooxdoo.org/current/playground/index.html)
* Online edytor / parser JSON [http://jsoneditoronline.org/] (http://jsoneditoronline.org/)
* Plugin Postman do Chrome (przyda się)
* Konsola bazy H2 : [http://localhost:8080/warsjavaqx/console/login.jsp] (http://localhost:8080/warsjavaqx/console/login.jsp)
	* Login: warsjavaqx
	* Hasło: warsjavaqx

# How to

* Uruchomienie - wchodzimy do katalogu głównego aplikacji i uruchamiamy skrypt run.bat lub komende mvn 'tomcat7:run'
* Budowanie frontendu odbywa się komendą 'generate.py build' (z folderu src/main/frontend)
* Weryfikacja kodu frontendu j.w. ale komendą 'generate.py lint'

package com.example.thebiblequiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conection extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "DBandroid";

    public Conection(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE quiz1 (\n" +
                "    id       INTEGER PRIMARY KEY AUTOINCREMENT\n" +
                "                     NOT NULL,\n" +
                "    pregunta TEXT    NOT NULL,\n" +
                "    resp1    TEXT    NOT NULL,\n" +
                "    resp2    TEXT    NOT NULL,\n" +
                "    resp3    TEXT    NOT NULL,\n" +
                "    opcion1  INT (1) NOT NULL\n" +
                ");");

        db.execSQL("CREATE TABLE quiz2 (\n" +
                "    id       INTEGER PRIMARY KEY AUTOINCREMENT\n" +
                "                     NOT NULL,\n" +
                "    pregunta TEXT    NOT NULL,\n" +
                "    resp1    TEXT    NOT NULL,\n" +
                "    resp2    TEXT    NOT NULL,\n" +
                "    resp3    TEXT    NOT NULL,\n" +
                "    opcion1  INT (1) NOT NULL\n" +
                ");");

        db.execSQL("CREATE TABLE quiz3 (\n" +
                "    id       INTEGER PRIMARY KEY AUTOINCREMENT\n" +
                "                     NOT NULL,\n" +
                "    pregunta TEXT    NOT NULL,\n" +
                "    resp1    TEXT    NOT NULL,\n" +
                "    resp2    TEXT    NOT NULL,\n" +
                "    resp3    TEXT    NOT NULL,\n" +
                "    opcion1  INT (1) NOT NULL\n" +
                ");");


        db.execSQL("CREATE TABLE quiz4 (\n" +
                "    id       INTEGER PRIMARY KEY AUTOINCREMENT\n" +
                "                     NOT NULL,\n" +
                "    pregunta TEXT    NOT NULL,\n" +
                "    resp1    TEXT    NOT NULL,\n" +
                "    resp2    TEXT    NOT NULL,\n" +
                "    resp3    TEXT    NOT NULL,\n" +
                "    opcion1  INT (1) NOT NULL\n" +
                ");");

        db.execSQL("CREATE TABLE marcador (\n" +
                "    id       INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    Score int default 1    NOT NULL\n" +
                ");");

        db.execSQL("INSERT INTO quiz1 (\n" +
                "                     opcion1,\n" +
                "                     resp3,\n" +
                "                     resp2,\n" +
                "                     resp1,\n" +
                "                     pregunta,\n" +
                "                     id\n" +
                "                 )\n" +
                "                 VALUES (\n" +
                "                     2,\n" +
                "                     'Latín',\n" +
                "                     'Griego',\n" +
                "                     'Hebreo',\n" +
                "                     '¿De cuál de los siguientes idiomas procede la palabra Biblia?',\n" +
                "                     1\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     70,\n" +
                "                     72,\n" +
                "                     73,\n" +
                "                     '¿Cuántos libros componen la biblia?',\n" +
                "                     2\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Dos',\n" +
                "                     'Cuatro',\n" +
                "                     'Tres',\n" +
                "                     '¿En cuántas partes se divide la Biblia?\n" +
                "\n" +
                "',\n" +
                "                     3\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Es un libro religioso, que transmite la Palabra de Dios.',\n" +
                "                     'Es un libro científico que nos ayuda acomprender la creación.',\n" +
                "                     'Es un libro de historia que nos transmite la vida de Jesús tal como paso.',\n" +
                "                     'A la hora de leer la Biblia teneemos que tener en cuenta que',\n" +
                "                     4\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tardó en escribirse varios siglos',\n" +
                "                     'Durante la vida de Jesús',\n" +
                "                     'El año 100 después de Cristo',\n" +
                "                     'La Biblia se escribió hacia',\n" +
                "                     5\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Lo primero que se produce es el acontecimiento histórico',\n" +
                "                     'El Antiguo Testamento no tiene nada que ver con la historia del pueblo de Israel',\n" +
                "                     'Inmediatamente se produce el hecho histórico se pone por escrito',\n" +
                "                     '¿Cuál de los siguientes pasos se da en el proceso de redacción del Antiguo testamento?\n" +
                "\n" +
                "',\n" +
                "                     6\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Un Dios salvador',\n" +
                "                     'Un Dios simpático',\n" +
                "                     'Un Dios tirano',\n" +
                "                     'En la historia del pueblo de Israel Dios aparece como',\n" +
                "                     7\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Mito',\n" +
                "                     'Novela',\n" +
                "                     'Poesía',\n" +
                "                     '¿Cuál de los siguientes géneros literarios no es usado en el Antiguo Testamento?',\n" +
                "                     8\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Se carácteriza por la exageración para dar relevancia a ciertos personajes.',\n" +
                "                     'Expresa sobretodo sentimientos.',\n" +
                "                     'Intenta resoponder a grandes preguntas sobre el origen de la humanidad.',\n" +
                "                     '¿Qué es la epopeya?',\n" +
                "                     9\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Levítico',\n" +
                "                     'Génesis',\n" +
                "                     'Éxodo',\n" +
                "                     'El primer libro de la Biblia es',\n" +
                "                     10\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Era carpintero',\n" +
                "                     'Era agricultor',\n" +
                "                     'Era pastor',\n" +
                "                     'Abrahán para vivir se dedicaba al siguiente oficio',\n" +
                "                     11\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Sansón lucho contra los romanos',\n" +
                "                     'Moisés murió al cruzar el mar Rojo',\n" +
                "                     ' Nehemías tuvo que ayudar a reconstruir su tierr',\n" +
                "                     '¿Cuál de las siguientes afirmaciones es verdadera?',\n" +
                "                     12\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Nieto',\n" +
                "                     'Padre',\n" +
                "                     'Tío',\n" +
                "                     '¿Qué parentesco tenía Jacob con Abrahán?',\n" +
                "                     13\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Romano',\n" +
                "                     'Persa',\n" +
                "                     'Griego',\n" +
                "                     '¿Que imperio dirigió Ciro?',\n" +
                "                     14\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tierra de Moisés',\n" +
                "                     'Tierra de Israel',\n" +
                "                     'Tierra de Canaán',\n" +
                "                     '¿Cuál de los siguientes nombres no ha recibido la tierra donde se asento el pueblo judío?',\n" +
                "                     15\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Genesís, Éxodo, Levítico, Números y Deuteronomio',\n" +
                "                     'Genesís, Éxodo, Ageo, levítico y Tobías',\n" +
                "                     'Genesis, Samuel, Números, Josué y Levítico',\n" +
                "                     'El Pentateuco esta compuesto por los siguientes libros',\n" +
                "                     16\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     '27 libros',\n" +
                "                     '26 libros',\n" +
                "                     '28 libros',\n" +
                "                     '¿El Nuevo testamento está compuesto por?',\n" +
                "                     17\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Sagrada Escritura',\n" +
                "                     'El gran libro de Dios',\n" +
                "                     'Relato de Dios',\n" +
                "                     'La biblia es sobretodo Palabra de Dios por eso también se la conoce como',\n" +
                "                     18\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'No metió ninguno',\n" +
                "                     'Uno de cada especie',\n" +
                "                     'Dos de cada especie',\n" +
                "                     '¿Cuántos animales metió Moisés en el Arca?',\n" +
                "                     19\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'El Nuevo Testamento es menos extenso',\n" +
                "                     'El Nuevo Testamento es más extenso',\n" +
                "                     'Igual de extensos',\n" +
                "                     'El Antiguo Testamento y el Nuevo resulta que son',\n" +
                "                     20\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Un clima seco, casí propio de un desierto, con escasez de agua.',\n" +
                "                     'Un clima templado y suelo fertil, rodeado de zonas áridas.',\n" +
                "                     'Muy humedo y lluvioso durante todo el año.',\n" +
                "                     'La Tierra Israel se caracteriza por un clima',\n" +
                "                     21\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Durante la época de la monarquía',\n" +
                "                     'Durante la época romana',\n" +
                "                     'Durante la época de los filisteos',\n" +
                "                     'La época de más paz y prosperida se da en el siguiente periodo',\n" +
                "                     22\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Revuelta de los Macabeos',\n" +
                "                     'Revuelta de los Etruscos',\n" +
                "                     'Revuelta de los pastores',\n" +
                "                     '¿Cuál de las siguientes revueltas se dio durante la Época griega?',\n" +
                "                     23\n" +
                "                 );\n");

        db.execSQL("INSERT INTO quiz2 (\n" +
                "                     opcion1,\n" +
                "                     resp3,\n" +
                "                     resp2,\n" +
                "                     resp1,\n" +
                "                     pregunta,\n" +
                "                     id\n" +
                "                 )\n" +
                "                 VALUES (\n" +
                "                     2,\n" +
                "                     'Latín',\n" +
                "                     'Griego',\n" +
                "                     'Hebreo',\n" +
                "                     '¿De cuál de los siguientes idiomas procede la palabra Biblia?',\n" +
                "                     1\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     70,\n" +
                "                     72,\n" +
                "                     73,\n" +
                "                     '¿Cuántos libros componen la biblia?',\n" +
                "                     2\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Dos',\n" +
                "                     'Cuatro',\n" +
                "                     'Tres',\n" +
                "                     '¿En cuántas partes se divide la Biblia?\n" +
                "\n" +
                "',\n" +
                "                     3\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Es un libro religioso, que transmite la Palabra de Dios.',\n" +
                "                     'Es un libro científico que nos ayuda acomprender la creación.',\n" +
                "                     'Es un libro de historia que nos transmite la vida de Jesús tal como paso.',\n" +
                "                     'A la hora de leer la Biblia teneemos que tener en cuenta que',\n" +
                "                     4\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tardó en escribirse varios siglos',\n" +
                "                     'Durante la vida de Jesús',\n" +
                "                     'El año 100 después de Cristo',\n" +
                "                     'La Biblia se escribió hacia',\n" +
                "                     5\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Lo primero que se produce es el acontecimiento histórico',\n" +
                "                     'El Antiguo Testamento no tiene nada que ver con la historia del pueblo de Israel',\n" +
                "                     'Inmediatamente se produce el hecho histórico se pone por escrito',\n" +
                "                     '¿Cuál de los siguientes pasos se da en el proceso de redacción del Antiguo testamento?\n" +
                "\n" +
                "',\n" +
                "                     6\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Un Dios salvador',\n" +
                "                     'Un Dios simpático',\n" +
                "                     'Un Dios tirano',\n" +
                "                     'En la historia del pueblo de Israel Dios aparece como',\n" +
                "                     7\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Mito',\n" +
                "                     'Novela',\n" +
                "                     'Poesía',\n" +
                "                     '¿Cuál de los siguientes géneros literarios no es usado en el Antiguo Testamento?',\n" +
                "                     8\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Se carácteriza por la exageración para dar relevancia a ciertos personajes.',\n" +
                "                     'Expresa sobretodo sentimientos.',\n" +
                "                     'Intenta resoponder a grandes preguntas sobre el origen de la humanidad.',\n" +
                "                     '¿Qué es la epopeya?',\n" +
                "                     9\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Levítico',\n" +
                "                     'Génesis',\n" +
                "                     'Éxodo',\n" +
                "                     'El primer libro de la Biblia es',\n" +
                "                     10\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Era carpintero',\n" +
                "                     'Era agricultor',\n" +
                "                     'Era pastor',\n" +
                "                     'Abrahán para vivir se dedicaba al siguiente oficio',\n" +
                "                     11\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Sansón lucho contra los romanos',\n" +
                "                     'Moisés murió al cruzar el mar Rojo',\n" +
                "                     ' Nehemías tuvo que ayudar a reconstruir su tierr',\n" +
                "                     '¿Cuál de las siguientes afirmaciones es verdadera?',\n" +
                "                     12\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Nieto',\n" +
                "                     'Padre',\n" +
                "                     'Tío',\n" +
                "                     '¿Qué parentesco tenía Jacob con Abrahán?',\n" +
                "                     13\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Romano',\n" +
                "                     'Persa',\n" +
                "                     'Griego',\n" +
                "                     '¿Que imperio dirigió Ciro?',\n" +
                "                     14\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tierra de Moisés',\n" +
                "                     'Tierra de Israel',\n" +
                "                     'Tierra de Canaán',\n" +
                "                     '¿Cuál de los siguientes nombres no ha recibido la tierra donde se asento el pueblo judío?',\n" +
                "                     15\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Genesís, Éxodo, Levítico, Números y Deuteronomio',\n" +
                "                     'Genesís, Éxodo, Ageo, levítico y Tobías',\n" +
                "                     'Genesis, Samuel, Números, Josué y Levítico',\n" +
                "                     'El Pentateuco esta compuesto por los siguientes libros',\n" +
                "                     16\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     '27 libros',\n" +
                "                     '26 libros',\n" +
                "                     '28 libros',\n" +
                "                     '¿El Nuevo testamento está compuesto por?',\n" +
                "                     17\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Sagrada Escritura',\n" +
                "                     'El gran libro de Dios',\n" +
                "                     'Relato de Dios',\n" +
                "                     'La biblia es sobretodo Palabra de Dios por eso también se la conoce como',\n" +
                "                     18\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'No metió ninguno',\n" +
                "                     'Uno de cada especie',\n" +
                "                     'Dos de cada especie',\n" +
                "                     '¿Cuántos animales metió Moisés en el Arca?',\n" +
                "                     19\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'El Nuevo Testamento es menos extenso',\n" +
                "                     'El Nuevo Testamento es más extenso',\n" +
                "                     'Igual de extensos',\n" +
                "                     'El Antiguo Testamento y el Nuevo resulta que son',\n" +
                "                     20\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Un clima seco, casí propio de un desierto, con escasez de agua.',\n" +
                "                     'Un clima templado y suelo fertil, rodeado de zonas áridas.',\n" +
                "                     'Muy humedo y lluvioso durante todo el año.',\n" +
                "                     'La Tierra Israel se caracteriza por un clima',\n" +
                "                     21\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Durante la época de la monarquía',\n" +
                "                     'Durante la época romana',\n" +
                "                     'Durante la época de los filisteos',\n" +
                "                     'La época de más paz y prosperida se da en el siguiente periodo',\n" +
                "                     22\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Revuelta de los Macabeos',\n" +
                "                     'Revuelta de los Etruscos',\n" +
                "                     'Revuelta de los pastores',\n" +
                "                     '¿Cuál de las siguientes revueltas se dio durante la Época griega?',\n" +
                "                     23\n" +
                "                 );\n");

        db.execSQL("INSERT INTO quiz3 (\n" +
                "                     opcion1,\n" +
                "                     resp3,\n" +
                "                     resp2,\n" +
                "                     resp1,\n" +
                "                     pregunta,\n" +
                "                     id\n" +
                "                 )\n" +
                "                 VALUES (\n" +
                "                     2,\n" +
                "                     'Latín',\n" +
                "                     'Griego',\n" +
                "                     'Hebreo',\n" +
                "                     '¿De cuál de los siguientes idiomas procede la palabra Biblia?',\n" +
                "                     1\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     70,\n" +
                "                     72,\n" +
                "                     73,\n" +
                "                     '¿Cuántos libros componen la biblia?',\n" +
                "                     2\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Dos',\n" +
                "                     'Cuatro',\n" +
                "                     'Tres',\n" +
                "                     '¿En cuántas partes se divide la Biblia?\n" +
                "\n" +
                "',\n" +
                "                     3\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Es un libro religioso, que transmite la Palabra de Dios.',\n" +
                "                     'Es un libro científico que nos ayuda acomprender la creación.',\n" +
                "                     'Es un libro de historia que nos transmite la vida de Jesús tal como paso.',\n" +
                "                     'A la hora de leer la Biblia teneemos que tener en cuenta que',\n" +
                "                     4\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tardó en escribirse varios siglos',\n" +
                "                     'Durante la vida de Jesús',\n" +
                "                     'El año 100 después de Cristo',\n" +
                "                     'La Biblia se escribió hacia',\n" +
                "                     5\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Lo primero que se produce es el acontecimiento histórico',\n" +
                "                     'El Antiguo Testamento no tiene nada que ver con la historia del pueblo de Israel',\n" +
                "                     'Inmediatamente se produce el hecho histórico se pone por escrito',\n" +
                "                     '¿Cuál de los siguientes pasos se da en el proceso de redacción del Antiguo testamento?\n" +
                "\n" +
                "',\n" +
                "                     6\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Un Dios salvador',\n" +
                "                     'Un Dios simpático',\n" +
                "                     'Un Dios tirano',\n" +
                "                     'En la historia del pueblo de Israel Dios aparece como',\n" +
                "                     7\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Mito',\n" +
                "                     'Novela',\n" +
                "                     'Poesía',\n" +
                "                     '¿Cuál de los siguientes géneros literarios no es usado en el Antiguo Testamento?',\n" +
                "                     8\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Se carácteriza por la exageración para dar relevancia a ciertos personajes.',\n" +
                "                     'Expresa sobretodo sentimientos.',\n" +
                "                     'Intenta resoponder a grandes preguntas sobre el origen de la humanidad.',\n" +
                "                     '¿Qué es la epopeya?',\n" +
                "                     9\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Levítico',\n" +
                "                     'Génesis',\n" +
                "                     'Éxodo',\n" +
                "                     'El primer libro de la Biblia es',\n" +
                "                     10\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Era carpintero',\n" +
                "                     'Era agricultor',\n" +
                "                     'Era pastor',\n" +
                "                     'Abrahán para vivir se dedicaba al siguiente oficio',\n" +
                "                     11\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Sansón lucho contra los romanos',\n" +
                "                     'Moisés murió al cruzar el mar Rojo',\n" +
                "                     ' Nehemías tuvo que ayudar a reconstruir su tierr',\n" +
                "                     '¿Cuál de las siguientes afirmaciones es verdadera?',\n" +
                "                     12\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Nieto',\n" +
                "                     'Padre',\n" +
                "                     'Tío',\n" +
                "                     '¿Qué parentesco tenía Jacob con Abrahán?',\n" +
                "                     13\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Romano',\n" +
                "                     'Persa',\n" +
                "                     'Griego',\n" +
                "                     '¿Que imperio dirigió Ciro?',\n" +
                "                     14\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tierra de Moisés',\n" +
                "                     'Tierra de Israel',\n" +
                "                     'Tierra de Canaán',\n" +
                "                     '¿Cuál de los siguientes nombres no ha recibido la tierra donde se asento el pueblo judío?',\n" +
                "                     15\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Genesís, Éxodo, Levítico, Números y Deuteronomio',\n" +
                "                     'Genesís, Éxodo, Ageo, levítico y Tobías',\n" +
                "                     'Genesis, Samuel, Números, Josué y Levítico',\n" +
                "                     'El Pentateuco esta compuesto por los siguientes libros',\n" +
                "                     16\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     '27 libros',\n" +
                "                     '26 libros',\n" +
                "                     '28 libros',\n" +
                "                     '¿El Nuevo testamento está compuesto por?',\n" +
                "                     17\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Sagrada Escritura',\n" +
                "                     'El gran libro de Dios',\n" +
                "                     'Relato de Dios',\n" +
                "                     'La biblia es sobretodo Palabra de Dios por eso también se la conoce como',\n" +
                "                     18\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'No metió ninguno',\n" +
                "                     'Uno de cada especie',\n" +
                "                     'Dos de cada especie',\n" +
                "                     '¿Cuántos animales metió Moisés en el Arca?',\n" +
                "                     19\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'El Nuevo Testamento es menos extenso',\n" +
                "                     'El Nuevo Testamento es más extenso',\n" +
                "                     'Igual de extensos',\n" +
                "                     'El Antiguo Testamento y el Nuevo resulta que son',\n" +
                "                     20\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Un clima seco, casí propio de un desierto, con escasez de agua.',\n" +
                "                     'Un clima templado y suelo fertil, rodeado de zonas áridas.',\n" +
                "                     'Muy humedo y lluvioso durante todo el año.',\n" +
                "                     'La Tierra Israel se caracteriza por un clima',\n" +
                "                     21\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Durante la época de la monarquía',\n" +
                "                     'Durante la época romana',\n" +
                "                     'Durante la época de los filisteos',\n" +
                "                     'La época de más paz y prosperida se da en el siguiente periodo',\n" +
                "                     22\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Revuelta de los Macabeos',\n" +
                "                     'Revuelta de los Etruscos',\n" +
                "                     'Revuelta de los pastores',\n" +
                "                     '¿Cuál de las siguientes revueltas se dio durante la Época griega?',\n" +
                "                     23\n" +
                "                 );\n");

        db.execSQL("INSERT INTO quiz4 (\n" +
                "                     opcion1,\n" +
                "                     resp3,\n" +
                "                     resp2,\n" +
                "                     resp1,\n" +
                "                     pregunta,\n" +
                "                     id\n" +
                "                 )\n" +
                "                 VALUES (\n" +
                "                     3,\n" +
                "                     'HIT',\n" +
                "                     'STRIKE',\n" +
                "                     'HOME RUN',\n" +
                "                     '¿Como se llama en beisbol cuando un bateador golpea la bola y esta sale del campo de juego, lo que le permite recorrer todas las bases con facilidad?',\n" +
                "                     1\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'WATERPOLO',\n" +
                "                     'HOCKEY SOBRE PATINES',\n" +
                "                     'VOLEIBOL',\n" +
                "                     'Si hablamos del jugador boya, estamos hablando de...',\n" +
                "                     2\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Dos',\n" +
                "                     'Cuatro',\n" +
                "                     'Tres',\n" +
                "                     '¿En cuántas partes se divide la Biblia?\n" +
                "\n" +
                "',\n" +
                "                     3\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Es un libro religioso, que transmite la Palabra de Dios.',\n" +
                "                     'Es un libro científico que nos ayuda acomprender la creación.',\n" +
                "                     'Es un libro de historia que nos transmite la vida de Jesús tal como paso.',\n" +
                "                     'A la hora de leer la Biblia teneemos que tener en cuenta que',\n" +
                "                     4\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tardó en escribirse varios siglos',\n" +
                "                     'Durante la vida de Jesús',\n" +
                "                     'El año 100 después de Cristo',\n" +
                "                     'La Biblia se escribió hacia',\n" +
                "                     5\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Lo primero que se produce es el acontecimiento histórico',\n" +
                "                     'El Antiguo Testamento no tiene nada que ver con la historia del pueblo de Israel',\n" +
                "                     'Inmediatamente se produce el hecho histórico se pone por escrito',\n" +
                "                     '¿Cuál de los siguientes pasos se da en el proceso de redacción del Antiguo testamento?\n" +
                "\n" +
                "',\n" +
                "                     6\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Un Dios salvador',\n" +
                "                     'Un Dios simpático',\n" +
                "                     'Un Dios tirano',\n" +
                "                     'En la historia del pueblo de Israel Dios aparece como',\n" +
                "                     7\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Mito',\n" +
                "                     'Novela',\n" +
                "                     'Poesía',\n" +
                "                     '¿Cuál de los siguientes géneros literarios no es usado en el Antiguo Testamento?',\n" +
                "                     8\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Se carácteriza por la exageración para dar relevancia a ciertos personajes.',\n" +
                "                     'Expresa sobretodo sentimientos.',\n" +
                "                     'Intenta resoponder a grandes preguntas sobre el origen de la humanidad.',\n" +
                "                     '¿Qué es la epopeya?',\n" +
                "                     9\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Levítico',\n" +
                "                     'Génesis',\n" +
                "                     'Éxodo',\n" +
                "                     'El primer libro de la Biblia es',\n" +
                "                     10\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Era carpintero',\n" +
                "                     'Era agricultor',\n" +
                "                     'Era pastor',\n" +
                "                     'Abrahán para vivir se dedicaba al siguiente oficio',\n" +
                "                     11\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Sansón lucho contra los romanos',\n" +
                "                     'Moisés murió al cruzar el mar Rojo',\n" +
                "                     ' Nehemías tuvo que ayudar a reconstruir su tierr',\n" +
                "                     '¿Cuál de las siguientes afirmaciones es verdadera?',\n" +
                "                     12\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Nieto',\n" +
                "                     'Padre',\n" +
                "                     'Tío',\n" +
                "                     '¿Qué parentesco tenía Jacob con Abrahán?',\n" +
                "                     13\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Romano',\n" +
                "                     'Persa',\n" +
                "                     'Griego',\n" +
                "                     '¿Que imperio dirigió Ciro?',\n" +
                "                     14\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tierra de Moisés',\n" +
                "                     'Tierra de Israel',\n" +
                "                     'Tierra de Canaán',\n" +
                "                     '¿Cuál de los siguientes nombres no ha recibido la tierra donde se asento el pueblo judío?',\n" +
                "                     15\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Genesís, Éxodo, Levítico, Números y Deuteronomio',\n" +
                "                     'Genesís, Éxodo, Ageo, levítico y Tobías',\n" +
                "                     'Genesis, Samuel, Números, Josué y Levítico',\n" +
                "                     'El Pentateuco esta compuesto por los siguientes libros',\n" +
                "                     16\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     '27 libros',\n" +
                "                     '26 libros',\n" +
                "                     '28 libros',\n" +
                "                     '¿El Nuevo testamento está compuesto por?',\n" +
                "                     17\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Sagrada Escritura',\n" +
                "                     'El gran libro de Dios',\n" +
                "                     'Relato de Dios',\n" +
                "                     'La biblia es sobretodo Palabra de Dios por eso también se la conoce como',\n" +
                "                     18\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'No metió ninguno',\n" +
                "                     'Uno de cada especie',\n" +
                "                     'Dos de cada especie',\n" +
                "                     '¿Cuántos animales metió Moisés en el Arca?',\n" +
                "                     19\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'El Nuevo Testamento es menos extenso',\n" +
                "                     'El Nuevo Testamento es más extenso',\n" +
                "                     'Igual de extensos',\n" +
                "                     'El Antiguo Testamento y el Nuevo resulta que son',\n" +
                "                     20\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Un clima seco, casí propio de un desierto, con escasez de agua.',\n" +
                "                     'Un clima templado y suelo fertil, rodeado de zonas áridas.',\n" +
                "                     'Muy humedo y lluvioso durante todo el año.',\n" +
                "                     'La Tierra Israel se caracteriza por un clima',\n" +
                "                     21\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Durante la época de la monarquía',\n" +
                "                     'Durante la época romana',\n" +
                "                     'Durante la época de los filisteos',\n" +
                "                     'La época de más paz y prosperida se da en el siguiente periodo',\n" +
                "                     22\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Revuelta de los Macabeos',\n" +
                "                     'Revuelta de los Etruscos',\n" +
                "                     'Revuelta de los pastores',\n" +
                "                     '¿Cuál de las siguientes revueltas se dio durante la Época griega?',\n" +
                "                     23\n" +
                "                 );\n");


        db.execSQL("ALTER TABLE quiz1 ADD score int not null default 0");
        db.execSQL("ALTER TABLE quiz2 ADD score int not null default 0");
        db.execSQL("ALTER TABLE quiz3 ADD score int not null default 0");
        db.execSQL("ALTER TABLE quiz4 ADD score int not null default 0");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS quiz1");
        db.execSQL("DROP TABLE IF EXISTS quiz2");
        db.execSQL("DROP TABLE IF EXISTS quiz3");
        db.execSQL("DROP TABLE IF EXISTS quiz4");

        onCreate(db);
    }


}

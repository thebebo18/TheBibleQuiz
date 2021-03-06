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
                "                     'Lat??n',\n" +
                "                     'Griego',\n" +
                "                     'Hebreo',\n" +
                "                     '??De cu??l de los siguientes idiomas procede la palabra Biblia?',\n" +
                "                     1\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     70,\n" +
                "                     72,\n" +
                "                     73,\n" +
                "                     '??Cu??ntos libros componen la biblia?',\n" +
                "                     2\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Dos',\n" +
                "                     'Cuatro',\n" +
                "                     'Tres',\n" +
                "                     '??En cu??ntas partes se divide la Biblia?\n" +
                "\n" +
                "',\n" +
                "                     3\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Es un libro religioso, que transmite la Palabra de Dios.',\n" +
                "                     'Es un libro cient??fico que nos ayuda acomprender la creaci??n.',\n" +
                "                     'Es un libro de historia que nos transmite la vida de Jes??s tal como paso.',\n" +
                "                     'A la hora de leer la Biblia teneemos que tener en cuenta que',\n" +
                "                     4\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tard?? en escribirse varios siglos',\n" +
                "                     'Durante la vida de Jes??s',\n" +
                "                     'El a??o 100 despu??s de Cristo',\n" +
                "                     'La Biblia se escribi?? hacia',\n" +
                "                     5\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Lo primero que se produce es el acontecimiento hist??rico',\n" +
                "                     'El Antiguo Testamento no tiene nada que ver con la historia del pueblo de Israel',\n" +
                "                     'Inmediatamente se produce el hecho hist??rico se pone por escrito',\n" +
                "                     '??Cu??l de los siguientes pasos se da en el proceso de redacci??n del Antiguo testamento?\n" +
                "\n" +
                "',\n" +
                "                     6\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Un Dios salvador',\n" +
                "                     'Un Dios simp??tico',\n" +
                "                     'Un Dios tirano',\n" +
                "                     'En la historia del pueblo de Israel Dios aparece como',\n" +
                "                     7\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Mito',\n" +
                "                     'Novela',\n" +
                "                     'Poes??a',\n" +
                "                     '??Cu??l de los siguientes g??neros literarios no es usado en el Antiguo Testamento?',\n" +
                "                     8\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Se car??cteriza por la exageraci??n para dar relevancia a ciertos personajes.',\n" +
                "                     'Expresa sobretodo sentimientos.',\n" +
                "                     'Intenta resoponder a grandes preguntas sobre el origen de la humanidad.',\n" +
                "                     '??Qu?? es la epopeya?',\n" +
                "                     9\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Lev??tico',\n" +
                "                     'G??nesis',\n" +
                "                     '??xodo',\n" +
                "                     'El primer libro de la Biblia es',\n" +
                "                     10\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Era carpintero',\n" +
                "                     'Era agricultor',\n" +
                "                     'Era pastor',\n" +
                "                     'Abrah??n para vivir se dedicaba al siguiente oficio',\n" +
                "                     11\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Sans??n lucho contra los romanos',\n" +
                "                     'Mois??s muri?? al cruzar el mar Rojo',\n" +
                "                     ' Nehem??as tuvo que ayudar a reconstruir su tierr',\n" +
                "                     '??Cu??l de las siguientes afirmaciones es verdadera?',\n" +
                "                     12\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Nieto',\n" +
                "                     'Padre',\n" +
                "                     'T??o',\n" +
                "                     '??Qu?? parentesco ten??a Jacob con Abrah??n?',\n" +
                "                     13\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Romano',\n" +
                "                     'Persa',\n" +
                "                     'Griego',\n" +
                "                     '??Que imperio dirigi?? Ciro?',\n" +
                "                     14\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tierra de Mois??s',\n" +
                "                     'Tierra de Israel',\n" +
                "                     'Tierra de Cana??n',\n" +
                "                     '??Cu??l de los siguientes nombres no ha recibido la tierra donde se asento el pueblo jud??o?',\n" +
                "                     15\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Genes??s, ??xodo, Lev??tico, N??meros y Deuteronomio',\n" +
                "                     'Genes??s, ??xodo, Ageo, lev??tico y Tob??as',\n" +
                "                     'Genesis, Samuel, N??meros, Josu?? y Lev??tico',\n" +
                "                     'El Pentateuco esta compuesto por los siguientes libros',\n" +
                "                     16\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     '27 libros',\n" +
                "                     '26 libros',\n" +
                "                     '28 libros',\n" +
                "                     '??El Nuevo testamento est?? compuesto por?',\n" +
                "                     17\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Sagrada Escritura',\n" +
                "                     'El gran libro de Dios',\n" +
                "                     'Relato de Dios',\n" +
                "                     'La biblia es sobretodo Palabra de Dios por eso tambi??n se la conoce como',\n" +
                "                     18\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'No meti?? ninguno',\n" +
                "                     'Uno de cada especie',\n" +
                "                     'Dos de cada especie',\n" +
                "                     '??Cu??ntos animales meti?? Mois??s en el Arca?',\n" +
                "                     19\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'El Nuevo Testamento es menos extenso',\n" +
                "                     'El Nuevo Testamento es m??s extenso',\n" +
                "                     'Igual de extensos',\n" +
                "                     'El Antiguo Testamento y el Nuevo resulta que son',\n" +
                "                     20\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Un clima seco, cas?? propio de un desierto, con escasez de agua.',\n" +
                "                     'Un clima templado y suelo fertil, rodeado de zonas ??ridas.',\n" +
                "                     'Muy humedo y lluvioso durante todo el a??o.',\n" +
                "                     'La Tierra Israel se caracteriza por un clima',\n" +
                "                     21\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Durante la ??poca de la monarqu??a',\n" +
                "                     'Durante la ??poca romana',\n" +
                "                     'Durante la ??poca de los filisteos',\n" +
                "                     'La ??poca de m??s paz y prosperida se da en el siguiente periodo',\n" +
                "                     22\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Revuelta de los Macabeos',\n" +
                "                     'Revuelta de los Etruscos',\n" +
                "                     'Revuelta de los pastores',\n" +
                "                     '??Cu??l de las siguientes revueltas se dio durante la ??poca griega?',\n" +
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
                "                     'Lat??n',\n" +
                "                     'Griego',\n" +
                "                     'Hebreo',\n" +
                "                     '??De cu??l de los siguientes idiomas procede la palabra Biblia?',\n" +
                "                     1\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     70,\n" +
                "                     72,\n" +
                "                     73,\n" +
                "                     '??Cu??ntos libros componen la biblia?',\n" +
                "                     2\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Dos',\n" +
                "                     'Cuatro',\n" +
                "                     'Tres',\n" +
                "                     '??En cu??ntas partes se divide la Biblia?\n" +
                "\n" +
                "',\n" +
                "                     3\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Es un libro religioso, que transmite la Palabra de Dios.',\n" +
                "                     'Es un libro cient??fico que nos ayuda acomprender la creaci??n.',\n" +
                "                     'Es un libro de historia que nos transmite la vida de Jes??s tal como paso.',\n" +
                "                     'A la hora de leer la Biblia teneemos que tener en cuenta que',\n" +
                "                     4\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tard?? en escribirse varios siglos',\n" +
                "                     'Durante la vida de Jes??s',\n" +
                "                     'El a??o 100 despu??s de Cristo',\n" +
                "                     'La Biblia se escribi?? hacia',\n" +
                "                     5\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Lo primero que se produce es el acontecimiento hist??rico',\n" +
                "                     'El Antiguo Testamento no tiene nada que ver con la historia del pueblo de Israel',\n" +
                "                     'Inmediatamente se produce el hecho hist??rico se pone por escrito',\n" +
                "                     '??Cu??l de los siguientes pasos se da en el proceso de redacci??n del Antiguo testamento?\n" +
                "\n" +
                "',\n" +
                "                     6\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Un Dios salvador',\n" +
                "                     'Un Dios simp??tico',\n" +
                "                     'Un Dios tirano',\n" +
                "                     'En la historia del pueblo de Israel Dios aparece como',\n" +
                "                     7\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Mito',\n" +
                "                     'Novela',\n" +
                "                     'Poes??a',\n" +
                "                     '??Cu??l de los siguientes g??neros literarios no es usado en el Antiguo Testamento?',\n" +
                "                     8\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Se car??cteriza por la exageraci??n para dar relevancia a ciertos personajes.',\n" +
                "                     'Expresa sobretodo sentimientos.',\n" +
                "                     'Intenta resoponder a grandes preguntas sobre el origen de la humanidad.',\n" +
                "                     '??Qu?? es la epopeya?',\n" +
                "                     9\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Lev??tico',\n" +
                "                     'G??nesis',\n" +
                "                     '??xodo',\n" +
                "                     'El primer libro de la Biblia es',\n" +
                "                     10\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Era carpintero',\n" +
                "                     'Era agricultor',\n" +
                "                     'Era pastor',\n" +
                "                     'Abrah??n para vivir se dedicaba al siguiente oficio',\n" +
                "                     11\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Sans??n lucho contra los romanos',\n" +
                "                     'Mois??s muri?? al cruzar el mar Rojo',\n" +
                "                     ' Nehem??as tuvo que ayudar a reconstruir su tierr',\n" +
                "                     '??Cu??l de las siguientes afirmaciones es verdadera?',\n" +
                "                     12\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Nieto',\n" +
                "                     'Padre',\n" +
                "                     'T??o',\n" +
                "                     '??Qu?? parentesco ten??a Jacob con Abrah??n?',\n" +
                "                     13\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Romano',\n" +
                "                     'Persa',\n" +
                "                     'Griego',\n" +
                "                     '??Que imperio dirigi?? Ciro?',\n" +
                "                     14\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tierra de Mois??s',\n" +
                "                     'Tierra de Israel',\n" +
                "                     'Tierra de Cana??n',\n" +
                "                     '??Cu??l de los siguientes nombres no ha recibido la tierra donde se asento el pueblo jud??o?',\n" +
                "                     15\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Genes??s, ??xodo, Lev??tico, N??meros y Deuteronomio',\n" +
                "                     'Genes??s, ??xodo, Ageo, lev??tico y Tob??as',\n" +
                "                     'Genesis, Samuel, N??meros, Josu?? y Lev??tico',\n" +
                "                     'El Pentateuco esta compuesto por los siguientes libros',\n" +
                "                     16\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     '27 libros',\n" +
                "                     '26 libros',\n" +
                "                     '28 libros',\n" +
                "                     '??El Nuevo testamento est?? compuesto por?',\n" +
                "                     17\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Sagrada Escritura',\n" +
                "                     'El gran libro de Dios',\n" +
                "                     'Relato de Dios',\n" +
                "                     'La biblia es sobretodo Palabra de Dios por eso tambi??n se la conoce como',\n" +
                "                     18\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'No meti?? ninguno',\n" +
                "                     'Uno de cada especie',\n" +
                "                     'Dos de cada especie',\n" +
                "                     '??Cu??ntos animales meti?? Mois??s en el Arca?',\n" +
                "                     19\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'El Nuevo Testamento es menos extenso',\n" +
                "                     'El Nuevo Testamento es m??s extenso',\n" +
                "                     'Igual de extensos',\n" +
                "                     'El Antiguo Testamento y el Nuevo resulta que son',\n" +
                "                     20\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Un clima seco, cas?? propio de un desierto, con escasez de agua.',\n" +
                "                     'Un clima templado y suelo fertil, rodeado de zonas ??ridas.',\n" +
                "                     'Muy humedo y lluvioso durante todo el a??o.',\n" +
                "                     'La Tierra Israel se caracteriza por un clima',\n" +
                "                     21\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Durante la ??poca de la monarqu??a',\n" +
                "                     'Durante la ??poca romana',\n" +
                "                     'Durante la ??poca de los filisteos',\n" +
                "                     'La ??poca de m??s paz y prosperida se da en el siguiente periodo',\n" +
                "                     22\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Revuelta de los Macabeos',\n" +
                "                     'Revuelta de los Etruscos',\n" +
                "                     'Revuelta de los pastores',\n" +
                "                     '??Cu??l de las siguientes revueltas se dio durante la ??poca griega?',\n" +
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
                "                     'Lat??n',\n" +
                "                     'Griego',\n" +
                "                     'Hebreo',\n" +
                "                     '??De cu??l de los siguientes idiomas procede la palabra Biblia?',\n" +
                "                     1\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     70,\n" +
                "                     72,\n" +
                "                     73,\n" +
                "                     '??Cu??ntos libros componen la biblia?',\n" +
                "                     2\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Dos',\n" +
                "                     'Cuatro',\n" +
                "                     'Tres',\n" +
                "                     '??En cu??ntas partes se divide la Biblia?\n" +
                "\n" +
                "',\n" +
                "                     3\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Es un libro religioso, que transmite la Palabra de Dios.',\n" +
                "                     'Es un libro cient??fico que nos ayuda acomprender la creaci??n.',\n" +
                "                     'Es un libro de historia que nos transmite la vida de Jes??s tal como paso.',\n" +
                "                     'A la hora de leer la Biblia teneemos que tener en cuenta que',\n" +
                "                     4\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tard?? en escribirse varios siglos',\n" +
                "                     'Durante la vida de Jes??s',\n" +
                "                     'El a??o 100 despu??s de Cristo',\n" +
                "                     'La Biblia se escribi?? hacia',\n" +
                "                     5\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Lo primero que se produce es el acontecimiento hist??rico',\n" +
                "                     'El Antiguo Testamento no tiene nada que ver con la historia del pueblo de Israel',\n" +
                "                     'Inmediatamente se produce el hecho hist??rico se pone por escrito',\n" +
                "                     '??Cu??l de los siguientes pasos se da en el proceso de redacci??n del Antiguo testamento?\n" +
                "\n" +
                "',\n" +
                "                     6\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Un Dios salvador',\n" +
                "                     'Un Dios simp??tico',\n" +
                "                     'Un Dios tirano',\n" +
                "                     'En la historia del pueblo de Israel Dios aparece como',\n" +
                "                     7\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Mito',\n" +
                "                     'Novela',\n" +
                "                     'Poes??a',\n" +
                "                     '??Cu??l de los siguientes g??neros literarios no es usado en el Antiguo Testamento?',\n" +
                "                     8\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Se car??cteriza por la exageraci??n para dar relevancia a ciertos personajes.',\n" +
                "                     'Expresa sobretodo sentimientos.',\n" +
                "                     'Intenta resoponder a grandes preguntas sobre el origen de la humanidad.',\n" +
                "                     '??Qu?? es la epopeya?',\n" +
                "                     9\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Lev??tico',\n" +
                "                     'G??nesis',\n" +
                "                     '??xodo',\n" +
                "                     'El primer libro de la Biblia es',\n" +
                "                     10\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Era carpintero',\n" +
                "                     'Era agricultor',\n" +
                "                     'Era pastor',\n" +
                "                     'Abrah??n para vivir se dedicaba al siguiente oficio',\n" +
                "                     11\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Sans??n lucho contra los romanos',\n" +
                "                     'Mois??s muri?? al cruzar el mar Rojo',\n" +
                "                     ' Nehem??as tuvo que ayudar a reconstruir su tierr',\n" +
                "                     '??Cu??l de las siguientes afirmaciones es verdadera?',\n" +
                "                     12\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Nieto',\n" +
                "                     'Padre',\n" +
                "                     'T??o',\n" +
                "                     '??Qu?? parentesco ten??a Jacob con Abrah??n?',\n" +
                "                     13\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Romano',\n" +
                "                     'Persa',\n" +
                "                     'Griego',\n" +
                "                     '??Que imperio dirigi?? Ciro?',\n" +
                "                     14\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tierra de Mois??s',\n" +
                "                     'Tierra de Israel',\n" +
                "                     'Tierra de Cana??n',\n" +
                "                     '??Cu??l de los siguientes nombres no ha recibido la tierra donde se asento el pueblo jud??o?',\n" +
                "                     15\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Genes??s, ??xodo, Lev??tico, N??meros y Deuteronomio',\n" +
                "                     'Genes??s, ??xodo, Ageo, lev??tico y Tob??as',\n" +
                "                     'Genesis, Samuel, N??meros, Josu?? y Lev??tico',\n" +
                "                     'El Pentateuco esta compuesto por los siguientes libros',\n" +
                "                     16\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     '27 libros',\n" +
                "                     '26 libros',\n" +
                "                     '28 libros',\n" +
                "                     '??El Nuevo testamento est?? compuesto por?',\n" +
                "                     17\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Sagrada Escritura',\n" +
                "                     'El gran libro de Dios',\n" +
                "                     'Relato de Dios',\n" +
                "                     'La biblia es sobretodo Palabra de Dios por eso tambi??n se la conoce como',\n" +
                "                     18\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'No meti?? ninguno',\n" +
                "                     'Uno de cada especie',\n" +
                "                     'Dos de cada especie',\n" +
                "                     '??Cu??ntos animales meti?? Mois??s en el Arca?',\n" +
                "                     19\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'El Nuevo Testamento es menos extenso',\n" +
                "                     'El Nuevo Testamento es m??s extenso',\n" +
                "                     'Igual de extensos',\n" +
                "                     'El Antiguo Testamento y el Nuevo resulta que son',\n" +
                "                     20\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Un clima seco, cas?? propio de un desierto, con escasez de agua.',\n" +
                "                     'Un clima templado y suelo fertil, rodeado de zonas ??ridas.',\n" +
                "                     'Muy humedo y lluvioso durante todo el a??o.',\n" +
                "                     'La Tierra Israel se caracteriza por un clima',\n" +
                "                     21\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Durante la ??poca de la monarqu??a',\n" +
                "                     'Durante la ??poca romana',\n" +
                "                     'Durante la ??poca de los filisteos',\n" +
                "                     'La ??poca de m??s paz y prosperida se da en el siguiente periodo',\n" +
                "                     22\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Revuelta de los Macabeos',\n" +
                "                     'Revuelta de los Etruscos',\n" +
                "                     'Revuelta de los pastores',\n" +
                "                     '??Cu??l de las siguientes revueltas se dio durante la ??poca griega?',\n" +
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
                "                     '??Como se llama en beisbol cuando un bateador golpea la bola y esta sale del campo de juego, lo que le permite recorrer todas las bases con facilidad?',\n" +
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
                "                     '??En cu??ntas partes se divide la Biblia?\n" +
                "\n" +
                "',\n" +
                "                     3\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Es un libro religioso, que transmite la Palabra de Dios.',\n" +
                "                     'Es un libro cient??fico que nos ayuda acomprender la creaci??n.',\n" +
                "                     'Es un libro de historia que nos transmite la vida de Jes??s tal como paso.',\n" +
                "                     'A la hora de leer la Biblia teneemos que tener en cuenta que',\n" +
                "                     4\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tard?? en escribirse varios siglos',\n" +
                "                     'Durante la vida de Jes??s',\n" +
                "                     'El a??o 100 despu??s de Cristo',\n" +
                "                     'La Biblia se escribi?? hacia',\n" +
                "                     5\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Lo primero que se produce es el acontecimiento hist??rico',\n" +
                "                     'El Antiguo Testamento no tiene nada que ver con la historia del pueblo de Israel',\n" +
                "                     'Inmediatamente se produce el hecho hist??rico se pone por escrito',\n" +
                "                     '??Cu??l de los siguientes pasos se da en el proceso de redacci??n del Antiguo testamento?\n" +
                "\n" +
                "',\n" +
                "                     6\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Un Dios salvador',\n" +
                "                     'Un Dios simp??tico',\n" +
                "                     'Un Dios tirano',\n" +
                "                     'En la historia del pueblo de Israel Dios aparece como',\n" +
                "                     7\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Mito',\n" +
                "                     'Novela',\n" +
                "                     'Poes??a',\n" +
                "                     '??Cu??l de los siguientes g??neros literarios no es usado en el Antiguo Testamento?',\n" +
                "                     8\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Se car??cteriza por la exageraci??n para dar relevancia a ciertos personajes.',\n" +
                "                     'Expresa sobretodo sentimientos.',\n" +
                "                     'Intenta resoponder a grandes preguntas sobre el origen de la humanidad.',\n" +
                "                     '??Qu?? es la epopeya?',\n" +
                "                     9\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Lev??tico',\n" +
                "                     'G??nesis',\n" +
                "                     '??xodo',\n" +
                "                     'El primer libro de la Biblia es',\n" +
                "                     10\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Era carpintero',\n" +
                "                     'Era agricultor',\n" +
                "                     'Era pastor',\n" +
                "                     'Abrah??n para vivir se dedicaba al siguiente oficio',\n" +
                "                     11\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     1,\n" +
                "                     'Sans??n lucho contra los romanos',\n" +
                "                     'Mois??s muri?? al cruzar el mar Rojo',\n" +
                "                     ' Nehem??as tuvo que ayudar a reconstruir su tierr',\n" +
                "                     '??Cu??l de las siguientes afirmaciones es verdadera?',\n" +
                "                     12\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Nieto',\n" +
                "                     'Padre',\n" +
                "                     'T??o',\n" +
                "                     '??Qu?? parentesco ten??a Jacob con Abrah??n?',\n" +
                "                     13\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Romano',\n" +
                "                     'Persa',\n" +
                "                     'Griego',\n" +
                "                     '??Que imperio dirigi?? Ciro?',\n" +
                "                     14\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Tierra de Mois??s',\n" +
                "                     'Tierra de Israel',\n" +
                "                     'Tierra de Cana??n',\n" +
                "                     '??Cu??l de los siguientes nombres no ha recibido la tierra donde se asento el pueblo jud??o?',\n" +
                "                     15\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Genes??s, ??xodo, Lev??tico, N??meros y Deuteronomio',\n" +
                "                     'Genes??s, ??xodo, Ageo, lev??tico y Tob??as',\n" +
                "                     'Genesis, Samuel, N??meros, Josu?? y Lev??tico',\n" +
                "                     'El Pentateuco esta compuesto por los siguientes libros',\n" +
                "                     16\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     '27 libros',\n" +
                "                     '26 libros',\n" +
                "                     '28 libros',\n" +
                "                     '??El Nuevo testamento est?? compuesto por?',\n" +
                "                     17\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Sagrada Escritura',\n" +
                "                     'El gran libro de Dios',\n" +
                "                     'Relato de Dios',\n" +
                "                     'La biblia es sobretodo Palabra de Dios por eso tambi??n se la conoce como',\n" +
                "                     18\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'No meti?? ninguno',\n" +
                "                     'Uno de cada especie',\n" +
                "                     'Dos de cada especie',\n" +
                "                     '??Cu??ntos animales meti?? Mois??s en el Arca?',\n" +
                "                     19\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'El Nuevo Testamento es menos extenso',\n" +
                "                     'El Nuevo Testamento es m??s extenso',\n" +
                "                     'Igual de extensos',\n" +
                "                     'El Antiguo Testamento y el Nuevo resulta que son',\n" +
                "                     20\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     2,\n" +
                "                     'Un clima seco, cas?? propio de un desierto, con escasez de agua.',\n" +
                "                     'Un clima templado y suelo fertil, rodeado de zonas ??ridas.',\n" +
                "                     'Muy humedo y lluvioso durante todo el a??o.',\n" +
                "                     'La Tierra Israel se caracteriza por un clima',\n" +
                "                     21\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Durante la ??poca de la monarqu??a',\n" +
                "                     'Durante la ??poca romana',\n" +
                "                     'Durante la ??poca de los filisteos',\n" +
                "                     'La ??poca de m??s paz y prosperida se da en el siguiente periodo',\n" +
                "                     22\n" +
                "                 ),\n" +
                "                 (\n" +
                "                     3,\n" +
                "                     'Revuelta de los Macabeos',\n" +
                "                     'Revuelta de los Etruscos',\n" +
                "                     'Revuelta de los pastores',\n" +
                "                     '??Cu??l de las siguientes revueltas se dio durante la ??poca griega?',\n" +
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

package com.miramicodigo.prueba_proyecto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by EQUIPO on 25/05/2017.
 */

public class RolActivity extends Activity {
    private ListView listaPersonalizada = null;
    private ArrayList <Item> arrayItem = null;
    private ListViewAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rol);

        listaPersonalizada = (ListView) findViewById(R.id.lvLista);
        arrayItem = new ArrayList<>();
        cargarLista();

    }
    public void cargarLista(){
        arrayItem.add(new Item("1","Taller Cul. Antropologia y Arqueologia","08:30"));
        arrayItem.add(new Item("2","Tobas de Auditoria","08:40"));
        arrayItem.add(new Item("3","Tradicional Cueca de Diseño Grafico","08:50"));
        arrayItem.add(new Item("4","Taller Cultural CIPyCA","09:00"));
        arrayItem.add(new Item("5","Taller Cultural de Saya Afroboliviana","09:10"));
        arrayItem.add(new Item("6","Taller Cul. Pastorcitos de Veterinaria","09:20"));
        arrayItem.add(new Item("7","Poderosa Morenada de Ingenieria","09:30"));
        arrayItem.add(new Item("8","Abogados del Diablo","09:40"));
        arrayItem.add(new Item("9","Reyes Sambos Arquitectura","09:50"));
        arrayItem.add(new Item("10","Expresion Chaqueña","10:00"));
        arrayItem.add(new Item("11","Tinkus Jayas de Economia","10:10"));
        arrayItem.add(new Item("12","Morenada de Odontologia","10:20"));
        arrayItem.add(new Item("13","Agrofarsantes","10:30"));
        arrayItem.add(new Item("14","Diablada Tecnologica","10:40"));
        arrayItem.add(new Item("15","Tobas Linguistica","10:50"));
        arrayItem.add(new Item("16","Sikuris de Italaque","11:00"));
        arrayItem.add(new Item("17","Del Sur","11:10"));
        arrayItem.add(new Item("18","Jalkas Matematicas","11:20"));
        arrayItem.add(new Item("19","Amor Tacana Ingenieria Industrial","11:30"));
        arrayItem.add(new Item("20","Pujllay Tecnologica Medica","11:40"));
        arrayItem.add(new Item("21","Taller Cultural Wiñay Takisunchis","11:50"));
        arrayItem.add(new Item("22","Taller Cultural Tinkus Wistus","12:00"));
        arrayItem.add(new Item("23","Morenada Central de Agronomia","12:10"));
        arrayItem.add(new Item("24","Tobas Jaguar Informatica","12:20"));
        arrayItem.add(new Item("25","Mohoseñada Linguistica e Idiomas","12:30"));
        arrayItem.add(new Item("26","Llamerada San Andres","12:40"));
        arrayItem.add(new Item("27","Diablada Medicina","12:50"));
        arrayItem.add(new Item("28","Artistica Cultural Psicokullaguada","13:00"));
        arrayItem.add(new Item("29","Chaqueños de Arte","13:10"));
        arrayItem.add(new Item("30","Potolos de Estadistica","13:20"));
        arrayItem.add(new Item("31","Caporales de Cien. Economicas","13:30"));
        arrayItem.add(new Item("32","Saya Afro Boliviana Humanidades","13:40"));
        arrayItem.add(new Item("33","Tinkus Puros y Naturales","13:50"));
        arrayItem.add(new Item("34","Reyes Morenos de Administracion","14:00"));
        arrayItem.add(new Item("35","Calcheños BIOFAR","14:10"));
        arrayItem.add(new Item("36","Chaqueños de Ley","14:20"));
        arrayItem.add(new Item("37","Geodiablos","14:30"));
        arrayItem.add(new Item("38","Verdaderos Amantes del Pergamino","14:40"));
        arrayItem.add(new Item("39","Rueda Chapaca Nutricion","14:50"));
        arrayItem.add(new Item("40","Caporales de Ingenieria","15:00"));
        arrayItem.add(new Item("41","Taller Cultural Jiwasan","15:10"));
        arrayItem.add(new Item("42","Pujllay Cs. de la Educacion","15:20"));
        arrayItem.add(new Item("43","Waca Waca Enfermeria","15:30"));
        arrayItem.add(new Item("44","Tinkus Huayna Lisos de Electrome.","15:40"));
        arrayItem.add(new Item("45","Morenada Achachis STUMSA","15:50"));
        arrayItem.add(new Item("46","Kullaguada Trabajo Social","16:00"));
        arrayItem.add(new Item("47","Pujllay Geografia","16:10"));
        arrayItem.add(new Item("48","Changos Charangos de Comunicacion","16:20"));
        arrayItem.add(new Item("49","Jalqas","16:30"));
        arrayItem.add(new Item("50","Rey Caporal de Auditoria","16:40"));

        adapter = new ListViewAdapter(this, arrayItem);
        listaPersonalizada.setAdapter(adapter);

    }



}

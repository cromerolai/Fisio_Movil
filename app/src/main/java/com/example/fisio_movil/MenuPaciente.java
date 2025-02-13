package com.example.fisio_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_paciente);

        getSupportActionBar().hide();//Oculta barra superior

    }

    //Cambia la pantalla a solicitar un servicio
    public void solicitarServicio (View s){
        Intent cambiar6 = new Intent(this, SolicitarServicio.class);
        startActivity(cambiar6);
    }

    //Cambia la pantalla a consultar historial de servicios del paciente
    public void historialServiciosP (View hp){
        Intent cambiar7 = new Intent(this, HistorialPaciente.class);
        startActivity(cambiar7);
    }

    //Cambia la pantalla a noticias de interes para el paciente
    public void noticiasP (View np){
        Intent cambiar8 = new Intent(this, NoticiasPaciente.class);
        startActivity(cambiar8);
    }

    //Cambia la pantalla a datos del paciente para actualizar
    public void perfilP (View pp){
        Intent cambiar9 = new Intent(this, DatosPaciente.class);
        startActivity(cambiar9);
    }

}
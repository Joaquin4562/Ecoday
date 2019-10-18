package com.example.ecoday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Usuario,Contraseña;
    Button Iniciar,Registrar,RegistrarG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Usuario=findViewById(R.id.usuario);
        Contraseña=findViewById(R.id.contraseña);
        Iniciar=findViewById(R.id.bt1);
        Registrar=findViewById(R.id.bt2);
        RegistrarG=findViewById(R.id.btG);
        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), principal.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}

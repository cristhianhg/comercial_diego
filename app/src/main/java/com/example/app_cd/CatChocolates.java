package com.example.app_cd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CatChocolates extends AppCompatActivity {
    Button btn_inicio,btn_carrito,btn_categorias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_chocolates);

        btn_inicio=findViewById(R.id.btn_inicio);
        btn_carrito=findViewById(R.id.btn_carrito);
        btn_categorias=findViewById(R.id.btn_categorias);

        btn_inicio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CatChocolates.this,Tienda.class));
                finish();
            }
        });
        btn_carrito.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CatChocolates.this,Carrito.class));
                finish();
            }
        });
        btn_categorias.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CatChocolates.this,CategoriasP.class));
                finish();
            }
        });
    }
}

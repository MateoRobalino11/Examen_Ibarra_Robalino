package uta.edu.ec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class I_MainActivity_R extends AppCompatActivity implements View.OnClickListener {
    ListView I_lvDatosVector_R;
    Button I_btnIngresarDatos_R;
    EditText I_etValor_R;
    ArrayList<I_Vector_R> I_valoresOriginales_R = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imain_r);
        I_btnIngresarDatos_R = findViewById(R.id.btnIngresar);
        I_btnIngresarDatos_R.setOnClickListener((View.OnClickListener) this);
        I_lvDatosVector_R = findViewById(R.id.ltDatos);
        I_lvDatosVector_R.setOnClickListener((View.OnClickListener) this);

        I_etValor_R = findViewById(R.id.I_etValor_R);
    }
//hola

    public void I_AdaptarDatas_R(String[] I_valores_R){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,I_valores_R);
        I_lvDatosVector_R.setAdapter(adapter);
    }
//PUSH
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnIngresar:


        }
    }
}
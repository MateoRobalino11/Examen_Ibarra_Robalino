package uta.edu.ec;

import androidx.appcompat.app.AppCompatActivity;
import uta.edu.ec.I_Vector_R;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class I_MainActivity_R extends AppCompatActivity {
    ArrayList<I_Vector_R> I_valores_R; // maneja el indice y el valor del vector
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imain_r);
    }
    public void R_Cerrar_I(View view){
        Intent R_intent_I = new Intent(this, R_Activity_I.class);
        startActivity(R_intent_I);
        finish();
    }

}
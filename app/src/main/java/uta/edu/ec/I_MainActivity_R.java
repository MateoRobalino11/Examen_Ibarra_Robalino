package uta.edu.ec;

import androidx.appcompat.app.AppCompatActivity;
import uta.edu.ec.I_Vector_R;
import java.util.ArrayList;

import android.os.Bundle;

public class I_MainActivity_R extends AppCompatActivity {
    ArrayList<I_Vector_R> I_valores_R; // maneja el indice y el valor del vector
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imain_r);
    }
}
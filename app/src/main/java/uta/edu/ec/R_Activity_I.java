package uta.edu.ec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class R_Activity_I extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ri);
    }
    public void R_Siguiente_I(View view){
        Intent R_intent_I = new Intent(this, I_MainActivity_R.class);
        startActivity(R_intent_I);
        finish();
    }
}
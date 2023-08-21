package com.patriciasoft.traductor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.patriciasoft.traductor.databinding.ActivityEnviarPalabraBinding;
import com.patriciasoft.traductor.databinding.ActivityMainBinding;
import com.patriciasoft.traductor.modelo.Palabra;

public class EnviarPalabraActivity extends AppCompatActivity {
private EnviarPalabraActivityViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEnviarPalabraBinding bindig = ActivityEnviarPalabraBinding.inflate(getLayoutInflater());
        setContentView(bindig.getRoot());
        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(EnviarPalabraActivityViewModel.class);
        Intent intent = getIntent();
        String pal=(String) intent.getStringExtra("palabra");
        mv.getPalabraM().observe(this, new Observer<Palabra>() {
            @Override
            public void onChanged(Palabra p) {
                bindig.etPalabraTrad.setText(p.getIngles());
                bindig.imageView.setImageResource(p.getFoto());
            }
        });

        mv.cargarPalabra(pal);
    }
}
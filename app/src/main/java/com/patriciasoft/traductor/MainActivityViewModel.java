package com.patriciasoft.traductor;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {
private Context context;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }
    public void traducir(String palabra){
        if(palabra.length() == 0){
            Toast.makeText(context, "Debe ingresar una palabra", Toast.LENGTH_LONG).show();
        }else if(!palabra.equals("helado") && !palabra.equals("zorro") && !palabra.equals("tigre")) {
            Toast.makeText(context, "Palabra Incorrecta", Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(context, EnviarPalabraActivity.class);
            intent.putExtra("palabra", palabra);
            intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }

    }
}

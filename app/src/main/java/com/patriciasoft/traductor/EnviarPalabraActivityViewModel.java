package com.patriciasoft.traductor;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.patriciasoft.traductor.modelo.Palabra;

import java.util.ArrayList;
import java.util.List;

public class EnviarPalabraActivityViewModel extends AndroidViewModel {
    private List<Palabra> lista=new ArrayList<>();
    private Context context;
    private MutableLiveData<Palabra> palabraM;

    public EnviarPalabraActivityViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
        lista.add(new Palabra("helado", "ice cream", R.drawable.helado));
        lista.add(new Palabra("tigre", "tiger", R.drawable.tigre));
        lista.add(new Palabra("zorro", "fox", R.drawable.zorro));
        }
    public void cargarPalabra(String pal){
        for (Palabra palabras:lista)
        {
            if(palabras.getEspaniol().equals(pal)){
                palabraM.setValue(palabras);
            }
        }
    }


    public LiveData<Palabra> getPalabraM(){
        if(palabraM==null){
            palabraM = new MutableLiveData<Palabra>();
        }
        return palabraM;

    }

}

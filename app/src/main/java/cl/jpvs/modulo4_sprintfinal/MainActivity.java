package cl.jpvs.modulo4_sprintfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.jpvs.modulo4_sprintfinal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;   //paso1  activar  Binding, el nombre depende del nombre de la clase

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = ActivityMainBinding.inflate(getLayoutInflater());  //paso 2;
        setContentView(binding.getRoot());


    }
}
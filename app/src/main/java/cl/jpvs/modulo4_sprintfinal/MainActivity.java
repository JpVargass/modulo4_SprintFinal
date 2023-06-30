package cl.jpvs.modulo4_sprintfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import cl.jpvs.modulo4_sprintfinal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;   //paso1  activar  Binding, el nombre depende del nombre de la clase

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = ActivityMainBinding.inflate(getLayoutInflater());  //paso 2;
        setContentView(binding.getRoot());


 binding.imageBtn.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent activityMenu = new Intent(getBaseContext(), SecondActivity.class);
         startActivity(activityMenu);
     }
 });


    }
}
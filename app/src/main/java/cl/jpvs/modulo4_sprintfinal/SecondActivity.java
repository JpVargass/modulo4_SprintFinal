package cl.jpvs.modulo4_sprintfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import cl.jpvs.modulo4_sprintfinal.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
       binding=ActivitySecondBinding.inflate((getLayoutInflater()));
       setContentView(binding.getRoot());

binding.btnLinkedin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
         String linkedinUrl ="https://www.linkedin.com/in/juanpablovargassoto/";
         Uri uri = Uri.parse(linkedinUrl);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
});


    }
}
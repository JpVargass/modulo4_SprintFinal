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
        binding = ActivitySecondBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        binding.btnLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String linkedinUrl = "https://www.linkedin.com/in/juanpablovargassoto/";
                Uri uri = Uri.parse(linkedinUrl);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        binding.btnLlamarWsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myphonenumber = "+56983603323";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + myphonenumber));
                startActivity(intent);


            }
        });
        binding.btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msj = binding.editTextTextMsjEmail.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                intent.putExtra(Intent.EXTRA_EMAIL, "jpvargass@gmail.com");
                intent.putExtra(Intent.EXTRA_CC, "");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto del mensaje");
                intent.putExtra(Intent.EXTRA_TEXT, msj);

                startActivity(Intent.createChooser(intent, "Enviar correo electrónico a través de: "));


            }
        });
    }


}


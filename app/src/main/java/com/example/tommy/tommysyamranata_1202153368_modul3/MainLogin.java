package com.example.tommy.tommysyamranata_1202153368_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainLogin extends AppCompatActivity {
    //    Deklarasi variabel
    private EditText Username, Pass;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_login);

//      Inisiasi dengan id
        Username = (EditText)findViewById(R.id.userForm);
        Pass = (EditText)findViewById(R.id.passForm);
        Login = (Button) findViewById(R.id.btnLogin);

//      Membuat tombol dapat di klik
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = Username.getText().toString().trim();
                String pass = Pass.getText().toString().trim();

                if(user.equals("EAD") && pass.equals("MOBILE")){
                    Intent intent = new Intent(MainLogin.this, Daftarmainmenu.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainLogin.this, "Username and Password are incorect. Try Again", Toast.LENGTH_SHORT).show();
                }
                if(user.isEmpty()){
                    Toast.makeText(MainLogin.this, "Please Input Username", Toast.LENGTH_SHORT).show();
                }if(pass.isEmpty()){
                    Toast.makeText(MainLogin.this, "Please Input Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

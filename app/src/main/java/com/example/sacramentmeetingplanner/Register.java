/* The activity to register login info; automatically logs in upon register
* */

package com.example.sacramentmeetingplanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;



public class Register extends AppCompatActivity {
    EditText fullName,emailAd,psword;
    Button registerBtn;
    TextView loginBtn;
    FirebaseAuth firebaseAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullName = findViewById(R.id.PersonName);
        emailAd = findViewById(R.id.Email);
        psword = findViewById(R.id.Password);
        registerBtn = findViewById(R.id.Registerbton);
        loginBtn = findViewById(R.id.loginbton);

        firebaseAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);

        if (firebaseAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailAd.getText().toString().trim();
                String password = psword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    emailAd.setError("Email is required");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    emailAd.setError("Password is required");
                    return;
                }

                if (password.length() < 6) {
                    psword.setError("Password must be >=6 characters longer");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                //Register the user in Firebase

                firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Register.this, "User Created.", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));

                        }else{
                            Toast.makeText(Register.this, "Registration failed! " + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });
    }
}
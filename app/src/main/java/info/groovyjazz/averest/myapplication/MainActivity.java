package info.groovyjazz.averest.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private Button signInButton, signUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initial View
        signInButton= (Button) findViewById(R.id.button);
        signUpButton=(Button) findViewById(R.id.button2);

        //Button Controller
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to Signup
                startActivity(new Intent(MainActivity.this,SignUp.class));
            }
        });
    }// MAIN METHOD

} //MAIN CLASS

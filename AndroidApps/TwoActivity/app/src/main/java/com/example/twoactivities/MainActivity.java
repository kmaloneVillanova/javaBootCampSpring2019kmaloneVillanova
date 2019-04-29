package com.example.twoactivities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText messageText;
    TextView replyText;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageText = findViewById(R.id.messageText);
        replyText = findViewById(R.id.replyText);
    }

    public void launchSecondActivity(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        String message = messageText.getText().toString();
        intent.putExtra("message", message);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1) {
            if(resultCode==RESULT_OK) {
                String reply = data.getStringExtra("reply");
                replyText.setText(reply);
            }
        }
    }
}

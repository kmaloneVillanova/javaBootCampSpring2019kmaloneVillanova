package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText replyText;
    TextView messageText;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("SecondActivity", "in SecondActivity onCreate method");

        messageText = findViewById(R.id.messageText);
        replyText = findViewById(R.id.replyText);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        messageText.setText(message);
    }


    public void launchReply(View view) {

       String reply = replyText.getText().toString();
       Intent replyIntent = new Intent();
       replyIntent.putExtra("reply", reply);
       setResult(RESULT_OK, replyIntent);
       finish();
    }
}

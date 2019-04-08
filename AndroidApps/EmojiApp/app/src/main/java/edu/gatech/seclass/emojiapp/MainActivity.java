package edu.gatech.seclass.emojiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private ImageView emojiImage;
    private RadioButton happyButton;
    private RadioButton loveButton;
    private RadioButton nerdButton;
    private RadioButton thinkingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get a reference to the emoji ImageView and the radio buttons
        emojiImage = findViewById(R.id.emoji_image);
        happyButton = findViewById(R.id.happy_button);
        loveButton = findViewById(R.id.love_button);
        nerdButton = findViewById(R.id.nerd_button);
        thinkingButton = findViewById(R.id.thinking_face_button);

        //set happy button to checked
        happyButton.setChecked(true);
    }

    public void changeEmoji(View view) {

        if(happyButton.isChecked())
            emojiImage.setImageResource(R.drawable.happy);
        if(loveButton.isChecked())
            emojiImage.setImageResource(R.drawable.love);
        if(nerdButton.isChecked())
            emojiImage.setImageResource(R.drawable.nerd);
        if(thinkingButton.isChecked())
            emojiImage.setImageResource(R.drawable.thinking_face);

    }
}

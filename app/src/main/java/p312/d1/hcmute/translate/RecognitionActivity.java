package p312.d1.hcmute.translate;

import static p312.d1.hcmute.translate.R.id.textView_tab_text_recognition;
import static p312.d1.hcmute.translate.R.id.textView_tab_translate;
import static p312.d1.hcmute.translate.R.id.textView_tab_voice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecognitionActivity extends AppCompatActivity {

    TextView textViewTabTranslate,textViewTabVoice,textViewTabTextRecognition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recognition);

        setActivityTab();
    }

    private void setActivityTab() {
        textViewTabTranslate = findViewById(textView_tab_translate);
        textViewTabVoice =findViewById(textView_tab_voice);
        textViewTabTextRecognition = findViewById(textView_tab_text_recognition);

        textViewTabTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognitionActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        textViewTabVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognitionActivity.this, VoiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
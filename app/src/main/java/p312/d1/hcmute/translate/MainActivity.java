package p312.d1.hcmute.translate;

import static p312.d1.hcmute.translate.R.id.layout_textView_tab;
import static p312.d1.hcmute.translate.R.id.layout_text_recognition;
import static p312.d1.hcmute.translate.R.id.layout_translate;
import static p312.d1.hcmute.translate.R.id.layout_voice;
import static p312.d1.hcmute.translate.R.id.textView_tab_text_recognition;
import static p312.d1.hcmute.translate.R.id.textView_tab_translate;
import static p312.d1.hcmute.translate.R.id.textView_tab_voice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewTabTranslate,textViewTabVoice,textViewTabTextRecognition;
    LinearLayout linearLayoutTranslate,linearLayoutVoice,linearLayoutTextRecognition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setActivityTab();

    }

    private void setActivityTab() {
        textViewTabTranslate = findViewById(textView_tab_translate);
        textViewTabVoice =findViewById(textView_tab_voice);
        textViewTabTextRecognition = findViewById(textView_tab_text_recognition);

//        textViewTabTranslate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.activity_voice);
//            }
//        });
        textViewTabVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VoiceActivity.class);
                startActivity(intent);
            }
        });
        textViewTabTextRecognition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecognitionActivity.class);
                startActivity(intent);
            }
        });

    }

//    private void setVisibilityLayout() {
//        linearLayoutTranslate.setVisibility(View.GONE);
//        linearLayoutVoice.setVisibility(View.GONE);
//        linearLayoutTextRecognition.setVisibility(View.GONE);
//    }

}
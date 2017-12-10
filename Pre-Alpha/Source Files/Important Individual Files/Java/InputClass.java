package comp433.tabulula;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class InputClass extends Activity {

    private EditText answerView;
    private TextView hiView;
    private TextView currView;
    private TextView question;
    private TextView qBox;
    private ImageView aImageView;

    private String answer;

    private int currentScore;
    private int hiScore;

    private SensorManager sensorManager;
    private Sensor cardSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_class_layout);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        cardSwitcher = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

//        qBox=(TextView) findViewById(R.id.qBox);
//        qBox.setText ("Tabulula");

        question = (TextView) findViewById(R.id.qBox);
        hiView = (TextView) findViewById(R.id.hiScore);
        currView = (TextView) findViewById(R.id.score);
        answerView = (EditText) findViewById(R.id.answer);
        aImageView = (ImageView) findViewById(R.id.face);

        answerView.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                boolean handled = false;

                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    String input = (v.getText().toString().isEmpty()) ? "0" : v.getText().toString();

                    reinit(checkAnswer(String.valueOf(answer)));

                    handled = true;

                }

                return handled;

            }

        });

        currentScore = 0;
        hiScore = 0;

        init();

    }

//below adapted from https://stackoverflow.com/questions/21445041/user-need-to-write-the-correct-answer-in-edittext-to-go-to-the-next-level, but didn't work so also pulled from https://stackoverflow.com/questions/21597600/correct-text-input-to-next-activity

    protected void init() {

        answer = "to begin";

        question.setText("What does incipire mean?");
        currView.setText("Score: " + currentScore * 20);
        hiView.setText("HiScore: " + hiScore * 20);



//        String userEntry = editText.getText().toString();
//        if(userEntry.equals(correctAnswer)) {
//            goToNextLevel();
//        }



    }

    protected void reinit(boolean rightAnswer) {

 //       while (rightAnswer) {
        if (rightAnswer) {
            if (++currentScore > hiScore){

                hiScore = currentScore;

                aImageView.setImageResource(R.drawable.fcorrlrg);

            }

//            currentScore++;

        } else {

            currentScore=0;
            aImageView.setImageResource(R.drawable.fwrnglrg);

        }

        answerView.setText(null);
        init();

        question.setText("What is the vocative declension of 'magnus'?");

    }

    protected boolean checkAnswer (String userAnswer) { return userAnswer == answer; }


    //need to refine or fix this...
    public void setCardSwitcher(SensorEvent sensorEvent) {
        if (sensorEvent.values[0] == 30) {
            startActivity(new Intent(InputClass.this, ChoiceCardClass.class));

        }}

}

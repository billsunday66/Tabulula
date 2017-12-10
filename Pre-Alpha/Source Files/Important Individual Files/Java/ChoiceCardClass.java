package comp433.tabulula;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

//import static android.R.color.black;
//import static android.graphics.Color.BLACK;
//import static comp433.choicecard.R.id.faceButton;

public class ChoiceCardClass extends AppCompatActivity {

    private Questions qLib = new Questions();

    private TextView showScore;
    private TextView qView;
    private Button choiceButton1;
    private Button choiceButton2;
    private Button choiceButton3;
    private Button choiceButton4;
    private Button choiceButton5;

    private ImageView answerView;

    private SensorManager mSensorManager;
    private Sensor mProx;

    private String answerChoice;
    private int currentScore = 0;
//    private int hiScore = 0;
    private int qNum = 0;

    int corr = 0;
    int incorr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice_card_class_layout);
        answerView = (ImageView) findViewById(R.id.faceButton);
//        hiView = (TextView) findViewById(R.id.hiScore);

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mProx = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        showScore = (TextView)findViewById(R.id.pointVal);
        qView = (TextView)findViewById(R.id.actualQuestion);
        choiceButton1 = (Button)findViewById(R.id.choiceA);
        choiceButton2 = (Button)findViewById(R.id.choiceB);
        choiceButton3 = (Button)findViewById(R.id.choiceC);
        choiceButton4 = (Button)findViewById(R.id.choiceD);
        choiceButton5 = (Button)findViewById(R.id.choiceE);

        newQ();

        //below adapted from https://stackoverflow.com/questions/31175601/how-can-i-change-default-toast-message-color-and-background-color-in-android and https://stackoverflow.com/questions/42630187/android-multiple-choice-quiz-app

        choiceButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                while (choiceButton1.getText() == answerChoice){
                    currentScore=currentScore+10;
                    addScore(currentScore);
                    newQ();
                    //change face here
                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 250);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Bene!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facerightlarge);
                    break;
                    

//                    Button face = (Button) findViewById(faceButton);
//                    faceButton.setBackgroundResource(R.drawable.facerightlarge);

                }while (choiceButton1.getText() != answerChoice){

                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 350);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.RED);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Malo!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facewronglarge);

//                    Button face = (Button) findViewById(faceButton);
//                    faceButton.setBackgroundResource(R.drawable.facerightlarge);

                    newQ();
                    break;

                }

            }
        });

        choiceButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                while (choiceButton2.getText() == answerChoice){
                    currentScore=currentScore+10;
                    addScore(currentScore);
                    newQ();
                    //change face here
                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 250);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Bene!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facerightlarge);
                    break;

                }while (choiceButton2.getText() != answerChoice) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 350);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.RED);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Malo!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facewronglarge);

                    newQ();
                    break;

                }

            }
        });

        choiceButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                while (choiceButton3.getText() == answerChoice){
                    currentScore=currentScore+10;
                    addScore(currentScore);
                    newQ();
                    //change face here
                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 250);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Bene!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facerightlarge);
                    break;

                }while (choiceButton3.getText() != answerChoice) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 350);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.RED);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Malo!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facewronglarge);

                    newQ();
                    break;

                }

            }
        });

        choiceButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                while (choiceButton4.getText() == answerChoice){
                    currentScore=currentScore+10;
                    addScore(currentScore);
                    newQ();
                    //change face here
                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 250);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Bene!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facerightlarge);
                    break;

                }while (choiceButton4.getText() != answerChoice) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 350);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.RED);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Malo!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facewronglarge);

                    newQ();
                    break;

                }

            }
        });

        choiceButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                while (choiceButton5.getText() == answerChoice){
                    currentScore=currentScore+10;
                    addScore(currentScore);
                    newQ();
                    //change face here
                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 250);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Bene!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facerightlarge);
                    break;

                }while (choiceButton5.getText() != answerChoice) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.TOP, 300, 350);

                    TextView tv = new TextView(ChoiceCardClass.this);
                    tv.setBackgroundColor(Color.RED);
                    tv.setTextColor(Color.WHITE);
                    tv.setTextSize(20);

                    Typeface t = Typeface.create("serif", Typeface.BOLD);
                    tv.setTypeface(t);
                    tv.setPadding(10, 10, 10, 10);
                    tv.setText("\"Malo!\"");
                    toast.setView(tv);
                    toast.show();

                    answerView.setImageResource(R.drawable.facewronglarge);

                    newQ();
                    break;

                }

            }
        });

    }

    private void newQ(){

        //some weirdness here... must fix... face gives wrong feedback, even if q is correct. EDIT: giving both feedbacks

        qView.setText(qLib.getQuestion(qNum));
        choiceButton1.setText(qLib.getChoice1(qNum));
        choiceButton2.setText(qLib.getChoice2(qNum));
        choiceButton3.setText(qLib.getChoice3(qNum));
        choiceButton4.setText(qLib.getChoice4(qNum));
        choiceButton5.setText(qLib.getChoice5(qNum));

        answerChoice = qLib.getCorrect(qNum);
        //fix random here
        qNum++;

    }

    private void addScore (int point) {

        showScore.setText("" + currentScore);

    }


    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values[0] == 30) {
            startActivity(new Intent(ChoiceCardClass.this, InputClass.class));

    }}

}

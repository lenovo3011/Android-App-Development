package com.example.tictactoe;
import java.lang.InterruptedException;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    TextView msg ;
    String btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9 ;
    int count  = 0;
    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        init () ;




    }


    private void init() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);




}




    public void logic (View view) throws InterruptedException {
        Button btn = (Button) view;
        String str = btn.getText().toString();

        if (!str.equals("X") & !str.equals("O")) {
            count++;
            if (flag) {
                btn.setText("X");
                btn.setBackgroundColor(Color.RED);
                btn.setTextColor(Color.YELLOW);

                flag = false;
            } else {
                btn.setText("O");
                btn.setBackgroundColor(Color.YELLOW);

                btn.setTextColor(Color.RED);

                flag = true;
            }
        }


        if (count > 4) {

            btn1 = button1.getText().toString();
            btn2 = button2.getText().toString();
            btn3 = button3.getText().toString();
            btn4 = button4.getText().toString();
            btn5 = button5.getText().toString();
            btn6 = button6.getText().toString();
            btn7 = button7.getText().toString();
            btn8 = button8.getText().toString();
            btn9 = button9.getText().toString();
            msg = (TextView) findViewById(R.id.msg);

            if (btn1.equals(btn2) && btn2.equals(btn3) && !btn1.isEmpty()) {
                msg.setText(btn1 + " is a winner !");
                disableButtons () ;
                delayReset();


            } else if (btn4.equals(btn5) && btn5.equals(btn6) && !btn4.isEmpty()) {
                msg.setText(btn4 + " is a winner !");
                disableButtons () ;

                delayReset();

            } else if (btn7.equals(btn8) && btn8.equals(btn9) && !btn7.isEmpty()) {
                msg.setText(btn7 + " is a winner !");
                disableButtons () ;

                delayReset();

            } else if (btn1.equals(btn4) && btn4.equals(btn7) && !btn1.isEmpty()) {
                msg.setText(btn1 + " is a winner !");
                disableButtons () ;

                delayReset();

            } else if (btn2.equals(btn5) && btn5.equals(btn8) && !btn2.isEmpty()) {
                msg.setText(btn2 + " is a winner !");
                disableButtons () ;
                delayReset();

            } else if (btn3.equals(btn6) && btn6.equals(btn9) && !btn3.isEmpty()) {
                msg.setText(btn3 + " is a winner !");
                disableButtons () ;

                delayReset();


            } else if (btn1.equals(btn5) && btn5.equals(btn9) && !btn1.isEmpty()) {
                msg.setText(btn1 + " is a winner !");
                disableButtons () ;
                delayReset();


            } else if (btn3.equals(btn5) && btn5.equals(btn7) && !btn3.isEmpty()) {
                msg.setText(btn3 + " is a winner !");
                disableButtons () ;
                delayReset() ;

            } else if (count == 9) {
                msg.setText("Game is tied !");
                disableButtons ();
                delayReset();


            }


        }
    }
    public void reset () {

        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        flag = true ;
        count = 0 ;
        button1.setBackgroundColor(Color.BLACK);
        button2.setBackgroundColor(Color.BLACK);
        button3.setBackgroundColor(Color.BLACK);
        button4.setBackgroundColor(Color.BLACK);
        button5.setBackgroundColor(Color.BLACK);
        button6.setBackgroundColor(Color.BLACK);
        button7.setBackgroundColor(Color.BLACK);
        button8.setBackgroundColor(Color.BLACK);
        button9.setBackgroundColor(Color.BLACK);

        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        msg.setText("");



    }
    private void delayReset() {
        new android.os.Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                },
                2000 // 2-second delay
        );
    }
    private void disableButtons () {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }

}
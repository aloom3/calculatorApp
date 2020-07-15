package app.calculator.calculator;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bSub, bAdd, bMult, bDiv, bEqual, bClear;
    EditText e1;
    double v1, v2;
    boolean boolAdd, boolSub, boolMult, boolDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.buttonOne);
        b2 = (Button) findViewById(R.id.buttonTwo);
        b3 = (Button) findViewById(R.id.buttonThree);
        b4 = (Button) findViewById(R.id.buttonFour);
        b5 = (Button) findViewById(R.id.buttonFive);
        b6 = (Button) findViewById(R.id.buttonSix);
        b7 = (Button) findViewById(R.id.buttonSeven);
        b8 = (Button) findViewById(R.id.buttonEight);
        b9 = (Button) findViewById(R.id.buttonNine);
        b0 = (Button) findViewById(R.id.buttonZero);
        bSub = (Button) findViewById(R.id.buttonSub);
        bAdd = (Button) findViewById(R.id.buttonAdd);
        bMult = (Button) findViewById(R.id.buttonMult);
        bDiv = (Button) findViewById(R.id.buttonDivision);
        bEqual = (Button) findViewById(R.id.buttonEqual);
        bClear = (Button) findViewById(R.id.buttonClear);
        e1 = (EditText) findViewById(R.id.editText12);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "0");
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (e1 == null) {
                    e1.setText("");
                }
                else {
                    v1 = Float.parseFloat(e1.getText()+"");
                    boolAdd = true;
                    e1.setText(null);

                }
            }
        });
        bSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(e1.getText() + "");
                boolSub = true;
                e1.setText(null);
            }
        });
        bMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(e1.getText() + "");
                boolMult = true;
                e1.setText(null);
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(e1.getText() + "");
                boolDiv = true;
                e1.setText(null);
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 = Float.parseFloat(e1.getText() + "");

                if (boolAdd == true){

                    e1.setText(v1 + v2 +"");
                    boolAdd = false;
                }


                if (boolSub == true){
                    e1.setText(v1 - v2 +"");
                    boolSub = false;
                }

                if (boolMult == true){
                    e1.setText(v1 * v2 + "");
                    boolMult=false;
                }

                if (boolDiv == true){
                    e1.setText(v1 / v2 +"");
                    boolDiv = false;
                }
            }
        });
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
            }
        });


    }
}
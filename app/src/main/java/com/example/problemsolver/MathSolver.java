package com.example.problemsolver;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import android.view.Menu;

import android.view.MenuItem;




public class MathSolver extends AppCompatActivity {

    String variable;
    String equation;

    TextView textView;
    private Button clear, delete, variablex, divide, add, subtract, multiply, equal, rightBracket, leftBracket, minusValue;
    private  Button one, two, three, four, five, six, seven, eight, nine, point, zero ;
    private String ans ="";
    ArrayList<Integer> a = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_solver);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //a.add(0);

        textView= (TextView) findViewById(R.id.textView);
        /*
        final EditText editText1= (EditText)findViewById(R.id.editText1);
        EditText editText2= (EditText)findViewById(R.id.editText2);
        */
        //textView.setMovementMethod(new ScrollingMovementMethod());

        //textView.setSelected(true);

        clear = (Button)findViewById(R.id.buttonClearText);
        delete = (Button)findViewById(R.id.buttonDelete);
        variablex = (Button)findViewById(R.id.buttonPercentage);
        divide = (Button)findViewById(R.id.buttonDivide);
        add = (Button)findViewById(R.id.buttonAdd);
        subtract = (Button)findViewById(R.id.buttonSubtraction);
        multiply = (Button)findViewById(R.id.buttonMultiply);
        equal = (Button)findViewById(R.id.buttonEqual);
        rightBracket =(Button)findViewById(R.id.buttonRightBracket);
        leftBracket =(Button)findViewById(R.id.buttonLeftBracket);
        minusValue = (Button)findViewById(R.id.buttonMinusValue);

        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        point = (Button)findViewById(R.id.buttonPoint);
        zero = (Button)findViewById(R.id.buttonZero);



        one.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="1";
                textView.setText(textView.getText() + "1");

            }

        });

        two.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="2";

                textView.setText(textView.getText() + "2");

            }

        });

        three.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="3";

                textView.setText(textView.getText() + "3");

            }

        });

        four.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="4";

                textView.setText(textView.getText() + "4");

            }

        });

        five.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="5";

                textView.setText(textView.getText() + "5");

            }

        });

        six.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="6";
                textView.setText(textView.getText() + "6");
            }

        });

        seven.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="7";
                textView.setText(textView.getText() + "7");
            }

        });

        eight.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="8";
                textView.setText(textView.getText() + "8");
            }

        });

        nine.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="9";
                textView.setText(textView.getText() + "9");
            }

        });

        //what happens if user clicks on point button
        point.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                //This code block will run when the textView is not empty
                if(!textView.getText().toString().isEmpty())
                //only if the textView doesn't end with a '+', '-' , '*', '(',')' , '=' or '.', the user can tap the point button.
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-'  && ch!='*' && ch!='(' && ch!=')'&& ch!='.'&& ch!='=')
                    {
                        ans+=".";
                        textView.setText(textView.getText() + ".");
                    }
                }
            }

        });

        zero.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                ans+="0";
                textView.setText(textView.getText() + "0");
            }

        });

        clear.setOnClickListener(new View.OnClickListener()

        {

            @Override

            public void onClick(View view)

            {
                ans="";
                textView.setText(null);
                a.clear();
            }

        });

        //what happens if user clicks on delete button
        delete.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                //This code block will run when the textView is not empty
                if(!textView.getText().toString().isEmpty())
                //The new textView will be the old textView minus the last char
                {
                    //the textView is saved in string s
                    String s = textView.getText().toString();
                    String s1="";
                    for(int i=0;i<s.length()-1;i++)
                    {
                        s1+=s.charAt(i);
                    }
                    //the new textView is saved in string sl
                    ans=s1;
                    textView.setText(s1);
                }
            }

        });
        /*
        //button to multiply the textView with -1
        minusValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText().toString();
                double res = Double.parseDouble(s + "");
                res*=-1;
                ans=String.valueOf(res);
                textView.setText(res + "");
            }
        });
        */
        variablex.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    //only if the textView doesn't end with a  '*', 'X'or '.', the user can tap the variable button.
                    if( ch!='*' && ch!='.'&& ch!='X')
                    {
                        a.add(s.length()-1);
                        ans+="X";
                        textView.setText(textView.getText() + "X");
                    }
                }
            }

        });

        /*
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-'  && ch!='*' && ch!='/' && ch!='.') {
                        a.add(s.length()-1);
                        ans+="/";
                        textView.setText(textView.getText() + "/");
                    }
                }
            }
        });
        */

        add.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-'  && ch!='*' && ch!='(' && ch!='.'&& ch!='=') {
                        a.add(s.length()-1);
                        ans+="+";
                        textView.setText(textView.getText() + "+");
                    }
                }
            }

        });

        subtract.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-'  && ch!='*' && ch!='(' && ch!='.'&& ch!='=') {
                        a.add(s.length()-1);
                        ans+="-";
                        textView.setText(textView.getText() + "-");
                    }
                }
                else{
                    ans+="-";
                    textView.setText(textView.getText() + "-");
                }
            }

        });

        multiply.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-'  && ch!='*' && ch!='(' && ch!='.'&& ch!='=') {
                        a.add(s.length()-1);
                        ans+="*";
                        textView.setText(textView.getText() + "*");
                    }

                }
            }

        });

        equal.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-'  && ch!='*' && ch!='(' && ch!='.'&& ch!='=') {
                        a.add(s.length()-1);
                        ans+="=";
                        textView.setText(textView.getText() + "=");
                    }

                }
            }

        });

        leftBracket.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='.'&& ch!='(') {
                        a.add(s.length()-1);
                        ans+="*";
                        textView.setText(textView.getText() + "(");
                    }
                }
                else{
                    ans+="(";
                    textView.setText(textView.getText() + "(");
                }
            }

        });
        rightBracket.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-'  && ch!='*' && ch!='(' && ch!='.'&& ch!='=') {
                        a.add(s.length()-1);
                        ans+="*";
                        textView.setText(textView.getText() + ")");
                    }
                }
            }

        });
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.main, menu);

        return true;

    }

}
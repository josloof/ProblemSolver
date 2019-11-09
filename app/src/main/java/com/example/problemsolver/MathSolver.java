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
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
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


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.solve:
                solve();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setClassVariable() {
        for (int i =0; i < equation.length(); i++) {
            char chr = equation.charAt(i);
            if (Character.isLetter(chr)) {
                variable = Character.toString(chr);
                return;
            }
        }
        variable = "None";
    }

    /**
     *Split a given expression into its components e.g 2x + 6 to [2x, +6]
     *
     * @param equation The equation to split
     * @return ArrayList of the components in equation
     */
    public ArrayList<String> split(String equation) {
        String expression = "";
        ArrayList<String> splitedEquation = new ArrayList();
        boolean isInsideBracket = false;

        for (int i = 0; i < equation.length(); i++) {
            String chr = Character.toString(equation.charAt(i));


            if ((chr.equals("+") || chr.equals("-")) && i != 0 && !isInsideBracket) {
                splitedEquation.add(expression);
                expression = chr;

            } else {
                expression +=chr;
            }

            if (chr.equals("(")) {
                isInsideBracket = true;
            } else if (chr.equals(")")) {
                isInsideBracket = false;
            }
        }
        splitedEquation.add(expression);

        return splitedEquation;
    }

    /**
     * Checks if an expression contains a bracket.
     *
     * @param expression
     * @return boolean
     */
    public boolean containsBracket(String expression) {
        return  expression.contains("(");
    }

    /**
     * It removes and evaluates components with bracket. e.g It turns ['2x', 2(x-8)] to ['2x', '2x', '-8']
     *
     * @param equationComponents equation components
     * @return
     */
    public ArrayList<String> openBracket(ArrayList<String> equationComponents) {
        ArrayList<String> eqtComponents = new ArrayList<>();
        for (int i = 0; i < equationComponents.size(); i++) {
            if (containsBracket(equationComponents.get(i))) {
                eqtComponents.addAll(expand(equationComponents.get(i)));
            } else {
                eqtComponents.add(equationComponents.get(i));
            }
        }
        return eqtComponents;
    }

    /**
     * It expands an expression with bracket e.g it turns 2(5x-8) => 10x - 16
     *
     * @param expression The expression to expand
     * @return a string with the evaluated form of the expression
     */
    public ArrayList<String> expand(String expression) {

        String[] expr = expression.split("[(]");

        int multiplier = expr[0].equals("-") || expr[0].equals("+") ? Integer.parseInt(expr[0] + "1") : Integer.parseInt(expr[0]);
        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> exprInBracket = split(getExprInBracket(expr[1]));

        for (int i =0; i < exprInBracket.size(); i++) {
            String elem = exprInBracket.get(i);
            try {
                Integer constant = multiplier * Integer.parseInt(elem);
                result.add(constant.toString());
            } catch(Exception e) {
                Integer newCoefficient = getCoefficient(elem) * multiplier;
                result.add(newCoefficient.toString() + variable);
            }
        }

        return result;
    }

    /**
     * Gets the coefficient of a variable (as the name implies) e.g 2x => 2
     *
     * @param variable
     * @return int the coefficient of the variable
     */
    public static int getCoefficient(String variable){
        String coefficient = "";
        if(variable.length() == 1) return 1;
        else if(variable.length() == 2 && variable.charAt(0) == '-') return -1;

        for(int i = 0; i < variable.length(); i++){
            if(Character.isDigit(variable.charAt(i)))coefficient+=variable.charAt(i);
        }
        if(variable.charAt(0) == '-')return Integer.parseInt("-" + coefficient);
        return Integer.parseInt(coefficient);
    }

    public String getExprInBracket(String expr) {
        String exprInBracket = "";
        for (int i =0; i < expr.length() - 1; i++) {
            exprInBracket +=expr.charAt(i);
        }

        return exprInBracket;
    }

    /**
     * It Collect like terms.
     *
     * @param leftHandSide The left hand side of the equation
     * @param rightHandSide The right hand side of the equation
     * @return Array with variables and constants seperately
     */
    public ArrayList<String>[] collectLikeTerms(ArrayList<String> leftHandSide, ArrayList<String> rightHandSide) {
        ArrayList<String> variables = new ArrayList<>();
        ArrayList<String> constants = new ArrayList<>();

        for (int i = 0; i < leftHandSide.size(); i++) {
            String elem = leftHandSide.get(i);
            try {
                Integer constant =  -1 * Integer.parseInt(elem);
                constants.add(constant.toString());
            } catch(Exception e) {
                variables.add(elem);
            }
        }

        for (int j = 0; j < rightHandSide.size(); j++) {
            String elem = rightHandSide.get(j);
            try {
                Integer constant =  Integer.parseInt(elem);
                constants.add(constant.toString());
            } catch(Exception e) {
                variables.add(changeVariableSign(elem));
            }
        }

        ArrayList<String>[] result = new ArrayList[2];
        result[0] = variables;
        result[1] = constants;
        return result;
    }

    public String changeVariableSign(String variable) {
        char firstChar = variable.charAt(0);
        if (Character.toString(firstChar).equals("+")){
            return variable.replace("+", "-");
        } else if (Character.toString(firstChar).equals("-")) {
            return variable.replace("-", "+");
        } else {
            return "-" + variable;
        }
    }



    public void solve() {
        LinearLayout wrapper = findViewById(R.id.wrapper);
        TextView errorTextView = findViewById(R.id.error);
        wrapper.removeAllViews();
        errorTextView.setText("");

        Integer nextStep = 1;
        TextView equationTextView = findViewById(R.id.textView);
        equation = equationTextView.getText().toString();
        equation = equation.replaceAll("\\s+",""); //removing all spaces from equation
        setClassVariable();

        if (!isValidEquation()) {
            return;
        }
        displaySteps(equation, "Step" + nextStep.toString() + ": ", "Write down the equation");
        nextStep +=1;

        String[] divEquation = equation.split("=");

        String leftHandSide = divEquation[0]; // The left handside of the equation
        String rightHandSide = divEquation[1];
        ArrayList<String> leftHandSideComps = split(leftHandSide);
        ArrayList<String> rightHandSideComps = split(rightHandSide);

        if (containsBracket(equation)) {
            if (containsBracket(leftHandSide)) leftHandSideComps = openBracket(leftHandSideComps);
            if (containsBracket(rightHandSide)) rightHandSideComps = openBracket(rightHandSideComps);

            displaySteps(getSolution(leftHandSideComps, rightHandSideComps), "Step" + nextStep.toString() + ": ", "Open bracket");
            nextStep +=1;
        }

        ArrayList<String>[] likeTerms = collectLikeTerms(leftHandSideComps, rightHandSideComps);

        leftHandSideComps = likeTerms[0]; // Now holds the variables.
        rightHandSideComps = likeTerms[1]; // Now holds the constants.

        displaySteps(getSolution(leftHandSideComps, rightHandSideComps), "Step" + nextStep.toString() + ": ", "Collect like terms");
        nextStep +=1;

        String variableSum = simplifyExpression(leftHandSideComps);
        String constantSum = simplifyConstants(rightHandSideComps);
        Integer coef = getCoefficient(variableSum);

        displaySteps(variableSum + " = " + constantSum, "Step" + nextStep.toString() + ": ", "Simplify both side of the equation");


        if (variableSum.equals(variable)) {
            displaySteps("Therefore " + variable + " = " + constantSum, "Step" + nextStep.toString() + ": ", "Write down the final answer");
            return;
        }

        if (coef == -1) {
            constantSum = Integer.toString(Integer.parseInt(constantSum) * -1);
            displaySteps(variable + " = " + constantSum, "Step" + nextStep.toString() + ": ", "Multiply through by -1");
            nextStep +=1;
            displaySteps("Therefore " + variable + " = " + constantSum, "Step" + nextStep.toString() + ": ", "Write down the final answer");
            return;
        }
        float constant = Float.parseFloat(constantSum)/coef;

        DecimalFormat df = new DecimalFormat("0.00");

        displaySteps(variableSum + "/" + coef.toString() + " = " + constantSum + "/" + coef.toString(), "Step" + nextStep.toString() + ": ", "Divide both side of the equation by " + coef.toString());

        if (coef == 0) {
            displaySteps("Therefore " + variable + " = " + "NAN or undefined", "Step" + nextStep.toString() + ": ", "Write down the final answer");
            return;
        }

        displaySteps("Therefore " + variable + " = " + df.format(constant), "Step" + nextStep.toString() + ": ", "Write down the final answer");
    }

    /**
     * Display solution to for each step
     *
     * @param solution The solution for a given step
     * @param step The step
     * @param content The step content
     */
    public void displaySteps(String solution, String step, String content) {
        int textColor = Integer.parseInt("000000", 16)+0xFF000000;

        LinearLayout wrapper = findViewById(R.id.wrapper);
        // wrapper.removeAllViews();
        LinearLayout linearLayout = new LinearLayout(this);
        TextView stepTextView = new TextView(this);
        TextView stepContentTextView = new TextView(this);
        TextView solutionTextView = new TextView(this);

        LinearLayout.LayoutParams linearLayouParams = new LinearLayout
                .LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams textParams = new LinearLayout
                .LayoutParams( ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        LinearLayout.LayoutParams solutionTextParams = new LinearLayout
                .LayoutParams( ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        solutionTextParams.setMargins(40, 18, 0, 0);
        linearLayouParams.setMargins(40, 20, 0, 0);

        stepTextView.setLayoutParams(textParams);
        stepTextView.setText(step);

        stepContentTextView.setLayoutParams(textParams);
        stepContentTextView.setText(content);
        stepContentTextView.setTextSize(17);
        stepContentTextView.setTextColor(textColor);

        stepTextView.setLayoutParams(textParams);
        stepTextView.setText(step);
        stepTextView.setTextSize(17);
        stepTextView.setTextColor(textColor);
        stepTextView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

        solutionTextView.setLayoutParams(solutionTextParams);
        solutionTextView.setText(solution);
        solutionTextView.setTextSize(17);
        solutionTextView.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        solutionTextView.setTextColor(textColor);

        linearLayout.setLayoutParams(linearLayouParams);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(stepTextView);
        linearLayout.addView(stepContentTextView);
        wrapper.addView(linearLayout);
        wrapper.addView(solutionTextView);

    }

    /**
     * It merges the right and left hand side of the equation components
     *
     * @param leftHandSide(List) The left hand side of the equation in a list
     * @param rightHandSide(List) Contains the components on the right hand side of the equation in a list
     *
     * @return String The string that contain the simplified equation
     */
    public String getSolution(ArrayList<String> leftHandSide, ArrayList<String> rightHandSide) {
        String leftHandSideSolution = "";
        String rightHandSideSolution = "";
        System.out.println(leftHandSide);

        for (int i=0; i < leftHandSide.size(); i++) {
            if (i == 0) {
                leftHandSideSolution = leftHandSide.get(0);
            } else {
                leftHandSideSolution = leftHandSideSolution + " " + getSolutionVar(leftHandSide.get(i));
            }
        }

        for (int i=0; i < rightHandSide.size(); i++) {
            if (i == 0) {
                rightHandSideSolution = rightHandSide.get(0);
            } else {
                rightHandSideSolution = rightHandSideSolution + " " + getSolutionVar(rightHandSide.get(i));
            }
        }
        return leftHandSideSolution + " = " + rightHandSideSolution;
    }

    public String getSolutionVar(String var) {
        char firstChar = var.charAt(0);
        if (Character.toString(firstChar).equals("+")) {
            return var.replace("+", "+ ");
        } else if (Character.toString(firstChar).equals("-")) {
            return var.replace("-", "- ");
        } else {
            return "+ " + var;
        }
    }

    /**
     * It simplify an expression. eg from [2x, +3x] into 5x
     *
     * @param expression The components in of an expression in an array e.g [2x, 4x, -5x]
     * @return String that holds the simplified expression
     */
    public String simplifyExpression(ArrayList<String> expression) {
        Integer coefficient = 0;
        for (int i = 0; i < expression.size(); i++) {
            coefficient += getCoefficient(expression.get(i));
        }

        if (coefficient == 1) return variable;
        if (coefficient == -1) return "-" + variable;

        return coefficient.toString(coefficient) + variable;
    }

    /**
     * Add up all the constants
     *
     * @param constants ArrayList of constants
     * @return
     */

    public String simplifyConstants(ArrayList<String> constants) {

        Integer constantSum = 0;
        for (int i = 0; i < constants.size(); i++) {
            constantSum += Integer.parseInt(constants.get(i));
        }

        return constantSum.toString();
    }

    public boolean isValidEquation(){
        String sign = "";  //this store the sign
        int ovar = 0;
        String num = "";
        TextView textView = findViewById(R.id.error);


        if(equation.length() == 0){
            textView.setText("You did not input anything!");
            return false;
        }

        if(variable.equals("None")){
            textView.setText("Invalid equation! There is no variable.");
            return false;
        }

        if (!equation.contains("=")){
            textView.setText("Invalid equation! There is no equality sign in your equation");
            return false;
        }

        //Checking if there is more than one variable and equals sign(=) in the equation
        int numOfEqualitySign = 0;
        for(int j = 0; j < equation.length(); j++){
            if (equation.charAt(j) == '=') {
                numOfEqualitySign +=1;
                if (numOfEqualitySign > 1) {
                    textView.setText("Invalid equation! You have more than one equality sign in your equation");
                    return false;
                }
                numOfEqualitySign +=1;
            }

            if(Character.isLetter(equation.charAt(j)) && !Character.toString(equation.charAt(j)).equals(variable)) {
                textView.setText("Come on this is a linear equation solver you cant have more than one variable!");
                return false;
            }
        }

        if(equation.charAt(equation.length()-1) == '='){
            textView.setText("Invalid equation! You did not input anything after the equality sign(=)");
            return false;
        }

        else if(equation.charAt(0) == '='){
            textView.setText("Invalid equation! You did not input anything before the equality sign(=)");
            return false;
        }

        //checking if the equation ends with either + or - Or two or more signs come together
        for(int k = 0; k < equation.length(); k++) {
            if((equation.charAt(0) == '+' && equation.charAt(1) == '=') || (equation.charAt(0) == '-' && equation.charAt(1) == '=')){
                System.out.println("Invalid equation! It is wrong to have only " + equation.charAt(0) + " in the left hand side of the equation");
                return true;
            }
            if (equation.charAt(k) == '-' || equation.charAt(k) == '+'){
                sign = "" + equation.charAt(k);
                if(k == equation.length() -1){
                    System.out.println("Invalid equation! You can not end an equation with " + sign);
                    return true;
                }
                else if(equation.charAt(k+1) == '+' || equation.charAt(k+1) == '-'){
                    textView.setText("Invalid equation! Two or more signs(e.g +, -) can not be together ");
                    return true;
                }
            }
            if(Character.isLetter(equation.charAt(k))){
                if(k != equation.length() -1){

                    if(Character.isLetter(equation.charAt(k+1))){
                        textView.setText("Invalid equation! Two or more  variables can not be together. ");
                        return false;
                    }
                }
            }
            if(k != equation.length() -1){
                if(Character.isLetter(equation.charAt(k)) && Character.isDigit(equation.charAt(k+1)))
                {
                    textView.setText("Invalid equation! You are expected to input either \"+\" or \"-\"  sign after " +  equation.charAt(k) + " but you input " + equation.charAt(k+1) + " which is a number");
                    return false;
                }
            }
            if(equation.charAt(k) == '(' || equation.charAt(k) == ')'){
                sign = "" + equation.charAt(k);
                if(k != equation.length() -1){
                    if(equation.charAt(k+1) == '(' || equation.charAt(k+1) == ')'){
                        textView.setText("Invalid equation! You cant have two or more " + sign + " together");
                        return false;
                    }
                }
            }
        }


        for(int m = 0; m < equation.length(); m++) {
            if(equation.charAt(m) == '(' )ovar += 1;
            else if(equation.charAt(m) ==  ')')ovar -= 1;
            if(ovar > 1){
                textView.setText("Invalid equation! You are expected to put a close bracket \")\" after " + equation.charAt(m-1) + " not an open bracket \"(\" ");
                return false;
            }
            else if (ovar < 0){
                textView.setText("Invalid equation! You are expected to put a open bracket \"(\" after " + equation.charAt(m-1) + " not a close bracket \") \" ");
                return false;
            }

        }
        if(ovar == 1){
            textView.setText("Invalid equation! You didnt close a bracket you opened.");
            return false;
        }
        String hold = "";

        //making sure that the factorize number has nno variable;
        for(int i = 0; i < equation.length(); i++){
            if(equation.charAt(i) == '('){
                // check1= 0;
                // making the variable hold empty after each passing
                hold = "";
                // the variable j tells if the open bracket is the first element in the string and also try to get the first number in num.
                int j = i-1;

                int k = i+1;
                //trying to get the number that is used to multily everything in the bracket and assign it to the variable num
                if(j>= 0){
                    while(Character.isDigit(equation.charAt(j)) || Character.isLetter(equation.charAt(j))){
                        num = num + equation.charAt(j);
                        j -=1;
                        if (j < 0) break;
                    }
                }

                while (equation.charAt(k) != ')'){
                    hold = hold + equation.charAt(k);
                    k +=1;
                }
                for(int q = 0; q  < num.length(); q++){
                    if(Character.isLetter(num.charAt(q))){
                        textView.setText("Invalid equation! You are not allowed to open a bracket with a variable");
                        return false;
                    }
                }
                for(int q = 0; q  < hold.length(); q++){
                    if(hold.charAt(q) == '='){
                        textView.setText("Invalid equation! It does not make sense to have an equality sign inside a bracket");
                        return false;
                    }
                    if(hold.length() == 1 ){
                        if(hold.charAt(q) == '+' || hold.charAt(q) == '-'){
                            // TextView textView = findViewById(R.id.);
                            textView.setText("Invalid equation! It is wrong to have only " + hold.charAt(q) + " in a bracket");
                            return false;
                        }
                    }
                }
                num = "";
            }
        }
        return true;
    }
}
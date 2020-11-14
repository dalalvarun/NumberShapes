package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    class Number{
        int n;
        public boolean checkTriangular()
        {
            int x = 1;
            int i=1;
            while(x<n)
            {
                i++;
                x+=i;

            }
            if(n==x)
                return true;
            return false;
        }
        public boolean checkSquare()
        {
            if(Math.sqrt((double)n) - Math.floor(Math.sqrt((double)n))==0)
                return true;
            return false;
        }
    }

    public void Triangular(View view)
    {

        try{
            EditText ip = (EditText) findViewById(R.id.numberInput);
            Number num = new Number();
            num.n = Integer.parseInt(ip.getText().toString());
            if(num.checkTriangular())
                Toast.makeText(this, "It is a Triangular Number!", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "Not a Triangular Number!", Toast.LENGTH_LONG).show();
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, "Please enter a number!!", Toast.LENGTH_SHORT).show();
        }

     }
    public void Square(View view)
    {

        try{
            EditText ip = (EditText) findViewById(R.id.numberInput);
            Number num = new Number();
            num.n = Integer.parseInt(ip.getText().toString());
            if(num.checkSquare())
                Toast.makeText(this, "It is a Square!", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "Not a Square!", Toast.LENGTH_LONG).show();
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, "Please enter a number!!", Toast.LENGTH_SHORT).show();
        }

    }
}
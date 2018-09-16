package br.com.kotake.calculadoradegorjeta;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    private NumberFormat percentForrmat = NumberFormat.getPercentInstance();
    private TextView amountTextView;
    private TextView percentTextView;
    private TextView tipTextView;
    private TextView totalTextView;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountTextView = (TextView) findViewById(R.id.amountTextView);
        percentTextView = (TextView) findViewById(R.id.percentTextView);
        tipTextView = (TextView) findViewById(R.id.tipTextView);
        totalTextView = (TextView) findViewById(R.id.totalTextView);
    }
}

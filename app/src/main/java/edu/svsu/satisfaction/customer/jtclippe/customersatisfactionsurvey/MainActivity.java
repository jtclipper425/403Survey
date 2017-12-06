package edu.svsu.satisfaction.customer.jtclippe.customersatisfactionsurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TextView view = (TextView)findViewById(R.id.seekBarProgress);
                view.setText(Integer.toString(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void showDone(View view)
    {
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        String progress = Integer.toString(seekBar.getProgress());

        RadioButton radSatisfy1 = (RadioButton) findViewById(R.id.radSatisfy1);
        RadioButton radSatisfy2 = (RadioButton) findViewById(R.id.radSatisfy2);
        RadioButton radSatisfy3 = (RadioButton) findViewById(R.id.radSatisfy3);
        RadioButton radSatisfy4 = (RadioButton) findViewById(R.id.radSatisfy4);
        RadioButton radSatisfy5 = (RadioButton) findViewById(R.id.radSatisfy5);

        String response2 = "";

        if (radSatisfy1.isChecked())
        {
            response2 = radSatisfy1.getText().toString();
        }
        else if (radSatisfy2.isChecked())
        {
            response2 = radSatisfy2.getText().toString();
        }
        else if (radSatisfy3.isChecked())
        {
            response2 = radSatisfy3.getText().toString();
        }
        else if (radSatisfy4.isChecked())
        {
            response2 = radSatisfy4.getText().toString();
        }
        else if (radSatisfy5.isChecked())
        {
            response2 = radSatisfy5.getText().toString();
        }

        CheckBox chkDescribe1 = (CheckBox) findViewById(R.id.chkDescribe1);
        CheckBox chkDescribe2 = (CheckBox) findViewById(R.id.chkDescribe2);
        CheckBox chkDescribe3 = (CheckBox) findViewById(R.id.chkDescribe3);
        CheckBox chkDescribe4 = (CheckBox) findViewById(R.id.chkDescribe4);
        CheckBox chkDescribe5 = (CheckBox) findViewById(R.id.chkDescribe5);
        CheckBox chkDescribe6 = (CheckBox) findViewById(R.id.chkDescribe6);
        CheckBox chkDescribe7 = (CheckBox) findViewById(R.id.chkDescribe7);
        CheckBox chkDescribe8 = (CheckBox) findViewById(R.id.chkDescribe8);
        CheckBox chkDescribe9 = (CheckBox) findViewById(R.id.chkDescribe9);
        CheckBox chkDescribe10 = (CheckBox) findViewById(R.id.chkDescribe10);

        String response3 = "";

        if (chkDescribe1.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe1.getText().toString();
            }
            else
            {
                response3 = chkDescribe1.getText().toString();
            }
        }
        if (chkDescribe2.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe2.getText().toString();
            }
            else
            {
                response3 = chkDescribe2.getText().toString();
            }
        }
        if (chkDescribe3.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe3.getText().toString();
            }
            else
            {
                response3 = chkDescribe3.getText().toString();
            }
        }
        if (chkDescribe4.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe4.getText().toString();
            }
            else
            {
                response3 = chkDescribe4.getText().toString();
            }
        }
        if (chkDescribe5.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe5.getText().toString();
            }
            else
            {
                response3 = chkDescribe5.getText().toString();
            }
        }
        if (chkDescribe6.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe6.getText().toString();
            }
            else
            {
                response3 = chkDescribe6.getText().toString();
            }
        }
        if (chkDescribe7.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe7.getText().toString();
            }
            else
            {
                response3 = chkDescribe7.getText().toString();
            }
        }
        if (chkDescribe8.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe8.getText().toString();
            }
            else
            {
                response3 = chkDescribe8.getText().toString();
            }
        }
        if (chkDescribe9.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe9.getText().toString();
            }
            else
            {
                response3 = chkDescribe9.getText().toString();
            }
        }
        if (chkDescribe10.isChecked())
        {
            if (response3 != "") {
                response3 += ", " + chkDescribe10.getText().toString();
            }
            else
            {
                response3 = chkDescribe10.getText().toString();
            }
        }

        RadioButton radNeeds1 = (RadioButton) findViewById(R.id.radNeeds1);
        RadioButton radNeeds2 = (RadioButton) findViewById(R.id.radNeeds2);
        RadioButton radNeeds3 = (RadioButton) findViewById(R.id.radNeeds3);
        RadioButton radNeeds4 = (RadioButton) findViewById(R.id.radNeeds4);
        RadioButton radNeeds5 = (RadioButton) findViewById(R.id.radNeeds5);

        String response4 = "";

        if (radNeeds1.isChecked())
        {
            response4 = radNeeds1.getText().toString();
        }
        else if (radNeeds2.isChecked())
        {
            response4 = radNeeds2.getText().toString();
        }
        else if (radNeeds3.isChecked())
        {
            response4 = radNeeds3.getText().toString();
        }
        else if (radNeeds4.isChecked())
        {
            response4 = radNeeds4.getText().toString();
        }
        else if (radNeeds5.isChecked())
        {
            response4 = radNeeds5.getText().toString();
        }

        RadioButton radQuality1 = (RadioButton) findViewById(R.id.radQuality1);
        RadioButton radQuality2 = (RadioButton) findViewById(R.id.radQuality2);
        RadioButton radQuality3 = (RadioButton) findViewById(R.id.radQuality3);
        RadioButton radQuality4 = (RadioButton) findViewById(R.id.radQuality4);
        RadioButton radQuality5 = (RadioButton) findViewById(R.id.radQuality5);

        String response5 = "";

        if (radQuality1.isChecked())
        {
            response5 = radQuality1.getText().toString();
        }
        else if (radQuality2.isChecked())
        {
            response5 = radQuality2.getText().toString();
        }
        else if (radQuality3.isChecked())
        {
            response5 = radQuality3.getText().toString();
        }
        else if (radQuality4.isChecked())
        {
            response5 = radQuality4.getText().toString();
        }
        else if (radQuality5.isChecked())
        {
            response5 = radQuality5.getText().toString();
        }

        RadioButton radValue1 = (RadioButton) findViewById(R.id.radValue1);
        RadioButton radValue2 = (RadioButton) findViewById(R.id.radValue2);
        RadioButton radValue3 = (RadioButton) findViewById(R.id.radValue3);
        RadioButton radValue4 = (RadioButton) findViewById(R.id.radValue4);
        RadioButton radValue5 = (RadioButton) findViewById(R.id.radValue5);

        String response6 = "";

        if (radValue1.isChecked())
        {
            response6 = radValue1.getText().toString();
        }
        else if (radValue2.isChecked())
        {
            response6 = radValue2.getText().toString();
        }
        else if (radValue3.isChecked())
        {
            response6 = radValue3.getText().toString();
        }
        else if (radValue4.isChecked())
        {
            response6 = radValue4.getText().toString();
        }
        else if (radValue5.isChecked())
        {
            response6 = radValue5.getText().toString();
        }

        RadioButton radResponsive1 = (RadioButton) findViewById(R.id.radResponsive1);
        RadioButton radResponsive2 = (RadioButton) findViewById(R.id.radResponsive2);
        RadioButton radResponsive3 = (RadioButton) findViewById(R.id.radResponsive3);
        RadioButton radResponsive4 = (RadioButton) findViewById(R.id.radResponsive4);
        RadioButton radResponsive5 = (RadioButton) findViewById(R.id.radResponsive5);
        RadioButton radResponsive6 = (RadioButton) findViewById(R.id.radResponsive6);

        String response7 = "";

        if (radResponsive1.isChecked())
        {
            response7 = radResponsive1.getText().toString();
        }
        else if (radResponsive2.isChecked())
        {
            response7 = radResponsive2.getText().toString();
        }
        else if (radResponsive3.isChecked())
        {
            response7 = radResponsive3.getText().toString();
        }
        else if (radResponsive4.isChecked())
        {
            response7 = radResponsive4.getText().toString();
        }
        else if (radResponsive5.isChecked())
        {
            response7 = radResponsive5.getText().toString();
        }
        else if (radResponsive6.isChecked())
        {
            response7 = radResponsive6.getText().toString();
        }

        RadioButton radTime1 = (RadioButton) findViewById(R.id.radTime1);
        RadioButton radTime2 = (RadioButton) findViewById(R.id.radTime2);
        RadioButton radTime3 = (RadioButton) findViewById(R.id.radTime3);
        RadioButton radTime4 = (RadioButton) findViewById(R.id.radTime4);
        RadioButton radTime5 = (RadioButton) findViewById(R.id.radTime5);
        RadioButton radTime6 = (RadioButton) findViewById(R.id.radTime6);

        String response8 = "";

        if (radTime1.isChecked())
        {
            response8 = radTime1.getText().toString();
        }
        else if (radTime2.isChecked())
        {
            response8 = radTime2.getText().toString();
        }
        else if (radTime3.isChecked())
        {
            response8 = radTime3.getText().toString();
        }
        else if (radTime4.isChecked())
        {
            response8 = radTime4.getText().toString();
        }
        else if (radTime5.isChecked())
        {
            response8 = radTime5.getText().toString();
        }
        else if (radTime6.isChecked())
        {
            response8 = radTime6.getText().toString();
        }

        RadioButton radPurchase1 = (RadioButton) findViewById(R.id.radPurchase1);
        RadioButton radPurchase2 = (RadioButton) findViewById(R.id.radPurchase2);
        RadioButton radPurchase3 = (RadioButton) findViewById(R.id.radPurchase3);
        RadioButton radPurchase4 = (RadioButton) findViewById(R.id.radPurchase4);
        RadioButton radPurchase5 = (RadioButton) findViewById(R.id.radPurchase5);

        String response9 = "";

        if (radPurchase1.isChecked())
        {
            response9 = radPurchase1.getText().toString();
        }
        else if (radPurchase2.isChecked())
        {
            response9 = radPurchase2.getText().toString();
        }
        else if (radPurchase3.isChecked())
        {
            response9 = radPurchase3.getText().toString();
        }
        else if (radPurchase4.isChecked())
        {
            response9 = radPurchase4.getText().toString();
        }
        else if (radPurchase5.isChecked())
        {
            response9 = radPurchase5.getText().toString();
        }

        EditText editText = (EditText) findViewById(R.id.editText);
        String comments = editText.getText().toString();

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(progress, response2, response3, response4, response5, response6, response7, response8, response9, comments);

        startActivity(new Intent(this, DoneActivity.class));
    }
}

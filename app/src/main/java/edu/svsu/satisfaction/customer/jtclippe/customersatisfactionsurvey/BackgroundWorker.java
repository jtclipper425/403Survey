package edu.svsu.satisfaction.customer.jtclippe.customersatisfactionsurvey;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundWorker extends AsyncTask<String, String, String> {

    Context context;

    BackgroundWorker(Context ctx)
    {
        context = ctx;
    }

    @Override
    protected String doInBackground(String... params) {
        URL url = null;
        try {
            url = new URL("http://csis.svsu.edu/~jtclippe/survey/results.php");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);

            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));

            String data = URLEncoder.encode("q1", "UTF-8")+"="+URLEncoder.encode(params[0], "UTF-8")
                    +"&"+ URLEncoder.encode("q2", "UTF-8")+"="+URLEncoder.encode(params[1], "UTF-8")
                    +"&"+ URLEncoder.encode("q3", "UTF-8")+"="+URLEncoder.encode(params[2], "UTF-8")
                    +"&"+ URLEncoder.encode("q4", "UTF-8")+"="+URLEncoder.encode(params[3], "UTF-8")
                    +"&"+ URLEncoder.encode("q5", "UTF-8")+"="+URLEncoder.encode(params[4], "UTF-8")
                    +"&"+ URLEncoder.encode("q6", "UTF-8")+"="+URLEncoder.encode(params[5], "UTF-8")
                    +"&"+ URLEncoder.encode("q7", "UTF-8")+"="+URLEncoder.encode(params[6], "UTF-8")
                    +"&"+ URLEncoder.encode("q8", "UTF-8")+"="+URLEncoder.encode(params[7], "UTF-8")
                    +"&"+ URLEncoder.encode("q9", "UTF-8")+"="+URLEncoder.encode(params[8], "UTF-8")
                    +"&"+ URLEncoder.encode("q10", "UTF-8")+"="+URLEncoder.encode(params[9], "UTF-8");

            bufferedWriter.write(data);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();

            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));

            String result = "";
            String line;

            while ((line = bufferedReader.readLine()) != null)
            {
                result+=line;
            }

            bufferedReader.close();
            inputStream.close();
            httpURLConnection.disconnect();
            return result;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String aVoid) {
        super.onPostExecute(aVoid);
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }
}

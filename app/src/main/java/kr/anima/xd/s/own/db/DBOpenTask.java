package kr.anima.xd.s.own.db;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by alfo6-10 on 8/25/2017.
 */

public class DBOpenTask extends AsyncTask<String, JSONArray, Boolean> {

    // TODO :: insert, load url !!!
    public static final String INSERT_URL = "http://sooong03.dothome.co.kr/android/insertDB.php";
    public static final String LOAD_URL = "http://sooong03.dothome.co.kr/android/loadDB.php";
    public static final String REQUEST_METHOD="POST";


    private URL url;
    private HttpURLConnection connection;

    private Context mContext;
    private ArrayList<JSONArray> list=new ArrayList<>();
    private Boolean urlType=false;


    public DBOpenTask() {
    }

    public DBOpenTask(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    protected Boolean doInBackground(String... strings) {

        // TODO : URL INSERT OR LOAD TYPE
        urlType=strings[0].equals(")")? true: false;
        if(urlType) return insertData();
        else return loadData();

    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        String result=aBoolean? DBManager.RESULT_SUCCESSFUL:DBManager.RESULT_FAIL;
        Toast.makeText(mContext, result, Toast.LENGTH_SHORT).show();
        super.onPostExecute(aBoolean);
    }

    @Override
    protected void onProgressUpdate(JSONArray... values) {
        list.add(values[0]);
        // TODO :: adapter notify
        super.onProgressUpdate(values);
    }


    private boolean insertData(){

        try {
            url=new URL(INSERT_URL);
            connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod(REQUEST_METHOD);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);

            OutputStream os=connection.getOutputStream();
            // TODO :
//            os.write();

            InputStream is=connection.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader reader=new BufferedReader(isr);
            StringBuffer buffer=new StringBuffer();
            String line=reader.readLine();
            while (line!=null){
                buffer.append(line);
                line=reader.readLine();
            }
            JSONArray array=new JSONArray(buffer.toString());
            publishProgress(array);
            return true;

        } catch (Exception e){  }

        return false;
    }

    private boolean loadData(){

        try {
            url=new URL(LOAD_URL);
            connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod(REQUEST_METHOD);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);

            InputStream is=connection.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader reader=new BufferedReader(isr);
            StringBuffer buffer=new StringBuffer();
            String line=reader.readLine();
            while (line!=null){
                buffer.append(line);
                line=reader.readLine();
            }
            JSONArray array=new JSONArray(buffer.toString());
            publishProgress(array);
            return true;

        } catch (Exception e){  }

        return false;
    }

}

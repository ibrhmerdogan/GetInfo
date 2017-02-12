package com.example.ibrhm.getinfo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class Services extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
 /* int MaingetInfoId;
    int x=0;
    int DIS=123;
    Databeses databeses;
    DBOperations dbOperations=new DBOperations();
    Values values=new Values();
    JSONObject jsonObject;
    JSONObject JObject=new JSONObject();
    private static final String url = "http://denemesitesidirdbyeni.co.nf/uyeler.php";
    GetInformation getInformation;

    public Services() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        getInformation=new GetInformation(url,JObject);
        getInformation.getJSONFromUrl();
        onTaskRemoved(intent);

         return START_STICKY;
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        Intent startIntent=new Intent(getApplicationContext(),getClass());
        startIntent.setPackage(getPackageName());
        startService(startIntent);

        super.onTaskRemoved(rootIntent);
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
    }

    class GetInformation extends AsyncTask<Void, Void, JSONObject> {
        private final String TAG = "HttpClient";
        private String URL;
        private JSONObject jsonObjSend;
        Context context;
        int id=48;

        Display display;
        String  resultString;
        ArrayList<String> uyeler;
        ArrayAdapter<String> arrayAdapter;


        public GetInformation(String URL, JSONObject jsonObjSend) {
            this.URL = URL;
            this.jsonObjSend = jsonObjSend;
        }

        public void getJSONFromUrl() {
            this.execute();

        }
        @Override
        protected JSONObject doInBackground(Void... params) {

            try {
                DefaultHttpClient httpclient = new DefaultHttpClient();
                HttpPost httpPostRequest = new HttpPost(URL);

                StringEntity se = new StringEntity(jsonObjSend.toString());

                // Set HTTP parameters
                httpPostRequest.setEntity(se);
                httpPostRequest.setHeader("Accept", "application/json");
                httpPostRequest.setHeader("Content-type", "application/json");

                long t = System.currentTimeMillis();
                HttpResponse response = (HttpResponse) httpclient.execute(httpPostRequest);
                //Toast.makeText(getApplicationContext(),""+response,Toast.LENGTH_LONG).show();
                Log.i(TAG, "HTTPResponse received in [" + (System.currentTimeMillis() - t) + "ms]");

                HttpEntity entity = response.getEntity();

                if (entity != null) {
                    // Read the content stream
                    InputStream instream = entity.getContent();

                    // convert content stream to a String
                    resultString = convertStreamToString(instream);
                    instream.close();
                    // resultString = resultString.substring(1, resultString.length() - 1); // remove wrapping "[" and "]"
                    JSONObject object= new JSONObject(resultString);



                    //Raw DEBUG output of our received JSON object:
                    Log.i(TAG, "<JSONObject>\n" + object.toString() + "\n</JSONObject>");
                    return object;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        protected void onPostExecute(JSONObject object)  {
            JSONObject objectt=object;
            JSONArray result=null;
            int i;
            try {
                JSONArray array=new JSONArray();
                result=array.put(objectt);
            } catch (Exception e) {
                e.printStackTrace();

            }
            int x=objectt.length();
            uyeler=new ArrayList<>();
            try{
                for (i=0;i<x;i++){

                     jsonObject = result.getJSONObject(0).getJSONObject(String.valueOf(i));
                    databeses=new Databeses(Services.this);
                   Boolean resultt=dbOperations.display(jsonObject.getString("date"),databeses);
                    if(jsonObject.getInt("no")==DIS && resultt==false){
                        values.setNo(jsonObject.getInt("no"));
                        values.setName(jsonObject.getString("name"));
                        values.setDate(jsonObject.getString("date"));
                        dbOperations.dBUpdate(databeses,1,values.getDate());
                        Toast.makeText(getApplicationContext(),"name"+values.getName(),Toast.LENGTH_LONG).show();

                    }

                }
            }catch (JSONException e){e.printStackTrace();}


        }

        private String convertStreamToString(InputStream is) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();

            String line = null;
            try {
                int x=0;
                while ((line = reader.readLine()) != null) {
                    x++;
                    if(x>4)
                        sb.append(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        }
    }
*/
}
/*  Intent intent = new Intent();
                        intent.setAction("org.tcellgy.intent.TITRESIM_INTENT");
                        sendBroadcast(intent);*/
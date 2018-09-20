package com.example.akbar.rumahsakitmusimedikacendikia;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class AppController extends Application {
    private static final String TAG = AppController.class.getSimpleName();
    private static AppController instance;
    RequestQueue mRequestQueue;
    @Override
    public void onCreate(){
        super.onCreate();
        instance = this;
    }

    public static synchronized AppController getInstance(Context applicationContext){
        return instance;
    }
    private RequestQueue getmRequestQueue(){
        if (mRequestQueue == null){
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }
    public <T> void addToRequestQueue(Request<T> req, String tag){
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getmRequestQueue().add(req);
    }
    public <T> void addToRequestqueue(Request<T> req){
        req.setTag(TAG);
        getmRequestQueue().add(req);
    }
    public void cancelAllRequest(Object req){
        if (mRequestQueue != null){
            mRequestQueue.cancelAll(req);
        }
    }
}

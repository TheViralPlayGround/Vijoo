package com.example.diplomat.vijoo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by diplomat on 5/20/17.
 */
public class BaseActivity extends Activity {


    protected Context context;
    //protected static Firebase dijooFireBase;
    //protected static FirebaseHandler fbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
      //  Firebase.setAndroidContext(this);


    }


    @Override
    protected void onPause() {

        // TODO close database


        super.onPause();

    }

    @Override
    protected void onResume() {

        super.onResume();
        // TODO open database


    }

    @Override
    protected void onStop(){

        super.onStop();


    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

    }
}

package kg.nurga.activities_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class SecondActivity extends FragmentActivity {


    static public String RESULT_KEY = "result_key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        SecondFragment secondFragment = new SecondFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction =  fragmentManager.beginTransaction();
        transaction.replace(R.id.second_container,secondFragment);
        transaction.commit();

    }

    void setResultActivity(String text){
        Intent intent = new Intent();
        intent.putExtra(RESULT_KEY,text);
        setResult(RESULT_OK,intent);
        finish();
    }
}

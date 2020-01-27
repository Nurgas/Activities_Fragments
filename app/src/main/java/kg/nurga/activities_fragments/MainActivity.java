package kg.nurga.activities_fragments;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {
    MainFragment mainFragment = new MainFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainFragment = new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction =  fragmentManager.beginTransaction();
        transaction.replace(R.id.main_container,mainFragment);
        transaction.commit();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==100){
            if (resultCode==RESULT_OK){
                String text = data.getStringExtra(SecondActivity.RESULT_KEY);
                mainFragment.setText(text);
            }
        }
    }

    void onOpenActivity(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivityForResult(intent,100);
    }
}

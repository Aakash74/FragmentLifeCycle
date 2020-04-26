package com.example.fragmentlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity","onCreate...");
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show();
        FragmentManager fragmentManager=getFragmentManager();
        android.app.FragmentTransaction ft = fragmentManager.beginTransaction();

        //for display if landscop mode or pediotrimode
        WindowManager windowManager=getWindowManager();
        Display display= windowManager.getDefaultDisplay();
        if(display.getWidth() > display.getHeight())
        {
            FirstFragment firstFragment=new FirstFragment();
            ft.replace(android.R.id.content,firstFragment);
        }
        else
        {
            SecondFragment secondFragment=new SecondFragment();
            ft.replace(android.R.id.content,secondFragment);
        }

        //to visible the fragment use
        ft.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity","onStart...");
        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity","onResume...");
        Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity","onRestart...");
        Toast.makeText(this,"OnRestart",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity","onPause...");
        Toast.makeText(this,"OnPause",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity","onStop...");
        Toast.makeText(this,"OnStop",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity","onDestroy...");
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_SHORT).show();

    }
}

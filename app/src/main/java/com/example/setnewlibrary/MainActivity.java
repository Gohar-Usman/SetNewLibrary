package com.example.setnewlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.toastermessage.MyToaster;

public class MainActivity extends AppCompatActivity implements MyToaster.MyCallBack {
 MyToaster.MyCallBack myCallBack = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyToaster.sum(myCallBack,2,4);
        Toast.makeText(this, "new library", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void addnumber(int result) {
        Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();

    }
}
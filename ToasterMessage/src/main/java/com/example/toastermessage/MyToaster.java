package com.example.toastermessage;

import android.content.Context;
import android.widget.Toast;

public class MyToaster {
    static MyCallBack myCallBack;

    public static void sum(MyCallBack myCallBack1, int a, int b){
        myCallBack = myCallBack1;
        myCallBack.addnumber(a+b);
    }

//    public static void s(Context c, String message){
//
//        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
//
//    }
    public interface MyCallBack{
        void addnumber(int result);
}
}

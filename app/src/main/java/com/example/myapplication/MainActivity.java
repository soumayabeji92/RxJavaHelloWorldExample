package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private String msg="Hello soumaya";
    private Observable<String> myObservable;
    private Observer<String> myObserver;
    private static String TAG="RxExample";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tvmsg);
        myObservable=Observable.just(msg);
        myObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG,"onSubscribe invoked");
            }

            @Override
            public void onNext(String s) {
                Log.i(TAG,"onNext invoked");
                textView.setText(s);
            }


            @Override
            public void onError(Throwable e) {
                Log.i(TAG,"onError invoked");
            }

            @Override
            public void onComplete() {
                Log.i(TAG,"onComplete invoked");
            }
        };
        myObservable.subscribe(myObserver);
    }

    }


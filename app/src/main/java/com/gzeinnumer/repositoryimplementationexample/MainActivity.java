package com.gzeinnumer.repositoryimplementationexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.gzeinnumer.repositoryimplementationexample.repository.MainVM;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    MainVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainVM.class);

        viewModel.getData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d(TAG, "onChanged: "+s);
            }
        });
    }
}
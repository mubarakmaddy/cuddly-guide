package com.ghrattgeoloc.newarchitecture.modules;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CustomModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "Heartbeat";
    private static ReactApplicationContext reactContext;

    public CustomModule(ReactApplicationContext context){
        super(context);
        this.reactContext = context;
    }

    @ReactMethod
    public void show(){
        Toast.makeText(reactContext, "Hello world", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return "CustomModule";
    }
}

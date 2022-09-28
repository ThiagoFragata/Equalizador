package com.equalizer;

import android.media.MediaPlayer;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class EqualizerModule extends ReactContextBaseJavaModule {

    EqualizerModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName(){
        return "EqualizerModule";
    }

    @ReactMethod
    public void createEqualizer() {

        Toast.makeText(getReactApplicationContext(), "Funcionou", Toast.LENGTH_SHORT).show();
    }
}

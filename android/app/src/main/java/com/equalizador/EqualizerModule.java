package com.equalizador;

import android.media.MediaPlayer;
import android.media.audiofx.Equalizer;
import android.media.audiofx.Visualizer;
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


    private MediaPlayer mMediaPlayer;
    private Equalizer mEqualizer;


    @ReactMethod
    public void setupEqualizer(short band, short level) {
        mEqualizer = new Equalizer(0, mMediaPlayer.getAudioSessionId());

        mEqualizer.setEnabled(true);

        short bands = mEqualizer.getNumberOfBands();

        final short minEqualizer = mEqualizer.getBandLevelRange()[0];
        final short maxEqualizer = mEqualizer.getBandLevelRange()[1];

        mEqualizer.setBandLevel (band,level);
        Toast.makeText(getReactApplicationContext(), "Banda e level =>" + band + level, Toast.LENGTH_SHORT).show();

        Equalizer.Settings settings = mEqualizer.getProperties();
        System.out.printf(String.valueOf(mEqualizer.getProperties()));
    }

    @ReactMethod
    public void callEqualizer() {
        Toast.makeText(getReactApplicationContext(), "Chaaama!", Toast.LENGTH_SHORT).show();
    }
}

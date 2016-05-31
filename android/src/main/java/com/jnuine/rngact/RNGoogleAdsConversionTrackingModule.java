package com.jnuine.rngact;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.ads.conversiontracking.AdWordsConversionReporter;

public class RNGoogleAdsConversionTrackingModule extends ReactContextBaseJavaModule {

    private final String LOG_TAG = "Ads Conversion Tracking";
    private final ReactApplicationContext mReactContext;

    public RNGoogleAdsConversionTrackingModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mReactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNGoogleAdsConversionTracking";
    }

    @ReactMethod
    public void reportWithConversionId(String conversionId, String trackingLabel, String trackingValue, Boolean repeatable) {
        try {
            AdWordsConversionReporter.reportWithConversionId(
                    mReactContext,
                    conversionId,
                    trackingLabel,
                    trackingValue,
                    repeatable
            );
        } catch (final Exception e) {
            Log.d(LOG_TAG, e.getLocalizedMessage());
        }

    }

}

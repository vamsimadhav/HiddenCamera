package com.example.hiddencamera.CameraConfigurations;

import androidx.annotation.IntDef;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CameraExposure {
    public static final int MIN_EXPOSURE = -12;
    public static final int MAX_EXPOSURE = 12;
    public static final int DEFAULT_EXPOSURE = 0;

    private CameraExposure() {
        throw new RuntimeException("Cannot initialize this class.");
    }

//    @Retention(RetentionPolicy.SOURCE)
//    @IntDef({MIN_EXPOSURE, DEFAULT_EXPOSURE, MAX_EXPOSURE})
//    public @interface SupportedExposure {
//    }

}

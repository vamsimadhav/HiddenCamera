package com.example.hiddencamera.CameraConfigurations;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CameraFacing {

    public static final int REAR_FACING_CAMERA = 0;
    public static final int FRONT_FACING_CAMERA = 1;

    private CameraFacing() {
        throw new RuntimeException("Cannot initialize this class.");
    }

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({REAR_FACING_CAMERA, FRONT_FACING_CAMERA})
    public @interface SupportedCameraFacing {
    }
}

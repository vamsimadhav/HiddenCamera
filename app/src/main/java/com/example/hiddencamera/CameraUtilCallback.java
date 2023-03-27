package com.example.hiddencamera;

import androidx.annotation.NonNull;

import com.example.hiddencamera.Helpers.CameraError;

import java.io.File;

public interface CameraUtilCallback {
    void onImageCapture(@NonNull File imageFile);
    void onCameraError(@CameraError.CameraErrorCodes int errorCodes);
}

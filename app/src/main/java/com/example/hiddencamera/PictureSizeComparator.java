package com.example.hiddencamera;

import android.hardware.Camera;

import java.util.Comparator;

class PictureSizeComparator implements Comparator<Camera.Size> {

    public int compare(Camera.Size a, Camera.Size b) {
        return (b.height * b.width) - (a.height * a.width);
    }
}
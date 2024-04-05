package com.facebook.share.internal;

public enum CameraEffectFeature {
    SHARE_CAMERA_EFFECT(20170417);
    
    private final int minVersion;

    private CameraEffectFeature(int i) {
        this.minVersion = i;
    }

    public String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}

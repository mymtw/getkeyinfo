package com.facebook.share.internal;

public enum ShareStoryFeature {
    SHARE_STORY_ASSET(20170417);
    
    private final int minVersion;

    private ShareStoryFeature(int i) {
        this.minVersion = i;
    }

    public String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}

package com.facebook.share.internal;

public enum ShareDialogFeature {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    
    private final int minVersion;

    private ShareDialogFeature(int i) {
        this.minVersion = i;
    }

    public String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}

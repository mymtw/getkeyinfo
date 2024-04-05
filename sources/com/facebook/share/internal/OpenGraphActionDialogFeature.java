package com.facebook.share.internal;

public enum OpenGraphActionDialogFeature {
    OG_ACTION_DIALOG(20130618);
    
    private final int minVersion;

    private OpenGraphActionDialogFeature(int i) {
        this.minVersion = i;
    }

    public String getAction() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}

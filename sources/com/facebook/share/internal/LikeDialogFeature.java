package com.facebook.share.internal;

public enum LikeDialogFeature {
    LIKE_DIALOG(20140701);
    
    private final int minVersion;

    private LikeDialogFeature(int i) {
        this.minVersion = i;
    }

    public String getAction() {
        return "com.facebook.platform.action.request.LIKE_DIALOG";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}

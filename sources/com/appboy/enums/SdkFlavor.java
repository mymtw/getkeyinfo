package com.appboy.enums;

import p005a4.C0035b;

public enum SdkFlavor implements C0035b<String> {
    UNITY("unity"),
    REACT("react"),
    CORDOVA("cordova"),
    XAMARIN("xamarin"),
    FLUTTER("flutter"),
    SEGMENT("segment"),
    TEALIUM("tealium"),
    MPARTICLE("mparticle");
    
    private final String jsonKey;

    private SdkFlavor(String str) {
        this.jsonKey = str;
    }

    public String forJsonPut() {
        return this.jsonKey;
    }
}

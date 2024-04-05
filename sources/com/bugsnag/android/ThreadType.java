package com.bugsnag.android;

public enum ThreadType {
    EMPTY(""),
    ANDROID("android"),
    C("c"),
    REACTNATIVEJS("reactnativejs");
    
    public static final C5715a Companion = null;
    private final String desc;

    /* renamed from: com.bugsnag.android.ThreadType$a */
    public static final class C5715a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C5715a();
    }

    private ThreadType(String str) {
        this.desc = str;
    }

    public final String getDesc$bugsnag_android_core_release() {
        return this.desc;
    }
}

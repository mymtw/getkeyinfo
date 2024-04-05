package com.bugsnag.android;

import kotlin.jvm.internal.C19383o;

public enum ErrorType {
    ANDROID("android"),
    REACTNATIVEJS("reactnativejs"),
    C("c");
    
    public static final C5707a Companion = null;
    private final String desc;

    /* renamed from: com.bugsnag.android.ErrorType$a */
    public static final class C5707a {
        /* renamed from: a */
        public static ErrorType m11494a(String str) {
            C19383o.m32798h(str, "desc");
            for (ErrorType errorType : ErrorType.values()) {
                if (C19383o.m32792b(errorType.getDesc$bugsnag_android_core_release(), str)) {
                    return errorType;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C5707a();
    }

    private ErrorType(String str) {
        this.desc = str;
    }

    public final String getDesc$bugsnag_android_core_release() {
        return this.desc;
    }
}

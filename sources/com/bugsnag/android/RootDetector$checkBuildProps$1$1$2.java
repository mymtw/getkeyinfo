package com.bugsnag.android;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import p753kq.C19857l;

public final class RootDetector$checkBuildProps$1$1$2 extends Lambda implements C19857l<String, Boolean> {
    public static final RootDetector$checkBuildProps$1$1$2 INSTANCE = new RootDetector$checkBuildProps$1$1$2();

    public RootDetector$checkBuildProps$1$1$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((String) obj));
    }

    public final boolean invoke(String str) {
        C19383o.m32798h(str, "line");
        return C19457k.m33025c1(str, "ro.debuggable=[1]", false) || C19457k.m33025c1(str, "ro.secure=[0]", false);
    }
}

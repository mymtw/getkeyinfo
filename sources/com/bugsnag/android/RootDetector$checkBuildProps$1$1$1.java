package com.bugsnag.android;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import p753kq.C19857l;

public final class RootDetector$checkBuildProps$1$1$1 extends Lambda implements C19857l<String, String> {
    public static final RootDetector$checkBuildProps$1$1$1 INSTANCE = new RootDetector$checkBuildProps$1$1$1();

    public RootDetector$checkBuildProps$1$1$1() {
        super(1);
    }

    public final String invoke(String str) {
        C19383o.m32798h(str, "line");
        return new Regex("\\s").replace((CharSequence) str, "");
    }
}

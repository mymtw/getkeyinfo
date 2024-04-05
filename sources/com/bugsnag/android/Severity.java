package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.etsy.android.lib.models.cardviewelement.BaseMessage;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;

public enum Severity implements C5748g1.C5749a {
    ERROR("error"),
    WARNING(BaseMessage.TYPE_WARNING),
    INFO("info");
    
    public static final C5711a Companion = null;
    /* access modifiers changed from: private */
    public final String str;

    /* renamed from: com.bugsnag.android.Severity$a */
    public static final class C5711a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C5711a();
    }

    private Severity(String str2) {
        this.str = str2;
    }

    public void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16530k(this.str);
    }
}

package com.facebook.appevents.suggestedevents;

import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import p401mg.C13080a;

/* renamed from: com.facebook.appevents.suggestedevents.a */
public final class C12242a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f27333b;

    /* renamed from: c */
    public final /* synthetic */ String f27334c;

    public C12242a(String str, String str2) {
        this.f27333b = str;
        this.f27334c = str2;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                ViewOnClickListener.C12240a.m20089a(ViewOnClickListener.Companion, this.f27333b, this.f27334c, new float[0]);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}

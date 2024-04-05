package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import java.io.File;
import p365hg.C12889o;
import p365hg.C12900p;
import p453tf.C13412e;
import p453tf.C13418j;

/* renamed from: com.facebook.share.internal.g */
public final class C12370g extends C13412e {
    /* renamed from: a */
    public final void mo39685a(AccessToken accessToken) {
        Context b = C13418j.m21106b();
        if (accessToken == null) {
            C12348b.f27511v = (C12348b.f27511v + 1) % 1000;
            b.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", C12348b.f27511v).apply();
            C12348b.f27505p.clear();
            C12889o oVar = C12348b.f27504o;
            File[] listFiles = oVar.f28427a.listFiles(C12889o.C12890a.C12891a.f28435a);
            oVar.f28431e.set(System.currentTimeMillis());
            if (listFiles != null) {
                C13418j.m21108d().execute(new C12900p(listFiles));
            }
        }
        C12348b.m20167c((C12348b) null, "com.facebook.sdk.LikeActionController.DID_RESET", (Bundle) null);
    }
}

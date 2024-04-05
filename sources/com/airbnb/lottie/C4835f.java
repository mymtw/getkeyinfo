package com.airbnb.lottie;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import p206p3.C7659e;

/* renamed from: com.airbnb.lottie.f */
public final class C4835f implements Callable<C4841l<C4828c>> {

    /* renamed from: b */
    public final /* synthetic */ Context f10865b;

    /* renamed from: c */
    public final /* synthetic */ String f10866c;

    public C4835f(Context context, String str) {
        this.f10865b = context;
        this.f10866c = str;
    }

    public final Object call() throws Exception {
        ZipInputStream zipInputStream;
        Context context = this.f10865b;
        String str = this.f10866c;
        try {
            String str2 = "asset_" + str;
            if (!str.endsWith(".zip")) {
                return C4829d.m10419b(context.getAssets().open(str), str2);
            }
            zipInputStream = new ZipInputStream(context.getAssets().open(str));
            C4841l<C4828c> e = C4829d.m10422e(zipInputStream, str2);
            C7659e.m14701b(zipInputStream);
            return e;
        } catch (IOException e2) {
            return new C4841l((Throwable) e2);
        } catch (Throwable th) {
            C7659e.m14701b(zipInputStream);
            throw th;
        }
    }
}

package com.squareup.picasso;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import okhttp3.C19933c;
import okhttp3.C20009t;

/* renamed from: com.squareup.picasso.p */
public final class C17455p implements C17448j {

    /* renamed from: a */
    public final C20009t f38136a;

    public C17455p(Context context) {
        long j;
        StringBuilder sb = C17427a0.f38069a;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        long max = Math.max(Math.min(j, 52428800), 5242880);
        C20009t.C20010a aVar = new C20009t.C20010a();
        aVar.f44325k = new C19933c(file, max);
        this.f38136a = new C20009t(aVar);
    }
}

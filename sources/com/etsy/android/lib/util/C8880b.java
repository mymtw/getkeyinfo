package com.etsy.android.lib.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.os.Environment;
import com.etsy.android.lib.util.C8886e;
import java.io.File;
import kotlin.p752io.C19365b;
import p287xp.C8339g;

/* renamed from: com.etsy.android.lib.util.b */
public final /* synthetic */ class C8880b implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ C8886e f19627b;

    /* renamed from: c */
    public final /* synthetic */ File f19628c;

    public /* synthetic */ C8880b(C8886e eVar, File file) {
        this.f19627b = eVar;
        this.f19628c = file;
    }

    public final Object apply(Object obj) {
        C8886e eVar = this.f19627b;
        File file = this.f19628c;
        Bitmap bitmap = (Bitmap) obj;
        File b = C8919r.m17357b(eVar.f19638d, C8919r.m17359d("", ".jpg"));
        Context context = eVar.f19638d;
        File externalCacheDir = Environment.getExternalStorageState().equals("mounted") || !Environment.isExternalStorageRemovable() ? context.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        File file2 = new File(externalCacheDir, C8919r.m17359d("", ".jpg"));
        if (!C8919r.m17356a(file2)) {
            file2 = null;
        }
        C19365b.m32685Q0(file, b);
        C19365b.m32685Q0(file, file2);
        MediaScannerConnection.scanFile(eVar.f19638d, new String[]{b.getAbsolutePath()}, (String[]) null, (MediaScannerConnection.OnScanCompletedListener) null);
        return new C8886e.C8889c(bitmap, file2);
    }
}

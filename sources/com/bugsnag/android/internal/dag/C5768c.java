package com.bugsnag.android.internal.dag;

import android.app.ActivityManager;
import android.content.Context;
import android.os.storage.StorageManager;
import androidx.activity.C0114h;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.internal.dag.c */
public final class C5768c extends DependencyModule {

    /* renamed from: b */
    public final StorageManager f12341b;

    /* renamed from: c */
    public final ActivityManager f12342c;

    public C5768c(C5767b bVar) {
        Context context = bVar.f12340b;
        C19383o.m32798h(context, "$this$getStorageManager");
        StorageManager storageManager = null;
        try {
            Object systemService = context.getSystemService("storage");
            storageManager = (StorageManager) (!(systemService instanceof StorageManager) ? null : systemService);
        } catch (RuntimeException unused) {
        }
        this.f12341b = storageManager;
        this.f12342c = C0114h.m296a0(bVar.f12340b);
    }
}

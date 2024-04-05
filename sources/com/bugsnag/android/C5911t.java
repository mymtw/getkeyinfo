package com.bugsnag.android;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.bugsnag.android.t */
public final class C5911t implements Callable<Boolean> {

    /* renamed from: b */
    public final /* synthetic */ C5917u f12607b;

    public C5911t(C5917u uVar) {
        this.f12607b = uVar;
    }

    public final Object call() throws Exception {
        File file = new File(NativeInterface.getNativeReportPath());
        return Boolean.valueOf(file.exists() || file.mkdirs());
    }
}

package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.play.core.appupdate.r */
public final class C15576r {

    /* renamed from: a */
    public final Context f35057a;

    public C15576r(Context context) {
        this.f35057a = context;
    }

    /* renamed from: a */
    public static long m25231a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File a : listFiles) {
                j += m25231a(a);
            }
        }
        return j;
    }
}

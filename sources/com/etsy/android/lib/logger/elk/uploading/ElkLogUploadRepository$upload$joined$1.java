package com.etsy.android.lib.logger.elk.uploading;

import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p340ea.C12663d;
import p753kq.C19857l;

final class ElkLogUploadRepository$upload$joined$1 extends Lambda implements C19857l<C12663d, CharSequence> {
    public static final ElkLogUploadRepository$upload$joined$1 INSTANCE = new ElkLogUploadRepository$upload$joined$1();

    public ElkLogUploadRepository$upload$joined$1() {
        super(1);
    }

    public final CharSequence invoke(C12663d dVar) {
        C19383o.m32797g(dVar, AnalyticsLogDatabaseHelper.LOG);
        return dVar.f27928b;
    }
}

package com.bugsnag.android;

import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.facebook.login.LoginFragment;

public enum BreadcrumbType {
    ERROR("error"),
    LOG(AnalyticsLogDatabaseHelper.LOG),
    MANUAL("manual"),
    NAVIGATION("navigation"),
    PROCESS("process"),
    REQUEST(LoginFragment.EXTRA_REQUEST),
    STATE("state"),
    USER("user");
    
    public static final C5706a Companion = null;
    /* access modifiers changed from: private */
    public final String type;

    /* renamed from: com.bugsnag.android.BreadcrumbType$a */
    public static final class C5706a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C5706a();
    }

    private BreadcrumbType(String str) {
        this.type = str;
    }

    public String toString() {
        return this.type;
    }
}

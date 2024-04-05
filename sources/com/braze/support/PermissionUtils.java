package com.braze.support;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.appboy.Constants;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PermissionUtils {

    /* renamed from: a */
    public static final String f11967a = C19383o.m32802l("PermissionUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: com.braze.support.PermissionUtils$a */
    public static final class C5589a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11968b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5589a(String str) {
            super(0);
            this.f11968b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11968b, "Failure checking permission ");
        }
    }

    /* renamed from: com.braze.support.PermissionUtils$b */
    final class C5590b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11969b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5590b(int i) {
            super(0);
            this.f11969b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0073e.m208h(C0072d.m201h("Incrementing permission req count to "), this.f11969b, ' ');
        }
    }

    /* renamed from: com.braze.support.PermissionUtils$c */
    public static final class C5591c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5591c f11970b = new C5591c();

        public C5591c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    /* renamed from: com.braze.support.PermissionUtils$d */
    public static final class C5592d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5592d f11971b = new C5592d();

        public C5592d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    /* renamed from: com.braze.support.PermissionUtils$e */
    public static final class C5593e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5593e f11972b = new C5593e();

        public C5593e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Notification permission already granted, doing nothing.";
        }
    }

    /* renamed from: com.braze.support.PermissionUtils$f */
    public static final class C5594f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5594f f11973b = new C5594f();

        public C5594f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Push Prompt can be shown on this device, within a reasonable confidence.";
        }
    }

    /* renamed from: a */
    public static final boolean m11331a(Context context, String str) {
        C19383o.m32797g(str, "permission");
        if (context != null) {
            try {
                if (context.checkCallingOrSelfPermission(str) == 0) {
                    return true;
                }
            } catch (Throwable th) {
                BrazeLogger.m11283e(f11967a, BrazeLogger.Priority.E, th, new C5589a(str), 8);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m11332b(Activity activity) {
        if (activity == null) {
            BrazeLogger.m11283e(f11967a, (BrazeLogger.Priority) null, (Throwable) null, C5591c.f11970b, 14);
        } else if (m11333c(activity) && Build.VERSION.SDK_INT >= 33) {
            SharedPreferences sharedPreferences = activity.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0);
            int i = sharedPreferences.getInt("android.permission.POST_NOTIFICATIONS", 0) + 1;
            BrazeLogger.m11283e(f11967a, (BrazeLogger.Priority) null, (Throwable) null, new C5590b(i), 14);
            sharedPreferences.edit().putInt("android.permission.POST_NOTIFICATIONS", i).apply();
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, IntentUtils.m11307b());
        }
    }

    /* renamed from: c */
    public static final boolean m11333c(Activity activity) {
        if (activity == null) {
            BrazeLogger.m11283e(f11967a, (BrazeLogger.Priority) null, (Throwable) null, C5592d.f11971b, 14);
            return false;
        } else if (Build.VERSION.SDK_INT < 33) {
            return false;
        } else {
            if (m11331a(activity, "android.permission.POST_NOTIFICATIONS")) {
                BrazeLogger.m11283e(f11967a, (BrazeLogger.Priority) null, (Throwable) null, C5593e.f11972b, 14);
                return false;
            } else if (activity.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0).getInt("android.permission.POST_NOTIFICATIONS", 0) >= 2) {
                return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
            } else {
                BrazeLogger.m11283e(f11967a, BrazeLogger.Priority.V, (Throwable) null, C5594f.f11973b, 12);
                return true;
            }
        }
    }
}

package com.paypal.android.platform.authsdk.authcommon.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BuildConfigUtils {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "BuildConfigUtils";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isAppDebuggable$auth_sdk_thirdPartyRelease(Context context) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            try {
                PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0);
                C19383o.m32796f(packageInfo, "context.applicationConte…text.getPackageName(), 0)");
                return (packageInfo.applicationInfo.flags & 2) != 0;
            } catch (PackageManager.NameNotFoundException e) {
                String access$getTAG$cp = BuildConfigUtils.TAG;
                Log.d(access$getTAG$cp, "Exception:" + e);
                return false;
            }
        }
    }
}

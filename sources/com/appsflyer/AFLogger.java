package com.appsflyer;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.appsflyer.internal.C4986ag;
import com.appsflyer.internal.C5002ak;
import com.appsflyer.internal.C5035bc;

public final class AFLogger {
    private static final long AFKeystoreWrapper = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int AFInAppEventType;

        private LogLevel(int i) {
            this.AFInAppEventType = i;
        }

        public final int getLevel() {
            return this.AFInAppEventType;
        }
    }

    public static void AFInAppEventParameterName(String str, boolean z) {
        if (AFKeystoreWrapper(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.4.3", AFKeystoreWrapper(str, false));
        }
        if (z) {
            if (C5002ak.AFInAppEventType == null) {
                C5002ak.AFInAppEventType = new C5002ak();
            }
            C5002ak.AFInAppEventType.valueOf((String) null, "I", AFKeystoreWrapper(str, true));
        }
    }

    public static void AFInAppEventType(String str) {
        AFInAppEventParameterName(str, true);
    }

    private static String AFKeystoreWrapper(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - AFKeystoreWrapper);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void AppsFlyer2dXConversionCallback(String str) {
        AFInAppEventParameterName(str);
    }

    private static void valueOf(String str, Throwable th, boolean z, boolean z2) {
        long j;
        if (AFKeystoreWrapper(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(" at ");
                sb.append(th.getStackTrace()[0].toString());
                str = sb.toString();
            }
            String AFKeystoreWrapper2 = AFKeystoreWrapper(str, false);
            if (z2) {
                Log.e("AppsFlyer_6.4.3", AFKeystoreWrapper2, th);
            } else if (z) {
                Log.d("AppsFlyer_6.4.3", AFKeystoreWrapper2);
            }
        }
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak akVar = C5002ak.AFInAppEventType;
        Throwable cause = th.getCause();
        akVar.valueOf("exception", th.getClass().getSimpleName(), C5002ak.AFKeystoreWrapper(cause == null ? th.getMessage() : cause.getMessage(), cause == null ? th.getStackTrace() : cause.getStackTrace()));
        Application application = C5035bc.AFKeystoreWrapper;
        if (application != null) {
            SharedPreferences.Editor edit = C4986ag.AFInAppEventParameterName((Context) application).edit();
            Application application2 = C5035bc.AFKeystoreWrapper;
            if (application2 == null) {
                j = -1;
            } else {
                j = C4986ag.AFInAppEventParameterName((Context) application2).getLong("exception_number", 0);
            }
            edit.putLong("exception_number", j + 1).apply();
        }
    }

    public static void values(String str) {
        if (!AFInAppEventParameterName()) {
            Log.d("AppsFlyer_6.4.3", AFKeystoreWrapper(str, false));
        }
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf((String) null, "F", str);
    }

    public static void AFInAppEventType(String str, Throwable th) {
        valueOf(str, th, true, true);
    }

    public static void AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper(LogLevel.VERBOSE)) {
            AFKeystoreWrapper(str, false);
        }
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf((String) null, "V", AFKeystoreWrapper(str, true));
    }

    public static void values(Throwable th) {
        valueOf((String) null, th, false, false);
    }

    public static void AFInAppEventParameterName(String str) {
        if (AFKeystoreWrapper(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.4.3", AFKeystoreWrapper(str, false));
        }
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf((String) null, "W", AFKeystoreWrapper(str, true));
    }

    private static boolean AFKeystoreWrapper(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void AFKeystoreWrapper(String str, Throwable th) {
        valueOf(str, th, true, false);
    }

    private static boolean AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void valueOf(String str) {
        if (AFKeystoreWrapper(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.4.3", AFKeystoreWrapper(str, false));
        }
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf((String) null, "D", AFKeystoreWrapper(str, true));
    }
}

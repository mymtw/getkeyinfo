package p681tl;

import java.util.HashMap;
import java.util.Map;
import p003a2.C0015b;

/* renamed from: tl.a */
public final class C18559a {

    /* renamed from: a */
    public static final HashMap f40868a;

    /* renamed from: b */
    public static final HashMap f40869b;

    /* renamed from: c */
    public static final HashMap f40870c = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f40868a = hashMap;
        HashMap hashMap2 = new HashMap();
        f40869b = hashMap2;
        Integer f = C0015b.m87f(hashMap, -1, "Too many sessions are running for current app, existing sessions must be resolved first.", -2, "A requested module is not available (to this user/device, for the installed apk).");
        Integer f2 = C0015b.m87f(hashMap, -3, "Request is otherwise invalid.", -4, "Requested session is not found.");
        Integer f3 = C0015b.m87f(hashMap, -5, "Split Install API is not available.", -6, "Network error: unable to obtain split details.");
        Integer f4 = C0015b.m87f(hashMap, -7, "Download not permitted under current device circumstances (e.g. in background).", -8, "Requested session contains modules from an existing active session and also new modules.");
        Integer f5 = C0015b.m87f(hashMap, -9, "Service handling split install has died.", -10, "Install failed due to insufficient storage.");
        Integer f6 = C0015b.m87f(hashMap, -15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "Unknown error processing split install.");
        hashMap2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        hashMap2.put(f, "MODULE_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(f2, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(f3, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(f4, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        hashMap2.put(-9, "SERVICE_DIED");
        hashMap2.put(f5, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        hashMap2.put(C0015b.m87f(hashMap, -11, "Signature verification error when invoking SplitCompat.", -12, "Error in SplitCompat emulation."), "SPLITCOMPAT_EMULATION_ERROR");
        hashMap2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        hashMap2.put(C0015b.m87f(hashMap, -13, "Error in copying files for SplitCompat.", -14, "The Play Store app is either not installed or not the official version."), "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-15, "APP_NOT_OWNED");
        hashMap2.put(f6, "INTERNAL_ERROR");
        for (Map.Entry entry : hashMap2.entrySet()) {
            f40870c.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }
}

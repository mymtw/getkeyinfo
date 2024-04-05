package p630nl;

import java.util.HashMap;
import p003a2.C0015b;

/* renamed from: nl.a */
public final class C18272a {

    /* renamed from: a */
    public static final HashMap f40103a;

    /* renamed from: b */
    public static final HashMap f40104b;

    static {
        HashMap hashMap = new HashMap();
        f40103a = hashMap;
        HashMap hashMap2 = new HashMap();
        f40104b = hashMap2;
        Integer f = C0015b.m87f(hashMap, -2, "An unknown error occurred.", -3, "The API is not available on this device.");
        Integer f2 = C0015b.m87f(hashMap, -4, "The request that was sent by the app is malformed.", -5, "The install is unavailable to this user or device.");
        Integer f3 = C0015b.m87f(hashMap, -6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", -7, "The install/update has not been (fully) downloaded yet.");
        Integer f4 = C0015b.m87f(hashMap, -8, "The install is already in progress and there is no UI flow to resume.", -9, "The Play Store app is either not installed or not the official version.");
        Integer f5 = C0015b.m87f(hashMap, -10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "An internal error happened in the Play Store.");
        hashMap2.put(-2, "ERROR_UNKNOWN");
        hashMap2.put(f, "ERROR_API_NOT_AVAILABLE");
        hashMap2.put(-4, "ERROR_INVALID_REQUEST");
        hashMap2.put(f2, "ERROR_INSTALL_UNAVAILABLE");
        hashMap2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        hashMap2.put(f3, "ERROR_DOWNLOAD_NOT_PRESENT");
        hashMap2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        hashMap2.put(f5, "ERROR_INTERNAL_ERROR");
        hashMap2.put(f4, "ERROR_PLAY_STORE_NOT_FOUND");
        hashMap2.put(-10, "ERROR_APP_NOT_OWNED");
        hashMap2.put(f5, "ERROR_INTERNAL_ERROR");
    }
}

package p606kl;

import java.util.HashMap;
import p003a2.C0015b;

/* renamed from: kl.a */
public final class C18143a {

    /* renamed from: a */
    public static final HashMap f39608a;

    /* renamed from: b */
    public static final HashMap f39609b;

    static {
        HashMap hashMap = new HashMap();
        f39608a = hashMap;
        HashMap hashMap2 = new HashMap();
        f39609b = hashMap2;
        Integer f = C0015b.m87f(hashMap, -1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).", -2, "The requested pack is not available.");
        Integer f2 = C0015b.m87f(hashMap, -3, "The request is invalid.", -4, "The requested download is not found.");
        Integer f3 = C0015b.m87f(hashMap, -5, "The Asset Delivery API is not available.", -6, "Network error. Unable to obtain the asset pack details.");
        Integer f4 = C0015b.m87f(hashMap, -7, "Download not permitted under current device circumstances (e.g. in background).", -10, "Asset pack download failed due to insufficient storage.");
        Integer f5 = C0015b.m87f(hashMap, -11, "The Play Store app is either not installed or not the official version.", -12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        Integer f6 = C0015b.m87f(hashMap, -13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "Unknown error downloading an asset pack.");
        hashMap2.put(-1, "APP_UNAVAILABLE");
        hashMap2.put(f, "PACK_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(f2, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(f3, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(f4, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(f5, "NETWORK_UNRESTRICTED");
        hashMap2.put(-13, "APP_NOT_OWNED");
        hashMap2.put(f6, "INTERNAL_ERROR");
    }
}

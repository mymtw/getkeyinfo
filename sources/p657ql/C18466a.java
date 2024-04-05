package p657ql;

import java.util.HashMap;
import p003a2.C0015b;

/* renamed from: ql.a */
public final class C18466a {

    /* renamed from: a */
    public static final HashMap f40669a;

    /* renamed from: b */
    public static final HashMap f40670b;

    static {
        HashMap hashMap = new HashMap();
        f40669a = hashMap;
        HashMap hashMap2 = new HashMap();
        f40670b = hashMap2;
        Integer f = C0015b.m87f(hashMap, -1, "The Play Store app is either not installed or not the official version.", -2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(f, "INVALID_REQUEST");
    }
}

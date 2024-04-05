package com.google.ads.conversiontracking;

import android.annotation.TargetApi;
import java.util.HashMap;

@TargetApi(4)
/* renamed from: com.google.ads.conversiontracking.g */
public final class C12619g {

    /* renamed from: a */
    public static final HashMap f27836a = new HashMap();

    /* renamed from: com.google.ads.conversiontracking.g$a */
    public static class C12620a {

        /* renamed from: a */
        public final String f27837a;

        /* renamed from: b */
        public final String f27838b;

        /* renamed from: c */
        public final long f27839c;

        public C12620a(String str, String str2, long j) {
            this.f27837a = str;
            this.f27838b = str2;
            this.f27839c = j;
        }
    }

    /* renamed from: com.google.ads.conversiontracking.g$b */
    public static class C12621b {

        /* renamed from: a */
        public final String f27840a;

        /* renamed from: b */
        public final C12620a f27841b;

        public C12621b(String str, C12620a aVar) {
            this.f27840a = str;
            this.f27841b = aVar;
        }
    }

    /* renamed from: com.google.ads.conversiontracking.g$d */
    public enum C12622d {
        DOUBLECLICK_AUDIENCE,
        DOUBLECLICK_CONVERSION,
        GOOGLE_CONVERSION,
        IAP_CONVERSION;

        /* renamed from: a */
        public static C12622d[] m20299a() {
            return (C12622d[]) f27846e.clone();
        }
    }
}

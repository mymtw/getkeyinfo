package com.facebook;

import com.facebook.internal.FeatureManager;
import java.util.Random;
import p408ng.C13115a;
import p453tf.C13418j;
import p568fn.C17782b;

public class FacebookException extends RuntimeException {
    public static final C12187b Companion = new C12187b();
    public static final long serialVersionUID = 1;

    /* renamed from: com.facebook.FacebookException$a */
    public static final class C12186a implements FeatureManager.C12256a {

        /* renamed from: b */
        public final /* synthetic */ String f27219b;

        public C12186a(String str) {
            this.f27219b = str;
        }

        /* renamed from: n */
        public final void mo20n(boolean z) {
            if (z) {
                try {
                    C13115a aVar = new C13115a(this.f27219b);
                    if ((aVar.f28839b == null || aVar.f28840c == null) ? false : true) {
                        C17782b.m29889u0(aVar.f28838a, aVar.toString());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.facebook.FacebookException$b */
    public static final class C12187b {
    }

    public FacebookException() {
    }

    public String toString() {
        String message = getMessage();
        return message != null ? message : "";
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str != null && C13418j.m21113i() && random.nextInt(100) > 50) {
            FeatureManager.m20098a(new C12186a(str), FeatureManager.Feature.ErrorReport);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FacebookException(java.lang.String r3, java.lang.Object... r4) {
        /*
            r2 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            if (r3 == 0) goto L_0x0014
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            int r0 = r4.length
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            java.lang.String r3 = androidx.compose.animation.C0388a.m1049e(r4, r0, r3, r1)
            goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            r2.<init>((java.lang.String) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookException.<init>(java.lang.String, java.lang.Object[]):void");
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}

package com.etsy.android.p327ui.search.p330v2;

import android.os.Build;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.network.Connectivity;
import kotlin.jvm.internal.C19383o;
import p425q9.C13267q;

/* renamed from: com.etsy.android.ui.search.v2.c */
public final class C10971c {

    /* renamed from: a */
    public final C13267q f24330a;

    /* renamed from: b */
    public final Connectivity f24331b;

    /* renamed from: c */
    public final C10972a f24332c;

    /* renamed from: d */
    public final String f24333d;

    /* renamed from: com.etsy.android.ui.search.v2.c$a */
    public static final class C10972a {

        /* renamed from: a */
        public final String f24334a;

        /* renamed from: b */
        public final String f24335b;

        public C10972a() {
            this(0);
        }

        public C10972a(int i) {
            String str = Build.MANUFACTURER;
            C19383o.m32796f(str, "MANUFACTURER");
            String str2 = Build.MODEL;
            C19383o.m32796f(str2, "MODEL");
            this.f24334a = str;
            this.f24335b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10972a)) {
                return false;
            }
            C10972a aVar = (C10972a) obj;
            return C19383o.m32792b(this.f24334a, aVar.f24334a) && C19383o.m32792b(this.f24335b, aVar.f24335b);
        }

        public final int hashCode() {
            return this.f24335b.hashCode() + (this.f24334a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("BuildInfo(manufacturer=");
            h.append(this.f24334a);
            h.append(", model=");
            return C0391c.m1057c(h, this.f24335b, ')');
        }
    }

    public C10971c(C13267q qVar, Connectivity connectivity, C10972a aVar) {
        C19383o.m32797g(qVar, "sessionTimeManager");
        C19383o.m32797g(connectivity, "connectivity");
        C19383o.m32797g(aVar, "buildInfo");
        this.f24330a = qVar;
        this.f24331b = connectivity;
        this.f24332c = aVar;
        this.f24333d = aVar.f24334a + ' ' + aVar.f24335b;
    }

    /* renamed from: a */
    public static String m18950a(String str) {
        return "buyer_features[" + str + ']';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10971c)) {
            return false;
        }
        C10971c cVar = (C10971c) obj;
        return C19383o.m32792b(this.f24330a, cVar.f24330a) && C19383o.m32792b(this.f24331b, cVar.f24331b) && C19383o.m32792b(this.f24332c, cVar.f24332c);
    }

    public final int hashCode() {
        int hashCode = this.f24331b.hashCode();
        return this.f24332c.hashCode() + ((hashCode + (this.f24330a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchBuyerFeatures(sessionTimeManager=");
        h.append(this.f24330a);
        h.append(", connectivity=");
        h.append(this.f24331b);
        h.append(", buildInfo=");
        h.append(this.f24332c);
        h.append(')');
        return h.toString();
    }
}

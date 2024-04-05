package com.etsy.android.p327ui.cardview.clickhandlers;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.m */
public abstract class C9130m {

    /* renamed from: com.etsy.android.ui.cardview.clickhandlers.m$a */
    public static final class C9131a extends C9130m {

        /* renamed from: a */
        public final long f20061a;

        /* renamed from: b */
        public final Map<AnalyticsProperty, Object> f20062b;

        public C9131a(long j, Map<AnalyticsProperty, ? extends Object> map) {
            C19383o.m32797g(map, "trackingParameters");
            this.f20061a = j;
            this.f20062b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9131a)) {
                return false;
            }
            C9131a aVar = (C9131a) obj;
            return this.f20061a == aVar.f20061a && C19383o.m32792b(this.f20062b, aVar.f20062b);
        }

        public final int hashCode() {
            return this.f20062b.hashCode() + (Long.hashCode(this.f20061a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ViewReceiptClick(receiptId=");
            h.append(this.f20061a);
            h.append(", trackingParameters=");
            h.append(this.f20062b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.cardview.clickhandlers.m$b */
    public static final class C9132b extends C9130m {

        /* renamed from: a */
        public final long f20063a;

        /* renamed from: b */
        public final long f20064b;

        /* renamed from: c */
        public final Map<AnalyticsProperty, Object> f20065c;

        public C9132b(long j, long j2, Map<AnalyticsProperty, ? extends Object> map) {
            C19383o.m32797g(map, "trackingParameters");
            this.f20063a = j;
            this.f20064b = j2;
            this.f20065c = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9132b)) {
                return false;
            }
            C9132b bVar = (C9132b) obj;
            return this.f20063a == bVar.f20063a && this.f20064b == bVar.f20064b && C19383o.m32792b(this.f20065c, bVar.f20065c);
        }

        public final int hashCode() {
            return this.f20065c.hashCode() + C0071c.m190b(this.f20064b, Long.hashCode(this.f20063a) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ViewTrackingClick(receiptId=");
            h.append(this.f20063a);
            h.append(", transactionId=");
            h.append(this.f20064b);
            h.append(", trackingParameters=");
            h.append(this.f20065c);
            h.append(')');
            return h.toString();
        }
    }
}

package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.inappnotifications.v */
public abstract class C11580v {

    /* renamed from: com.etsy.android.ui.user.inappnotifications.v$a */
    public static final class C11581a extends C11580v {

        /* renamed from: a */
        public final long f25668a;

        /* renamed from: b */
        public final String f25669b;

        /* renamed from: c */
        public final boolean f25670c;

        public C11581a(long j, String str, boolean z) {
            C19383o.m32797g(str, "shopName");
            this.f25668a = j;
            this.f25669b = str;
            this.f25670c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11581a)) {
                return false;
            }
            C11581a aVar = (C11581a) obj;
            return this.f25668a == aVar.f25668a && C19383o.m32792b(this.f25669b, aVar.f25669b) && this.f25670c == aVar.f25670c;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f25669b, Long.hashCode(this.f25668a) * 31, 31);
            boolean z = this.f25670c;
            if (z) {
                z = true;
            }
            return e + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Favorite(shopUserId=");
            h.append(this.f25668a);
            h.append(", shopName=");
            h.append(this.f25669b);
            h.append(", isFavorite=");
            return C0391c.m1058d(h, this.f25670c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.v$b */
    public static final class C11582b extends C11580v {

        /* renamed from: a */
        public final long f25671a;

        public C11582b(long j) {
            this.f25671a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11582b) && this.f25671a == ((C11582b) obj).f25671a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f25671a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("ShopClick(shopId="), this.f25671a, ')');
        }
    }
}

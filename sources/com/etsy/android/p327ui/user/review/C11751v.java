package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.v */
public interface C11751v {

    /* renamed from: com.etsy.android.ui.user.review.v$a */
    public static final class C11752a implements C11751v {

        /* renamed from: a */
        public final String f26188a;

        /* renamed from: b */
        public final Integer f26189b;

        /* renamed from: c */
        public final Throwable f26190c;

        public C11752a() {
            this((String) null, (Integer) null, 7);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C11752a(String str, Integer num, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (Throwable) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11752a)) {
                return false;
            }
            C11752a aVar = (C11752a) obj;
            return C19383o.m32792b(this.f26188a, aVar.f26188a) && C19383o.m32792b(this.f26189b, aVar.f26189b) && C19383o.m32792b(this.f26190c, aVar.f26190c);
        }

        public final int hashCode() {
            String str = this.f26188a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f26189b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Throwable th = this.f26190c;
            if (th != null) {
                i = th.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f26188a);
            h.append(", code=");
            h.append(this.f26189b);
            h.append(", error=");
            return C0070b.m185h(h, this.f26190c, ')');
        }

        public C11752a(String str, Integer num, Throwable th) {
            this.f26188a = str;
            this.f26189b = num;
            this.f26190c = th;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.v$b */
    public static final class C11753b implements C11751v {

        /* renamed from: a */
        public static final C11753b f26191a = new C11753b();
    }
}

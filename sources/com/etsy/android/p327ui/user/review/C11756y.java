package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.y */
public abstract class C11756y {

    /* renamed from: a */
    public final long f26194a;

    /* renamed from: b */
    public final List<Long> f26195b;

    /* renamed from: com.etsy.android.ui.user.review.y$a */
    public static final class C11757a extends C11756y {

        /* renamed from: c */
        public final long f26196c;

        /* renamed from: d */
        public final List<Long> f26197d;

        public C11757a(long j, List<Long> list) {
            super(j, list);
            this.f26196c = j;
            this.f26197d = list;
        }

        /* renamed from: a */
        public final long mo37997a() {
            return this.f26196c;
        }

        /* renamed from: b */
        public final List<Long> mo37998b() {
            return this.f26197d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11757a)) {
                return false;
            }
            C11757a aVar = (C11757a) obj;
            return this.f26196c == aVar.f26196c && C19383o.m32792b(this.f26197d, aVar.f26197d);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f26196c) * 31;
            List<Long> list = this.f26197d;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CardClicked(transactionId=");
            h.append(this.f26196c);
            h.append(", transactionIds=");
            return C0070b.m186i(h, this.f26197d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.y$b */
    public static final class C11758b extends C11756y {

        /* renamed from: c */
        public final long f26198c;

        /* renamed from: d */
        public final List<Long> f26199d;

        /* renamed from: e */
        public final int f26200e;

        public C11758b(long j, List<Long> list, int i) {
            super(j, list);
            this.f26198c = j;
            this.f26199d = list;
            this.f26200e = i;
        }

        /* renamed from: a */
        public final long mo37997a() {
            return this.f26198c;
        }

        /* renamed from: b */
        public final List<Long> mo37998b() {
            return this.f26199d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11758b)) {
                return false;
            }
            C11758b bVar = (C11758b) obj;
            return this.f26198c == bVar.f26198c && C19383o.m32792b(this.f26199d, bVar.f26199d) && this.f26200e == bVar.f26200e;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f26198c) * 31;
            List<Long> list = this.f26199d;
            return Integer.hashCode(this.f26200e) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("StarClicked(transactionId=");
            h.append(this.f26198c);
            h.append(", transactionIds=");
            h.append(this.f26199d);
            h.append(", rating=");
            return C0073e.m208h(h, this.f26200e, ')');
        }
    }

    public C11756y() {
        throw null;
    }

    public C11756y(long j, List list) {
        this.f26194a = j;
        this.f26195b = list;
    }

    /* renamed from: a */
    public long mo37997a() {
        return this.f26194a;
    }

    /* renamed from: b */
    public List<Long> mo37998b() {
        return this.f26195b;
    }
}

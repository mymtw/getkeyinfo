package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p569fo.C17783a;

/* renamed from: com.etsy.android.ui.user.review.t */
public abstract class C11745t {

    /* renamed from: com.etsy.android.ui.user.review.t$a */
    public static final class C11746a extends C11745t {

        /* renamed from: a */
        public final String f26178a;

        /* renamed from: b */
        public final List<C17783a> f26179b;

        public C11746a(String str, List<C17783a> list) {
            C19383o.m32797g(str, "requestId");
            this.f26178a = str;
            this.f26179b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11746a)) {
                return false;
            }
            C11746a aVar = (C11746a) obj;
            return C19383o.m32792b(this.f26178a, aVar.f26178a) && C19383o.m32792b(this.f26179b, aVar.f26179b);
        }

        public final int hashCode() {
            int hashCode = this.f26178a.hashCode() * 31;
            List<C17783a> list = this.f26179b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Cancelled(requestId=");
            h.append(this.f26178a);
            h.append(", trackTransformationInfo=");
            return C0070b.m186i(h, this.f26179b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.t$b */
    public static final class C11747b extends C11745t {

        /* renamed from: a */
        public final String f26180a;

        /* renamed from: b */
        public final List<C17783a> f26181b;

        public C11747b(String str, List<C17783a> list) {
            C19383o.m32797g(str, "requestId");
            this.f26180a = str;
            this.f26181b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11747b)) {
                return false;
            }
            C11747b bVar = (C11747b) obj;
            return C19383o.m32792b(this.f26180a, bVar.f26180a) && C19383o.m32792b(this.f26181b, bVar.f26181b);
        }

        public final int hashCode() {
            int hashCode = this.f26180a.hashCode() * 31;
            List<C17783a> list = this.f26181b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Complete(requestId=");
            h.append(this.f26180a);
            h.append(", trackTransformationInfo=");
            return C0070b.m186i(h, this.f26181b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.t$c */
    public static final class C11748c extends C11745t {

        /* renamed from: a */
        public final String f26182a;

        /* renamed from: b */
        public final Throwable f26183b;

        /* renamed from: c */
        public final List<C17783a> f26184c;

        public C11748c(String str, Throwable th, List<C17783a> list) {
            C19383o.m32797g(str, "requestId");
            this.f26182a = str;
            this.f26183b = th;
            this.f26184c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11748c)) {
                return false;
            }
            C11748c cVar = (C11748c) obj;
            return C19383o.m32792b(this.f26182a, cVar.f26182a) && C19383o.m32792b(this.f26183b, cVar.f26183b) && C19383o.m32792b(this.f26184c, cVar.f26184c);
        }

        public final int hashCode() {
            int hashCode = this.f26182a.hashCode() * 31;
            Throwable th = this.f26183b;
            int i = 0;
            int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
            List<C17783a> list = this.f26184c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(requestId=");
            h.append(this.f26182a);
            h.append(", cause=");
            h.append(this.f26183b);
            h.append(", trackTransformationInfo=");
            return C0070b.m186i(h, this.f26184c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.t$d */
    public static final class C11749d extends C11745t {

        /* renamed from: a */
        public final String f26185a;

        /* renamed from: b */
        public final float f26186b;

        public C11749d(String str, float f) {
            C19383o.m32797g(str, "requestId");
            this.f26185a = str;
            this.f26186b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11749d)) {
                return false;
            }
            C11749d dVar = (C11749d) obj;
            return C19383o.m32792b(this.f26185a, dVar.f26185a) && C19383o.m32792b(Float.valueOf(this.f26186b), Float.valueOf(dVar.f26186b));
        }

        public final int hashCode() {
            return Float.hashCode(this.f26186b) + (this.f26185a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("InProgress(requestId=");
            h.append(this.f26185a);
            h.append(", progress=");
            return C0388a.m1048d(h, this.f26186b, ')');
        }
    }
}

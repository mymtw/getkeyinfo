package com.etsy.android.p327ui.user.circles;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.circles.d */
public abstract class C11509d {

    /* renamed from: com.etsy.android.ui.user.circles.d$a */
    public static final class C11510a extends C11509d {

        /* renamed from: a */
        public final Throwable f25393a;

        /* renamed from: b */
        public final C11512e f25394b;

        public C11510a(Exception exc, C11512e eVar) {
            C19383o.m32797g(eVar, "spec");
            this.f25393a = exc;
            this.f25394b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11510a)) {
                return false;
            }
            C11510a aVar = (C11510a) obj;
            return C19383o.m32792b(this.f25393a, aVar.f25393a) && C19383o.m32792b(this.f25394b, aVar.f25394b);
        }

        public final int hashCode() {
            Throwable th = this.f25393a;
            return this.f25394b.hashCode() + ((th == null ? 0 : th.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(throwable=");
            h.append(this.f25393a);
            h.append(", spec=");
            h.append(this.f25394b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.circles.d$b */
    public static final class C11511b extends C11509d {

        /* renamed from: a */
        public final List<C11506a> f25395a;

        /* renamed from: b */
        public final int f25396b;

        /* renamed from: c */
        public final C11512e f25397c;

        public C11511b(ArrayList arrayList, int i, C11512e eVar) {
            C19383o.m32797g(eVar, "spec");
            this.f25395a = arrayList;
            this.f25396b = i;
            this.f25397c = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11511b)) {
                return false;
            }
            C11511b bVar = (C11511b) obj;
            return C19383o.m32792b(this.f25395a, bVar.f25395a) && this.f25396b == bVar.f25396b && C19383o.m32792b(this.f25397c, bVar.f25397c);
        }

        public final int hashCode() {
            return this.f25397c.hashCode() + C0069a.m170a(this.f25396b, this.f25395a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(users=");
            h.append(this.f25395a);
            h.append(", maxUsers=");
            h.append(this.f25396b);
            h.append(", spec=");
            h.append(this.f25397c);
            h.append(')');
            return h.toString();
        }
    }
}

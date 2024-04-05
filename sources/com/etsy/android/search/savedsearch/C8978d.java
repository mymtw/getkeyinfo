package com.etsy.android.search.savedsearch;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.vespa.ListSectionActionResult;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.search.savedsearch.d */
public interface C8978d {

    /* renamed from: com.etsy.android.search.savedsearch.d$a */
    public static final class C8979a implements C8978d {

        /* renamed from: a */
        public final String f19817a;

        /* renamed from: b */
        public final int f19818b;

        /* renamed from: c */
        public final Throwable f19819c;

        public C8979a(String str, int i, Throwable th) {
            this.f19817a = str;
            this.f19818b = i;
            this.f19819c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8979a)) {
                return false;
            }
            C8979a aVar = (C8979a) obj;
            return C19383o.m32792b(this.f19817a, aVar.f19817a) && this.f19818b == aVar.f19818b && C19383o.m32792b(this.f19819c, aVar.f19819c);
        }

        public final int hashCode() {
            String str = this.f19817a;
            int i = 0;
            int a = C0069a.m170a(this.f19818b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f19819c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f19817a);
            h.append(", code=");
            h.append(this.f19818b);
            h.append(", exception=");
            return C0070b.m185h(h, this.f19819c, ')');
        }
    }

    /* renamed from: com.etsy.android.search.savedsearch.d$b */
    public static final class C8980b implements C8978d {

        /* renamed from: a */
        public final ListSectionActionResult f19820a;

        public C8980b(ListSectionActionResult listSectionActionResult) {
            this.f19820a = listSectionActionResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8980b) && C19383o.m32792b(this.f19820a, ((C8980b) obj).f19820a);
        }

        public final int hashCode() {
            return this.f19820a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(serverDrivenResult=");
            h.append(this.f19820a);
            h.append(')');
            return h.toString();
        }
    }
}

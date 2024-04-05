package androidx.compose.foundation.text.selection;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;

/* renamed from: androidx.compose.foundation.text.selection.g */
public final class C1011g {

    /* renamed from: a */
    public final C1012a f2121a;

    /* renamed from: b */
    public final C1012a f2122b;

    /* renamed from: c */
    public final boolean f2123c;

    /* renamed from: androidx.compose.foundation.text.selection.g$a */
    public static final class C1012a {

        /* renamed from: a */
        public final ResolvedTextDirection f2124a;

        /* renamed from: b */
        public final int f2125b;

        /* renamed from: c */
        public final long f2126c;

        public C1012a(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            C19383o.m32797g(resolvedTextDirection, "direction");
            this.f2124a = resolvedTextDirection;
            this.f2125b = i;
            this.f2126c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1012a)) {
                return false;
            }
            C1012a aVar = (C1012a) obj;
            return this.f2124a == aVar.f2124a && this.f2125b == aVar.f2125b && this.f2126c == aVar.f2126c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f2126c) + C0069a.m170a(this.f2125b, this.f2124a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AnchorInfo(direction=");
            h.append(this.f2124a);
            h.append(", offset=");
            h.append(this.f2125b);
            h.append(", selectableId=");
            return C0015b.m91j(h, this.f2126c, ')');
        }
    }

    public C1011g(C1012a aVar, C1012a aVar2, boolean z) {
        this.f2121a = aVar;
        this.f2122b = aVar2;
        this.f2123c = z;
    }

    /* renamed from: a */
    public static C1011g m2102a(C1011g gVar, C1012a aVar, C1012a aVar2, int i) {
        if ((i & 1) != 0) {
            aVar = gVar.f2121a;
        }
        if ((i & 2) != 0) {
            aVar2 = gVar.f2122b;
        }
        boolean z = (i & 4) != 0 ? gVar.f2123c : false;
        gVar.getClass();
        C19383o.m32797g(aVar, "start");
        C19383o.m32797g(aVar2, ResponseConstants.PROMOTION_END);
        return new C1011g(aVar, aVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1011g)) {
            return false;
        }
        C1011g gVar = (C1011g) obj;
        return C19383o.m32792b(this.f2121a, gVar.f2121a) && C19383o.m32792b(this.f2122b, gVar.f2122b) && this.f2123c == gVar.f2123c;
    }

    public final int hashCode() {
        int hashCode = (this.f2122b.hashCode() + (this.f2121a.hashCode() * 31)) * 31;
        boolean z = this.f2123c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Selection(start=");
        h.append(this.f2121a);
        h.append(", end=");
        h.append(this.f2122b);
        h.append(", handlesCrossed=");
        return C0391c.m1058d(h, this.f2123c, ')');
    }
}

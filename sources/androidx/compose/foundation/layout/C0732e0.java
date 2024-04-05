package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;

/* renamed from: androidx.compose.foundation.layout.e0 */
public final class C0732e0 implements C0736g0 {

    /* renamed from: a */
    public final String f1496a;

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f1497b;

    public C0732e0(C0754q qVar, String str) {
        this.f1496a = str;
        this.f1497b = C0761x.m1751w0(qVar, C1351n1.f2948a);
    }

    /* renamed from: a */
    public final int mo4082a(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        return mo4112e().f1546b;
    }

    /* renamed from: b */
    public final int mo4083b(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        return mo4112e().f1548d;
    }

    /* renamed from: c */
    public final int mo4084c(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return mo4112e().f1545a;
    }

    /* renamed from: d */
    public final int mo4085d(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return mo4112e().f1547c;
    }

    /* renamed from: e */
    public final C0754q mo4112e() {
        return (C0754q) this.f1497b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0732e0)) {
            return false;
        }
        return C19383o.m32792b(mo4112e(), ((C0732e0) obj).mo4112e());
    }

    public final int hashCode() {
        return this.f1496a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1496a);
        sb.append("(left=");
        sb.append(mo4112e().f1545a);
        sb.append(", top=");
        sb.append(mo4112e().f1546b);
        sb.append(", right=");
        sb.append(mo4112e().f1547c);
        sb.append(", bottom=");
        return C0073e.m208h(sb, mo4112e().f1548d, ')');
    }
}

package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.core.view.C2348w0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p289y0.C8352d;

/* renamed from: androidx.compose.foundation.layout.c */
public final class C0716c implements C0736g0 {

    /* renamed from: a */
    public final int f1471a;

    /* renamed from: b */
    public final String f1472b;

    /* renamed from: c */
    public final ParcelableSnapshotMutableState f1473c = C0761x.m1751w0(C8352d.f18319e, C1351n1.f2948a);

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f1474d = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);

    public C0716c(int i, String str) {
        this.f1471a = i;
        this.f1472b = str;
    }

    /* renamed from: a */
    public final int mo4082a(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        return mo4086e().f18321b;
    }

    /* renamed from: b */
    public final int mo4083b(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        return mo4086e().f18323d;
    }

    /* renamed from: c */
    public final int mo4084c(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return mo4086e().f18320a;
    }

    /* renamed from: d */
    public final int mo4085d(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return mo4086e().f18322c;
    }

    /* renamed from: e */
    public final C8352d mo4086e() {
        return (C8352d) this.f1473c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0716c)) {
            return false;
        }
        return this.f1471a == ((C0716c) obj).f1471a;
    }

    /* renamed from: f */
    public final void mo4088f(C2348w0 w0Var, int i) {
        C19383o.m32797g(w0Var, "windowInsetsCompat");
        if (i == 0 || (i & this.f1471a) != 0) {
            C8352d b = w0Var.mo8942b(this.f1471a);
            C19383o.m32797g(b, "<set-?>");
            this.f1473c.setValue(b);
            this.f1474d.setValue(Boolean.valueOf(w0Var.f5615a.mo8967p(this.f1471a)));
        }
    }

    public final int hashCode() {
        return this.f1471a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1472b);
        sb.append('(');
        sb.append(mo4086e().f18320a);
        sb.append(", ");
        sb.append(mo4086e().f18321b);
        sb.append(", ");
        sb.append(mo4086e().f18322c);
        sb.append(", ");
        return C0073e.m208h(sb, mo4086e().f18323d, ')');
    }
}

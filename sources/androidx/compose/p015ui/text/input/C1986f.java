package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.session.C0087d;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2022r;
import com.etsy.android.lib.models.editable.EditableListing;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p001a0.C0005b;

/* renamed from: androidx.compose.ui.text.input.f */
public final class C1986f {

    /* renamed from: a */
    public final C1997o f4470a;

    /* renamed from: b */
    public int f4471b;

    /* renamed from: c */
    public int f4472c;

    /* renamed from: d */
    public int f4473d = -1;

    /* renamed from: e */
    public int f4474e = -1;

    public C1986f(C1913a aVar, long j) {
        this.f4470a = new C1997o(aVar.f4296b);
        this.f4471b = C2022r.m4466e(j);
        this.f4472c = C2022r.m4465d(j);
        int e = C2022r.m4466e(j);
        int d = C2022r.m4465d(j);
        if (e < 0 || e > aVar.length()) {
            StringBuilder h = C0069a.m177h("start (", e, ") offset is outside of text region ");
            h.append(aVar.length());
            throw new IndexOutOfBoundsException(h.toString());
        } else if (d < 0 || d > aVar.length()) {
            StringBuilder h2 = C0069a.m177h("end (", d, ") offset is outside of text region ");
            h2.append(aVar.length());
            throw new IndexOutOfBoundsException(h2.toString());
        } else if (e > d) {
            throw new IllegalArgumentException(C0087d.m235e("Do not set reversed range: ", e, EditableListing.CATEGORY_PATH_JOIN_STRING, d));
        }
    }

    /* renamed from: a */
    public final void mo7658a(int i, int i2) {
        long l = C0005b.m47l(i, i2);
        this.f4470a.mo7686b(i, i2, "");
        long k0 = C19421p.m32943k0(C0005b.m47l(this.f4471b, this.f4472c), l);
        this.f4471b = C2022r.m4466e(k0);
        this.f4472c = C2022r.m4465d(k0);
        int i3 = this.f4473d;
        if (i3 != -1) {
            long k02 = C19421p.m32943k0(C0005b.m47l(i3, this.f4474e), l);
            if (C2022r.m4463b(k02)) {
                this.f4473d = -1;
                this.f4474e = -1;
                return;
            }
            this.f4473d = C2022r.m4466e(k02);
            this.f4474e = C2022r.m4465d(k02);
        }
    }

    /* renamed from: b */
    public final char mo7659b(int i) {
        C1997o oVar = this.f4470a;
        C1988h hVar = oVar.f4514b;
        if (hVar == null) {
            return oVar.f4513a.charAt(i);
        }
        int i2 = oVar.f4515c;
        if (i < i2) {
            return oVar.f4513a.charAt(i);
        }
        int i3 = hVar.f4475a;
        int i4 = hVar.f4478d;
        int i5 = hVar.f4477c;
        int i6 = i3 - (i4 - i5);
        if (i >= i6 + i2) {
            return oVar.f4513a.charAt(i - ((i6 - oVar.f4516d) + i2));
        }
        int i7 = i - i2;
        return i7 < i5 ? hVar.f4476b[i7] : hVar.f4476b[(i7 - i5) + i4];
    }

    /* renamed from: c */
    public final int mo7660c() {
        return this.f4470a.mo7685a();
    }

    /* renamed from: d */
    public final void mo7661d(int i, int i2, String str) {
        C19383o.m32797g(str, "text");
        if (i < 0 || i > this.f4470a.mo7685a()) {
            StringBuilder h = C0069a.m177h("start (", i, ") offset is outside of text region ");
            h.append(this.f4470a.mo7685a());
            throw new IndexOutOfBoundsException(h.toString());
        } else if (i2 < 0 || i2 > this.f4470a.mo7685a()) {
            StringBuilder h2 = C0069a.m177h("end (", i2, ") offset is outside of text region ");
            h2.append(this.f4470a.mo7685a());
            throw new IndexOutOfBoundsException(h2.toString());
        } else if (i <= i2) {
            this.f4470a.mo7686b(i, i2, str);
            this.f4471b = str.length() + i;
            this.f4472c = str.length() + i;
            this.f4473d = -1;
            this.f4474e = -1;
        } else {
            throw new IllegalArgumentException(C0087d.m235e("Do not set reversed range: ", i, EditableListing.CATEGORY_PATH_JOIN_STRING, i2));
        }
    }

    /* renamed from: e */
    public final void mo7662e(int i, int i2) {
        if (i < 0 || i > this.f4470a.mo7685a()) {
            StringBuilder h = C0069a.m177h("start (", i, ") offset is outside of text region ");
            h.append(this.f4470a.mo7685a());
            throw new IndexOutOfBoundsException(h.toString());
        } else if (i2 < 0 || i2 > this.f4470a.mo7685a()) {
            StringBuilder h2 = C0069a.m177h("end (", i2, ") offset is outside of text region ");
            h2.append(this.f4470a.mo7685a());
            throw new IndexOutOfBoundsException(h2.toString());
        } else if (i < i2) {
            this.f4473d = i;
            this.f4474e = i2;
        } else {
            throw new IllegalArgumentException(C0087d.m235e("Do not set reversed or empty range: ", i, EditableListing.CATEGORY_PATH_JOIN_STRING, i2));
        }
    }

    /* renamed from: f */
    public final void mo7663f(int i, int i2) {
        if (i < 0 || i > this.f4470a.mo7685a()) {
            StringBuilder h = C0069a.m177h("start (", i, ") offset is outside of text region ");
            h.append(this.f4470a.mo7685a());
            throw new IndexOutOfBoundsException(h.toString());
        } else if (i2 < 0 || i2 > this.f4470a.mo7685a()) {
            StringBuilder h2 = C0069a.m177h("end (", i2, ") offset is outside of text region ");
            h2.append(this.f4470a.mo7685a());
            throw new IndexOutOfBoundsException(h2.toString());
        } else if (i <= i2) {
            this.f4471b = i;
            this.f4472c = i2;
        } else {
            throw new IllegalArgumentException(C0087d.m235e("Do not set reversed range: ", i, EditableListing.CATEGORY_PATH_JOIN_STRING, i2));
        }
    }

    public final String toString() {
        return this.f4470a.toString();
    }
}

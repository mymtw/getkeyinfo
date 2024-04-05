package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.h0 */
public final class C3156h0 {

    /* renamed from: a */
    public final C3158b f7268a;

    /* renamed from: b */
    public C3157a f7269b = new C3157a();

    /* renamed from: androidx.recyclerview.widget.h0$a */
    public static class C3157a {

        /* renamed from: a */
        public int f7270a = 0;

        /* renamed from: b */
        public int f7271b;

        /* renamed from: c */
        public int f7272c;

        /* renamed from: d */
        public int f7273d;

        /* renamed from: e */
        public int f7274e;

        /* renamed from: a */
        public final boolean mo11880a() {
            int i = this.f7270a;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.f7273d;
                int i4 = this.f7271b;
                if ((((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) << 0) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.f7273d;
                int i6 = this.f7272c;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.f7274e;
                int i8 = this.f7271b;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.f7274e;
                int i10 = this.f7272c;
                if (i9 > i10) {
                    i2 = 1;
                } else if (i9 != i10) {
                    i2 = 4;
                }
                if ((i & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h0$b */
    public interface C3158b {
        /* renamed from: a */
        int mo11678a(View view);

        /* renamed from: b */
        int mo11679b();

        /* renamed from: c */
        int mo11680c();

        /* renamed from: d */
        View mo11681d(int i);

        /* renamed from: e */
        int mo11682e(View view);
    }

    public C3156h0(C3158b bVar) {
        this.f7268a = bVar;
    }

    /* renamed from: a */
    public final View mo11878a(int i, int i2, int i3, int i4) {
        int b = this.f7268a.mo11679b();
        int c = this.f7268a.mo11680c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View d = this.f7268a.mo11681d(i);
            int a = this.f7268a.mo11678a(d);
            int e = this.f7268a.mo11682e(d);
            C3157a aVar = this.f7269b;
            aVar.f7271b = b;
            aVar.f7272c = c;
            aVar.f7273d = a;
            aVar.f7274e = e;
            if (i3 != 0) {
                aVar.f7270a = i3 | 0;
                if (aVar.mo11880a()) {
                    return d;
                }
            }
            if (i4 != 0) {
                C3157a aVar2 = this.f7269b;
                aVar2.f7270a = i4 | 0;
                if (aVar2.mo11880a()) {
                    view = d;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public final boolean mo11879b(View view) {
        C3157a aVar = this.f7269b;
        int b = this.f7268a.mo11679b();
        int c = this.f7268a.mo11680c();
        int a = this.f7268a.mo11678a(view);
        int e = this.f7268a.mo11682e(view);
        aVar.f7271b = b;
        aVar.f7272c = c;
        aVar.f7273d = a;
        aVar.f7274e = e;
        C3157a aVar2 = this.f7269b;
        aVar2.f7270a = 24579 | 0;
        return aVar2.mo11880a();
    }
}

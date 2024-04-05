package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.emoji2.text.flatbuffer.C2677b;
import androidx.recyclerview.widget.RecyclerView;
import p001a0.C0005b;

/* renamed from: androidx.emoji2.text.l */
public final class C2689l {

    /* renamed from: a */
    public final C2677b f6058a;

    /* renamed from: b */
    public final char[] f6059b;

    /* renamed from: c */
    public final C2690a f6060c = new C2690a(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);

    /* renamed from: d */
    public final Typeface f6061d;

    /* renamed from: androidx.emoji2.text.l$a */
    public static class C2690a {

        /* renamed from: a */
        public final SparseArray<C2690a> f6062a;

        /* renamed from: b */
        public C2680h f6063b;

        public C2690a() {
            this(1);
        }

        /* renamed from: a */
        public final void mo10088a(C2680h hVar, int i, int i2) {
            int a = hVar.mo10074a(i);
            SparseArray<C2690a> sparseArray = this.f6062a;
            C2690a aVar = sparseArray == null ? null : sparseArray.get(a);
            if (aVar == null) {
                aVar = new C2690a();
                this.f6062a.put(hVar.mo10074a(i), aVar);
            }
            if (i2 > i) {
                aVar.mo10088a(hVar, i + 1, i2);
            } else {
                aVar.f6063b = hVar;
            }
        }

        public C2690a(int i) {
            this.f6062a = new SparseArray<>(i);
        }
    }

    public C2689l(Typeface typeface, C2677b bVar) {
        int i;
        int i2;
        this.f6061d = typeface;
        this.f6058a = bVar;
        int a = bVar.mo10072a(6);
        if (a != 0) {
            int i3 = a + bVar.f6027a;
            i = bVar.f6028b.getInt(bVar.f6028b.getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f6059b = new char[(i * 2)];
        int a2 = bVar.mo10072a(6);
        if (a2 != 0) {
            int i4 = a2 + bVar.f6027a;
            i2 = bVar.f6028b.getInt(bVar.f6028b.getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C2680h hVar = new C2680h(this, i5);
            Character.toChars(hVar.mo10076c(), this.f6059b, i5 * 2);
            C0005b.m20N(hVar.mo10075b() > 0, "invalid metadata codepoint length");
            this.f6060c.mo10088a(hVar, 0, hVar.mo10075b() - 1);
        }
    }
}

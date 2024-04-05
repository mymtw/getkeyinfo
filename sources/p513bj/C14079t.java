package p513bj;

import androidx.compose.p015ui.node.C1739f;
import androidx.compose.p015ui.text.android.C1921d;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bj.t */
public final class C14079t {

    /* renamed from: h */
    public static final C1921d f30993h = new C1921d(3);

    /* renamed from: i */
    public static final C1739f f30994i = new C1739f(3);

    /* renamed from: a */
    public final int f30995a;

    /* renamed from: b */
    public final ArrayList<C14080a> f30996b = new ArrayList<>();

    /* renamed from: c */
    public final C14080a[] f30997c = new C14080a[5];

    /* renamed from: d */
    public int f30998d = -1;

    /* renamed from: e */
    public int f30999e;

    /* renamed from: f */
    public int f31000f;

    /* renamed from: g */
    public int f31001g;

    /* renamed from: bj.t$a */
    public static class C14080a {

        /* renamed from: a */
        public int f31002a;

        /* renamed from: b */
        public int f31003b;

        /* renamed from: c */
        public float f31004c;
    }

    public C14079t(int i) {
        this.f30995a = i;
    }

    /* renamed from: a */
    public final void mo46946a(float f, int i) {
        C14080a aVar;
        if (this.f30998d != 1) {
            Collections.sort(this.f30996b, f30993h);
            this.f30998d = 1;
        }
        int i2 = this.f31001g;
        if (i2 > 0) {
            C14080a[] aVarArr = this.f30997c;
            int i3 = i2 - 1;
            this.f31001g = i3;
            aVar = aVarArr[i3];
        } else {
            aVar = new C14080a();
        }
        int i4 = this.f30999e;
        this.f30999e = i4 + 1;
        aVar.f31002a = i4;
        aVar.f31003b = i;
        aVar.f31004c = f;
        this.f30996b.add(aVar);
        this.f31000f += i;
        while (true) {
            int i5 = this.f31000f;
            int i6 = this.f30995a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C14080a aVar2 = this.f30996b.get(0);
                int i8 = aVar2.f31003b;
                if (i8 <= i7) {
                    this.f31000f -= i8;
                    this.f30996b.remove(0);
                    int i9 = this.f31001g;
                    if (i9 < 5) {
                        C14080a[] aVarArr2 = this.f30997c;
                        this.f31001g = i9 + 1;
                        aVarArr2[i9] = aVar2;
                    }
                } else {
                    aVar2.f31003b = i8 - i7;
                    this.f31000f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final float mo46947b() {
        if (this.f30998d != 0) {
            Collections.sort(this.f30996b, f30994i);
            this.f30998d = 0;
        }
        float f = 0.5f * ((float) this.f31000f);
        int i = 0;
        for (int i2 = 0; i2 < this.f30996b.size(); i2++) {
            C14080a aVar = this.f30996b.get(i2);
            i += aVar.f31003b;
            if (((float) i) >= f) {
                return aVar.f31004c;
            }
        }
        if (this.f30996b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C14080a> arrayList = this.f30996b;
        return arrayList.get(arrayList.size() - 1).f31004c;
    }
}

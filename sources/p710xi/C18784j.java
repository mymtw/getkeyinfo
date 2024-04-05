package p710xi;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.compose.p015ui.text.android.C1921d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p513bj.C14049b0;
import p513bj.C14075p;
import p636oi.C18296a;
import p636oi.C18300d;

/* renamed from: xi.j */
public final class C18784j implements C18300d {

    /* renamed from: b */
    public final List<C18775e> f41651b;

    /* renamed from: c */
    public final long[] f41652c;

    /* renamed from: d */
    public final long[] f41653d;

    public C18784j(ArrayList arrayList) {
        this.f41651b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f41652c = new long[(arrayList.size() * 2)];
        for (int i = 0; i < arrayList.size(); i++) {
            C18775e eVar = (C18775e) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f41652c;
            jArr[i2] = eVar.f41622b;
            jArr[i2 + 1] = eVar.f41623c;
        }
        long[] jArr2 = this.f41652c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f41653d = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public final int mo69841a(long j) {
        int b = C14049b0.m21629b(this.f41653d, j, false);
        if (b < this.f41653d.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: c */
    public final List<C18296a> mo69842c(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.f41651b.size(); i2++) {
            long[] jArr = this.f41652c;
            int i3 = i2 * 2;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                C18775e eVar = this.f41651b.get(i2);
                C18296a aVar = eVar.f41621a;
                if (aVar.f40151e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new C1921d(2));
        while (i < arrayList2.size()) {
            C18296a aVar2 = ((C18775e) arrayList2.get(i)).f41621a;
            aVar2.getClass();
            CharSequence charSequence = aVar2.f40147a;
            Bitmap bitmap = aVar2.f40150d;
            Layout.Alignment alignment = aVar2.f40148b;
            Layout.Alignment alignment2 = aVar2.f40149c;
            int i4 = aVar2.f40153g;
            float f = aVar2.f40154h;
            int i5 = aVar2.f40155i;
            int i6 = aVar2.f40160n;
            float f2 = aVar2.f40161o;
            float f3 = aVar2.f40156j;
            float f4 = aVar2.f40157k;
            boolean z = aVar2.f40158l;
            float f5 = f3;
            float f6 = (float) (-1 - i);
            C18296a aVar3 = r5;
            boolean z2 = z;
            C18296a aVar4 = new C18296a(charSequence, alignment, alignment2, bitmap, f6, 1, i4, f, i5, i6, f2, f5, f4, z2, aVar2.f40159m, aVar2.f40162p, aVar2.f40163q);
            arrayList.add(aVar3);
            i++;
        }
        return arrayList;
    }

    /* renamed from: e */
    public final long mo69843e(int i) {
        boolean z = true;
        C14075p.m21691c(i >= 0);
        if (i >= this.f41653d.length) {
            z = false;
        }
        C14075p.m21691c(z);
        return this.f41653d[i];
    }

    /* renamed from: f */
    public final int mo69844f() {
        return this.f41653d.length;
    }
}

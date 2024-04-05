package androidx.compose.p015ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.input.pointer.q */
public final class C1645q {

    /* renamed from: a */
    public final LinkedHashMap f3667a = new LinkedHashMap();

    /* renamed from: androidx.compose.ui.input.pointer.q$a */
    public static final class C1646a {

        /* renamed from: a */
        public final long f3668a;

        /* renamed from: b */
        public final long f3669b;

        /* renamed from: c */
        public final boolean f3670c;

        public C1646a(long j, long j2, boolean z) {
            this.f3668a = j;
            this.f3669b = j2;
            this.f3670c = z;
        }
    }

    /* renamed from: a */
    public final C1635g mo6617a(C1647r rVar, C1654y yVar) {
        boolean z;
        long j;
        long j2;
        int i;
        C1647r rVar2 = rVar;
        C1654y yVar2 = yVar;
        C19383o.m32797g(yVar2, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(rVar2.f3671a.size());
        List<C1648s> list = rVar2.f3671a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            C1648s sVar = list.get(i2);
            C1646a aVar = (C1646a) this.f3667a.get(new C1643o(sVar.f3673a));
            if (aVar == null) {
                j2 = sVar.f3674b;
                j = sVar.f3676d;
                z = false;
            } else {
                long j3 = aVar.f3668a;
                j2 = j3;
                z = aVar.f3670c;
                j = yVar2.m34775screenToLocalMKHz9U(aVar.f3669b);
            }
            long j4 = sVar.f3673a;
            linkedHashMap.put(new C1643o(j4), new C1644p(j4, sVar.f3674b, sVar.f3676d, sVar.f3677e, j2, j, z, sVar.f3678f, (List) sVar.f3680h, sVar.f3681i));
            boolean z2 = sVar.f3677e;
            if (z2) {
                i = i2;
                this.f3667a.put(new C1643o(sVar.f3673a), new C1646a(sVar.f3674b, sVar.f3675c, z2));
            } else {
                i = i2;
                this.f3667a.remove(new C1643o(sVar.f3673a));
            }
            i2 = i + 1;
        }
        return new C1635g(linkedHashMap, rVar2);
    }
}

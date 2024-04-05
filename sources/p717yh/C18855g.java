package p717yh;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14077r;
import p717yh.C18848e0;

/* renamed from: yh.g */
public final class C18855g implements C18848e0.C18851c {

    /* renamed from: a */
    public final int f41821a;

    /* renamed from: b */
    public final List<Format> f41822b;

    public C18855g(int i, List<Format> list) {
        this.f41821a = i;
        this.f41822b = list;
    }

    /* renamed from: a */
    public final C18848e0 mo70292a(int i, C18848e0.C18850b bVar) {
        if (i == 2) {
            return new C18874t(new C18859k(new C18854f0(mo70298b(bVar))));
        }
        if (i == 3 || i == 4) {
            return new C18874t(new C18871q(bVar.f41789a));
        }
        if (i == 21) {
            return new C18874t(new C18869o());
        }
        if (i != 27) {
            if (i == 36) {
                return new C18874t(new C18867n(new C18837a0(mo70298b(bVar))));
            }
            if (i == 89) {
                return new C18874t(new C18857i(bVar.f41790b));
            }
            if (i != 138) {
                if (i == 172) {
                    return new C18874t(new C18843d(bVar.f41789a));
                }
                if (i == 257) {
                    return new C18882z(new C18873s("application/vnd.dvb.ait"));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i != 134) {
                            if (i != 135) {
                                switch (i) {
                                    case 15:
                                        if (mo70299c(2)) {
                                            return null;
                                        }
                                        return new C18874t(new C18853f(false, bVar.f41789a));
                                    case 16:
                                        return new C18874t(new C18861l(new C18854f0(mo70298b(bVar))));
                                    case 17:
                                        if (mo70299c(2)) {
                                            return null;
                                        }
                                        return new C18874t(new C18870p(bVar.f41789a));
                                    default:
                                        return null;
                                }
                            }
                        } else if (mo70299c(16)) {
                            return null;
                        } else {
                            return new C18882z(new C18873s("application/x-scte35"));
                        }
                    } else if (!mo70299c(64)) {
                        return null;
                    }
                }
                return new C18874t(new C18838b(bVar.f41789a));
            }
            return new C18874t(new C18856h(bVar.f41789a));
        } else if (mo70299c(4)) {
            return null;
        } else {
            return new C18874t(new C18864m(new C18837a0(mo70298b(bVar)), mo70299c(1), mo70299c(8)));
        }
    }

    /* renamed from: b */
    public final List<Format> mo70298b(C18848e0.C18850b bVar) {
        ArrayList arrayList;
        String str;
        int i;
        if (mo70299c(32)) {
            return this.f41822b;
        }
        C14077r rVar = new C14077r(bVar.f41791c);
        List<Format> list = this.f41822b;
        while (rVar.f30988c - rVar.f30987b > 0) {
            int p = rVar.mo46925p();
            int p2 = rVar.f30987b + rVar.mo46925p();
            if (p == 134) {
                ArrayList arrayList2 = new ArrayList();
                int p3 = rVar.mo46925p() & 31;
                for (int i2 = 0; i2 < p3; i2++) {
                    String m = rVar.mo46922m(3);
                    int p4 = rVar.mo46925p();
                    boolean z = (p4 & 128) != 0;
                    if (z) {
                        i = p4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte p5 = (byte) rVar.mo46925p();
                    rVar.mo46909A(1);
                    List<byte[]> list2 = null;
                    if (z) {
                        list2 = Collections.singletonList((p5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    Format.C14176b bVar2 = new Format.C14176b();
                    bVar2.f31303k = str;
                    bVar2.f31295c = m;
                    bVar2.f31291C = i;
                    bVar2.f31305m = list2;
                    arrayList2.add(bVar2.mo47144a());
                }
                arrayList = arrayList2;
            } else {
                arrayList = list;
            }
            rVar.mo46935z(p2);
            list = arrayList;
        }
        return list;
    }

    /* renamed from: c */
    public final boolean mo70299c(int i) {
        return (i & this.f41821a) != 0;
    }
}

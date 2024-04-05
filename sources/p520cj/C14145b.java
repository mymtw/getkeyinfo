package p520cj;

import p513bj.C14077r;

/* renamed from: cj.b */
public final class C14145b {

    /* renamed from: a */
    public final String f31165a;

    public C14145b(String str) {
        this.f31165a = str;
    }

    /* renamed from: a */
    public static C14145b m21899a(C14077r rVar) {
        String str;
        rVar.mo46909A(2);
        int p = rVar.mo46925p();
        int i = p >> 1;
        int p2 = ((rVar.mo46925p() >> 3) & 31) | ((p & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = p2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(p2);
        return new C14145b(sb.toString());
    }
}

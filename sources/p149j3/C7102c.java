package p149j3;

import java.util.ArrayList;
import java.util.List;
import p003a2.C0023f;
import p167l3.C7243i;

/* renamed from: j3.c */
public final class C7102c {

    /* renamed from: a */
    public final List<C7243i> f15798a;

    /* renamed from: b */
    public final char f15799b;

    /* renamed from: c */
    public final double f15800c;

    /* renamed from: d */
    public final String f15801d;

    /* renamed from: e */
    public final String f15802e;

    public C7102c(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f15798a = arrayList;
        this.f15799b = c;
        this.f15800c = d;
        this.f15801d = str;
        this.f15802e = str2;
    }

    /* renamed from: a */
    public static int m13766a(char c, String str, String str2) {
        return str2.hashCode() + C0023f.m105e(str, (c + 0) * 31, 31);
    }

    public final int hashCode() {
        return m13766a(this.f15799b, this.f15802e, this.f15801d);
    }
}

package p171l7;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.util.HashMap;
import p003a2.C0015b;
import p007a6.C0040b;
import p161k6.C7199b;
import p169l5.C7267c;
import p179m5.C7333e;
import p179m5.C7335g;
import p179m5.C7336h;
import p181m7.C7339a;
import p181m7.C7346h;
import p244t5.C7959a;

/* renamed from: l7.c */
public final class C7277c {

    /* renamed from: a */
    public static final C7199b f16123a;

    /* renamed from: b */
    public static final C7199b f16124b;

    /* renamed from: c */
    public static final C7199b f16125c;

    /* renamed from: d */
    public static final C7199b f16126d;

    /* renamed from: e */
    public static final C7199b f16127e;

    /* renamed from: f */
    public static final C7199b f16128f = new C7199b(C0040b.f98f);

    /* renamed from: g */
    public static final C7199b f16129g = new C7199b(C0040b.f97e);

    /* renamed from: h */
    public static final C7199b f16130h = new C7199b(C0040b.f93a);

    /* renamed from: i */
    public static final C7199b f16131i = new C7199b(C0040b.f95c);

    /* renamed from: j */
    public static final C7199b f16132j = new C7199b(C0040b.f99g);

    /* renamed from: k */
    public static final C7199b f16133k = new C7199b(C0040b.f100h);

    /* renamed from: l */
    public static final HashMap f16134l;

    static {
        C7959a aVar = C7339a.f16306h;
        f16123a = new C7199b(aVar);
        C7959a aVar2 = C7339a.f16307i;
        f16124b = new C7199b(aVar2);
        C7959a aVar3 = C7339a.f16308j;
        f16125c = new C7199b(aVar3);
        C7959a aVar4 = C7339a.f16309k;
        f16126d = new C7199b(aVar4);
        C7959a aVar5 = C7339a.f16310l;
        f16127e = new C7199b(aVar5);
        HashMap hashMap = new HashMap();
        f16134l = hashMap;
        hashMap.put(aVar, 0);
        hashMap.put(aVar2, 1);
        hashMap.put(aVar3, 2);
        hashMap.put(aVar4, 3);
        hashMap.put(aVar5, 4);
    }

    /* renamed from: a */
    public static String m13937a(C7346h hVar) {
        C7199b bVar = hVar.f16346c;
        if (bVar.f15983b.equals(f16128f.f15983b)) {
            return "SHA3-256";
        }
        if (bVar.f15983b.equals(f16129g.f15983b)) {
            return "SHA-512/256";
        }
        StringBuilder h = C0072d.m201h("unknown tree digest: ");
        h.append(bVar.f15983b);
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: b */
    public static C7199b m13938b(int i) {
        if (i == 0) {
            return f16123a;
        }
        if (i == 1) {
            return f16124b;
        }
        if (i == 2) {
            return f16125c;
        }
        if (i == 3) {
            return f16126d;
        }
        if (i == 4) {
            return f16127e;
        }
        throw new IllegalArgumentException(C0015b.m88g("unknown security category: ", i));
    }

    /* renamed from: c */
    public static C7199b m13939c(String str) {
        if (str.equals("SHA3-256")) {
            return f16128f;
        }
        if (str.equals("SHA-512/256")) {
            return f16129g;
        }
        throw new IllegalArgumentException(C0326j.m864i("unknown tree digest: ", str));
    }

    /* renamed from: d */
    public static C7267c m13940d(C7959a aVar) {
        if (aVar.equals(C0040b.f93a)) {
            return new C7333e();
        }
        if (aVar.equals(C0040b.f95c)) {
            return new C7335g();
        }
        if (aVar.equals(C0040b.f99g)) {
            return new C7336h(128);
        }
        if (aVar.equals(C0040b.f100h)) {
            return new C7336h(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + aVar);
    }

    /* renamed from: e */
    public static C7199b m13941e(String str) {
        if (str.equals("SHA-256")) {
            return f16130h;
        }
        if (str.equals("SHA-512")) {
            return f16131i;
        }
        if (str.equals("SHAKE128")) {
            return f16132j;
        }
        if (str.equals("SHAKE256")) {
            return f16133k;
        }
        throw new IllegalArgumentException(C0326j.m864i("unknown tree digest: ", str));
    }
}

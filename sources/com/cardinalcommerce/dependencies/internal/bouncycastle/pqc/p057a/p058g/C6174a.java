package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6185j;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import p007a6.C0040b;
import p169l5.C7267c;
import p179m5.C7333e;
import p179m5.C7335g;
import p179m5.C7336h;
import p186n2.C7438x;
import p244t5.C7959a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.a */
public final class C6174a implements Serializable {

    /* renamed from: b */
    private final int f13410b;

    /* renamed from: c */
    private final List<C6176c> f13411c;

    /* renamed from: d */
    private int f13412d;

    /* renamed from: e */
    private C6201u f13413e;

    /* renamed from: f */
    private List<C6201u> f13414f;

    /* renamed from: g */
    private Map<Integer, LinkedList<C6201u>> f13415g;

    /* renamed from: h */
    private Stack<C6201u> f13416h;

    /* renamed from: i */
    private Map<Integer, C6201u> f13417i;

    /* renamed from: j */
    private int f13418j;

    /* renamed from: k */
    private boolean f13419k;

    /* renamed from: l */
    public transient C6189l f13420l;

    public C6174a(C6174a aVar, C7267c cVar) {
        this.f13420l = new C6189l(new C6191n(cVar));
        int i = aVar.f13410b;
        this.f13410b = i;
        this.f13412d = aVar.f13412d;
        this.f13413e = aVar.f13413e;
        ArrayList arrayList = new ArrayList();
        this.f13414f = arrayList;
        arrayList.addAll(aVar.f13414f);
        this.f13415g = aVar.f13415g;
        Stack<C6201u> stack = new Stack<>();
        this.f13416h = stack;
        stack.addAll(aVar.f13416h);
        List<C6176c> list = aVar.f13411c;
        this.f13411c = list;
        this.f13417i = new TreeMap(aVar.f13417i);
        int i2 = aVar.f13418j;
        this.f13418j = i2;
        this.f13419k = aVar.f13419k;
        if (this.f13414f == null) {
            throw new IllegalStateException("authenticationPath == null");
        } else if (this.f13415g == null) {
            throw new IllegalStateException("retain == null");
        } else if (this.f13416h == null) {
            throw new IllegalStateException("stack == null");
        } else if (list == null) {
            throw new IllegalStateException("treeHashInstances == null");
        } else if (!C6177d.m12378d(i, (long) i2)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public C6174a(C6174a aVar, byte[] bArr, byte[] bArr2, C6187k kVar) {
        this.f13420l = aVar.f13420l;
        this.f13410b = aVar.f13410b;
        this.f13412d = aVar.f13412d;
        this.f13413e = aVar.f13413e;
        ArrayList arrayList = new ArrayList();
        this.f13414f = arrayList;
        arrayList.addAll(aVar.f13414f);
        this.f13415g = aVar.f13415g;
        Stack<C6201u> stack = new Stack<>();
        this.f13416h = stack;
        stack.addAll(aVar.f13416h);
        this.f13411c = aVar.f13411c;
        this.f13417i = new TreeMap(aVar.f13417i);
        this.f13418j = aVar.f13418j;
        mo17507c(bArr, bArr2, kVar);
        aVar.f13419k = true;
    }

    public C6174a(C6189l lVar, int i, int i2) {
        this.f13420l = lVar;
        this.f13410b = i;
        this.f13412d = i2;
        if (i2 <= i && i2 >= 2) {
            int i3 = i - i2;
            if (i3 % 2 == 0) {
                this.f13414f = new ArrayList();
                this.f13415g = new TreeMap();
                this.f13416h = new Stack<>();
                this.f13411c = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f13411c.add(new C6176c(i4));
                }
                this.f13417i = new TreeMap();
                this.f13418j = 0;
                this.f13419k = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* renamed from: a */
    public int mo17503a() {
        return this.f13418j;
    }

    /* renamed from: a */
    public C6174a mo17504a(C7959a aVar) {
        C7267c cVar;
        HashMap hashMap = C6181g.f13437a;
        if (aVar.equals(C0040b.f93a)) {
            cVar = new C7333e();
        } else if (aVar.equals(C0040b.f95c)) {
            cVar = new C7335g();
        } else if (aVar.equals(C0040b.f99g)) {
            cVar = new C7336h(128);
        } else if (aVar.equals(C0040b.f100h)) {
            cVar = new C7336h(256);
        } else {
            throw new IllegalArgumentException("unrecognized digest OID: " + aVar);
        }
        return new C6174a(this, cVar);
    }

    /* renamed from: a */
    public C6174a mo17505a(byte[] bArr, byte[] bArr2, C6187k kVar) {
        return new C6174a(this, bArr, bArr2, kVar);
    }

    /* renamed from: b */
    public final void mo17506b(byte[] bArr, byte[] bArr2, C6187k kVar) {
        if (kVar != null) {
            C6185j jVar = (C6185j) ((C6185j.C6186a) ((C6185j.C6186a) new C6185j.C6186a().mo17536c(kVar.f13466a)).mo17535a(kVar.f13467b)).mo17528e();
            C6182h hVar = (C6182h) ((C6182h.C6183a) ((C6182h.C6183a) new C6182h.C6183a().mo17536c(kVar.f13466a)).mo17535a(kVar.f13467b)).mo17525e();
            for (int i = 0; i < (1 << this.f13410b); i++) {
                C6187k.C6188a aVar = (C6187k.C6188a) ((C6187k.C6188a) new C6187k.C6188a().mo17536c(kVar.f13466a)).mo17535a(kVar.f13467b);
                aVar.f13453e = i;
                aVar.f13454f = kVar.f13451f;
                aVar.f13455g = kVar.f13452g;
                kVar = (C6187k) ((C6187k.C6188a) aVar.mo17537d(kVar.f13469d)).mo17529e();
                C6189l lVar = this.f13420l;
                lVar.mo17531b(lVar.mo17533d(bArr2, kVar), bArr);
                C7438x a = this.f13420l.mo17530a(kVar);
                C6185j.C6186a aVar2 = (C6185j.C6186a) ((C6185j.C6186a) new C6185j.C6186a().mo17536c(jVar.f13466a)).mo17535a(jVar.f13467b);
                aVar2.f13447e = i;
                aVar2.f13448f = jVar.f13445f;
                aVar2.f13449g = jVar.f13446g;
                jVar = (C6185j) ((C6185j.C6186a) aVar2.mo17537d(jVar.f13469d)).mo17528e();
                C6201u b = C6199s.m12410b(this.f13420l, a, jVar);
                C6182h.C6183a aVar3 = (C6182h.C6183a) ((C6182h.C6183a) new C6182h.C6183a().mo17536c(hVar.f13466a)).mo17535a(hVar.f13467b);
                aVar3.f13441f = i;
                hVar = (C6182h) ((C6182h.C6183a) aVar3.mo17537d(hVar.f13469d)).mo17525e();
                while (!this.f13416h.isEmpty() && this.f13416h.peek().mo17542a() == b.mo17542a()) {
                    int a2 = i / (1 << b.mo17542a());
                    if (a2 == 1) {
                        this.f13414f.add(b.clone());
                    }
                    if (a2 == 3 && b.mo17542a() < this.f13410b - this.f13412d) {
                        this.f13411c.get(b.mo17542a()).mo17514a(b.clone());
                    }
                    if (a2 >= 3 && (a2 & 1) == 1 && b.mo17542a() >= this.f13410b - this.f13412d && b.mo17542a() <= this.f13410b - 2) {
                        if (this.f13415g.get(Integer.valueOf(b.mo17542a())) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(b.clone());
                            this.f13415g.put(Integer.valueOf(b.mo17542a()), linkedList);
                        } else {
                            this.f13415g.get(Integer.valueOf(b.mo17542a())).add(b.clone());
                        }
                    }
                    C6182h.C6183a aVar4 = (C6182h.C6183a) ((C6182h.C6183a) new C6182h.C6183a().mo17536c(hVar.f13466a)).mo17535a(hVar.f13467b);
                    aVar4.f13440e = hVar.f13438e;
                    aVar4.f13441f = (hVar.f13439f - 1) / 2;
                    C6182h hVar2 = (C6182h) ((C6182h.C6183a) aVar4.mo17537d(hVar.f13469d)).mo17525e();
                    C6201u a3 = C6199s.m12409a(this.f13420l, this.f13416h.pop(), b, hVar2);
                    C6201u uVar = new C6201u(a3.mo17542a() + 1, a3.mo17543b());
                    C6182h.C6183a aVar5 = (C6182h.C6183a) ((C6182h.C6183a) new C6182h.C6183a().mo17536c(hVar2.f13466a)).mo17535a(hVar2.f13467b);
                    aVar5.f13440e = hVar2.f13438e + 1;
                    aVar5.f13441f = hVar2.f13439f;
                    hVar = (C6182h) ((C6182h.C6183a) aVar5.mo17537d(hVar2.f13469d)).mo17525e();
                    b = uVar;
                }
                this.f13416h.push(b);
            }
            this.f13413e = this.f13416h.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* renamed from: c */
    public final void mo17507c(byte[] bArr, byte[] bArr2, C6187k kVar) {
        C6176c cVar;
        Object obj;
        List<C6201u> list;
        if (kVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (!this.f13419k) {
            int i = this.f13418j;
            int i2 = this.f13410b;
            if (i <= (1 << i2) - 2) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = 0;
                        break;
                    } else if (((i >> i3) & 1) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (((this.f13418j >> (i3 + 1)) & 1) == 0 && i3 < this.f13410b - 1) {
                    this.f13417i.put(Integer.valueOf(i3), this.f13414f.get(i3).clone());
                }
                C6185j jVar = (C6185j) ((C6185j.C6186a) ((C6185j.C6186a) new C6185j.C6186a().mo17536c(kVar.f13466a)).mo17535a(kVar.f13467b)).mo17528e();
                C6182h hVar = (C6182h) ((C6182h.C6183a) ((C6182h.C6183a) new C6182h.C6183a().mo17536c(kVar.f13466a)).mo17535a(kVar.f13467b)).mo17525e();
                if (i3 == 0) {
                    C6187k.C6188a aVar = (C6187k.C6188a) ((C6187k.C6188a) new C6187k.C6188a().mo17536c(kVar.f13466a)).mo17535a(kVar.f13467b);
                    aVar.f13453e = this.f13418j;
                    aVar.f13454f = kVar.f13451f;
                    aVar.f13455g = kVar.f13452g;
                    kVar = (C6187k) ((C6187k.C6188a) aVar.mo17537d(kVar.f13469d)).mo17529e();
                    C6189l lVar = this.f13420l;
                    lVar.mo17531b(lVar.mo17533d(bArr2, kVar), bArr);
                    C7438x a = this.f13420l.mo17530a(kVar);
                    C6185j.C6186a aVar2 = (C6185j.C6186a) ((C6185j.C6186a) new C6185j.C6186a().mo17536c(jVar.f13466a)).mo17535a(jVar.f13467b);
                    aVar2.f13447e = this.f13418j;
                    aVar2.f13448f = jVar.f13445f;
                    aVar2.f13449g = jVar.f13446g;
                    this.f13414f.set(0, C6199s.m12410b(this.f13420l, a, (C6185j) ((C6185j.C6186a) aVar2.mo17537d(jVar.f13469d)).mo17528e()));
                } else {
                    C6182h.C6183a aVar3 = (C6182h.C6183a) ((C6182h.C6183a) new C6182h.C6183a().mo17536c(hVar.f13466a)).mo17535a(hVar.f13467b);
                    int i4 = i3 - 1;
                    aVar3.f13440e = i4;
                    aVar3.f13441f = this.f13418j >> i3;
                    C6189l lVar2 = this.f13420l;
                    lVar2.mo17531b(lVar2.mo17533d(bArr2, kVar), bArr);
                    C6201u a2 = C6199s.m12409a(this.f13420l, this.f13414f.get(i4), this.f13417i.get(Integer.valueOf(i4)), (C6182h) ((C6182h.C6183a) aVar3.mo17537d(hVar.f13469d)).mo17525e());
                    this.f13414f.set(i3, new C6201u(a2.mo17542a() + 1, a2.mo17543b()));
                    this.f13417i.remove(Integer.valueOf(i4));
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (i5 < this.f13410b - this.f13412d) {
                            list = this.f13414f;
                            obj = this.f13411c.get(i5).mo17519e();
                        } else {
                            list = this.f13414f;
                            obj = this.f13415g.get(Integer.valueOf(i5)).removeFirst();
                        }
                        list.set(i5, obj);
                    }
                    int min = Math.min(i3, this.f13410b - this.f13412d);
                    for (int i6 = 0; i6 < min; i6++) {
                        int i7 = ((1 << i6) * 3) + this.f13418j + 1;
                        if (i7 < (1 << this.f13410b)) {
                            this.f13411c.get(i6).mo17513a(i7);
                        }
                    }
                }
                for (int i8 = 0; i8 < ((this.f13410b - this.f13412d) >> 1); i8++) {
                    Iterator<C6176c> it = this.f13411c.iterator();
                    C6176c cVar2 = null;
                    while (true) {
                        cVar = cVar2;
                        while (it.hasNext()) {
                            cVar2 = it.next();
                            if (!cVar2.mo17517c() && cVar2.mo17518d()) {
                                if (cVar != null && cVar2.mo17512a() >= cVar.mo17512a()) {
                                    if (cVar2.mo17512a() == cVar.mo17512a() && cVar2.mo17516b() < cVar.mo17516b()) {
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (cVar != null) {
                        cVar.mo17515a(this.f13416h, this.f13420l, bArr, bArr2, kVar);
                    }
                }
                this.f13418j++;
                return;
            }
            throw new IllegalStateException("index out of bounds");
        } else {
            throw new IllegalStateException("index already used");
        }
    }

    public C6174a(C6200t tVar, int i) {
        this(tVar.f13500b, tVar.f13501c, tVar.f13502d);
        this.f13418j = i;
        this.f13419k = true;
    }

    public C6174a(C6200t tVar, byte[] bArr, byte[] bArr2, C6187k kVar) {
        this(tVar.f13500b, tVar.f13501c, tVar.f13502d);
        mo17506b(bArr, bArr2, kVar);
    }

    public C6174a(C6200t tVar, byte[] bArr, byte[] bArr2, C6187k kVar, int i) {
        this(tVar.f13500b, tVar.f13501c, tVar.f13502d);
        mo17506b(bArr, bArr2, kVar);
        while (this.f13418j < i) {
            mo17507c(bArr, bArr2, kVar);
            this.f13419k = false;
        }
    }
}

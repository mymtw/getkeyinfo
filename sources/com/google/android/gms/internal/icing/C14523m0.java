package com.google.android.gms.internal.icing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.reflect.C19421p;

/* renamed from: com.google.android.gms.internal.icing.m0 */
public final class C14523m0 extends C14510j<String> implements RandomAccess, C14527n0 {

    /* renamed from: c */
    public final ArrayList f32669c;

    static {
        new C14523m0(10).f32650b = false;
    }

    public C14523m0() {
        this(10);
    }

    /* renamed from: M */
    public final Object mo49747M(int i) {
        return this.f32669c.get(i);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo49812a();
        this.f32669c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo49812a();
        if (collection instanceof C14527n0) {
            collection = ((C14527n0) collection).zzh();
        }
        boolean addAll = this.f32669c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: c */
    public final String get(int i) {
        Object obj = this.f32669c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzcf) {
            zzcf zzcf = (zzcf) obj;
            String zzk = zzcf.zzk(C14515k0.f32655a);
            if (zzcf.zzh()) {
                this.f32669c.set(i, zzk);
            }
            return zzk;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C14515k0.f32655a);
        C19421p pVar = C14509i2.f32649a;
        int length = bArr.length;
        pVar.getClass();
        if (C19421p.m32948n0(length, bArr)) {
            this.f32669c.set(i, str);
        }
        return str;
    }

    public final void clear() {
        mo49812a();
        this.f32669c.clear();
        this.modCount++;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C14511j0 mo49798r(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f32669c);
            return new C14523m0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i) {
        mo49812a();
        Object remove = this.f32669c.remove(i);
        this.modCount++;
        return remove instanceof String ? (String) remove : remove instanceof zzcf ? ((zzcf) remove).zzk(C14515k0.f32655a) : new String((byte[]) remove, C14515k0.f32655a);
    }

    public final Object set(int i, Object obj) {
        mo49812a();
        Object obj2 = this.f32669c.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof zzcf ? ((zzcf) obj2).zzk(C14515k0.f32655a) : new String((byte[]) obj2, C14515k0.f32655a);
    }

    public final int size() {
        return this.f32669c.size();
    }

    /* renamed from: u */
    public final void mo49752u(zzcf zzcf) {
        mo49812a();
        this.f32669c.add(zzcf);
        this.modCount++;
    }

    public final List<?> zzh() {
        return Collections.unmodifiableList(this.f32669c);
    }

    public final C14527n0 zzi() {
        return this.f32650b ? new C14485c2(this) : this;
    }

    public C14523m0(int i) {
        this.f32669c = new ArrayList(i);
    }

    public C14523m0(ArrayList<Object> arrayList) {
        this.f32669c = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}

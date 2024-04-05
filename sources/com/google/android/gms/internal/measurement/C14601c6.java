package com.google.android.gms.internal.measurement;

import com.google.android.play.core.appupdate.C15562d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.c6 */
public final class C14601c6 extends C14830u4<String> implements RandomAccess, C14614d6 {

    /* renamed from: c */
    public final ArrayList f32788c;

    static {
        new C14601c6(10).f33094b = false;
    }

    public C14601c6() {
        this(10);
    }

    /* renamed from: Q */
    public final void mo50423Q(zzix zzix) {
        mo50891a();
        this.f32788c.add(zzix);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo50891a();
        this.f32788c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo50891a();
        if (collection instanceof C14614d6) {
            collection = ((C14614d6) collection).zzh();
        }
        boolean addAll = this.f32788c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14891z5 mo50356b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f32788c);
            return new C14601c6((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final String get(int i) {
        Object obj = this.f32788c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzix) {
            zzix zzix = (zzix) obj;
            String zzn = zzix.zzn(C14575a6.f32740a);
            if (zzix.zzi()) {
                this.f32788c.set(i, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C14575a6.f32740a);
        C15562d dVar = C14881y7.f33174a;
        int length = bArr.length;
        dVar.getClass();
        if (C15562d.m25191b0(0, length, bArr)) {
            this.f32788c.set(i, str);
        }
        return str;
    }

    public final void clear() {
        mo50891a();
        this.f32788c.clear();
        this.modCount++;
    }

    public final Object remove(int i) {
        mo50891a();
        Object remove = this.f32788c.remove(i);
        this.modCount++;
        return remove instanceof String ? (String) remove : remove instanceof zzix ? ((zzix) remove).zzn(C14575a6.f32740a) : new String((byte[]) remove, C14575a6.f32740a);
    }

    public final Object set(int i, Object obj) {
        mo50891a();
        Object obj2 = this.f32788c.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof zzix ? ((zzix) obj2).zzn(C14575a6.f32740a) : new String((byte[]) obj2, C14575a6.f32740a);
    }

    public final int size() {
        return this.f32788c.size();
    }

    /* renamed from: x */
    public final Object mo50432x(int i) {
        return this.f32788c.get(i);
    }

    public final C14614d6 zze() {
        return this.f33094b ? new C14809s7(this) : this;
    }

    public final List<?> zzh() {
        return Collections.unmodifiableList(this.f32788c);
    }

    public C14601c6(int i) {
        this.f32788c = new ArrayList(i);
    }

    public C14601c6(ArrayList<Object> arrayList) {
        this.f32788c = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}

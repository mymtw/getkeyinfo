package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p568fn.C17782b;

public abstract class zzag<E> extends zzac<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    public static final C14463c f32612c = new C14463c(zzai.zza, 0);

    public static <E> zzag<E> zzi(Object[] objArr, int i) {
        return i == 0 ? zzai.zza : new zzai(objArr, i);
    }

    public static <E> zzag<E> zzj(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return zzai.zza;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        C14462b bVar = new C14462b();
        bVar.mo49663a(next);
        while (it.hasNext()) {
            bVar.mo49663a(it.next());
        }
        bVar.f32593c = true;
        return zzi(bVar.f32591a, bVar.f32592b);
    }

    public static <E> zzag<E> zzk(Collection<? extends E> collection) {
        if (collection instanceof zzac) {
            zzag<E> zzd = ((zzac) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        C17782b.m29833B0(length, array2);
        return zzi(array2, length);
    }

    public static <E> zzag<E> zzl() {
        return zzai.zza;
    }

    public static <E> zzag<E> zzm(E e) {
        Object[] objArr = {e};
        C17782b.m29833B0(1, objArr);
        return zzi(objArr, 1);
    }

    public static <E> zzag<E> zzn(E e, E e2) {
        Object[] objArr = {e, e2};
        C17782b.m29833B0(2, objArr);
        return zzi(objArr, 2);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (list instanceof RandomAccess) {
                for (int i = 0; i < size; i++) {
                    Object obj2 = get(i);
                    Object obj3 = list.get(i);
                    if (!(obj2 == obj3 || (obj2 != null && obj2.equals(obj3)))) {
                        return false;
                    }
                }
            } else {
                Iterator it = list.iterator();
                for (Object next : this) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    Object next2 = it.next();
                    if (next == next2 || (next != null && next.equals(next2))) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        return false;
                    }
                }
                if (it.hasNext()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Deprecated
    public final zzag<E> zzd() {
        return this;
    }

    public final C14464d<E> zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzag<E> subList(int i, int i2) {
        C17782b.m29837D0(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzai.zza : new zzaf(this, i, i3);
    }

    /* renamed from: zzo */
    public final C14465e<E> listIterator(int i) {
        C17782b.m29835C0(i, size());
        return isEmpty() ? f32612c : new C14463c(this, i);
    }
}

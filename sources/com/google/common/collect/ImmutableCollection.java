package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    public static final Object[] f35897b = new Object[0];

    /* renamed from: com.google.common.collect.ImmutableCollection$a */
    public static abstract class C15949a<E> extends C15950b<E> {

        /* renamed from: a */
        public Object[] f35898a;

        /* renamed from: b */
        public int f35899b = 0;

        /* renamed from: c */
        public boolean f35900c;

        public C15949a(int i) {
            C16203o.m26215b(i, "initialCapacity");
            this.f35898a = new Object[i];
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final void mo56633b(Object obj) {
            obj.getClass();
            mo56634c(this.f35899b + 1);
            Object[] objArr = this.f35898a;
            int i = this.f35899b;
            this.f35899b = i + 1;
            objArr[i] = obj;
        }

        /* renamed from: c */
        public final void mo56634c(int i) {
            Object[] objArr = this.f35898a;
            if (objArr.length < i) {
                this.f35898a = Arrays.copyOf(objArr, C15950b.m25825a(objArr.length, i));
                this.f35900c = false;
            } else if (this.f35900c) {
                this.f35898a = (Object[]) objArr.clone();
                this.f35900c = false;
            }
        }
    }

    /* renamed from: com.google.common.collect.ImmutableCollection$b */
    public static abstract class C15950b<E> {
        /* renamed from: a */
        public static int m25825a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                return i3 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        return isEmpty() ? ImmutableList.m25826of() : ImmutableList.asImmutableList(toArray());
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    public int copyIntoArray(Object[] objArr, int i) {
        C16170f2 it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object[] internalArray() {
        return null;
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean isPartialView();

    public abstract C16170f2<E> iterator();

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f35897b);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return Arrays.copyOfRange(internalArray, internalArrayStart(), internalArrayEnd(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }
}

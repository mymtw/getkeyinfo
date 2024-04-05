package com.google.common.collect;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.base.C15794l;
import com.google.common.collect.C16178h1;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class EnumMultiset<E extends Enum<E>> extends C16156d<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    public transient Class<E> f35857d;

    /* renamed from: e */
    public transient E[] f35858e;

    /* renamed from: f */
    public transient int[] f35859f;

    /* renamed from: g */
    public transient int f35860g;

    /* renamed from: h */
    public transient long f35861h;

    /* renamed from: com.google.common.collect.EnumMultiset$a */
    public class C15935a extends EnumMultiset<E>.c<E> {
        public C15935a() {
            super();
        }

        /* renamed from: a */
        public final Object mo56520a(int i) {
            return EnumMultiset.this.f35858e[i];
        }
    }

    /* renamed from: com.google.common.collect.EnumMultiset$b */
    public class C15936b extends EnumMultiset<E>.c<C16178h1.C16179a<E>> {
        public C15936b() {
            super();
        }

        /* renamed from: a */
        public final Object mo56520a(int i) {
            return new C16218s(this, i);
        }
    }

    /* renamed from: com.google.common.collect.EnumMultiset$c */
    public abstract class C15937c<T> implements Iterator<T> {

        /* renamed from: b */
        public int f35864b = 0;

        /* renamed from: c */
        public int f35865c = -1;

        public C15937c() {
        }

        /* renamed from: a */
        public abstract T mo56520a(int i);

        public final boolean hasNext() {
            while (this.f35864b < EnumMultiset.this.f35858e.length) {
                int[] access$100 = EnumMultiset.this.f35859f;
                int i = this.f35864b;
                if (access$100[i] > 0) {
                    return true;
                }
                this.f35864b = i + 1;
            }
            return false;
        }

        public final T next() {
            if (hasNext()) {
                T a = mo56520a(this.f35864b);
                int i = this.f35864b;
                this.f35865c = i;
                this.f35864b = i + 1;
                return a;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            C16203o.m26218e(this.f35865c >= 0);
            if (EnumMultiset.this.f35859f[this.f35865c] > 0) {
                EnumMultiset.access$210(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                long unused = enumMultiset.f35861h = enumMultiset.f35861h - ((long) EnumMultiset.this.f35859f[this.f35865c]);
                EnumMultiset.this.f35859f[this.f35865c] = 0;
            }
            this.f35865c = -1;
        }
    }

    public EnumMultiset(Class<E> cls) {
        this.f35857d = cls;
        C15794l.m25613g(cls.isEnum());
        E[] eArr = (Enum[]) cls.getEnumConstants();
        this.f35858e = eArr;
        this.f35859f = new int[eArr.length];
    }

    public static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
        int i = enumMultiset.f35860g;
        enumMultiset.f35860g = i - 1;
        return i;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.f35857d = cls;
        E[] eArr = (Enum[]) cls.getEnumConstants();
        this.f35858e = eArr;
        this.f35859f = new int[eArr.length];
        C16213q1.m26247d(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f35857d);
        C16213q1.m26250g(this, objectOutputStream);
    }

    /* renamed from: a */
    public final boolean mo56516a(@NullableDecl Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        E e = (Enum) obj;
        int ordinal = e.ordinal();
        E[] eArr = this.f35858e;
        return ordinal < eArr.length && eArr[ordinal] == e;
    }

    public void checkIsE(@NullableDecl Object obj) {
        obj.getClass();
        if (!mo56516a(obj)) {
            StringBuilder h = C0072d.m201h("Expected an ");
            h.append(this.f35857d);
            h.append(" but got ");
            h.append(obj);
            throw new ClassCastException(h.toString());
        }
    }

    public void clear() {
        Arrays.fill(this.f35859f, 0);
        this.f35861h = 0;
        this.f35860g = 0;
    }

    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    public int count(@NullableDecl Object obj) {
        if (obj == null || !mo56516a(obj)) {
            return 0;
        }
        return this.f35859f[((Enum) obj).ordinal()];
    }

    public int distinctElements() {
        return this.f35860g;
    }

    public Iterator<E> elementIterator() {
        return new C15935a();
    }

    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public Iterator<C16178h1.C16179a<E>> entryIterator() {
        return new C15936b();
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Iterator<E> iterator() {
        return Multisets.m26081d(this);
    }

    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i) {
        if (obj == null || !mo56516a(obj)) {
            return 0;
        }
        Enum enumR = (Enum) obj;
        C16203o.m26215b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        int ordinal = enumR.ordinal();
        int[] iArr = this.f35859f;
        int i2 = iArr[ordinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[ordinal] = 0;
            this.f35860g--;
            this.f35861h -= (long) i2;
        } else {
            iArr[ordinal] = i2 - i;
            this.f35861h -= (long) i;
        }
        return i2;
    }

    public int size() {
        return Ints.m26384b(this.f35861h);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        C15794l.m25614h(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(((Enum) it.next()).getDeclaringClass());
        C16201n0.m26210a(iterable, enumMultiset);
        return enumMultiset;
    }

    @CanIgnoreReturnValue
    public int add(E e, int i) {
        checkIsE(e);
        C16203o.m26215b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        int ordinal = e.ordinal();
        int i2 = this.f35859f[ordinal];
        long j = (long) i;
        long j2 = ((long) i2) + j;
        C15794l.m25610d(j2, "too many occurrences: %s", j2 <= ParserMinimalBase.MAX_INT_L);
        this.f35859f[ordinal] = (int) j2;
        if (i2 == 0) {
            this.f35860g++;
        }
        this.f35861h += j;
        return i2;
    }

    @CanIgnoreReturnValue
    public int setCount(E e, int i) {
        checkIsE(e);
        C16203o.m26215b(i, ResponseConstants.COUNT);
        int ordinal = e.ordinal();
        int[] iArr = this.f35859f;
        int i2 = iArr[ordinal];
        iArr[ordinal] = i;
        this.f35861h += (long) (i - i2);
        if (i2 == 0 && i > 0) {
            this.f35860g++;
        } else if (i2 > 0 && i == 0) {
            this.f35860g--;
        }
        return i2;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> create = create(cls);
        C16201n0.m26210a(iterable, create);
        return create;
    }
}

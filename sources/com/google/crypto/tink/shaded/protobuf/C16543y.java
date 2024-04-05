package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.y */
public final class C16543y extends C16469c<String> implements C16545z, RandomAccess {

    /* renamed from: c */
    public final ArrayList f36714c;

    static {
        new C16543y(10).f36583b = false;
    }

    public C16543y(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public final void add(int i, Object obj) {
        mo58670a();
        this.f36714c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo58670a();
        this.f36714c.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final List<?> mo58719f() {
        return Collections.unmodifiableList(this.f36714c);
    }

    public final Object get(int i) {
        String str;
        Object obj = this.f36714c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            str = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f36714c.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C16531v.f36704a);
            boolean z = false;
            if (Utf8.f36555a.mo58597f(0, 0, bArr.length, bArr) == 0) {
                z = true;
            }
            if (z) {
                this.f36714c.set(i, str);
            }
        }
        return str;
    }

    /* renamed from: i */
    public final C16531v.C16535d mo58661i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f36714c);
            return new C16543y((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public final C16545z mo58722j() {
        return this.f36583b ? new C16483f1(this) : this;
    }

    /* renamed from: k */
    public final Object mo58723k(int i) {
        return this.f36714c.get(i);
    }

    /* renamed from: m0 */
    public final void mo58725m0(ByteString byteString) {
        mo58670a();
        this.f36714c.add(byteString);
        this.modCount++;
    }

    public final Object remove(int i) {
        mo58670a();
        Object remove = this.f36714c.remove(i);
        this.modCount++;
        return remove instanceof String ? (String) remove : remove instanceof ByteString ? ((ByteString) remove).toStringUtf8() : new String((byte[]) remove, C16531v.f36704a);
    }

    public final Object set(int i, Object obj) {
        mo58670a();
        Object obj2 = this.f36714c.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof ByteString ? ((ByteString) obj2).toStringUtf8() : new String((byte[]) obj2, C16531v.f36704a);
    }

    public final int size() {
        return this.f36714c.size();
    }

    public C16543y(ArrayList<Object> arrayList) {
        this.f36714c = arrayList;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo58670a();
        if (collection instanceof C16545z) {
            collection = ((C16545z) collection).mo58719f();
        }
        boolean addAll = this.f36714c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }
}

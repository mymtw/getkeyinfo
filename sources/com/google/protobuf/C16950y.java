package com.google.protobuf;

import com.google.protobuf.C16935v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y */
public final class C16950y extends C16872c<String> implements C16952z, RandomAccess {

    /* renamed from: c */
    public final ArrayList f37317c;

    static {
        new C16950y(10).f37182b = false;
    }

    public C16950y(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public final void add(int i, Object obj) {
        mo59861a();
        this.f37317c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo59861a();
        this.f37317c.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final List<?> mo59884f() {
        return Collections.unmodifiableList(this.f37317c);
    }

    public final Object get(int i) {
        String str;
        Object obj = this.f37317c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            str = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f37317c.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C16935v.f37301a);
            boolean z = false;
            if (Utf8.f37176a.mo59818f(0, 0, bArr.length, bArr) == 0) {
                z = true;
            }
            if (z) {
                this.f37317c.set(i, str);
            }
        }
        return str;
    }

    /* renamed from: i */
    public final C16935v.C16942f mo59843i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f37317c);
            return new C16950y((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public final C16952z mo59887j() {
        return this.f37182b ? new C16884e1(this) : this;
    }

    /* renamed from: k */
    public final Object mo59888k(int i) {
        return this.f37317c.get(i);
    }

    public final Object remove(int i) {
        mo59861a();
        Object remove = this.f37317c.remove(i);
        this.modCount++;
        return remove instanceof String ? (String) remove : remove instanceof ByteString ? ((ByteString) remove).toStringUtf8() : new String((byte[]) remove, C16935v.f37301a);
    }

    public final Object set(int i, Object obj) {
        mo59861a();
        Object obj2 = this.f37317c.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof ByteString ? ((ByteString) obj2).toStringUtf8() : new String((byte[]) obj2, C16935v.f37301a);
    }

    public final int size() {
        return this.f37317c.size();
    }

    /* renamed from: t */
    public final void mo59891t(ByteString byteString) {
        mo59861a();
        this.f37317c.add(byteString);
        this.modCount++;
    }

    public C16950y(ArrayList<Object> arrayList) {
        this.f37317c = arrayList;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo59861a();
        if (collection instanceof C16952z) {
            collection = ((C16952z) collection).mo59884f();
        }
        boolean addAll = this.f37317c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }
}

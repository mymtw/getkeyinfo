package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2631w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.z */
public final class C2643z extends C2563c<String> implements C2548a0, RandomAccess {

    /* renamed from: c */
    public final ArrayList f5983c;

    static {
        new C2643z(10).f5841b = false;
    }

    public C2643z(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public final void add(int i, Object obj) {
        mo9596a();
        this.f5983c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c0 */
    public final void mo9546c0(ByteString byteString) {
        mo9596a();
        this.f5983c.add(byteString);
        this.modCount++;
    }

    public final void clear() {
        mo9596a();
        this.f5983c.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final List<?> mo9547f() {
        return Collections.unmodifiableList(this.f5983c);
    }

    public final Object get(int i) {
        String str;
        Object obj = this.f5983c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            str = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f5983c.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C2631w.f5973a);
            boolean z = false;
            if (Utf8.f5815a.mo9533f(0, 0, bArr.length, bArr) == 0) {
                z = true;
            }
            if (z) {
                this.f5983c.set(i, str);
            }
        }
        return str;
    }

    /* renamed from: i */
    public final C2631w.C2635d mo9612i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f5983c);
            return new C2643z((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public final C2548a0 mo9548j() {
        return this.f5841b ? new C2581g1(this) : this;
    }

    /* renamed from: k */
    public final Object mo9549k(int i) {
        return this.f5983c.get(i);
    }

    public final Object remove(int i) {
        mo9596a();
        Object remove = this.f5983c.remove(i);
        this.modCount++;
        return remove instanceof String ? (String) remove : remove instanceof ByteString ? ((ByteString) remove).toStringUtf8() : new String((byte[]) remove, C2631w.f5973a);
    }

    public final Object set(int i, Object obj) {
        mo9596a();
        Object obj2 = this.f5983c.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof ByteString ? ((ByteString) obj2).toStringUtf8() : new String((byte[]) obj2, C2631w.f5973a);
    }

    public final int size() {
        return this.f5983c.size();
    }

    public C2643z(ArrayList<Object> arrayList) {
        this.f5983c = arrayList;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo9596a();
        if (collection instanceof C2548a0) {
            collection = ((C2548a0) collection).mo9547f();
        }
        boolean addAll = this.f5983c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }
}

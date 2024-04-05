package p690um;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;
import p674sm.C18539f;
import p674sm.C18540g;

/* renamed from: um.f */
public final class C18625f implements C18538e, C18540g {

    /* renamed from: a */
    public boolean f41122a = true;

    /* renamed from: b */
    public final JsonWriter f41123b;

    /* renamed from: c */
    public final Map<Class<?>, C18537d<?>> f41124c;

    /* renamed from: d */
    public final Map<Class<?>, C18539f<?>> f41125d;

    /* renamed from: e */
    public final C18537d<Object> f41126e;

    /* renamed from: f */
    public final boolean f41127f;

    public C18625f(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, C18619a aVar, boolean z) {
        this.f41123b = new JsonWriter(bufferedWriter);
        this.f41124c = hashMap;
        this.f41125d = hashMap2;
        this.f41126e = aVar;
        this.f41127f = z;
    }

    /* renamed from: a */
    public final C18538e mo59028a(C18536c cVar, Object obj) throws IOException {
        return mo70133g(obj, cVar.f40805a);
    }

    /* renamed from: b */
    public final C18540g mo70052b(String str) throws IOException {
        mo70134h();
        this.f41123b.value(str);
        return this;
    }

    /* renamed from: c */
    public final C18538e mo59030c(C18536c cVar, long j) throws IOException {
        String str = cVar.f40805a;
        mo70134h();
        this.f41123b.name(str);
        mo70134h();
        this.f41123b.value(j);
        return this;
    }

    /* renamed from: d */
    public final C18538e mo59031d(C18536c cVar, int i) throws IOException {
        String str = cVar.f40805a;
        mo70134h();
        this.f41123b.name(str);
        mo70134h();
        this.f41123b.value((long) i);
        return this;
    }

    /* renamed from: e */
    public final C18540g mo70053e(boolean z) throws IOException {
        mo70134h();
        this.f41123b.value(z);
        return this;
    }

    /* renamed from: f */
    public final C18625f mo70132f(Object obj) throws IOException {
        if (obj == null) {
            this.f41123b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f41123b.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    mo70134h();
                    this.f41123b.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                this.f41123b.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.f41123b.value((long) iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        long j = jArr[i];
                        mo70134h();
                        this.f41123b.value(j);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.f41123b.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.f41123b.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        mo70132f(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        mo70132f(objArr[i]);
                        i++;
                    }
                }
                this.f41123b.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f41123b.beginArray();
                for (Object f : (Collection) obj) {
                    mo70132f(f);
                }
                this.f41123b.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f41123b.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo70133g(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                    }
                }
                this.f41123b.endObject();
                return this;
            } else {
                C18537d dVar = this.f41124c.get(obj.getClass());
                if (dVar != null) {
                    this.f41123b.beginObject();
                    dVar.mo18639a(obj, this);
                    this.f41123b.endObject();
                    return this;
                }
                C18539f fVar = this.f41125d.get(obj.getClass());
                if (fVar != null) {
                    fVar.mo18639a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    mo70134h();
                    this.f41123b.value(name);
                    return this;
                } else {
                    C18537d<Object> dVar2 = this.f41126e;
                    this.f41123b.beginObject();
                    dVar2.mo18639a(obj, this);
                    this.f41123b.endObject();
                    return this;
                }
            }
        }
    }

    /* renamed from: g */
    public final C18625f mo70133g(Object obj, String str) throws IOException {
        if (!this.f41127f) {
            mo70134h();
            this.f41123b.name(str);
            if (obj != null) {
                return mo70132f(obj);
            }
            this.f41123b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            mo70134h();
            this.f41123b.name(str);
            return mo70132f(obj);
        }
    }

    /* renamed from: h */
    public final void mo70134h() throws IOException {
        if (!this.f41122a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}

package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p003a2.C0023f;
import p618lp.C18215a;

/* renamed from: com.squareup.moshi.a */
public final class C17384a implements JsonAdapter.C17360e {

    /* renamed from: a */
    public final List<C17386b> f37931a;

    /* renamed from: b */
    public final List<C17386b> f37932b;

    /* renamed from: com.squareup.moshi.a$a */
    public class C17385a extends JsonAdapter<Object> {

        /* renamed from: a */
        public final /* synthetic */ C17386b f37933a;

        /* renamed from: b */
        public final /* synthetic */ JsonAdapter f37934b;

        /* renamed from: c */
        public final /* synthetic */ C17386b f37935c;

        /* renamed from: d */
        public final /* synthetic */ Set f37936d;

        /* renamed from: e */
        public final /* synthetic */ Type f37937e;

        public C17385a(C17386b bVar, JsonAdapter jsonAdapter, C17414y yVar, C17386b bVar2, Set set, Type type) {
            this.f37933a = bVar;
            this.f37934b = jsonAdapter;
            this.f37935c = bVar2;
            this.f37936d = set;
            this.f37937e = type;
        }

        public final Object fromJson(JsonReader jsonReader) throws IOException {
            C17386b bVar = this.f37935c;
            if (bVar == null) {
                return this.f37934b.fromJson(jsonReader);
            }
            if (bVar.f37944g || jsonReader.mo68426u() != JsonReader.Token.NULL) {
                try {
                    return this.f37935c.mo68482b(jsonReader);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + jsonReader.getPath(), cause);
                }
            } else {
                jsonReader.mo68423n();
                return null;
            }
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            C17386b bVar = this.f37933a;
            if (bVar == null) {
                this.f37934b.toJson(wVar, obj);
            } else if (bVar.f37944g || obj != null) {
                try {
                    bVar.mo68484d(wVar, obj);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + wVar.getPath(), cause);
                }
            } else {
                wVar.mo68530i();
            }
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("JsonAdapter");
            h.append(this.f37936d);
            h.append("(");
            h.append(this.f37937e);
            h.append(")");
            return h.toString();
        }
    }

    /* renamed from: com.squareup.moshi.a$b */
    public static abstract class C17386b {

        /* renamed from: a */
        public final Type f37938a;

        /* renamed from: b */
        public final Set<? extends Annotation> f37939b;

        /* renamed from: c */
        public final Object f37940c;

        /* renamed from: d */
        public final Method f37941d;

        /* renamed from: e */
        public final int f37942e;

        /* renamed from: f */
        public final JsonAdapter<?>[] f37943f;

        /* renamed from: g */
        public final boolean f37944g;

        public C17386b(Type type, Set<? extends Annotation> set, Object obj, Method method, int i, int i2, boolean z) {
            this.f37938a = C18215a.m30722a(type);
            this.f37939b = set;
            this.f37940c = obj;
            this.f37941d = method;
            this.f37942e = i2;
            this.f37943f = new JsonAdapter[(i - i2)];
            this.f37944g = z;
        }

        /* renamed from: a */
        public void mo68481a(C17414y yVar, JsonAdapter.C17360e eVar) {
            if (this.f37943f.length > 0) {
                Type[] genericParameterTypes = this.f37941d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f37941d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i = this.f37942e; i < length; i++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                    Set<? extends Annotation> f = C18215a.m30727f(parameterAnnotations[i]);
                    this.f37943f[i - this.f37942e] = (!C17387a0.m29124b(this.f37938a, type) || !this.f37939b.equals(f)) ? yVar.mo68558c(type, f, (String) null) : yVar.mo68559d(eVar, type, f);
                }
            }
        }

        /* renamed from: b */
        public Object mo68482b(JsonReader jsonReader) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        /* renamed from: c */
        public final Object mo68483c(Object obj) throws InvocationTargetException {
            JsonAdapter<?>[] jsonAdapterArr = this.f37943f;
            Object[] objArr = new Object[(jsonAdapterArr.length + 1)];
            objArr[0] = obj;
            System.arraycopy(jsonAdapterArr, 0, objArr, 1, jsonAdapterArr.length);
            try {
                return this.f37941d.invoke(this.f37940c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: d */
        public void mo68484d(C17412w wVar, Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }
    }

    public C17384a(ArrayList arrayList, ArrayList arrayList2) {
        this.f37931a = arrayList;
        this.f37932b = arrayList2;
    }

    /* renamed from: a */
    public static C17386b m29118a(List<C17386b> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C17386b bVar = list.get(i);
            if (C17387a0.m29124b(bVar.f37938a, type) && bVar.f37939b.equals(set)) {
                return bVar;
            }
        }
        return null;
    }

    public final JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
        C17386b a = m29118a(this.f37931a, type, set);
        C17386b a2 = m29118a(this.f37932b, type, set);
        JsonAdapter<T> jsonAdapter = null;
        if (a == null && a2 == null) {
            return null;
        }
        if (a == null || a2 == null) {
            try {
                jsonAdapter = yVar.mo68559d(this, type, set);
            } catch (IllegalArgumentException e) {
                StringBuilder l = C0023f.m111l("No ", a == null ? "@ToJson" : "@FromJson", " adapter for ");
                l.append(C18215a.m30732k(type, set));
                throw new IllegalArgumentException(l.toString(), e);
            }
        }
        JsonAdapter<T> jsonAdapter2 = jsonAdapter;
        if (a != null) {
            a.mo68481a(yVar, this);
        }
        if (a2 != null) {
            a2.mo68481a(yVar, this);
        }
        return new C17385a(a, jsonAdapter2, yVar, a2, set, type);
    }
}

package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p003a2.C0023f;
import p756lr.C19893f;
import p756lr.C19896h;
import p756lr.C19897i;

public abstract class JsonAdapter<T> {

    /* renamed from: com.squareup.moshi.JsonAdapter$a */
    public class C17356a extends JsonAdapter<T> {
        public C17356a() {
        }

        public final T fromJson(JsonReader jsonReader) throws IOException {
            return JsonAdapter.this.fromJson(jsonReader);
        }

        public final boolean isLenient() {
            return JsonAdapter.this.isLenient();
        }

        public final void toJson(C17412w wVar, T t) throws IOException {
            boolean z = wVar.f38016h;
            wVar.f38016h = true;
            try {
                JsonAdapter.this.toJson(wVar, t);
            } finally {
                wVar.f38016h = z;
            }
        }

        public final String toString() {
            return JsonAdapter.this + ".serializeNulls()";
        }
    }

    /* renamed from: com.squareup.moshi.JsonAdapter$b */
    public class C17357b extends JsonAdapter<T> {
        public C17357b() {
        }

        public final T fromJson(JsonReader jsonReader) throws IOException {
            boolean z = jsonReader.f37895f;
            jsonReader.f37895f = true;
            try {
                return JsonAdapter.this.fromJson(jsonReader);
            } finally {
                jsonReader.f37895f = z;
            }
        }

        public final boolean isLenient() {
            return true;
        }

        public final void toJson(C17412w wVar, T t) throws IOException {
            boolean z = wVar.f38015g;
            wVar.f38015g = true;
            try {
                JsonAdapter.this.toJson(wVar, t);
            } finally {
                wVar.f38015g = z;
            }
        }

        public final String toString() {
            return JsonAdapter.this + ".lenient()";
        }
    }

    /* renamed from: com.squareup.moshi.JsonAdapter$c */
    public class C17358c extends JsonAdapter<T> {
        public C17358c() {
        }

        public final T fromJson(JsonReader jsonReader) throws IOException {
            boolean z = jsonReader.f37896g;
            jsonReader.f37896g = true;
            try {
                return JsonAdapter.this.fromJson(jsonReader);
            } finally {
                jsonReader.f37896g = z;
            }
        }

        public final boolean isLenient() {
            return JsonAdapter.this.isLenient();
        }

        public final void toJson(C17412w wVar, T t) throws IOException {
            JsonAdapter.this.toJson(wVar, t);
        }

        public final String toString() {
            return JsonAdapter.this + ".failOnUnknown()";
        }
    }

    /* renamed from: com.squareup.moshi.JsonAdapter$d */
    public class C17359d extends JsonAdapter<T> {

        /* renamed from: b */
        public final /* synthetic */ String f37890b;

        public C17359d(String str) {
            this.f37890b = str;
        }

        public final T fromJson(JsonReader jsonReader) throws IOException {
            return JsonAdapter.this.fromJson(jsonReader);
        }

        public final boolean isLenient() {
            return JsonAdapter.this.isLenient();
        }

        public final void toJson(C17412w wVar, T t) throws IOException {
            String str = wVar.f38014f;
            if (str == null) {
                str = "";
            }
            wVar.mo68531n(this.f37890b);
            try {
                JsonAdapter.this.toJson(wVar, t);
            } finally {
                wVar.mo68531n(str);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(JsonAdapter.this);
            sb.append(".indent(\"");
            return C0023f.m110k(sb, this.f37890b, "\")");
        }
    }

    /* renamed from: com.squareup.moshi.JsonAdapter$e */
    public interface C17360e {
        JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C17414y yVar);
    }

    public final JsonAdapter<T> failOnUnknown() {
        return new C17358c();
    }

    public abstract T fromJson(JsonReader jsonReader) throws IOException;

    public final T fromJson(String str) throws IOException {
        C19893f fVar = new C19893f();
        fVar.mo72715G0(str);
        C17405q qVar = new C17405q((C19897i) fVar);
        T fromJson = fromJson((JsonReader) qVar);
        if (isLenient() || qVar.mo68426u() == JsonReader.Token.END_DOCUMENT) {
            return fromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson((JsonReader) new C17408t(obj));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public JsonAdapter<T> indent(String str) {
        if (str != null) {
            return new C17359d(str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final JsonAdapter<T> lenient() {
        return new C17357b();
    }

    public final JsonAdapter<T> nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    public final JsonAdapter<T> nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    public final JsonAdapter<T> serializeNulls() {
        return new C17356a();
    }

    public final String toJson(T t) {
        C19893f fVar = new C19893f();
        try {
            toJson((C19896h) fVar, t);
            return fVar.mo72708B();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public abstract void toJson(C17412w wVar, T t) throws IOException;

    public final Object toJsonValue(T t) {
        C17411v vVar = new C17411v();
        try {
            toJson((C17412w) vVar, t);
            int i = vVar.f38010b;
            if (i <= 1 && (i != 1 || vVar.f38011c[i - 1] == 7)) {
                return vVar.f38008k[0];
            }
            throw new IllegalStateException("Incomplete document");
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void toJson(C19896h hVar, T t) throws IOException {
        toJson((C17412w) new C17407s(hVar), t);
    }

    public final T fromJson(C19897i iVar) throws IOException {
        return fromJson((JsonReader) new C17405q(iVar));
    }
}

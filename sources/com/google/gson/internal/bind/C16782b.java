package com.google.gson.internal.bind;

import com.google.gson.C16798l;
import com.google.gson.C16800n;
import com.google.gson.C16801o;
import com.google.gson.C16802p;
import com.google.gson.C16803q;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.bind.b */
public final class C16782b extends JsonWriter {

    /* renamed from: e */
    public static final C16783a f37090e = new C16783a();

    /* renamed from: f */
    public static final C16803q f37091f = new C16803q("closed");

    /* renamed from: b */
    public final ArrayList f37092b = new ArrayList();

    /* renamed from: c */
    public String f37093c;

    /* renamed from: d */
    public C16800n f37094d = C16801o.f37122b;

    /* renamed from: com.google.gson.internal.bind.b$a */
    public class C16783a extends Writer {
        public final void close() throws IOException {
            throw new AssertionError();
        }

        public final void flush() throws IOException {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C16782b() {
        super(f37090e);
    }

    /* renamed from: a */
    public final C16800n mo59606a() {
        ArrayList arrayList = this.f37092b;
        return (C16800n) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: b */
    public final void mo59607b(C16800n nVar) {
        if (this.f37093c != null) {
            nVar.getClass();
            if (!(nVar instanceof C16801o) || getSerializeNulls()) {
                ((C16802p) mo59606a()).f37123b.put(this.f37093c, nVar);
            }
            this.f37093c = null;
        } else if (this.f37092b.isEmpty()) {
            this.f37094d = nVar;
        } else {
            C16800n a = mo59606a();
            if (a instanceof C16798l) {
                C16798l lVar = (C16798l) a;
                if (nVar == null) {
                    lVar.getClass();
                    nVar = C16801o.f37122b;
                }
                lVar.f37121b.add(nVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final JsonWriter beginArray() throws IOException {
        C16798l lVar = new C16798l();
        mo59607b(lVar);
        this.f37092b.add(lVar);
        return this;
    }

    public final JsonWriter beginObject() throws IOException {
        C16802p pVar = new C16802p();
        mo59607b(pVar);
        this.f37092b.add(pVar);
        return this;
    }

    public final void close() throws IOException {
        if (this.f37092b.isEmpty()) {
            this.f37092b.add(f37091f);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final JsonWriter endArray() throws IOException {
        if (this.f37092b.isEmpty() || this.f37093c != null) {
            throw new IllegalStateException();
        } else if (mo59606a() instanceof C16798l) {
            ArrayList arrayList = this.f37092b;
            arrayList.remove(arrayList.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter endObject() throws IOException {
        if (this.f37092b.isEmpty() || this.f37093c != null) {
            throw new IllegalStateException();
        } else if (mo59606a() instanceof C16802p) {
            ArrayList arrayList = this.f37092b;
            arrayList.remove(arrayList.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void flush() throws IOException {
    }

    public final JsonWriter name(String str) throws IOException {
        if (this.f37092b.isEmpty() || this.f37093c != null) {
            throw new IllegalStateException();
        } else if (mo59606a() instanceof C16802p) {
            this.f37093c = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter nullValue() throws IOException {
        mo59607b(C16801o.f37122b);
        return this;
    }

    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            mo59607b(C16801o.f37122b);
            return this;
        }
        mo59607b(new C16803q(bool));
        return this;
    }

    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            mo59607b(C16801o.f37122b);
            return this;
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        mo59607b(new C16803q(number));
        return this;
    }

    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            mo59607b(C16801o.f37122b);
            return this;
        }
        mo59607b(new C16803q(str));
        return this;
    }

    public final JsonWriter value(boolean z) throws IOException {
        mo59607b(new C16803q(Boolean.valueOf(z)));
        return this;
    }

    public final JsonWriter value(double d) throws IOException {
        if (isLenient() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            mo59607b(new C16803q((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    public final JsonWriter value(long j) throws IOException {
        mo59607b(new C16803q((Number) Long.valueOf(j)));
        return this;
    }
}

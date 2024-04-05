package p305z7;

import com.fasterxml.jackson.core.JsonFactory;
import p305z7.C8466h;

/* renamed from: z7.e */
public final class C8462e {

    /* renamed from: e */
    public static final C8462e f18482e = new C8462e();

    /* renamed from: a */
    public boolean f18483a = false;

    /* renamed from: b */
    public C8466h.C8472f f18484b;

    /* renamed from: c */
    public C8466h.C8472f f18485c;

    /* renamed from: d */
    public C8466h.C8473g f18486d;

    public C8462e() {
        C8466h.C8471e eVar = C8466h.f18491a;
        this.f18485c = eVar;
        this.f18484b = eVar;
        this.f18486d = C8466h.f18492b;
    }

    /* renamed from: a */
    public final boolean mo21033a() {
        return this.f18483a;
    }

    /* renamed from: b */
    public final void mo21034b(Appendable appendable, String str) {
        if (!this.f18485c.mo21036a(str)) {
            appendable.append(str);
            return;
        }
        appendable.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        C8462e eVar = C8465g.f18488a;
        if (str != null) {
            this.f18486d.mo21035a(appendable, str);
        }
        appendable.append(JsonFactory.DEFAULT_QUOTE_CHAR);
    }
}

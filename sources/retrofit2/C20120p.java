package retrofit2;

import java.io.IOException;

/* renamed from: retrofit2.p */
public final class C20120p extends C20122r<Iterable<Object>> {

    /* renamed from: a */
    public final /* synthetic */ C20122r f44518a;

    public C20120p(C20122r rVar) {
        this.f44518a = rVar;
    }

    /* renamed from: a */
    public final void mo74375a(C20141t tVar, Object obj) throws IOException {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object a : iterable) {
                this.f44518a.mo74375a(tVar, a);
            }
        }
    }
}

package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;

/* renamed from: retrofit2.q */
public final class C20121q extends C20122r<Object> {

    /* renamed from: a */
    public final /* synthetic */ C20122r f44519a;

    public C20121q(C20122r rVar) {
        this.f44519a = rVar;
    }

    /* renamed from: a */
    public final void mo74375a(C20141t tVar, Object obj) throws IOException {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.f44519a.mo74375a(tVar, Array.get(obj, i));
            }
        }
    }
}

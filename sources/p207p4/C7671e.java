package p207p4;

import java.io.InputStream;
import java.net.URL;
import p150j4.C7114e;
import p197o4.C7575f;
import p197o4.C7588n;
import p197o4.C7590o;
import p197o4.C7596r;

/* renamed from: p4.e */
public final class C7671e implements C7588n<URL, InputStream> {

    /* renamed from: a */
    public final C7588n<C7575f, InputStream> f16993a;

    /* renamed from: p4.e$a */
    public static class C7672a implements C7590o<URL, InputStream> {
        /* renamed from: b */
        public final C7588n<URL, InputStream> mo20003b(C7596r rVar) {
            return new C7671e(rVar.mo20029b(C7575f.class, InputStream.class));
        }
    }

    public C7671e(C7588n<C7575f, InputStream> nVar) {
        this.f16993a = nVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        return this.f16993a.mo20000a(new C7575f((URL) obj), i, i2, eVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20001b(Object obj) {
        URL url = (URL) obj;
        return true;
    }
}

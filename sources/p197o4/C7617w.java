package p197o4;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.w */
public final class C7617w<Data> implements C7588n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f16893b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    public final C7588n<C7575f, Data> f16894a;

    /* renamed from: o4.w$a */
    public static class C7618a implements C7590o<Uri, InputStream> {
        /* renamed from: b */
        public final C7588n<Uri, InputStream> mo20003b(C7596r rVar) {
            return new C7617w(rVar.mo20029b(C7575f.class, InputStream.class));
        }
    }

    public C7617w(C7588n<C7575f, Data> nVar) {
        this.f16894a = nVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        return this.f16894a.mo20000a(new C7575f(((Uri) obj).toString()), i, i2, eVar);
    }

    /* renamed from: b */
    public final boolean mo20001b(Object obj) {
        return f16893b.contains(((Uri) obj).getScheme());
    }
}

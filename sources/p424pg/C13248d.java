package p424pg;

import android.webkit.ValueCallback;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;
import p424pg.C13245c;

/* renamed from: pg.d */
public final class C13248d<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C13245c f29102a;

    /* renamed from: b */
    public final /* synthetic */ C13245c.C13247b f29103b;

    public C13248d(C13245c cVar, C13245c.C13247b bVar) {
        this.f29102a = cVar;
        this.f29103b = bVar;
    }

    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        LinkedHashMap linkedHashMap = this.f29102a.f29095b;
        String str2 = this.f29103b.f29097a;
        C19383o.m32796f(str, "html");
        linkedHashMap.put(str2, str);
    }
}

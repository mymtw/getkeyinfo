package com.facebook;

import android.util.Pair;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;
import p453tf.C13426p;

/* renamed from: com.facebook.c */
public final class C12245c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f27336b;

    /* renamed from: c */
    public final /* synthetic */ C13426p f27337c;

    public C12245c(ArrayList arrayList, C13426p pVar) {
        this.f27336b = arrayList;
        this.f27337c = pVar;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                Iterator it = this.f27336b.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    Object obj = pair.second;
                    C19383o.m32796f(obj, "pair.second");
                    ((GraphRequest.C12195b) pair.first).mo39238a((GraphResponse) obj);
                }
                Iterator it2 = this.f27337c.f29414e.iterator();
                while (it2.hasNext()) {
                    ((C13426p.C13427a) it2.next()).mo39759a(this.f27337c);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}

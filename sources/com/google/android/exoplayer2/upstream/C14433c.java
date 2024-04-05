package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p505aj.C13999g;
import p505aj.C14001h;
import p505aj.C14002i;
import p505aj.C14013s;
import p513bj.C14049b0;
import p513bj.C14075p;
import p595ji.C17992d;

/* renamed from: com.google.android.exoplayer2.upstream.c */
public final class C14433c<T> implements Loader.C14427d {

    /* renamed from: a */
    public final long f32526a;

    /* renamed from: b */
    public final C14002i f32527b;

    /* renamed from: c */
    public final int f32528c;

    /* renamed from: d */
    public final C14013s f32529d;

    /* renamed from: e */
    public final C14434a<? extends T> f32530e;

    /* renamed from: f */
    public volatile T f32531f;

    /* renamed from: com.google.android.exoplayer2.upstream.c$a */
    public interface C14434a<T> {
        /* renamed from: a */
        Object mo47763a(Uri uri, C14001h hVar) throws IOException;
    }

    public C14433c() {
        throw null;
    }

    public C14433c(C13999g gVar, Uri uri, C14434a aVar) {
        Map emptyMap = Collections.emptyMap();
        Uri uri2 = uri;
        C14075p.m21697i(uri2, "The uri must be set.");
        C14002i iVar = new C14002i(uri2, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
        this.f32529d = new C14013s(gVar);
        this.f32527b = iVar;
        this.f32528c = 4;
        this.f32530e = aVar;
        this.f32526a = C17992d.f39337b.getAndIncrement();
    }

    /* renamed from: a */
    public final void mo47727a() throws IOException {
        this.f32529d.f30850b = 0;
        C14001h hVar = new C14001h(this.f32529d, this.f32527b);
        try {
            hVar.mo46817a();
            Uri uri = this.f32529d.getUri();
            uri.getClass();
            this.f32531f = this.f32530e.mo47763a(uri, hVar);
        } finally {
            int i = C14049b0.f30913a;
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo47728b() {
    }
}

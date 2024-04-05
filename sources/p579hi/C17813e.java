package p579hi;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.C14433c;
import java.io.IOException;
import java.util.List;
import p505aj.C14001h;
import p579hi.C17812d;

/* renamed from: hi.e */
public final class C17813e<T extends C17812d<T>> implements C14433c.C14434a<T> {

    /* renamed from: a */
    public final C14433c.C14434a<? extends T> f38720a;

    /* renamed from: b */
    public final List<StreamKey> f38721b;

    public C17813e(C14433c.C14434a<? extends T> aVar, List<StreamKey> list) {
        this.f38720a = aVar;
        this.f38721b = list;
    }

    /* renamed from: a */
    public final Object mo47763a(Uri uri, C14001h hVar) throws IOException {
        C17812d dVar = (C17812d) this.f38720a.mo47763a(uri, hVar);
        List<StreamKey> list = this.f38721b;
        return (list == null || list.isEmpty()) ? dVar : (C17812d) dVar.mo47783a(this.f38721b);
    }
}

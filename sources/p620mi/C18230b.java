package p620mi;

import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.hls.playlist.C14335b;
import com.google.android.exoplayer2.source.hls.playlist.C14338c;
import com.google.android.exoplayer2.upstream.C14433c;
import java.util.List;
import p579hi.C17813e;

/* renamed from: mi.b */
public final class C18230b implements C18232d {

    /* renamed from: a */
    public final C18232d f39970a;

    /* renamed from: b */
    public final List<StreamKey> f39971b;

    public C18230b(C18229a aVar, List list) {
        this.f39970a = aVar;
        this.f39971b = list;
    }

    /* renamed from: a */
    public final C14433c.C14434a<C18231c> mo69773a(C14335b bVar, C14338c cVar) {
        return new C17813e(this.f39970a.mo69773a(bVar, cVar), this.f39971b);
    }

    /* renamed from: b */
    public final C14433c.C14434a<C18231c> mo69774b() {
        return new C17813e(this.f39970a.mo69774b(), this.f39971b);
    }
}

package p620mi;

import com.google.android.exoplayer2.source.hls.playlist.C14335b;
import com.google.android.exoplayer2.source.hls.playlist.C14338c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.C14433c;

/* renamed from: mi.a */
public final class C18229a implements C18232d {
    /* renamed from: a */
    public final C14433c.C14434a<C18231c> mo69773a(C14335b bVar, C14338c cVar) {
        return new HlsPlaylistParser(bVar, cVar);
    }

    /* renamed from: b */
    public final C14433c.C14434a<C18231c> mo69774b() {
        return new HlsPlaylistParser(C14335b.f32101n, (C14338c) null);
    }
}

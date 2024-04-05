package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.C14347j;
import java.io.IOException;

public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a */
    public interface C14331a {
        /* renamed from: g */
        void mo47732g();

        /* renamed from: h */
        boolean mo47733h(Uri uri, long j);
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$b */
    public interface C14332b {
    }

    /* renamed from: a */
    void mo47766a(C14331a aVar);

    /* renamed from: b */
    void mo47767b(Uri uri) throws IOException;

    /* renamed from: c */
    long mo47768c();

    /* renamed from: d */
    C14335b mo47769d();

    /* renamed from: e */
    void mo47770e(Uri uri);

    /* renamed from: f */
    void mo47771f(C14331a aVar);

    /* renamed from: i */
    C14338c mo47772i(boolean z, Uri uri);

    /* renamed from: j */
    boolean mo47773j(Uri uri);

    /* renamed from: k */
    boolean mo47774k();

    /* renamed from: l */
    void mo47775l(Uri uri, C14347j.C14348a aVar, C14332b bVar);

    /* renamed from: n */
    void mo47776n() throws IOException;

    void stop();
}

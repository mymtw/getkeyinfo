package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.C14431b;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.lang3.time.DateUtils;

/* renamed from: com.google.android.exoplayer2.upstream.a */
public final class C14430a implements C14431b {
    /* renamed from: a */
    public final long mo48172a(C14431b.C14432a aVar) {
        int i;
        IOException iOException = aVar.f32524a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return -9223372036854775807L;
        }
        return DateUtils.MILLIS_PER_MINUTE;
    }

    /* renamed from: b */
    public final int mo48173b(int i) {
        return i == 7 ? 6 : 3;
    }

    /* renamed from: c */
    public final long mo48174c(C14431b.C14432a aVar) {
        IOException iOException = aVar.f32524a;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((aVar.f32525b - 1) * 1000, 5000);
    }
}

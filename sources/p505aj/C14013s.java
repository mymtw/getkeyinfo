package p505aj;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: aj.s */
public final class C14013s implements C13999g {

    /* renamed from: a */
    public final C13999g f30849a;

    /* renamed from: b */
    public long f30850b;

    /* renamed from: c */
    public Uri f30851c = Uri.EMPTY;

    /* renamed from: d */
    public Map<String, List<String>> f30852d = Collections.emptyMap();

    public C14013s(C13999g gVar) {
        gVar.getClass();
        this.f30849a = gVar;
    }

    /* renamed from: b */
    public final long mo46812b(C14002i iVar) throws IOException {
        this.f30851c = iVar.f30774a;
        this.f30852d = Collections.emptyMap();
        long b = this.f30849a.mo46812b(iVar);
        Uri uri = getUri();
        uri.getClass();
        this.f30851c = uri;
        this.f30852d = mo46815d();
        return b;
    }

    public final void close() throws IOException {
        this.f30849a.close();
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo46815d() {
        return this.f30849a.mo46815d();
    }

    /* renamed from: e */
    public final void mo46806e(C14014t tVar) {
        tVar.getClass();
        this.f30849a.mo46806e(tVar);
    }

    public final Uri getUri() {
        return this.f30849a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f30849a.read(bArr, i, i2);
        if (read != -1) {
            this.f30850b += (long) read;
        }
        return read;
    }
}

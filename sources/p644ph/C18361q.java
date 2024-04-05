package p644ph;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import p513bj.C14077r;
import p563fi.C17734a;

/* renamed from: ph.q */
public final class C18361q {

    /* renamed from: a */
    public final C14077r f40322a = new C14077r(10);

    /* renamed from: a */
    public final Metadata mo69892a(C18346e eVar, C17734a.C17735a aVar) throws IOException {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                eVar.mo69872c(this.f40322a.f30986a, 0, 10, false);
                this.f40322a.mo46935z(0);
                if (this.f40322a.mo46927r() != 4801587) {
                    break;
                }
                this.f40322a.mo46909A(3);
                int o = this.f40322a.mo46924o();
                int i2 = o + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f40322a.f30986a, 0, bArr, 0, 10);
                    eVar.mo69872c(bArr, 10, o, false);
                    metadata = new C17734a(aVar).mo68991u0(i2, bArr);
                } else {
                    eVar.mo69880k(o, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        eVar.f40296f = 0;
        eVar.mo69880k(i, false);
        return metadata;
    }
}

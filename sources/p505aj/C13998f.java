package p505aj;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.common.base.C15781b;
import java.io.IOException;
import java.net.URLDecoder;
import p513bj.C14049b0;

/* renamed from: aj.f */
public final class C13998f extends C13996d {

    /* renamed from: e */
    public C14002i f30765e;

    /* renamed from: f */
    public byte[] f30766f;

    /* renamed from: g */
    public int f30767g;

    /* renamed from: h */
    public int f30768h;

    public C13998f() {
        super(false);
    }

    /* renamed from: b */
    public final long mo46812b(C14002i iVar) throws IOException {
        mo46809m(iVar);
        this.f30765e = iVar;
        Uri uri = iVar.f30774a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            throw new ParserException(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        }
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = C14049b0.f30913a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f30766f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str);
                    throw new ParserException(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e);
                }
            } else {
                this.f30766f = C14049b0.m21652y(URLDecoder.decode(str, C15781b.f35560a.name()));
            }
            long j = iVar.f30779f;
            byte[] bArr = this.f30766f;
            if (j <= ((long) bArr.length)) {
                int i2 = (int) j;
                this.f30767g = i2;
                int length = bArr.length - i2;
                this.f30768h = length;
                long j2 = iVar.f30780g;
                if (j2 != -1) {
                    this.f30768h = (int) Math.min((long) length, j2);
                }
                mo46810n(iVar);
                long j3 = iVar.f30780g;
                return j3 != -1 ? j3 : (long) this.f30768h;
            }
            this.f30766f = null;
            throw new DataSourceException(0);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(valueOf3.length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw new ParserException(sb.toString());
    }

    public final void close() {
        if (this.f30766f != null) {
            this.f30766f = null;
            mo46808l();
        }
        this.f30765e = null;
    }

    public final Uri getUri() {
        C14002i iVar = this.f30765e;
        if (iVar != null) {
            return iVar.f30774a;
        }
        return null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f30768h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f30766f;
        int i4 = C14049b0.f30913a;
        System.arraycopy(bArr2, this.f30767g, bArr, i, min);
        this.f30767g += min;
        this.f30768h -= min;
        mo46807k(min);
        return min;
    }
}

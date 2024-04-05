package p592in;

import com.google.firebase.perf.p530v1.NetworkRequestMetric;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import p576gn.C17801b;

/* renamed from: in.a */
public final class C17869a extends InputStream {

    /* renamed from: b */
    public final InputStream f38794b;

    /* renamed from: c */
    public final C17801b f38795c;

    /* renamed from: d */
    public final Timer f38796d;

    /* renamed from: e */
    public long f38797e = -1;

    /* renamed from: f */
    public long f38798f;

    /* renamed from: g */
    public long f38799g = -1;

    public C17869a(InputStream inputStream, C17801b bVar, Timer timer) {
        this.f38796d = timer;
        this.f38794b = inputStream;
        this.f38795c = bVar;
        this.f38798f = ((NetworkRequestMetric) bVar.f38700e.f37158c).mo59379W();
    }

    public final int available() throws IOException {
        try {
            return this.f38794b.available();
        } catch (IOException e) {
            this.f38795c.mo69041i(this.f38796d.getDurationMicros());
            C17876h.m30013c(this.f38795c);
            throw e;
        }
    }

    public final void close() throws IOException {
        long durationMicros = this.f38796d.getDurationMicros();
        if (this.f38799g == -1) {
            this.f38799g = durationMicros;
        }
        try {
            this.f38794b.close();
            long j = this.f38797e;
            if (j != -1) {
                this.f38795c.mo69040h(j);
            }
            long j2 = this.f38798f;
            if (j2 != -1) {
                NetworkRequestMetric.C16642b bVar = this.f38795c.f38700e;
                bVar.mo59761u();
                NetworkRequestMetric.m27506G((NetworkRequestMetric) bVar.f37158c, j2);
            }
            this.f38795c.mo69041i(this.f38799g);
            this.f38795c.mo69034a();
        } catch (IOException e) {
            this.f38795c.mo69041i(this.f38796d.getDurationMicros());
            C17876h.m30013c(this.f38795c);
            throw e;
        }
    }

    public final void mark(int i) {
        this.f38794b.mark(i);
    }

    public final boolean markSupported() {
        return this.f38794b.markSupported();
    }

    public final int read() throws IOException {
        try {
            int read = this.f38794b.read();
            long durationMicros = this.f38796d.getDurationMicros();
            if (this.f38798f == -1) {
                this.f38798f = durationMicros;
            }
            if (read == -1 && this.f38799g == -1) {
                this.f38799g = durationMicros;
                this.f38795c.mo69041i(durationMicros);
                this.f38795c.mo69034a();
            } else {
                long j = this.f38797e + 1;
                this.f38797e = j;
                this.f38795c.mo69040h(j);
            }
            return read;
        } catch (IOException e) {
            this.f38795c.mo69041i(this.f38796d.getDurationMicros());
            C17876h.m30013c(this.f38795c);
            throw e;
        }
    }

    public final void reset() throws IOException {
        try {
            this.f38794b.reset();
        } catch (IOException e) {
            this.f38795c.mo69041i(this.f38796d.getDurationMicros());
            C17876h.m30013c(this.f38795c);
            throw e;
        }
    }

    public final long skip(long j) throws IOException {
        try {
            long skip = this.f38794b.skip(j);
            long durationMicros = this.f38796d.getDurationMicros();
            if (this.f38798f == -1) {
                this.f38798f = durationMicros;
            }
            if (skip == -1 && this.f38799g == -1) {
                this.f38799g = durationMicros;
                this.f38795c.mo69041i(durationMicros);
            } else {
                long j2 = this.f38797e + skip;
                this.f38797e = j2;
                this.f38795c.mo69040h(j2);
            }
            return skip;
        } catch (IOException e) {
            this.f38795c.mo69041i(this.f38796d.getDurationMicros());
            C17876h.m30013c(this.f38795c);
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f38794b.read(bArr, i, i2);
            long durationMicros = this.f38796d.getDurationMicros();
            if (this.f38798f == -1) {
                this.f38798f = durationMicros;
            }
            if (read == -1 && this.f38799g == -1) {
                this.f38799g = durationMicros;
                this.f38795c.mo69041i(durationMicros);
                this.f38795c.mo69034a();
            } else {
                long j = this.f38797e + ((long) read);
                this.f38797e = j;
                this.f38795c.mo69040h(j);
            }
            return read;
        } catch (IOException e) {
            this.f38795c.mo69041i(this.f38796d.getDurationMicros());
            C17876h.m30013c(this.f38795c);
            throw e;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        try {
            int read = this.f38794b.read(bArr);
            long durationMicros = this.f38796d.getDurationMicros();
            if (this.f38798f == -1) {
                this.f38798f = durationMicros;
            }
            if (read == -1 && this.f38799g == -1) {
                this.f38799g = durationMicros;
                this.f38795c.mo69041i(durationMicros);
                this.f38795c.mo69034a();
            } else {
                long j = this.f38797e + ((long) read);
                this.f38797e = j;
                this.f38795c.mo69040h(j);
            }
            return read;
        } catch (IOException e) {
            this.f38795c.mo69041i(this.f38796d.getDurationMicros());
            C17876h.m30013c(this.f38795c);
            throw e;
        }
    }
}

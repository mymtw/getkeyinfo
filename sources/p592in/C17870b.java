package p592in;

import com.google.firebase.perf.p530v1.NetworkRequestMetric;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import p576gn.C17801b;

/* renamed from: in.b */
public final class C17870b extends OutputStream {

    /* renamed from: b */
    public final OutputStream f38800b;

    /* renamed from: c */
    public final Timer f38801c;

    /* renamed from: d */
    public C17801b f38802d;

    /* renamed from: e */
    public long f38803e = -1;

    public C17870b(OutputStream outputStream, C17801b bVar, Timer timer) {
        this.f38800b = outputStream;
        this.f38802d = bVar;
        this.f38801c = timer;
    }

    public final void close() throws IOException {
        long j = this.f38803e;
        if (j != -1) {
            this.f38802d.mo69037e(j);
        }
        C17801b bVar = this.f38802d;
        long durationMicros = this.f38801c.getDurationMicros();
        NetworkRequestMetric.C16642b bVar2 = bVar.f38700e;
        bVar2.mo59761u();
        NetworkRequestMetric.m27505F((NetworkRequestMetric) bVar2.f37158c, durationMicros);
        try {
            this.f38800b.close();
        } catch (IOException e) {
            this.f38802d.mo69041i(this.f38801c.getDurationMicros());
            C17876h.m30013c(this.f38802d);
            throw e;
        }
    }

    public final void flush() throws IOException {
        try {
            this.f38800b.flush();
        } catch (IOException e) {
            this.f38802d.mo69041i(this.f38801c.getDurationMicros());
            C17876h.m30013c(this.f38802d);
            throw e;
        }
    }

    public final void write(int i) throws IOException {
        try {
            this.f38800b.write(i);
            long j = this.f38803e + 1;
            this.f38803e = j;
            this.f38802d.mo69037e(j);
        } catch (IOException e) {
            this.f38802d.mo69041i(this.f38801c.getDurationMicros());
            C17876h.m30013c(this.f38802d);
            throw e;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        try {
            this.f38800b.write(bArr);
            long length = this.f38803e + ((long) bArr.length);
            this.f38803e = length;
            this.f38802d.mo69037e(length);
        } catch (IOException e) {
            this.f38802d.mo69041i(this.f38801c.getDurationMicros());
            C17876h.m30013c(this.f38802d);
            throw e;
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f38800b.write(bArr, i, i2);
            long j = this.f38803e + ((long) i2);
            this.f38803e = j;
            this.f38802d.mo69037e(j);
        } catch (IOException e) {
            this.f38802d.mo69041i(this.f38801c.getDurationMicros());
            C17876h.m30013c(this.f38802d);
            throw e;
        }
    }
}

package p644ph;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import p505aj.C13997e;
import p513bj.C14077r;
import p644ph.C18368v;

/* renamed from: ph.g */
public final class C18348g implements C18368v {

    /* renamed from: a */
    public final byte[] f40300a = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: a */
    public final void mo47752a(Format format) {
    }

    /* renamed from: b */
    public final int mo47753b(C13997e eVar, int i, boolean z) throws IOException {
        int read = eVar.read(this.f40300a, 0, Math.min(this.f40300a.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public final void mo47754c(long j, int i, int i2, int i3, C18368v.C18369a aVar) {
    }

    /* renamed from: f */
    public final void mo47755f(C14077r rVar, int i) {
        rVar.mo46909A(i);
    }
}

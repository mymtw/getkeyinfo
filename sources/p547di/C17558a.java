package p547di;

import androidx.preference.C3039b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p512bi.C14044c;
import p513bj.C14077r;

/* renamed from: di.a */
public final class C17558a extends C3039b {
    /* renamed from: u0 */
    public static EventMessage m29430u0(C14077r rVar) {
        String k = rVar.mo46920k();
        k.getClass();
        String k2 = rVar.mo46920k();
        k2.getClass();
        return new EventMessage(k, k2, rVar.mo46926q(), rVar.mo46926q(), Arrays.copyOfRange(rVar.f30986a, rVar.f30987b, rVar.f30988c));
    }

    /* renamed from: n0 */
    public final Metadata mo11184n0(C14044c cVar, ByteBuffer byteBuffer) {
        return new Metadata(m29430u0(new C14077r(byteBuffer.limit(), byteBuffer.array())));
    }
}

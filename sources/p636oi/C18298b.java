package p636oi;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import p513bj.C14075p;
import p619mh.C18225f;
import p619mh.C18227g;

/* renamed from: oi.b */
public abstract class C18298b extends C18227g<C18304g, C18305h, SubtitleDecoderException> implements C18301e {
    public C18298b() {
        super(new C18304g[2], new C18305h[2]);
        C14075p.m21694f(this.f39963g == this.f39961e.length);
        for (I l : this.f39961e) {
            l.mo47271l(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
        }
    }

    /* renamed from: a */
    public final void mo69839a(long j) {
    }

    /* renamed from: e */
    public final SubtitleDecoderException mo69770e(DecoderInputBuffer decoderInputBuffer, C18225f fVar, boolean z) {
        C18304g gVar = (C18304g) decoderInputBuffer;
        C18305h hVar = (C18305h) fVar;
        try {
            ByteBuffer byteBuffer = gVar.f31493d;
            byteBuffer.getClass();
            hVar.mo69845k(gVar.f31495f, mo69840g(byteBuffer.limit(), z, byteBuffer.array()), gVar.f40183j);
            hVar.f39937b &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* renamed from: g */
    public abstract C18300d mo69840g(int i, boolean z, byte[] bArr) throws SubtitleDecoderException;
}

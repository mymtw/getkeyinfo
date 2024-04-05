package p504ai;

import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.C14240a;
import com.google.android.exoplayer2.mediacodec.C14242b;
import p520cj.C14149e;

/* renamed from: ai.a */
public final /* synthetic */ class C13974a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ C14240a f30709a;

    /* renamed from: b */
    public final /* synthetic */ C14242b.C14245c f30710b;

    public /* synthetic */ C13974a(C14240a aVar, C14242b.C14245c cVar) {
        this.f30709a = aVar;
        this.f30710b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        C14240a aVar = this.f30709a;
        C14242b.C14245c cVar = this.f30710b;
        aVar.getClass();
        ((C14149e.C14151b) cVar).mo47083b(j);
    }
}

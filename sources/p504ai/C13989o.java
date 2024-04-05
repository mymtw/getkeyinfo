package p504ai;

import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.C14242b;
import com.google.android.exoplayer2.mediacodec.C14248e;
import p520cj.C14149e;

/* renamed from: ai.o */
public final /* synthetic */ class C13989o implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ C14248e f30749a;

    /* renamed from: b */
    public final /* synthetic */ C14242b.C14245c f30750b;

    public /* synthetic */ C13989o(C14248e eVar, C14242b.C14245c cVar) {
        this.f30749a = eVar;
        this.f30750b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        C14248e eVar = this.f30749a;
        C14242b.C14245c cVar = this.f30750b;
        eVar.getClass();
        ((C14149e.C14151b) cVar).mo47083b(j);
    }
}

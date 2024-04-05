package p504ai;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.Comparator;

/* renamed from: ai.n */
public final /* synthetic */ class C13988n implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ MediaCodecUtil.C14239f f30748b;

    public /* synthetic */ C13988n(MediaCodecUtil.C14239f fVar) {
        this.f30748b = fVar;
    }

    public final int compare(Object obj, Object obj2) {
        MediaCodecUtil.C14239f fVar = this.f30748b;
        return fVar.mo3372e(obj2) - fVar.mo3372e(obj);
    }
}

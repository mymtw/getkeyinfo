package p504ai;

import android.os.HandlerThread;
import com.google.android.exoplayer2.mediacodec.C14240a;
import com.google.common.base.C15804s;

/* renamed from: ai.b */
public final /* synthetic */ class C13975b implements C15804s {

    /* renamed from: b */
    public final /* synthetic */ int f30711b;

    public /* synthetic */ C13975b(int i) {
        this.f30711b = i;
    }

    public final Object get() {
        return new HandlerThread(C14240a.m22281o(this.f30711b, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }
}

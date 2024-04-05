package p504ai;

import android.os.HandlerThread;
import com.google.android.exoplayer2.mediacodec.C14240a;
import com.google.common.base.C15804s;

/* renamed from: ai.c */
public final /* synthetic */ class C13976c implements C15804s {

    /* renamed from: b */
    public final /* synthetic */ int f30712b;

    public /* synthetic */ C13976c(int i) {
        this.f30712b = i;
    }

    public final Object get() {
        return new HandlerThread(C14240a.m22281o(this.f30712b, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}

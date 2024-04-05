package p633no;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import java.util.concurrent.Callable;

/* renamed from: no.b */
public final /* synthetic */ class C18284b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ MediaCodecInfo f40134b;

    public /* synthetic */ C18284b(MediaCodecInfo mediaCodecInfo) {
        this.f40134b = mediaCodecInfo;
    }

    public final Object call() {
        return MediaCodec.createByCodecName(this.f40134b.getName());
    }
}

package p635oh;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.C14224f;
import com.google.android.exoplayer2.drm.C14229g;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;

/* renamed from: oh.d */
public final /* synthetic */ class C18294d implements MediaDrm.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ C14229g f40144a;

    /* renamed from: b */
    public final /* synthetic */ C14224f.C14226b f40145b;

    public /* synthetic */ C18294d(C14229g gVar, DefaultDrmSessionManager.C14208b bVar) {
        this.f40144a = gVar;
        this.f40145b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        C14229g gVar = this.f40144a;
        C14224f.C14226b bVar = this.f40145b;
        gVar.getClass();
        DefaultDrmSessionManager.C14209c cVar = DefaultDrmSessionManager.this.f31552y;
        cVar.getClass();
        cVar.obtainMessage(i, bArr).sendToTarget();
    }
}

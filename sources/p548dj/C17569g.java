package p548dj;

import android.graphics.SurfaceTexture;

/* renamed from: dj.g */
public final /* synthetic */ class C17569g implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b */
    public final /* synthetic */ C17570h f38428b;

    public /* synthetic */ C17569g(C17570h hVar) {
        this.f38428b = hVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f38428b.f38429b.set(true);
    }
}

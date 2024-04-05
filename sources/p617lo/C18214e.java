package p617lo;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import p388lb.C13006a;

/* renamed from: lo.e */
public final class C18214e implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b */
    public SurfaceTexture f39921b;

    /* renamed from: c */
    public Surface f39922c;

    /* renamed from: d */
    public int f39923d;

    /* renamed from: e */
    public final Object f39924e = new Object();

    /* renamed from: f */
    public boolean f39925f;

    public C18214e() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        C13006a.m20718g("glBindTexture textureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        C13006a.m20718g("glTexParameter");
        this.f39923d = i;
        this.f39921b = new SurfaceTexture(this.f39923d);
        this.f39922c = new Surface(this.f39921b);
        this.f39921b.setOnFrameAvailableListener(this);
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f39924e) {
            if (!this.f39925f) {
                this.f39925f = true;
                this.f39924e.notifyAll();
            } else {
                throw new RuntimeException("frameAvailable already set, frame could be dropped");
            }
        }
    }
}

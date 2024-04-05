package com.linkedin.android.litr.preview;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p145io.C17877a;
import p585ho.C17837c;

public class VideoPreviewRenderer implements GLSurfaceView.Renderer {
    private static final int GL_TEXTURE_EXTERNAL_OES = 36197;
    private static final String TAG = "VideoPreviewRenderer";
    /* access modifiers changed from: private */
    public C17837c frameRenderFilter;
    private final C17047c inputSurfaceTextureListener;
    /* access modifiers changed from: private */
    public float[] mvpMatrix = new float[16];
    private SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = new C17045a();
    /* access modifiers changed from: private */
    public C17048d previewRenderListener;
    /* access modifiers changed from: private */
    public SurfaceTexture previewSurfaceTexture;
    private float[] stMatrix = new float[16];
    private int textureHandle;

    /* renamed from: com.linkedin.android.litr.preview.VideoPreviewRenderer$a */
    public class C17045a implements SurfaceTexture.OnFrameAvailableListener {
        public C17045a() {
        }

        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            VideoFilterPreviewView.this.requestRender();
        }
    }

    /* renamed from: com.linkedin.android.litr.preview.VideoPreviewRenderer$b */
    public class C17046b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C17837c f37417b;

        public C17046b(C17837c cVar) {
            this.f37417b = cVar;
        }

        public final void run() {
            VideoPreviewRenderer.this.frameRenderFilter.release();
            if (VideoPreviewRenderer.this.previewSurfaceTexture != null) {
                this.f37417b.mo69069a();
                this.f37417b.mo69071b(Arrays.copyOf(VideoPreviewRenderer.this.mvpMatrix, VideoPreviewRenderer.this.mvpMatrix.length));
            }
            C17837c unused = VideoPreviewRenderer.this.frameRenderFilter = this.f37417b;
        }
    }

    /* renamed from: com.linkedin.android.litr.preview.VideoPreviewRenderer$c */
    public interface C17047c {
        /* renamed from: a */
        void mo60323a();
    }

    /* renamed from: com.linkedin.android.litr.preview.VideoPreviewRenderer$d */
    public interface C17048d {
    }

    static {
        Class<VideoPreviewRenderer> cls = VideoPreviewRenderer.class;
    }

    public VideoPreviewRenderer(C17047c cVar) {
        this.inputSurfaceTextureListener = cVar;
        this.frameRenderFilter = new C17877a();
        Matrix.setIdentityM(this.stMatrix, 0);
    }

    private void initMvpMatrix(float f) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        float f2 = f;
        Matrix.orthoM(fArr, 0, -f2, f2, -1.0f, 1.0f, -1.0f, 1.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.mvpMatrix, 0);
        Matrix.multiplyMM(this.mvpMatrix, 0, fArr, 0, fArr2, 0);
    }

    public void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            this.previewSurfaceTexture.updateTexImage();
            this.previewSurfaceTexture.getTransformMatrix(this.stMatrix);
        }
        GLES20.glClear(PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
        this.frameRenderFilter.mo69073c(this.stMatrix, this.textureHandle);
        C17837c cVar = this.frameRenderFilter;
        this.previewSurfaceTexture.getTimestamp();
        cVar.apply();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        initMvpMatrix(((float) i) / ((float) i2));
        C17837c cVar = this.frameRenderFilter;
        float[] fArr = this.mvpMatrix;
        cVar.mo69071b(Arrays.copyOf(fArr, fArr.length));
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.textureHandle = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textureHandle);
        this.previewSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this.onFrameAvailableListener);
        GLES20.glBindTexture(GL_TEXTURE_EXTERNAL_OES, this.textureHandle);
        GLES20.glTexParameterf(GL_TEXTURE_EXTERNAL_OES, 10240, 9729.0f);
        GLES20.glTexParameterf(GL_TEXTURE_EXTERNAL_OES, 10241, 9728.0f);
        GLES20.glTexParameteri(GL_TEXTURE_EXTERNAL_OES, 10242, 33071);
        GLES20.glTexParameteri(GL_TEXTURE_EXTERNAL_OES, 10243, 33071);
        GLES20.glBindTexture(3553, 0);
        this.inputSurfaceTextureListener.mo60323a();
        this.frameRenderFilter.mo69069a();
        GLES20.glGetIntegerv(3379, iArr, 0);
    }

    public void release() {
        this.frameRenderFilter.release();
        SurfaceTexture surfaceTexture = this.previewSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void setFilter(C17837c cVar) {
        C17048d dVar;
        if (this.frameRenderFilter != cVar && (dVar = this.previewRenderListener) != null) {
            VideoFilterPreviewView.this.queueEvent(new C17046b(cVar));
        }
    }

    public void setPreviewRenderListener(C17048d dVar) {
        this.previewRenderListener = dVar;
    }
}

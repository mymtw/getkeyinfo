package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.google.android.play.core.assetpacks.C15588c1;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p520cj.C14152f;
import p520cj.C14153g;

public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements C14153g {
    private final C14440a renderer;

    /* renamed from: com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView$a */
    public static final class C14440a implements GLSurfaceView.Renderer {

        /* renamed from: k */
        public static final float[] f32537k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: l */
        public static final String[] f32538l = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: m */
        public static final FloatBuffer f32539m = C15588c1.m25302R(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: b */
        public final GLSurfaceView f32540b;

        /* renamed from: c */
        public final int[] f32541c = new int[3];

        /* renamed from: d */
        public final int[] f32542d = new int[3];

        /* renamed from: e */
        public final int[] f32543e = new int[3];

        /* renamed from: f */
        public final int[] f32544f = new int[3];

        /* renamed from: g */
        public final AtomicReference<C14152f> f32545g = new AtomicReference<>();

        /* renamed from: h */
        public int f32546h;

        /* renamed from: i */
        public int f32547i;

        /* renamed from: j */
        public C14152f f32548j;

        public C14440a(GLSurfaceView gLSurfaceView) {
            this.f32540b = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f32543e;
                this.f32544f[i] = -1;
                iArr[i] = -1;
            }
        }

        public final void onDrawFrame(GL10 gl10) {
            C14152f andSet = this.f32545g.getAndSet((Object) null);
            if (andSet != null || this.f32548j != null) {
                if (andSet != null) {
                    C14152f fVar = this.f32548j;
                    if (fVar != null) {
                        fVar.getClass();
                        throw null;
                    }
                    this.f32548j = andSet;
                }
                this.f32548j.getClass();
                GLES20.glUniformMatrix3fv(this.f32547i, 1, false, f32537k, 0);
                throw null;
            }
        }

        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int P = C15588c1.m25298P("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f32546h = P;
            GLES20.glUseProgram(P);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f32546h, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, f32539m);
            this.f32542d[0] = GLES20.glGetAttribLocation(this.f32546h, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f32542d[0]);
            this.f32542d[1] = GLES20.glGetAttribLocation(this.f32546h, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f32542d[1]);
            this.f32542d[2] = GLES20.glGetAttribLocation(this.f32546h, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f32542d[2]);
            C15588c1.m25292M();
            this.f32547i = GLES20.glGetUniformLocation(this.f32546h, "mColorConversion");
            C15588c1.m25292M();
            GLES20.glGenTextures(3, this.f32541c, 0);
            for (int i = 0; i < 3; i++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f32546h, f32538l[i]), i);
                GLES20.glActiveTexture(33984 + i);
                GLES20.glBindTexture(3553, this.f32541c[i]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            C15588c1.m25292M();
            C15588c1.m25292M();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    @Deprecated
    public C14153g getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(C14152f fVar) {
        C14440a aVar = this.renderer;
        if (aVar.f32545g.getAndSet(fVar) == null) {
            aVar.f32540b.requestRender();
            return;
        }
        throw null;
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14440a aVar = new C14440a(this);
        this.renderer = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}

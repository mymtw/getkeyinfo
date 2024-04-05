package p145io;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.appboy.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p388lb.C13006a;
import p585ho.C17837c;
import p585ho.C17838d;

/* renamed from: io.a */
public final class C17877a implements C17837c {

    /* renamed from: a */
    public final C17838d f38821a = new C17838d(new PointF(1.0f, 1.0f), new PointF(0.5f, 0.5f));

    /* renamed from: b */
    public float[] f38822b = new float[16];

    /* renamed from: c */
    public float[] f38823c = new float[16];

    /* renamed from: d */
    public int f38824d;

    /* renamed from: e */
    public FloatBuffer f38825e;

    /* renamed from: f */
    public int f38826f;

    /* renamed from: g */
    public int f38827g;

    /* renamed from: h */
    public int f38828h;

    /* renamed from: i */
    public int f38829i;

    /* renamed from: j */
    public int f38830j;

    /* renamed from: k */
    public int f38831k;

    /* renamed from: l */
    public int f38832l;

    /* renamed from: m */
    public int f38833m;

    public C17877a() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f38825e = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
    }

    /* renamed from: a */
    public final void mo69069a() {
        int i = 0;
        Matrix.setIdentityM(this.f38823c, 0);
        int o = C13006a.m20725o(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main()\n{\ngl_Position = uMVPMatrix * aPosition;\nvTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}");
        this.f38826f = o;
        if (o != 0) {
            int o2 = C13006a.m20725o(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()\n{\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
            this.f38827g = o2;
            if (o2 != 0) {
                int i2 = this.f38826f;
                int glCreateProgram = GLES20.glCreateProgram();
                C13006a.m20718g("glCreateProgram");
                if (glCreateProgram == 0) {
                    Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, "Could not create glProgram");
                }
                GLES20.glAttachShader(glCreateProgram, i2);
                C13006a.m20718g("glAttachShader");
                GLES20.glAttachShader(glCreateProgram, o2);
                C13006a.m20718g("glAttachShader");
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, "Could not link glProgram: ");
                    Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, GLES20.glGetProgramInfoLog(glCreateProgram));
                    GLES20.glDeleteProgram(glCreateProgram);
                } else {
                    i = glCreateProgram;
                }
                this.f38828h = i;
                if (i != 0) {
                    this.f38832l = GLES20.glGetAttribLocation(i, "aPosition");
                    C13006a.m20718g("glGetAttribLocation aPosition");
                    if (this.f38832l != -1) {
                        this.f38833m = GLES20.glGetAttribLocation(this.f38828h, "aTextureCoord");
                        C13006a.m20718g("glGetAttribLocation aTextureCoord");
                        if (this.f38833m != -1) {
                            this.f38829i = GLES20.glGetUniformLocation(this.f38828h, "uMVPMatrix");
                            C13006a.m20718g("glGetUniformLocation uMVPMatrix");
                            if (this.f38829i != -1) {
                                this.f38830j = GLES20.glGetUniformLocation(this.f38828h, "uSTMatrix");
                                C13006a.m20718g("glGetUniformLocation uSTMatrix");
                                if (this.f38830j == -1) {
                                    throw new RuntimeException("Could not get attrib location for uSTMatrix");
                                }
                                return;
                            }
                            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                        }
                        throw new RuntimeException("Could not get attrib location for aTextureCoord");
                    }
                    throw new RuntimeException("Could not get attrib location for aPosition");
                }
                release();
                throw new RuntimeException("failed creating glProgram");
            }
            release();
            throw new RuntimeException("failed loading fragment shader");
        }
        throw new RuntimeException("failed loading vertex shader");
    }

    public final void apply() {
        this.f38825e.position(0);
        GLES20.glVertexAttribPointer(this.f38832l, 3, 5126, false, 20, this.f38825e);
        C13006a.m20718g("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f38832l);
        C13006a.m20718g("glEnableVertexAttribArray aPositionHandle");
        this.f38825e.position(3);
        GLES20.glVertexAttribPointer(this.f38833m, 2, 5126, false, 20, this.f38825e);
        C13006a.m20718g("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f38833m);
        C13006a.m20718g("glEnableVertexAttribArray aTextureHandle");
        C13006a.m20718g("onDrawFrame start");
        GLES20.glUseProgram(this.f38828h);
        C13006a.m20718g("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f38831k);
        GLES20.glUniformMatrix4fv(this.f38829i, 1, false, this.f38822b, this.f38824d);
        GLES20.glUniformMatrix4fv(this.f38830j, 1, false, this.f38823c, 0);
        GLES20.glDrawArrays(5, 0, 4);
        C13006a.m20718g("glDrawArrays");
    }

    /* renamed from: b */
    public final void mo69071b(float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        C17838d dVar = this.f38821a;
        float f5 = fArr[0];
        boolean z = f5 == 0.0f;
        float abs = 1.0f / (z ? Math.abs(fArr[4]) : Math.abs(f5));
        if (z) {
            PointF pointF = dVar.f38751a;
            f = pointF.x;
            f2 = pointF.y * abs;
        } else {
            PointF pointF2 = dVar.f38751a;
            f = pointF2.x * abs;
            f2 = pointF2.y;
        }
        if (z) {
            PointF pointF3 = dVar.f38752b;
            f3 = (pointF3.x * 2.0f) - 1.0f;
            f4 = (1.0f - (pointF3.y * 2.0f)) * abs;
        } else {
            PointF pointF4 = dVar.f38752b;
            f3 = ((pointF4.x * 2.0f) - 1.0f) * abs;
            f4 = 1.0f - (pointF4.y * 2.0f);
        }
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, f3, f4, 0.0f);
        dVar.getClass();
        Matrix.rotateM(fArr2, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr2, 0, f, f2, 1.0f);
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        this.f38822b = fArr3;
        this.f38824d = 0;
    }

    /* renamed from: c */
    public final void mo69073c(float[] fArr, int i) {
        this.f38831k = i;
        this.f38823c = fArr;
    }

    public final void release() {
        GLES20.glDeleteProgram(this.f38828h);
        GLES20.glDeleteShader(this.f38826f);
        GLES20.glDeleteShader(this.f38827g);
        GLES20.glDeleteBuffers(1, new int[]{this.f38833m}, 0);
        this.f38828h = 0;
        this.f38826f = 0;
        this.f38827g = 0;
        this.f38833m = 0;
    }
}

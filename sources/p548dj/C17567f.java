package p548dj;

import com.google.android.play.core.assetpacks.C15588c1;
import java.nio.FloatBuffer;
import p548dj.C17563d;

/* renamed from: dj.f */
public final class C17567f {

    /* renamed from: i */
    public static final String[] f38411i = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: j */
    public static final String[] f38412j = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: k */
    public static final float[] f38413k = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: l */
    public static final float[] f38414l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: m */
    public static final float[] f38415m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public int f38416a;

    /* renamed from: b */
    public C17568a f38417b;

    /* renamed from: c */
    public int f38418c;

    /* renamed from: d */
    public int f38419d;

    /* renamed from: e */
    public int f38420e;

    /* renamed from: f */
    public int f38421f;

    /* renamed from: g */
    public int f38422g;

    /* renamed from: h */
    public int f38423h;

    /* renamed from: dj.f$a */
    public static class C17568a {

        /* renamed from: a */
        public final int f38424a;

        /* renamed from: b */
        public final FloatBuffer f38425b;

        /* renamed from: c */
        public final FloatBuffer f38426c;

        /* renamed from: d */
        public final int f38427d;

        public C17568a(C17563d.C17565b bVar) {
            float[] fArr = bVar.f38409c;
            this.f38424a = fArr.length / 3;
            this.f38425b = C15588c1.m25302R(fArr);
            this.f38426c = C15588c1.m25302R(bVar.f38410d);
            int i = bVar.f38408b;
            if (i == 1) {
                this.f38427d = 5;
            } else if (i != 2) {
                this.f38427d = 4;
            } else {
                this.f38427d = 6;
            }
        }
    }

    /* renamed from: a */
    public static boolean m29437a(C17563d dVar) {
        C17563d.C17564a aVar = dVar.f38402a;
        C17563d.C17564a aVar2 = dVar.f38403b;
        C17563d.C17565b[] bVarArr = aVar.f38406a;
        if (bVarArr.length != 1 || bVarArr[0].f38407a != 0) {
            return false;
        }
        C17563d.C17565b[] bVarArr2 = aVar2.f38406a;
        return bVarArr2.length == 1 && bVarArr2[0].f38407a == 0;
    }
}

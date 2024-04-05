package androidx.compose.p015ui.graphics.colorspace;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import p568fn.C17782b;

/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpaces */
public final class ColorSpaces {

    /* renamed from: a */
    public static final float[] f3224a;

    /* renamed from: b */
    public static final float[] f3225b;

    /* renamed from: c */
    public static final Rgb f3226c;

    /* renamed from: d */
    public static final Rgb f3227d;

    /* renamed from: e */
    public static final Rgb f3228e;

    /* renamed from: f */
    public static final Rgb f3229f;

    /* renamed from: g */
    public static final Rgb f3230g;

    /* renamed from: h */
    public static final Rgb f3231h;

    /* renamed from: i */
    public static final Rgb f3232i;

    /* renamed from: j */
    public static final Rgb f3233j;

    /* renamed from: k */
    public static final Rgb f3234k;

    /* renamed from: l */
    public static final Rgb f3235l;

    /* renamed from: m */
    public static final Rgb f3236m;

    /* renamed from: n */
    public static final Rgb f3237n;

    /* renamed from: o */
    public static final Rgb f3238o;

    /* renamed from: p */
    public static final Rgb f3239p;

    /* renamed from: q */
    public static final C1513j f3240q;

    /* renamed from: r */
    public static final C1509f f3241r;

    /* renamed from: s */
    public static final Rgb f3242s;

    /* renamed from: t */
    public static final C1510g f3243t;

    /* renamed from: u */
    public static final C1505c[] f3244u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f3224a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f3225b = fArr2;
        C1511h hVar = new C1511h(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1511h hVar2 = new C1511h(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1512i iVar = C17782b.f38635f;
        float[] fArr3 = fArr;
        C1512i iVar2 = iVar;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr3, iVar2, hVar, 0);
        f3226c = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr3, iVar2, 1.0d, 0.0f, 1.0f, 1);
        f3227d = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr3, iVar2, (float[]) null, ColorSpaces$ExtendedSrgb$1.INSTANCE, ColorSpaces$ExtendedSrgb$2.INSTANCE, -0.799f, 2.399f, hVar, 2);
        f3228e = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr3, iVar2, 1.0d, -0.5f, 7.499f, 3);
        f3229f = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, iVar2, new C1511h(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f3230g = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, iVar2, new C1511h(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f3231h = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C1512i(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f3232i = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, iVar, hVar, 7);
        f3233j = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, C17782b.f38632c, new C1511h(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f3234k = rgb9;
        C1512i iVar3 = iVar;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, iVar3, new C1511h(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f3235l = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, iVar3, 2.2d, 0.0f, 1.0f, 10);
        f3236m = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, C17782b.f38633d, new C1511h(1.8d, 1.0d, ShadowDrawableWrapper.COS_45, 0.0625d, 0.031248d), 11);
        f3237n = rgb12;
        C1512i iVar4 = C17782b.f38634e;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, iVar4, 1.0d, -65504.0f, 65504.0f, 12);
        f3238o = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, iVar4, 1.0d, -65504.0f, 65504.0f, 13);
        f3239p = rgb14;
        C1513j jVar = new C1513j();
        f3240q = jVar;
        C1509f fVar = new C1509f();
        f3241r = fVar;
        Rgb rgb15 = new Rgb("None", fArr, iVar3, hVar2, 16);
        f3242s = rgb15;
        C1510g gVar = new C1510g();
        f3243t = gVar;
        f3244u = new C1505c[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, jVar, fVar, rgb15, gVar};
    }
}

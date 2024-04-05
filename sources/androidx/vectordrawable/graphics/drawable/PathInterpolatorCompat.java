package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.C0326j;
import org.xmlpull.v1.XmlPullParser;
import p003a2.C0023f;
import p195o2.C7511a;
import p280x0.C8299j;
import p289y0.C8354f;

public class PathInterpolatorCompat implements Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private static final float PRECISION = 0.002f;

    /* renamed from: mX */
    private float[] f7724mX;

    /* renamed from: mY */
    private float[] f7725mY;

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void initCubic(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / PRECISION)) + 1);
        if (min > 0) {
            this.f7724mX = new float[min];
            this.f7725mY = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f7724mX[i2] = fArr[0];
                this.f7725mY[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f7724mX[0])) <= 1.0E-5d && ((double) Math.abs(this.f7725mY[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f7724mX[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f7725mY[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f7724mX;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder h = C0072d.m201h("The Path must start at (0,0) and end at (1,1) start: ");
            h.append(this.f7724mX[0]);
            h.append(",");
            h.append(this.f7725mY[0]);
            h.append(" end:");
            int i6 = min - 1;
            h.append(this.f7724mX[i6]);
            h.append(",");
            h.append(this.f7725mY[i6]);
            throw new IllegalArgumentException(h.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void initQuad(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        initPath(path);
    }

    private void parseInterpolatorFromTypeArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C8299j.m16595h(xmlPullParser, "pathData")) {
            String f = C8299j.m16593f(typedArray, xmlPullParser, "pathData", 4);
            Path d = C8354f.m16674d(f);
            if (d != null) {
                initPath(d);
                return;
            }
            throw new InflateException(C0326j.m864i("The path is null, which is created from ", f));
        } else if (!C8299j.m16595h(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C8299j.m16595h(xmlPullParser, "controlY1")) {
            float d2 = C8299j.m16591d(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float d3 = C8299j.m16591d(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean h = C8299j.m16595h(xmlPullParser, "controlX2");
            if (h != C8299j.m16595h(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!h) {
                initQuad(d2, d3);
            } else {
                initCubic(d2, d3, C8299j.m16591d(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C8299j.m16591d(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f7724mX.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f7724mX[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f7724mX;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f7725mY[i];
        }
        float[] fArr2 = this.f7725mY;
        float f5 = fArr2[i];
        return C0023f.m103b(fArr2[length], f5, (f - f3) / f4, f5);
    }

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray i = C8299j.m16596i(resources, theme, attributeSet, C7511a.f16762g);
        parseInterpolatorFromTypeArray(i, xmlPullParser);
        i.recycle();
    }
}

package p177m3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C4828c;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.C4845a;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p113g3.C6842c;
import p125h3.C6928a;
import p125h3.C6942n;
import p125h3.C6944p;
import p149j3.C7101b;
import p149j3.C7102c;
import p158k3.C7178a;
import p158k3.C7179b;
import p158k3.C7187j;
import p167l3.C7243i;
import p173m.C7279a;
import p193o.C7498f;
import p206p3.C7659e;
import p214q3.C7720c;

/* renamed from: m3.f */
public final class C7318f extends C4845a {

    /* renamed from: A */
    public final HashMap f16219A = new HashMap();

    /* renamed from: B */
    public final C7498f<String> f16220B = new C7498f<>();

    /* renamed from: C */
    public final C6942n f16221C;

    /* renamed from: D */
    public final LottieDrawable f16222D;

    /* renamed from: E */
    public final C4828c f16223E;

    /* renamed from: F */
    public C6928a<Integer, Integer> f16224F;

    /* renamed from: G */
    public C6928a<Integer, Integer> f16225G;

    /* renamed from: H */
    public C6928a<Float, Float> f16226H;

    /* renamed from: I */
    public C6928a<Float, Float> f16227I;

    /* renamed from: v */
    public final StringBuilder f16228v = new StringBuilder(2);

    /* renamed from: w */
    public final RectF f16229w = new RectF();

    /* renamed from: x */
    public final Matrix f16230x = new Matrix();

    /* renamed from: y */
    public final C7319a f16231y = new C7319a();

    /* renamed from: z */
    public final C7320b f16232z = new C7320b();

    /* renamed from: m3.f$a */
    public class C7319a extends Paint {
        public C7319a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: m3.f$b */
    public class C7320b extends Paint {
        public C7320b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: m3.f$c */
    public static /* synthetic */ class C7321c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16233a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.model.DocumentData$Justification[] r0 = com.airbnb.lottie.model.DocumentData.Justification.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16233a = r0
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16233a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16233a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p177m3.C7318f.C7321c.<clinit>():void");
        }
    }

    public C7318f(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        C7179b bVar;
        C7179b bVar2;
        C7178a aVar;
        C7178a aVar2;
        this.f16222D = lottieDrawable;
        this.f16223E = layer.f10963b;
        C6942n nVar = new C6942n((List) layer.f10978q.f15969c);
        this.f16221C = nVar;
        nVar.mo19077a(this);
        mo14606e(nVar);
        C7187j jVar = layer.f10979r;
        if (!(jVar == null || (aVar2 = jVar.f15955a) == null)) {
            C6928a<Integer, Integer> a = aVar2.mo19485a();
            this.f16224F = a;
            a.mo19077a(this);
            mo14606e(this.f16224F);
        }
        if (!(jVar == null || (aVar = jVar.f15956b) == null)) {
            C6928a<Integer, Integer> a2 = aVar.mo19485a();
            this.f16225G = a2;
            a2.mo19077a(this);
            mo14606e(this.f16225G);
        }
        if (!(jVar == null || (bVar2 = jVar.f15957c) == null)) {
            C6928a<Float, Float> a3 = bVar2.mo19485a();
            this.f16226H = a3;
            a3.mo19077a(this);
            mo14606e(this.f16226H);
        }
        if (jVar != null && (bVar = jVar.f15958d) != null) {
            C6928a<Float, Float> a4 = bVar.mo19485a();
            this.f16227I = a4;
            a4.mo19077a(this);
            mo14606e(this.f16227I);
        }
    }

    /* renamed from: p */
    public static void m14040p(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = C7321c.f16233a[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: q */
    public static void m14041q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: r */
    public static void m14042r(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        super.mo14604c(cVar, obj);
        if (obj == C4840k.f10876a) {
            C6928a<Integer, Integer> aVar = this.f16224F;
            if (aVar != null) {
                aVar.mo19087k(cVar);
            } else if (cVar == null) {
                if (aVar != null) {
                    mo14615m(aVar);
                }
                this.f16224F = null;
            } else {
                C6944p pVar = new C6944p(cVar, null);
                this.f16224F = pVar;
                pVar.mo19077a(this);
                mo14606e(this.f16224F);
            }
        } else if (obj == C4840k.f10877b) {
            C6928a<Integer, Integer> aVar2 = this.f16225G;
            if (aVar2 != null) {
                aVar2.mo19087k(cVar);
            } else if (cVar == null) {
                if (aVar2 != null) {
                    mo14615m(aVar2);
                }
                this.f16225G = null;
            } else {
                C6944p pVar2 = new C6944p(cVar, null);
                this.f16225G = pVar2;
                pVar2.mo19077a(this);
                mo14606e(this.f16225G);
            }
        } else if (obj == C4840k.f10890o) {
            C6928a<Float, Float> aVar3 = this.f16226H;
            if (aVar3 != null) {
                aVar3.mo19087k(cVar);
            } else if (cVar == null) {
                if (aVar3 != null) {
                    mo14615m(aVar3);
                }
                this.f16226H = null;
            } else {
                C6944p pVar3 = new C6944p(cVar, null);
                this.f16226H = pVar3;
                pVar3.mo19077a(this);
                mo14606e(this.f16226H);
            }
        } else if (obj == C4840k.f10891p) {
            C6928a<Float, Float> aVar4 = this.f16227I;
            if (aVar4 != null) {
                aVar4.mo19087k(cVar);
            } else if (cVar == null) {
                if (aVar4 != null) {
                    mo14615m(aVar4);
                }
                this.f16227I = null;
            } else {
                C6944p pVar4 = new C6944p(cVar, null);
                this.f16227I = pVar4;
                pVar4.mo19077a(this);
                mo14606e(this.f16227I);
            }
        }
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        super.mo14605d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f16223E.f10850j.width(), (float) this.f16223E.f10850j.height());
    }

    /* renamed from: j */
    public final void mo14612j(Canvas canvas, Matrix matrix, int i) {
        List list;
        String str;
        String str2;
        int i2;
        float f;
        List list2;
        int i3;
        List list3;
        String str3;
        int i4;
        Canvas canvas2 = canvas;
        canvas.save();
        if (!this.f16222D.useTextGlyphs()) {
            canvas.setMatrix(matrix);
        }
        DocumentData documentData = (DocumentData) this.f16221C.mo19083g();
        C7101b bVar = this.f16223E.f10845e.get(documentData.f10906b);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        C6928a<Integer, Integer> aVar = this.f16224F;
        if (aVar != null) {
            this.f16231y.setColor(aVar.mo19083g().intValue());
        } else {
            this.f16231y.setColor(documentData.f10912h);
        }
        C6928a<Integer, Integer> aVar2 = this.f16225G;
        if (aVar2 != null) {
            this.f16232z.setColor(aVar2.mo19083g().intValue());
        } else {
            this.f16232z.setColor(documentData.f10913i);
        }
        C6928a<Integer, Integer> aVar3 = this.f11003t.f15386j;
        int intValue = ((aVar3 == null ? 100 : aVar3.mo19083g().intValue()) * 255) / 100;
        this.f16231y.setAlpha(intValue);
        this.f16232z.setAlpha(intValue);
        C6928a<Float, Float> aVar4 = this.f16226H;
        if (aVar4 != null) {
            this.f16232z.setStrokeWidth(aVar4.mo19083g().floatValue());
        } else {
            this.f16232z.setStrokeWidth((float) (documentData.f10914j * ((double) C7659e.m14702c()) * ((double) C7659e.m14703d(matrix))));
        }
        if (this.f16222D.useTextGlyphs()) {
            float f2 = ((float) documentData.f10907c) / 100.0f;
            float d = C7659e.m14703d(matrix);
            String str4 = documentData.f10905a;
            float c = C7659e.m14702c() * ((float) documentData.f10910f);
            List asList = Arrays.asList(str4.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
            int size = asList.size();
            int i5 = 0;
            while (i5 < size) {
                String str5 = (String) asList.get(i5);
                float f3 = 0.0f;
                int i6 = 0;
                while (i6 < str5.length()) {
                    C7102c cVar = (C7102c) this.f16223E.f10847g.mo19993f(C7102c.m13766a(str5.charAt(i6), bVar.f15796a, bVar.f15797b), (Integer) null);
                    if (cVar == null) {
                        list3 = asList;
                        i4 = size;
                        i3 = i5;
                        str3 = str5;
                    } else {
                        list3 = asList;
                        str3 = str5;
                        double d2 = cVar.f15800c;
                        i4 = size;
                        i3 = i5;
                        f3 = (float) ((d2 * ((double) f2) * ((double) C7659e.m14702c()) * ((double) d)) + ((double) f3));
                    }
                    i6++;
                    size = i4;
                    str5 = str3;
                    asList = list3;
                    i5 = i3;
                }
                List list4 = asList;
                int i7 = size;
                String str6 = str5;
                canvas.save();
                m14040p(documentData.f10908d, canvas2, f3);
                int i8 = i5;
                canvas2.translate(0.0f, (((float) i8) * c) - ((((float) (i7 - 1)) * c) / 2.0f));
                int i9 = 0;
                while (i9 < str6.length()) {
                    String str7 = str6;
                    C7102c cVar2 = (C7102c) this.f16223E.f10847g.mo19993f(C7102c.m13766a(str7.charAt(i9), bVar.f15796a, bVar.f15797b), (Integer) null);
                    if (cVar2 == null) {
                        Matrix matrix2 = matrix;
                        i2 = i7;
                        str2 = str7;
                        f = c;
                    } else {
                        if (this.f16219A.containsKey(cVar2)) {
                            list2 = (List) this.f16219A.get(cVar2);
                            i2 = i7;
                        } else {
                            List<C7243i> list5 = cVar2.f15798a;
                            int size2 = list5.size();
                            ArrayList arrayList = new ArrayList(size2);
                            int i10 = 0;
                            while (i10 < size2) {
                                arrayList.add(new C6842c(this.f16222D, this, list5.get(i10)));
                                i10++;
                                list5 = list5;
                                i7 = i7;
                                size2 = size2;
                            }
                            i2 = i7;
                            this.f16219A.put(cVar2, arrayList);
                            list2 = arrayList;
                        }
                        int i11 = 0;
                        while (i11 < list2.size()) {
                            Path path = ((C6842c) list2.get(i11)).getPath();
                            path.computeBounds(this.f16229w, false);
                            this.f16230x.set(matrix);
                            String str8 = str7;
                            float f4 = c;
                            this.f16230x.preTranslate(0.0f, C7659e.m14702c() * ((float) (-documentData.f10911g)));
                            this.f16230x.preScale(f2, f2);
                            path.transform(this.f16230x);
                            if (documentData.f10915k) {
                                m14042r(path, this.f16231y, canvas2);
                                m14042r(path, this.f16232z, canvas2);
                            } else {
                                m14042r(path, this.f16232z, canvas2);
                                m14042r(path, this.f16231y, canvas2);
                            }
                            i11++;
                            c = f4;
                            str7 = str8;
                        }
                        Matrix matrix3 = matrix;
                        str2 = str7;
                        f = c;
                        float c2 = C7659e.m14702c() * ((float) cVar2.f15800c) * f2 * d;
                        float f5 = ((float) documentData.f10909e) / 10.0f;
                        C6928a<Float, Float> aVar5 = this.f16227I;
                        if (aVar5 != null) {
                            f5 += aVar5.mo19083g().floatValue();
                        }
                        canvas2.translate((f5 * d) + c2, 0.0f);
                    }
                    i9++;
                    c = f;
                    i7 = i2;
                    str6 = str2;
                }
                Matrix matrix4 = matrix;
                float f6 = c;
                canvas.restore();
                i5 = i8 + 1;
                asList = list4;
                size = i7;
            }
        } else {
            Matrix matrix5 = matrix;
            float d3 = C7659e.m14703d(matrix);
            Typeface typeface = this.f16222D.getTypeface(bVar.f15796a, bVar.f15797b);
            if (typeface != null) {
                String str9 = documentData.f10905a;
                this.f16222D.getTextDelegate();
                this.f16231y.setTypeface(typeface);
                this.f16231y.setTextSize((float) (documentData.f10907c * ((double) C7659e.m14702c())));
                this.f16232z.setTypeface(this.f16231y.getTypeface());
                this.f16232z.setTextSize(this.f16231y.getTextSize());
                float c3 = C7659e.m14702c() * ((float) documentData.f10910f);
                List asList2 = Arrays.asList(str9.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = asList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    String str10 = (String) asList2.get(i12);
                    m14040p(documentData.f10908d, canvas2, this.f16232z.measureText(str10));
                    canvas2.translate(0.0f, (((float) i12) * c3) - ((((float) (size3 - 1)) * c3) / 2.0f));
                    int i13 = 0;
                    while (i13 < str10.length()) {
                        int codePointAt = str10.codePointAt(i13);
                        int charCount = Character.charCount(codePointAt) + i13;
                        while (charCount < str10.length()) {
                            int codePointAt2 = str10.codePointAt(charCount);
                            if (!(Character.getType(codePointAt2) == 16 || Character.getType(codePointAt2) == 27 || Character.getType(codePointAt2) == 6 || Character.getType(codePointAt2) == 28 || Character.getType(codePointAt2) == 19)) {
                                break;
                            }
                            charCount += Character.charCount(codePointAt2);
                            codePointAt = (codePointAt * 31) + codePointAt2;
                        }
                        C7498f<String> fVar = this.f16220B;
                        long j = (long) codePointAt;
                        if (fVar.f16720b) {
                            fVar.mo19888d();
                        }
                        if (C7279a.m13947e(fVar.f16721c, fVar.f16723e, j) >= 0) {
                            str = (String) this.f16220B.mo19889f(j, (Long) null);
                            list = asList2;
                        } else {
                            this.f16228v.setLength(0);
                            int i14 = i13;
                            while (i14 < charCount) {
                                int codePointAt3 = str10.codePointAt(i14);
                                this.f16228v.appendCodePoint(codePointAt3);
                                i14 += Character.charCount(codePointAt3);
                                asList2 = asList2;
                            }
                            list = asList2;
                            str = this.f16228v.toString();
                            this.f16220B.mo19890h(j, str);
                        }
                        i13 += str.length();
                        if (documentData.f10915k) {
                            m14041q(str, this.f16231y, canvas2);
                            m14041q(str, this.f16232z, canvas2);
                        } else {
                            m14041q(str, this.f16232z, canvas2);
                            m14041q(str, this.f16231y, canvas2);
                        }
                        float measureText = this.f16231y.measureText(str, 0, 1);
                        float f7 = ((float) documentData.f10909e) / 10.0f;
                        C6928a<Float, Float> aVar6 = this.f16227I;
                        if (aVar6 != null) {
                            f7 += aVar6.mo19083g().floatValue();
                        }
                        canvas2.translate((f7 * d3) + measureText, 0.0f);
                        asList2 = list;
                    }
                    canvas.setMatrix(matrix);
                    i12++;
                    asList2 = asList2;
                }
            }
        }
        canvas.restore();
    }
}

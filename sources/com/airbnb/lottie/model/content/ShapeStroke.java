package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p113g3.C6841b;
import p113g3.C6858q;
import p158k3.C7178a;
import p158k3.C7179b;
import p158k3.C7181d;
import p167l3.C7236b;

public final class ShapeStroke implements C7236b {

    /* renamed from: a */
    public final String f10932a;

    /* renamed from: b */
    public final C7179b f10933b;

    /* renamed from: c */
    public final List<C7179b> f10934c;

    /* renamed from: d */
    public final C7178a f10935d;

    /* renamed from: e */
    public final C7181d f10936e;

    /* renamed from: f */
    public final C7179b f10937f;

    /* renamed from: g */
    public final LineCapType f10938g;

    /* renamed from: h */
    public final LineJoinType f10939h;

    /* renamed from: i */
    public final float f10940i;

    /* renamed from: j */
    public final boolean f10941j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = C4843a.f10942a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = C4843a.f10943b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$a */
    public static /* synthetic */ class C4843a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10942a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f10943b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r0 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10943b = r0
                r1 = 1
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r2 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10943b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r3 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f10943b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f10942a = r3
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f10942a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f10942a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r1 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.content.ShapeStroke.C4843a.<clinit>():void");
        }
    }

    public ShapeStroke(String str, C7179b bVar, ArrayList arrayList, C7178a aVar, C7181d dVar, C7179b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f10932a = str;
        this.f10933b = bVar;
        this.f10934c = arrayList;
        this.f10935d = aVar;
        this.f10936e = dVar;
        this.f10937f = bVar2;
        this.f10938g = lineCapType;
        this.f10939h = lineJoinType;
        this.f10940i = f;
        this.f10941j = z;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6858q(lottieDrawable, aVar, this);
    }
}

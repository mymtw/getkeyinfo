package androidx.constraintlayout.solver.widgets;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.constraintlayout.solver.C2190c;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.C2203c;
import androidx.constraintlayout.solver.widgets.analyzer.C2211k;
import androidx.constraintlayout.solver.widgets.analyzer.C2214m;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p003a2.C0023f;
import p194o0.C7508a;

public class ConstraintWidget {

    /* renamed from: A */
    public boolean f5110A;

    /* renamed from: B */
    public boolean f5111B = false;

    /* renamed from: C */
    public int f5112C = 0;

    /* renamed from: D */
    public int f5113D = 0;

    /* renamed from: E */
    public ConstraintAnchor f5114E;

    /* renamed from: F */
    public ConstraintAnchor f5115F;

    /* renamed from: G */
    public ConstraintAnchor f5116G;

    /* renamed from: H */
    public ConstraintAnchor f5117H;

    /* renamed from: I */
    public ConstraintAnchor f5118I;

    /* renamed from: J */
    public ConstraintAnchor f5119J;

    /* renamed from: K */
    public ConstraintAnchor f5120K;

    /* renamed from: L */
    public ConstraintAnchor f5121L;

    /* renamed from: M */
    public ConstraintAnchor[] f5122M;

    /* renamed from: N */
    public ArrayList<ConstraintAnchor> f5123N;

    /* renamed from: O */
    public boolean[] f5124O;

    /* renamed from: P */
    public DimensionBehaviour[] f5125P;

    /* renamed from: Q */
    public ConstraintWidget f5126Q;

    /* renamed from: R */
    public int f5127R;

    /* renamed from: S */
    public int f5128S;

    /* renamed from: T */
    public float f5129T;

    /* renamed from: U */
    public int f5130U;

    /* renamed from: V */
    public int f5131V;

    /* renamed from: W */
    public int f5132W;

    /* renamed from: X */
    public int f5133X;

    /* renamed from: Y */
    public int f5134Y;

    /* renamed from: Z */
    public int f5135Z;

    /* renamed from: a */
    public boolean f5136a = false;

    /* renamed from: a0 */
    public float f5137a0;

    /* renamed from: b */
    public C2203c f5138b;

    /* renamed from: b0 */
    public float f5139b0;

    /* renamed from: c */
    public C2203c f5140c;

    /* renamed from: c0 */
    public Object f5141c0;

    /* renamed from: d */
    public C2211k f5142d = null;

    /* renamed from: d0 */
    public int f5143d0;

    /* renamed from: e */
    public C2214m f5144e = null;

    /* renamed from: e0 */
    public String f5145e0;

    /* renamed from: f */
    public boolean[] f5146f = {true, true};

    /* renamed from: f0 */
    public String f5147f0;

    /* renamed from: g */
    public boolean f5148g = true;

    /* renamed from: g0 */
    public int f5149g0;

    /* renamed from: h */
    public boolean f5150h = true;

    /* renamed from: h0 */
    public int f5151h0;

    /* renamed from: i */
    public boolean f5152i = false;

    /* renamed from: i0 */
    public float[] f5153i0;

    /* renamed from: j */
    public boolean f5154j = false;

    /* renamed from: j0 */
    public ConstraintWidget[] f5155j0;

    /* renamed from: k */
    public int f5156k = -1;

    /* renamed from: k0 */
    public ConstraintWidget[] f5157k0;

    /* renamed from: l */
    public int f5158l = -1;

    /* renamed from: l0 */
    public ConstraintWidget f5159l0;

    /* renamed from: m */
    public int f5160m = 0;

    /* renamed from: m0 */
    public ConstraintWidget f5161m0;

    /* renamed from: n */
    public int f5162n = 0;

    /* renamed from: n0 */
    public int f5163n0;

    /* renamed from: o */
    public int[] f5164o = new int[2];

    /* renamed from: o0 */
    public int f5165o0;

    /* renamed from: p */
    public int f5166p = 0;

    /* renamed from: q */
    public int f5167q = 0;

    /* renamed from: r */
    public float f5168r = 1.0f;

    /* renamed from: s */
    public int f5169s = 0;

    /* renamed from: t */
    public int f5170t = 0;

    /* renamed from: u */
    public float f5171u = 1.0f;

    /* renamed from: v */
    public int f5172v = -1;

    /* renamed from: w */
    public float f5173w = 1.0f;

    /* renamed from: x */
    public int[] f5174x = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* renamed from: y */
    public float f5175y = 0.0f;

    /* renamed from: z */
    public boolean f5176z = false;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$a */
    public static /* synthetic */ class C2196a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5177a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f5178b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5178b = r0
                r1 = 1
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5178b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5178b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f5178b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f5177a = r4
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f5177a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f5177a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f5177a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f5177a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f5177a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f5177a     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f5177a     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f5177a     // Catch:{ NoSuchFieldError -> 0x009b }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.C2196a.<clinit>():void");
        }
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f5114E = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f5115F = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f5116G = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f5117H = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f5118I = constraintAnchor5;
        this.f5119J = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f5120K = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f5121L = constraintAnchor6;
        this.f5122M = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.f5123N = arrayList;
        this.f5124O = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f5125P = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f5126Q = null;
        this.f5127R = 0;
        this.f5128S = 0;
        this.f5129T = 0.0f;
        this.f5130U = -1;
        this.f5131V = 0;
        this.f5132W = 0;
        this.f5133X = 0;
        this.f5137a0 = 0.5f;
        this.f5139b0 = 0.5f;
        this.f5143d0 = 0;
        this.f5145e0 = null;
        this.f5147f0 = null;
        this.f5149g0 = 0;
        this.f5151h0 = 0;
        this.f5153i0 = new float[]{-1.0f, -1.0f};
        this.f5155j0 = new ConstraintWidget[]{null, null};
        this.f5157k0 = new ConstraintWidget[]{null, null};
        this.f5159l0 = null;
        this.f5161m0 = null;
        this.f5163n0 = -1;
        this.f5165o0 = -1;
        arrayList.add(this.f5114E);
        this.f5123N.add(this.f5115F);
        this.f5123N.add(this.f5116G);
        this.f5123N.add(this.f5117H);
        this.f5123N.add(this.f5119J);
        this.f5123N.add(this.f5120K);
        this.f5123N.add(this.f5121L);
        this.f5123N.add(this.f5118I);
    }

    /* renamed from: A */
    public boolean mo8261A() {
        return this.f5152i || (this.f5114E.f5102c && this.f5116G.f5102c);
    }

    /* renamed from: B */
    public boolean mo8262B() {
        return this.f5154j || (this.f5115F.f5102c && this.f5117H.f5102c);
    }

    /* renamed from: C */
    public void mo8263C() {
        this.f5114E.mo8257j();
        this.f5115F.mo8257j();
        this.f5116G.mo8257j();
        this.f5117H.mo8257j();
        this.f5118I.mo8257j();
        this.f5119J.mo8257j();
        this.f5120K.mo8257j();
        this.f5121L.mo8257j();
        this.f5126Q = null;
        this.f5175y = 0.0f;
        this.f5127R = 0;
        this.f5128S = 0;
        this.f5129T = 0.0f;
        this.f5130U = -1;
        this.f5131V = 0;
        this.f5132W = 0;
        this.f5133X = 0;
        this.f5134Y = 0;
        this.f5135Z = 0;
        this.f5137a0 = 0.5f;
        this.f5139b0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f5125P;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f5141c0 = null;
        this.f5143d0 = 0;
        this.f5147f0 = null;
        this.f5149g0 = 0;
        this.f5151h0 = 0;
        float[] fArr = this.f5153i0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f5156k = -1;
        this.f5158l = -1;
        int[] iArr = this.f5174x;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f5160m = 0;
        this.f5162n = 0;
        this.f5168r = 1.0f;
        this.f5171u = 1.0f;
        this.f5167q = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f5170t = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f5166p = 0;
        this.f5169s = 0;
        this.f5172v = -1;
        this.f5173w = 1.0f;
        boolean[] zArr = this.f5146f;
        zArr[0] = true;
        zArr[1] = true;
        this.f5111B = false;
        boolean[] zArr2 = this.f5124O;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f5148g = true;
    }

    /* renamed from: D */
    public final void mo8264D() {
        ConstraintWidget constraintWidget = this.f5126Q;
        if (constraintWidget != null && (constraintWidget instanceof C2220d)) {
            ((C2220d) constraintWidget).getClass();
        }
        int size = this.f5123N.size();
        for (int i = 0; i < size; i++) {
            this.f5123N.get(i).mo8257j();
        }
    }

    /* renamed from: E */
    public final void mo8265E() {
        this.f5152i = false;
        this.f5154j = false;
        int size = this.f5123N.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = this.f5123N.get(i);
            constraintAnchor.f5102c = false;
            constraintAnchor.f5101b = 0;
        }
    }

    /* renamed from: F */
    public void mo8266F(C7508a aVar) {
        this.f5114E.mo8258k();
        this.f5115F.mo8258k();
        this.f5116G.mo8258k();
        this.f5117H.mo8258k();
        this.f5118I.mo8258k();
        this.f5121L.mo8258k();
        this.f5119J.mo8258k();
        this.f5120K.mo8258k();
    }

    /* renamed from: G */
    public final void mo8267G(int i, int i2) {
        this.f5114E.mo8259l(i);
        this.f5116G.mo8259l(i2);
        this.f5131V = i;
        this.f5127R = i2 - i;
        this.f5152i = true;
    }

    /* renamed from: H */
    public final void mo8268H(int i, int i2) {
        this.f5115F.mo8259l(i);
        this.f5117H.mo8259l(i2);
        this.f5132W = i;
        this.f5128S = i2 - i;
        if (this.f5176z) {
            this.f5118I.mo8259l(i + this.f5133X);
        }
        this.f5154j = true;
    }

    /* renamed from: I */
    public final void mo8269I(int i) {
        this.f5128S = i;
        int i2 = this.f5135Z;
        if (i < i2) {
            this.f5128S = i2;
        }
    }

    /* renamed from: J */
    public final void mo8270J(DimensionBehaviour dimensionBehaviour) {
        this.f5125P[0] = dimensionBehaviour;
    }

    /* renamed from: K */
    public final void mo8271K(DimensionBehaviour dimensionBehaviour) {
        this.f5125P[1] = dimensionBehaviour;
    }

    /* renamed from: L */
    public final void mo8272L(int i) {
        this.f5127R = i;
        int i2 = this.f5134Y;
        if (i < i2) {
            this.f5127R = i2;
        }
    }

    /* renamed from: M */
    public void mo8273M(boolean z, boolean z2) {
        int i;
        int i2;
        C2211k kVar = this.f5142d;
        boolean z3 = z & kVar.f5201g;
        C2214m mVar = this.f5144e;
        boolean z4 = z2 & mVar.f5201g;
        int i3 = kVar.f5202h.f5189g;
        int i4 = mVar.f5202h.f5189g;
        int i5 = kVar.f5203i.f5189g;
        int i6 = mVar.f5203i.f5189g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.f5131V = i3;
        }
        if (z4) {
            this.f5132W = i4;
        }
        if (this.f5143d0 == 8) {
            this.f5127R = 0;
            this.f5128S = 0;
            return;
        }
        if (z3) {
            if (this.f5125P[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.f5127R)) {
                i8 = i2;
            }
            this.f5127R = i8;
            int i10 = this.f5134Y;
            if (i8 < i10) {
                this.f5127R = i10;
            }
        }
        if (z4) {
            if (this.f5125P[1] == DimensionBehaviour.FIXED && i9 < (i = this.f5128S)) {
                i9 = i;
            }
            this.f5128S = i9;
            int i11 = this.f5135Z;
            if (i9 < i11) {
                this.f5128S = i11;
            }
        }
    }

    /* renamed from: N */
    public void mo8274N(C2190c cVar, boolean z) {
        int i;
        int i2;
        C2214m mVar;
        C2211k kVar;
        ConstraintAnchor constraintAnchor = this.f5114E;
        cVar.getClass();
        int n = C2190c.m4718n(constraintAnchor);
        int n2 = C2190c.m4718n(this.f5115F);
        int n3 = C2190c.m4718n(this.f5116G);
        int n4 = C2190c.m4718n(this.f5117H);
        if (z && (kVar = this.f5142d) != null) {
            DependencyNode dependencyNode = kVar.f5202h;
            if (dependencyNode.f5192j) {
                DependencyNode dependencyNode2 = kVar.f5203i;
                if (dependencyNode2.f5192j) {
                    n = dependencyNode.f5189g;
                    n3 = dependencyNode2.f5189g;
                }
            }
        }
        if (z && (mVar = this.f5144e) != null) {
            DependencyNode dependencyNode3 = mVar.f5202h;
            if (dependencyNode3.f5192j) {
                DependencyNode dependencyNode4 = mVar.f5203i;
                if (dependencyNode4.f5192j) {
                    n2 = dependencyNode3.f5189g;
                    n4 = dependencyNode4.f5189g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.f5131V = n;
        this.f5132W = n2;
        if (this.f5143d0 == 8) {
            this.f5127R = 0;
            this.f5128S = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f5125P;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.f5127R)) {
            i4 = i2;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.f5128S)) {
            i5 = i;
        }
        this.f5127R = i4;
        this.f5128S = i5;
        int i6 = this.f5135Z;
        if (i5 < i6) {
            this.f5128S = i6;
        }
        int i7 = this.f5134Y;
        if (i4 < i7) {
            this.f5127R = i7;
        }
    }

    /* renamed from: d */
    public final void mo8275d(C2220d dVar, C2190c cVar, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                C2225g.m4905a(dVar, cVar, this);
                hashSet.remove(this);
                mo8276e(cVar, dVar.mo8343U(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f5114E.f5100a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f5103d.mo8275d(dVar, cVar, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f5116G.f5100a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f5103d.mo8275d(dVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f5115F.f5100a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f5103d.mo8275d(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f5117H.f5100a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f5103d.mo8275d(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f5118I.f5100a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f5103d.mo8275d(dVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x06bb  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8276e(androidx.constraintlayout.solver.C2190c r59, boolean r60) {
        /*
            r58 = this;
            r15 = r58
            r14 = r59
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5114E
            androidx.constraintlayout.solver.SolverVariable r13 = r14.mo8233k(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5116G
            androidx.constraintlayout.solver.SolverVariable r12 = r14.mo8233k(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5115F
            androidx.constraintlayout.solver.SolverVariable r11 = r14.mo8233k(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5117H
            androidx.constraintlayout.solver.SolverVariable r10 = r14.mo8233k(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5118I
            androidx.constraintlayout.solver.SolverVariable r9 = r14.mo8233k(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            r8 = 0
            r7 = 1
            if (r0 == 0) goto L_0x003f
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.f5125P
            r1 = r0[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x0032
            r1 = r7
            goto L_0x0033
        L_0x0032:
            r1 = r8
        L_0x0033:
            r0 = r0[r7]
            if (r0 != r2) goto L_0x0039
            r0 = r7
            goto L_0x003a
        L_0x0039:
            r0 = r8
        L_0x003a:
            r28 = r0
            r29 = r1
            goto L_0x0043
        L_0x003f:
            r28 = r8
            r29 = r28
        L_0x0043:
            int r0 = r15.f5143d0
            r6 = 8
            if (r0 != r6) goto L_0x007d
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r15.f5123N
            int r0 = r0.size()
            r1 = r8
        L_0x0050:
            if (r1 >= r0) goto L_0x006f
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r15.f5123N
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r2
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r2.f5100a
            if (r2 != 0) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0067
            r2 = r7
            goto L_0x0068
        L_0x0067:
            r2 = r8
        L_0x0068:
            if (r2 == 0) goto L_0x006c
            r0 = r7
            goto L_0x0070
        L_0x006c:
            int r1 = r1 + 1
            goto L_0x0050
        L_0x006f:
            r0 = r8
        L_0x0070:
            if (r0 != 0) goto L_0x007d
            boolean[] r0 = r15.f5124O
            boolean r1 = r0[r8]
            if (r1 != 0) goto L_0x007d
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x007d
            return
        L_0x007d:
            boolean r0 = r15.f5152i
            r5 = 5
            if (r0 != 0) goto L_0x0086
            boolean r1 = r15.f5154j
            if (r1 == 0) goto L_0x014d
        L_0x0086:
            if (r0 == 0) goto L_0x00d5
            int r0 = r15.f5131V
            r14.mo8226d(r13, r0)
            int r0 = r15.f5131V
            int r1 = r15.f5127R
            int r0 = r0 + r1
            r14.mo8226d(r12, r0)
            if (r29 == 0) goto L_0x00d5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x00d5
            boolean r1 = r15.f5150h
            if (r1 == 0) goto L_0x00cc
            androidx.constraintlayout.solver.widgets.d r0 = (androidx.constraintlayout.solver.widgets.C2220d) r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.f5114E
            r0.mo8341R(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.f5116G
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r0.f5268H0
            if (r2 == 0) goto L_0x00c4
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x00c4
            int r2 = r1.mo8251d()
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r3 = r0.f5268H0
            java.lang.Object r3 = r3.get()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3
            int r3 = r3.mo8251d()
            if (r2 <= r3) goto L_0x00d5
        L_0x00c4:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f5268H0 = r2
            goto L_0x00d5
        L_0x00cc:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5116G
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r14.mo8228f(r0, r12, r8, r5)
        L_0x00d5:
            boolean r0 = r15.f5154j
            if (r0 == 0) goto L_0x0140
            int r0 = r15.f5132W
            r14.mo8226d(r11, r0)
            int r0 = r15.f5132W
            int r1 = r15.f5128S
            int r0 = r0 + r1
            r14.mo8226d(r10, r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5118I
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r0.f5100a
            if (r0 != 0) goto L_0x00ed
            goto L_0x00f5
        L_0x00ed:
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00f5
            r0 = r7
            goto L_0x00f6
        L_0x00f5:
            r0 = r8
        L_0x00f6:
            if (r0 == 0) goto L_0x0100
            int r0 = r15.f5132W
            int r1 = r15.f5133X
            int r0 = r0 + r1
            r14.mo8226d(r9, r0)
        L_0x0100:
            if (r28 == 0) goto L_0x0140
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x0140
            boolean r1 = r15.f5150h
            if (r1 == 0) goto L_0x0137
            androidx.constraintlayout.solver.widgets.d r0 = (androidx.constraintlayout.solver.widgets.C2220d) r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.f5115F
            r0.mo8341R(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.f5117H
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r0.f5267G0
            if (r2 == 0) goto L_0x012f
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x012f
            int r2 = r1.mo8251d()
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r3 = r0.f5267G0
            java.lang.Object r3 = r3.get()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3
            int r3 = r3.mo8251d()
            if (r2 <= r3) goto L_0x0140
        L_0x012f:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f5267G0 = r2
            goto L_0x0140
        L_0x0137:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5117H
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r14.mo8228f(r0, r10, r8, r5)
        L_0x0140:
            boolean r0 = r15.f5152i
            if (r0 == 0) goto L_0x014d
            boolean r0 = r15.f5154j
            if (r0 == 0) goto L_0x014d
            r15.f5152i = r8
            r15.f5154j = r8
            return
        L_0x014d:
            if (r60 == 0) goto L_0x01d3
            androidx.constraintlayout.solver.widgets.analyzer.k r0 = r15.f5142d
            if (r0 == 0) goto L_0x01d3
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r15.f5144e
            if (r1 == 0) goto L_0x01d3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.f5202h
            boolean r3 = r2.f5192j
            if (r3 == 0) goto L_0x01d3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5203i
            boolean r0 = r0.f5192j
            if (r0 == 0) goto L_0x01d3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r1.f5202h
            boolean r0 = r0.f5192j
            if (r0 == 0) goto L_0x01d3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r1.f5203i
            boolean r0 = r0.f5192j
            if (r0 == 0) goto L_0x01d3
            int r0 = r2.f5189g
            r14.mo8226d(r13, r0)
            androidx.constraintlayout.solver.widgets.analyzer.k r0 = r15.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5203i
            int r0 = r0.f5189g
            r14.mo8226d(r12, r0)
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r15.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5202h
            int r0 = r0.f5189g
            r14.mo8226d(r11, r0)
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r15.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5203i
            int r0 = r0.f5189g
            r14.mo8226d(r10, r0)
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r15.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5235k
            int r0 = r0.f5189g
            r14.mo8226d(r9, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x01ce
            if (r29 == 0) goto L_0x01b5
            boolean[] r0 = r15.f5146f
            boolean r0 = r0[r8]
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r58.mo8296x()
            if (r0 != 0) goto L_0x01b5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5116G
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r14.mo8228f(r0, r12, r8, r6)
        L_0x01b5:
            if (r28 == 0) goto L_0x01ce
            boolean[] r0 = r15.f5146f
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x01ce
            boolean r0 = r58.mo8297y()
            if (r0 != 0) goto L_0x01ce
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5117H
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r14.mo8228f(r0, r10, r8, r6)
        L_0x01ce:
            r15.f5152i = r8
            r15.f5154j = r8
            return
        L_0x01d3:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x0244
            boolean r0 = r15.mo8295w(r8)
            if (r0 == 0) goto L_0x01e6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            androidx.constraintlayout.solver.widgets.d r0 = (androidx.constraintlayout.solver.widgets.C2220d) r0
            r0.mo8339P(r15, r8)
            r0 = r7
            goto L_0x01ea
        L_0x01e6:
            boolean r0 = r58.mo8296x()
        L_0x01ea:
            boolean r1 = r15.mo8295w(r7)
            if (r1 == 0) goto L_0x01f9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r15.f5126Q
            androidx.constraintlayout.solver.widgets.d r1 = (androidx.constraintlayout.solver.widgets.C2220d) r1
            r1.mo8339P(r15, r7)
            r1 = r7
            goto L_0x01fd
        L_0x01f9:
            boolean r1 = r58.mo8297y()
        L_0x01fd:
            if (r0 != 0) goto L_0x021c
            if (r29 == 0) goto L_0x021c
            int r2 = r15.f5143d0
            if (r2 == r6) goto L_0x021c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5105f
            if (r2 != 0) goto L_0x021c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5105f
            if (r2 != 0) goto L_0x021c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r15.f5126Q
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5116G
            androidx.constraintlayout.solver.SolverVariable r2 = r14.mo8233k(r2)
            r14.mo8228f(r2, r12, r8, r7)
        L_0x021c:
            if (r1 != 0) goto L_0x023f
            if (r28 == 0) goto L_0x023f
            int r2 = r15.f5143d0
            if (r2 == r6) goto L_0x023f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5105f
            if (r2 != 0) goto L_0x023f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.f5117H
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5105f
            if (r2 != 0) goto L_0x023f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.f5118I
            if (r2 != 0) goto L_0x023f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r15.f5126Q
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5117H
            androidx.constraintlayout.solver.SolverVariable r2 = r14.mo8233k(r2)
            r14.mo8228f(r2, r10, r8, r7)
        L_0x023f:
            r31 = r0
            r30 = r1
            goto L_0x0248
        L_0x0244:
            r30 = r8
            r31 = r30
        L_0x0248:
            int r0 = r15.f5127R
            int r1 = r15.f5134Y
            if (r0 >= r1) goto L_0x024f
            goto L_0x0250
        L_0x024f:
            r1 = r0
        L_0x0250:
            int r2 = r15.f5128S
            int r3 = r15.f5135Z
            if (r2 >= r3) goto L_0x0257
            goto L_0x0258
        L_0x0257:
            r3 = r2
        L_0x0258:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r15.f5125P
            r5 = r4[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 == r8) goto L_0x0263
            r18 = r7
            goto L_0x0265
        L_0x0263:
            r18 = 0
        L_0x0265:
            r4 = r4[r7]
            if (r4 == r8) goto L_0x026c
            r19 = r7
            goto L_0x026e
        L_0x026c:
            r19 = 0
        L_0x026e:
            int r7 = r15.f5130U
            r15.f5172v = r7
            float r6 = r15.f5129T
            r15.f5173w = r6
            r22 = r1
            int r1 = r15.f5160m
            r23 = r3
            int r3 = r15.f5162n
            r24 = 0
            int r24 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            r25 = 4
            r27 = r11
            if (r24 <= 0) goto L_0x03ae
            int r11 = r15.f5143d0
            r33 = r9
            r9 = 8
            if (r11 == r9) goto L_0x0374
            r9 = 3
            if (r5 != r8) goto L_0x0296
            if (r1 != 0) goto L_0x0296
            r1 = r9
        L_0x0296:
            if (r4 != r8) goto L_0x029b
            if (r3 != 0) goto L_0x029b
            r3 = r9
        L_0x029b:
            if (r5 != r8) goto L_0x0364
            if (r4 != r8) goto L_0x0364
            if (r1 != r9) goto L_0x0364
            if (r3 != r9) goto L_0x0364
            r11 = -1
            if (r7 != r11) goto L_0x02bd
            if (r18 == 0) goto L_0x02ae
            if (r19 != 0) goto L_0x02ae
            r0 = 0
            r15.f5172v = r0
            goto L_0x02bd
        L_0x02ae:
            if (r18 != 0) goto L_0x02bd
            if (r19 == 0) goto L_0x02bd
            r0 = 1
            r15.f5172v = r0
            if (r7 != r11) goto L_0x02bd
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = r0 / r6
            r15.f5173w = r11
        L_0x02bd:
            int r0 = r15.f5172v
            if (r0 != 0) goto L_0x02d5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5115F
            boolean r0 = r0.mo8255h()
            if (r0 == 0) goto L_0x02d1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5117H
            boolean r0 = r0.mo8255h()
            if (r0 != 0) goto L_0x02d5
        L_0x02d1:
            r0 = 1
            r15.f5172v = r0
            goto L_0x02ed
        L_0x02d5:
            r0 = 1
            int r2 = r15.f5172v
            if (r2 != r0) goto L_0x02ed
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5114E
            boolean r0 = r0.mo8255h()
            if (r0 == 0) goto L_0x02ea
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5116G
            boolean r0 = r0.mo8255h()
            if (r0 != 0) goto L_0x02ed
        L_0x02ea:
            r0 = 0
            r15.f5172v = r0
        L_0x02ed:
            int r0 = r15.f5172v
            r2 = -1
            if (r0 != r2) goto L_0x0341
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5115F
            boolean r0 = r0.mo8255h()
            if (r0 == 0) goto L_0x0312
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5117H
            boolean r0 = r0.mo8255h()
            if (r0 == 0) goto L_0x0312
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5114E
            boolean r0 = r0.mo8255h()
            if (r0 == 0) goto L_0x0312
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5116G
            boolean r0 = r0.mo8255h()
            if (r0 != 0) goto L_0x0341
        L_0x0312:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5115F
            boolean r0 = r0.mo8255h()
            if (r0 == 0) goto L_0x0326
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5117H
            boolean r0 = r0.mo8255h()
            if (r0 == 0) goto L_0x0326
            r0 = 0
            r15.f5172v = r0
            goto L_0x0341
        L_0x0326:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5114E
            boolean r0 = r0.mo8255h()
            if (r0 == 0) goto L_0x0341
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5116G
            boolean r0 = r0.mo8255h()
            if (r0 == 0) goto L_0x0341
            float r0 = r15.f5173w
            r2 = 1065353216(0x3f800000, float:1.0)
            float r11 = r2 / r0
            r15.f5173w = r11
            r0 = 1
            r15.f5172v = r0
        L_0x0341:
            int r0 = r15.f5172v
            r2 = -1
            if (r0 != r2) goto L_0x039f
            int r0 = r15.f5166p
            if (r0 <= 0) goto L_0x0352
            int r2 = r15.f5169s
            if (r2 != 0) goto L_0x0352
            r2 = 0
            r15.f5172v = r2
            goto L_0x039f
        L_0x0352:
            if (r0 != 0) goto L_0x039f
            int r0 = r15.f5169s
            if (r0 <= 0) goto L_0x039f
            float r0 = r15.f5173w
            r2 = 1065353216(0x3f800000, float:1.0)
            float r11 = r2 / r0
            r15.f5173w = r11
            r0 = 1
            r15.f5172v = r0
            goto L_0x039f
        L_0x0364:
            if (r5 != r8) goto L_0x0383
            if (r1 != r9) goto L_0x0383
            r11 = 0
            r15.f5172v = r11
            float r0 = (float) r2
            float r6 = r6 * r0
            int r0 = (int) r6
            if (r4 == r8) goto L_0x0377
            r22 = r0
            r1 = r25
        L_0x0374:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03b1
        L_0x0377:
            r36 = r1
            r35 = r3
            r34 = r23
            r11 = 1065353216(0x3f800000, float:1.0)
            r32 = 1
            r1 = r0
            goto L_0x03bb
        L_0x0383:
            if (r4 != r8) goto L_0x039f
            if (r3 != r9) goto L_0x039f
            r2 = 1
            r15.f5172v = r2
            r2 = -1
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r2) goto L_0x0393
            float r2 = r11 / r6
            r15.f5173w = r2
        L_0x0393:
            float r2 = r15.f5173w
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            if (r5 == r8) goto L_0x03a3
            r23 = r0
            r3 = r25
            goto L_0x03b1
        L_0x039f:
            r11 = 1065353216(0x3f800000, float:1.0)
            r0 = r23
        L_0x03a3:
            r34 = r0
            r36 = r1
            r35 = r3
            r1 = r22
            r32 = 1
            goto L_0x03bb
        L_0x03ae:
            r33 = r9
            goto L_0x0374
        L_0x03b1:
            r36 = r1
            r35 = r3
            r1 = r22
            r34 = r23
            r32 = 0
        L_0x03bb:
            int[] r0 = r15.f5164o
            r2 = 0
            r0[r2] = r36
            r2 = 1
            r0[r2] = r35
            if (r32 == 0) goto L_0x03cf
            int r0 = r15.f5172v
            r2 = -1
            if (r0 == 0) goto L_0x03cc
            if (r0 != r2) goto L_0x03d0
        L_0x03cc:
            r18 = 1
            goto L_0x03d2
        L_0x03cf:
            r2 = -1
        L_0x03d0:
            r18 = 0
        L_0x03d2:
            if (r32 == 0) goto L_0x03de
            int r0 = r15.f5172v
            r3 = 1
            if (r0 == r3) goto L_0x03db
            if (r0 != r2) goto L_0x03de
        L_0x03db:
            r37 = 1
            goto L_0x03e0
        L_0x03de:
            r37 = 0
        L_0x03e0:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f5125P
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r9) goto L_0x03f0
            boolean r0 = r15 instanceof androidx.constraintlayout.solver.widgets.C2220d
            if (r0 == 0) goto L_0x03f0
            r19 = 1
            goto L_0x03f2
        L_0x03f0:
            r19 = 0
        L_0x03f2:
            if (r19 == 0) goto L_0x03f7
            r22 = 0
            goto L_0x03f9
        L_0x03f7:
            r22 = r1
        L_0x03f9:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5121L
            boolean r0 = r0.mo8255h()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.f5124O
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f5156k
            r40 = 0
            r7 = 2
            if (r0 == r7) goto L_0x04f2
            boolean r0 = r15.f5152i
            if (r0 != 0) goto L_0x04f2
            if (r60 == 0) goto L_0x0459
            androidx.constraintlayout.solver.widgets.analyzer.k r0 = r15.f5142d
            if (r0 == 0) goto L_0x0459
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5202h
            boolean r2 = r1.f5192j
            if (r2 == 0) goto L_0x0459
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5203i
            boolean r0 = r0.f5192j
            if (r0 != 0) goto L_0x0427
            goto L_0x0459
        L_0x0427:
            if (r60 == 0) goto L_0x04f2
            int r0 = r1.f5189g
            r14.mo8226d(r13, r0)
            androidx.constraintlayout.solver.widgets.analyzer.k r0 = r15.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5203i
            int r0 = r0.f5189g
            r14.mo8226d(r12, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x04f2
            if (r29 == 0) goto L_0x04f2
            boolean[] r0 = r15.f5146f
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x04f2
            boolean r0 = r58.mo8296x()
            if (r0 != 0) goto L_0x04f2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5116G
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r6 = 8
            r14.mo8228f(r0, r12, r1, r6)
            goto L_0x04f2
        L_0x0459:
            r6 = 8
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x0468
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5116G
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r21 = r0
            goto L_0x046a
        L_0x0468:
            r21 = r40
        L_0x046a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x0477
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5114E
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r41 = r0
            goto L_0x0479
        L_0x0477:
            r41 = r40
        L_0x0479:
            boolean[] r0 = r15.f5146f
            r17 = 0
            boolean r5 = r0[r17]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f5125P
            r42 = r0[r17]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r15.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.f5116G
            int r1 = r15.f5131V
            int r2 = r15.f5134Y
            int[] r6 = r15.f5174x
            r43 = r6[r17]
            float r6 = r15.f5137a0
            r20 = 1
            r0 = r0[r20]
            if (r0 != r8) goto L_0x049a
            r44 = r20
            goto L_0x049c
        L_0x049a:
            r44 = r17
        L_0x049c:
            int r0 = r15.f5166p
            r24 = r0
            int r0 = r15.f5167q
            r25 = r0
            float r0 = r15.f5168r
            r26 = r0
            r0 = 1
            r45 = r2
            r2 = r0
            r0 = r58
            r46 = r1
            r1 = r59
            r47 = r3
            r3 = r29
            r48 = r4
            r4 = r28
            r16 = r6
            r6 = r41
            r7 = r21
            r49 = r8
            r8 = r42
            r51 = r9
            r50 = r33
            r9 = r19
            r52 = r10
            r10 = r48
            r53 = r27
            r11 = r47
            r54 = r12
            r12 = r46
            r55 = r13
            r13 = r22
            r14 = r45
            r15 = r43
            r17 = r18
            r18 = r44
            r19 = r31
            r20 = r30
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.mo8278g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0500
        L_0x04f2:
            r49 = r8
            r51 = r9
            r52 = r10
            r54 = r12
            r55 = r13
            r53 = r27
            r50 = r33
        L_0x0500:
            if (r60 == 0) goto L_0x0566
            r15 = r58
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r15.f5144e
            if (r0 == 0) goto L_0x0559
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5202h
            boolean r2 = r1.f5192j
            if (r2 == 0) goto L_0x0559
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5203i
            boolean r0 = r0.f5192j
            if (r0 == 0) goto L_0x0559
            int r0 = r1.f5189g
            r14 = r59
            r13 = r53
            r14.mo8226d(r13, r0)
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r15.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5203i
            int r0 = r0.f5189g
            r12 = r52
            r14.mo8226d(r12, r0)
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r15.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5235k
            int r0 = r0.f5189g
            r1 = r50
            r14.mo8226d(r1, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x0553
            if (r30 != 0) goto L_0x0553
            if (r28 == 0) goto L_0x0553
            boolean[] r2 = r15.f5146f
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x054f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5117H
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r2 = 8
            r10 = 0
            r14.mo8228f(r0, r12, r10, r2)
            goto L_0x0557
        L_0x054f:
            r2 = 8
            r10 = 0
            goto L_0x0557
        L_0x0553:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x0557:
            r8 = r10
            goto L_0x0575
        L_0x0559:
            r14 = r59
            r1 = r50
            r12 = r52
            r13 = r53
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x0574
        L_0x0566:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r58
            r14 = r59
            r1 = r50
            r12 = r52
            r13 = r53
        L_0x0574:
            r8 = r11
        L_0x0575:
            int r0 = r15.f5158l
            r3 = 2
            if (r0 != r3) goto L_0x057b
            r8 = r10
        L_0x057b:
            if (r8 == 0) goto L_0x064a
            boolean r0 = r15.f5154j
            if (r0 != 0) goto L_0x064a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f5125P
            r0 = r0[r11]
            r3 = r51
            if (r0 != r3) goto L_0x058f
            boolean r0 = r15 instanceof androidx.constraintlayout.solver.widgets.C2220d
            if (r0 == 0) goto L_0x058f
            r9 = r11
            goto L_0x0590
        L_0x058f:
            r9 = r10
        L_0x0590:
            if (r9 == 0) goto L_0x0594
            r34 = r10
        L_0x0594:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x05a0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5117H
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r7 = r0
            goto L_0x05a2
        L_0x05a0:
            r7 = r40
        L_0x05a2:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.f5126Q
            if (r0 == 0) goto L_0x05ae
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5115F
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r6 = r0
            goto L_0x05b0
        L_0x05ae:
            r6 = r40
        L_0x05b0:
            int r0 = r15.f5133X
            if (r0 > 0) goto L_0x05b8
            int r3 = r15.f5143d0
            if (r3 != r2) goto L_0x05e6
        L_0x05b8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.f5118I
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.f5105f
            if (r3 == 0) goto L_0x05db
            r14.mo8227e(r1, r13, r0, r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5118I
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5105f
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r14.mo8227e(r1, r0, r10, r2)
            if (r28 == 0) goto L_0x05d8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.f5117H
            androidx.constraintlayout.solver.SolverVariable r0 = r14.mo8233k(r0)
            r1 = 5
            r14.mo8228f(r7, r0, r10, r1)
        L_0x05d8:
            r27 = r10
            goto L_0x05e8
        L_0x05db:
            int r3 = r15.f5143d0
            if (r3 != r2) goto L_0x05e3
            r14.mo8227e(r1, r13, r10, r2)
            goto L_0x05e6
        L_0x05e3:
            r14.mo8227e(r1, r13, r0, r2)
        L_0x05e6:
            r27 = r38
        L_0x05e8:
            boolean[] r0 = r15.f5146f
            boolean r5 = r0[r11]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f5125P
            r8 = r0[r11]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r15.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.f5117H
            int r1 = r15.f5132W
            int r2 = r15.f5135Z
            int[] r10 = r15.f5174x
            r16 = r10[r11]
            float r10 = r15.f5139b0
            r17 = 0
            r0 = r0[r17]
            r11 = r49
            if (r0 != r11) goto L_0x0609
            r18 = 1
            goto L_0x060b
        L_0x0609:
            r18 = r17
        L_0x060b:
            int r0 = r15.f5169s
            r24 = r0
            int r0 = r15.f5170t
            r25 = r0
            float r0 = r15.f5171u
            r26 = r0
            r0 = 0
            r19 = r2
            r2 = r0
            r0 = r58
            r20 = r1
            r1 = r59
            r11 = r3
            r3 = r28
            r21 = r4
            r4 = r29
            r17 = r10
            r10 = r21
            r56 = r12
            r12 = r20
            r57 = r13
            r13 = r34
            r14 = r19
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r30
            r20 = r31
            r21 = r39
            r22 = r35
            r23 = r36
            r0.mo8278g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x064e
        L_0x064a:
            r56 = r12
            r57 = r13
        L_0x064e:
            if (r32 == 0) goto L_0x06af
            r0 = r58
            int r1 = r0.f5172v
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1
            if (r1 != r3) goto L_0x0684
            float r1 = r0.f5173w
            androidx.constraintlayout.solver.b r3 = r59.mo8234l()
            androidx.constraintlayout.solver.b$a r4 = r3.f5075d
            r5 = r56
            r4.mo8206f(r5, r2)
            androidx.constraintlayout.solver.b$a r2 = r3.f5075d
            r4 = r57
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.mo8206f(r4, r6)
            androidx.constraintlayout.solver.b$a r2 = r3.f5075d
            r7 = r54
            r2.mo8206f(r7, r1)
            androidx.constraintlayout.solver.b$a r2 = r3.f5075d
            float r1 = -r1
            r8 = r55
            r2.mo8206f(r8, r1)
            r1 = r59
            r1.mo8225c(r3)
            goto L_0x06b3
        L_0x0684:
            r1 = r59
            r7 = r54
            r8 = r55
            r5 = r56
            r4 = r57
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0.f5173w
            androidx.constraintlayout.solver.b r9 = r59.mo8234l()
            androidx.constraintlayout.solver.b$a r10 = r9.f5075d
            r10.mo8206f(r7, r2)
            androidx.constraintlayout.solver.b$a r2 = r9.f5075d
            r2.mo8206f(r8, r6)
            androidx.constraintlayout.solver.b$a r2 = r9.f5075d
            r2.mo8206f(r5, r3)
            androidx.constraintlayout.solver.b$a r2 = r9.f5075d
            float r3 = -r3
            r2.mo8206f(r4, r3)
            r1.mo8225c(r9)
            goto L_0x06b3
        L_0x06af:
            r0 = r58
            r1 = r59
        L_0x06b3:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.f5121L
            boolean r2 = r2.mo8255h()
            if (r2 == 0) goto L_0x0771
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.f5121L
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5105f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.f5103d
            float r3 = r0.f5175y
            r4 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = java.lang.Math.toRadians(r3)
            float r3 = (float) r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.f5121L
            int r4 = r4.mo8252e()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r0.mo8284m(r5)
            androidx.constraintlayout.solver.SolverVariable r6 = r1.mo8233k(r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r0.mo8284m(r7)
            androidx.constraintlayout.solver.SolverVariable r8 = r1.mo8233k(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.mo8284m(r9)
            androidx.constraintlayout.solver.SolverVariable r10 = r1.mo8233k(r10)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.mo8284m(r11)
            androidx.constraintlayout.solver.SolverVariable r12 = r1.mo8233k(r12)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r2.mo8284m(r5)
            androidx.constraintlayout.solver.SolverVariable r5 = r1.mo8233k(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.mo8284m(r7)
            androidx.constraintlayout.solver.SolverVariable r7 = r1.mo8233k(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r2.mo8284m(r9)
            androidx.constraintlayout.solver.SolverVariable r9 = r1.mo8233k(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mo8284m(r11)
            androidx.constraintlayout.solver.SolverVariable r2 = r1.mo8233k(r2)
            androidx.constraintlayout.solver.b r11 = r59.mo8234l()
            double r13 = (double) r3
            double r15 = java.lang.Math.sin(r13)
            double r3 = (double) r4
            r17 = r9
            r60 = r10
            double r9 = r15 * r3
            float r9 = (float) r9
            androidx.constraintlayout.solver.b$a r10 = r11.f5075d
            r15 = 1056964608(0x3f000000, float:0.5)
            r10.mo8206f(r7, r15)
            androidx.constraintlayout.solver.b$a r7 = r11.f5075d
            r7.mo8206f(r2, r15)
            androidx.constraintlayout.solver.b$a r2 = r11.f5075d
            r7 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2.mo8206f(r8, r7)
            androidx.constraintlayout.solver.b$a r2 = r11.f5075d
            r2.mo8206f(r12, r7)
            float r2 = -r9
            r11.f5073b = r2
            r1.mo8225c(r11)
            androidx.constraintlayout.solver.b r2 = r59.mo8234l()
            double r8 = java.lang.Math.cos(r13)
            double r8 = r8 * r3
            float r3 = (float) r8
            androidx.constraintlayout.solver.b$a r4 = r2.f5075d
            r4.mo8206f(r5, r15)
            androidx.constraintlayout.solver.b$a r4 = r2.f5075d
            r5 = r17
            r4.mo8206f(r5, r15)
            androidx.constraintlayout.solver.b$a r4 = r2.f5075d
            r4.mo8206f(r6, r7)
            androidx.constraintlayout.solver.b$a r4 = r2.f5075d
            r5 = r60
            r4.mo8206f(r5, r7)
            float r3 = -r3
            r2.f5073b = r3
            r1.mo8225c(r2)
        L_0x0771:
            r1 = 0
            r0.f5152i = r1
            r0.f5154j = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.mo8276e(androidx.constraintlayout.solver.c, boolean):void");
    }

    /* renamed from: f */
    public boolean mo8277f() {
        return this.f5143d0 != 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:195:0x0353 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0409 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0421 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x04c7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:327:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:331:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x019e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8278g(androidx.constraintlayout.solver.C2190c r34, boolean r35, boolean r36, boolean r37, boolean r38, androidx.constraintlayout.solver.SolverVariable r39, androidx.constraintlayout.solver.SolverVariable r40, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r41, boolean r42, androidx.constraintlayout.solver.widgets.ConstraintAnchor r43, androidx.constraintlayout.solver.widgets.ConstraintAnchor r44, int r45, int r46, int r47, int r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, int r55, int r56, int r57, int r58, float r59, boolean r60) {
        /*
            r33 = this;
            r0 = r33
            r10 = r34
            r11 = r39
            r12 = r40
            r13 = r43
            r14 = r44
            r15 = r47
            r1 = r48
            r2 = r56
            r3 = r57
            r4 = r58
            r5 = r59
            androidx.constraintlayout.solver.SolverVariable r9 = r10.mo8233k(r13)
            androidx.constraintlayout.solver.SolverVariable r8 = r10.mo8233k(r14)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r13.f5105f
            androidx.constraintlayout.solver.SolverVariable r7 = r10.mo8233k(r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r14.f5105f
            androidx.constraintlayout.solver.SolverVariable r6 = r10.mo8233k(r6)
            boolean r16 = r43.mo8255h()
            boolean r17 = r44.mo8255h()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.f5121L
            boolean r12 = r12.mo8255h()
            if (r17 == 0) goto L_0x003f
            int r18 = r16 + 1
            goto L_0x0041
        L_0x003f:
            r18 = r16
        L_0x0041:
            if (r12 == 0) goto L_0x0045
            int r18 = r18 + 1
        L_0x0045:
            r2 = r18
            if (r50 == 0) goto L_0x004c
            r19 = 3
            goto L_0x004e
        L_0x004c:
            r19 = r55
        L_0x004e:
            int[] r18 = androidx.constraintlayout.solver.widgets.ConstraintWidget.C2196a.f5178b
            int r20 = r41.ordinal()
            r14 = r18[r20]
            r11 = 1
            r18 = r6
            if (r14 == r11) goto L_0x006e
            r11 = 2
            if (r14 == r11) goto L_0x006e
            r11 = 3
            if (r14 == r11) goto L_0x006e
            r11 = 4
            if (r14 == r11) goto L_0x0067
            r14 = r19
            goto L_0x0071
        L_0x0067:
            r14 = r19
            if (r14 == r11) goto L_0x0071
            r19 = 1
            goto L_0x0073
        L_0x006e:
            r14 = r19
            r11 = 4
        L_0x0071:
            r19 = 0
        L_0x0073:
            int r11 = r0.f5143d0
            r6 = 8
            if (r11 != r6) goto L_0x007d
            r11 = 0
            r19 = 0
            goto L_0x007f
        L_0x007d:
            r11 = r46
        L_0x007f:
            if (r60 == 0) goto L_0x00a2
            if (r16 != 0) goto L_0x008d
            if (r17 != 0) goto L_0x008d
            if (r12 != 0) goto L_0x008d
            r6 = r45
            r10.mo8226d(r9, r6)
            goto L_0x009d
        L_0x008d:
            if (r16 == 0) goto L_0x009d
            if (r17 != 0) goto L_0x009d
            int r6 = r43.mo8252e()
            r23 = r12
            r12 = 8
            r10.mo8227e(r9, r7, r6, r12)
            goto L_0x00a5
        L_0x009d:
            r23 = r12
            r12 = 8
            goto L_0x00a5
        L_0x00a2:
            r23 = r12
            r12 = r6
        L_0x00a5:
            if (r19 != 0) goto L_0x00c3
            if (r42 == 0) goto L_0x00bc
            r5 = 3
            r6 = 0
            r10.mo8227e(r8, r9, r6, r5)
            if (r15 <= 0) goto L_0x00b3
            r10.mo8228f(r8, r9, r15, r12)
        L_0x00b3:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00c0
            r10.mo8229g(r8, r9, r1, r12)
            goto L_0x00c0
        L_0x00bc:
            r5 = 3
            r10.mo8227e(r8, r9, r11, r12)
        L_0x00c0:
            r6 = r5
            goto L_0x012d
        L_0x00c3:
            r1 = 2
            r6 = 3
            if (r2 == r1) goto L_0x00e0
            if (r50 != 0) goto L_0x00e0
            r1 = 1
            if (r14 == r1) goto L_0x00ce
            if (r14 != 0) goto L_0x00e0
        L_0x00ce:
            int r1 = java.lang.Math.max(r3, r11)
            if (r4 <= 0) goto L_0x00d8
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00d8:
            r5 = 8
            r10.mo8227e(r8, r9, r1, r5)
            r19 = 0
            goto L_0x012d
        L_0x00e0:
            r1 = -2
            if (r3 != r1) goto L_0x00e4
            r3 = r11
        L_0x00e4:
            if (r4 != r1) goto L_0x00e7
            r4 = r11
        L_0x00e7:
            if (r11 <= 0) goto L_0x00ed
            r1 = 1
            if (r14 == r1) goto L_0x00ed
            r11 = 0
        L_0x00ed:
            if (r3 <= 0) goto L_0x00f8
            r1 = 8
            r10.mo8228f(r8, r9, r3, r1)
            int r11 = java.lang.Math.max(r11, r3)
        L_0x00f8:
            if (r4 <= 0) goto L_0x0111
            if (r36 == 0) goto L_0x0101
            r1 = 1
            if (r14 != r1) goto L_0x0101
            r1 = 0
            goto L_0x0102
        L_0x0101:
            r1 = 1
        L_0x0102:
            if (r1 == 0) goto L_0x010a
            r1 = 8
            r10.mo8229g(r8, r9, r4, r1)
            goto L_0x010c
        L_0x010a:
            r1 = 8
        L_0x010c:
            int r11 = java.lang.Math.min(r11, r4)
            goto L_0x0113
        L_0x0111:
            r1 = 8
        L_0x0113:
            r12 = 1
            if (r14 != r12) goto L_0x0133
            if (r36 == 0) goto L_0x011c
            r10.mo8227e(r8, r9, r11, r1)
            goto L_0x012d
        L_0x011c:
            if (r52 == 0) goto L_0x0126
            r5 = 5
            r10.mo8227e(r8, r9, r11, r5)
            r10.mo8229g(r8, r9, r11, r1)
            goto L_0x012d
        L_0x0126:
            r5 = 5
            r10.mo8227e(r8, r9, r11, r5)
            r10.mo8229g(r8, r9, r11, r1)
        L_0x012d:
            r11 = r38
            r24 = r2
            r12 = r3
            goto L_0x019c
        L_0x0133:
            r1 = 2
            if (r14 != r1) goto L_0x0198
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = r13.f5104e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r12) goto L_0x015a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r1) goto L_0x0141
            goto L_0x015a
        L_0x0141:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.f5126Q
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mo8284m(r11)
            androidx.constraintlayout.solver.SolverVariable r1 = r10.mo8233k(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r0.f5126Q
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mo8284m(r12)
            androidx.constraintlayout.solver.SolverVariable r11 = r10.mo8233k(r11)
            goto L_0x0170
        L_0x015a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.f5126Q
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mo8284m(r12)
            androidx.constraintlayout.solver.SolverVariable r1 = r10.mo8233k(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r0.f5126Q
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mo8284m(r12)
            androidx.constraintlayout.solver.SolverVariable r11 = r10.mo8233k(r11)
        L_0x0170:
            androidx.constraintlayout.solver.b r12 = r34.mo8234l()
            androidx.constraintlayout.solver.b$a r6 = r12.f5075d
            r24 = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.mo8206f(r8, r2)
            androidx.constraintlayout.solver.b$a r2 = r12.f5075d
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.mo8206f(r9, r6)
            androidx.constraintlayout.solver.b$a r2 = r12.f5075d
            r2.mo8206f(r11, r5)
            androidx.constraintlayout.solver.b$a r2 = r12.f5075d
            float r5 = -r5
            r2.mo8206f(r1, r5)
            r10.mo8225c(r12)
            r11 = r38
            r12 = r3
            r19 = 0
            goto L_0x019c
        L_0x0198:
            r24 = r2
            r12 = r3
            r11 = 1
        L_0x019c:
            if (r60 == 0) goto L_0x04b7
            if (r52 == 0) goto L_0x01b0
            r3 = r39
            r6 = r8
            r5 = r9
            r38 = r11
            r1 = r24
            r2 = 2
            r4 = 8
            r7 = 0
            r8 = r40
            goto L_0x04c5
        L_0x01b0:
            if (r16 != 0) goto L_0x01b7
            if (r17 != 0) goto L_0x01b7
            if (r23 != 0) goto L_0x01b7
            goto L_0x01bb
        L_0x01b7:
            if (r16 == 0) goto L_0x01bf
            if (r17 != 0) goto L_0x01bf
        L_0x01bb:
            r6 = r18
        L_0x01bd:
            r5 = 0
            goto L_0x01e1
        L_0x01bf:
            if (r16 != 0) goto L_0x01eb
            if (r17 == 0) goto L_0x01eb
            int r1 = r44.mo8252e()
            int r1 = -r1
            r6 = r18
            r2 = 8
            r10.mo8227e(r8, r6, r1, r2)
            if (r36 == 0) goto L_0x01bd
            r3 = r39
            r1 = 5
            r5 = 0
            r10.mo8228f(r9, r3, r5, r1)
            r15 = r44
            r7 = r5
            r2 = r6
            r6 = r8
            r38 = r11
            goto L_0x049d
        L_0x01e1:
            r15 = r44
            r7 = r5
            r2 = r6
            r6 = r8
            r38 = r11
            r1 = 5
            goto L_0x049d
        L_0x01eb:
            r3 = r39
            r6 = r18
            r1 = 2
            r5 = 0
            if (r16 == 0) goto L_0x01e1
            if (r17 == 0) goto L_0x01e1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r13.f5105f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.f5103d
            r1 = r44
            r13 = 3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.f5105f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.f5103d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r0.f5126Q
            r16 = 6
            if (r19 == 0) goto L_0x02fb
            if (r14 != 0) goto L_0x0257
            if (r4 != 0) goto L_0x0233
            if (r12 != 0) goto L_0x0233
            boolean r4 = r7.f5055f
            if (r4 == 0) goto L_0x0226
            boolean r4 = r6.f5055f
            if (r4 == 0) goto L_0x0226
            int r2 = r43.mo8252e()
            r4 = 8
            r10.mo8227e(r9, r7, r2, r4)
            int r1 = r44.mo8252e()
            int r1 = -r1
            r10.mo8227e(r8, r6, r1, r4)
            return
        L_0x0226:
            r4 = 8
            r17 = r4
            r18 = r17
            r22 = 0
            r23 = 0
            r24 = 1
            goto L_0x023f
        L_0x0233:
            r4 = 8
            r17 = 5
            r18 = 5
            r22 = 1
            r23 = 1
            r24 = 0
        L_0x023f:
            boolean r4 = r2 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r4 != 0) goto L_0x024f
            boolean r4 = r5 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r4 == 0) goto L_0x0248
            goto L_0x024f
        L_0x0248:
            r4 = r18
            r18 = r14
            r14 = r17
            goto L_0x0254
        L_0x024f:
            r18 = r14
            r14 = r17
            r4 = 4
        L_0x0254:
            r17 = 8
            goto L_0x02a5
        L_0x0257:
            r15 = 1
            r17 = 8
            if (r14 != r15) goto L_0x0263
            r18 = r14
            r4 = r16
            r14 = 4
            r15 = 0
            goto L_0x0279
        L_0x0263:
            r15 = 3
            if (r14 != r15) goto L_0x02f2
            int r15 = r0.f5172v
            r18 = r14
            r14 = -1
            if (r15 != r14) goto L_0x0289
            if (r53 == 0) goto L_0x0275
            if (r36 == 0) goto L_0x0273
            r4 = 5
            goto L_0x0277
        L_0x0273:
            r4 = 4
            goto L_0x0277
        L_0x0275:
            r4 = r17
        L_0x0277:
            r14 = 5
            r15 = 1
        L_0x0279:
            r22 = r4
            r26 = r14
            r23 = r15
            r25 = r17
            r4 = 1
            r15 = 5
            r24 = 1
            r14 = r40
            goto L_0x0351
        L_0x0289:
            if (r50 == 0) goto L_0x02b2
            r14 = r56
            r15 = 2
            if (r14 == r15) goto L_0x0296
            r4 = 1
            if (r14 != r4) goto L_0x0294
            goto L_0x0296
        L_0x0294:
            r4 = 0
            goto L_0x0297
        L_0x0296:
            r4 = 1
        L_0x0297:
            if (r4 != 0) goto L_0x029d
            r14 = r17
            r4 = 5
            goto L_0x029f
        L_0x029d:
            r4 = 4
            r14 = 5
        L_0x029f:
            r22 = 1
            r23 = 1
            r24 = 1
        L_0x02a5:
            r26 = r4
            r25 = r14
            r4 = r23
            r23 = r24
            r15 = 5
            r14 = r40
            goto L_0x034d
        L_0x02b2:
            if (r4 <= 0) goto L_0x02c0
            r14 = r40
            r4 = 1
            r15 = 5
            r22 = 1
            r23 = 1
            r24 = 5
            goto L_0x0349
        L_0x02c0:
            if (r4 != 0) goto L_0x02e9
            if (r12 != 0) goto L_0x02e9
            if (r53 != 0) goto L_0x02d2
            r14 = r40
            r24 = r17
            r4 = 1
            r15 = 5
            r22 = 1
            r23 = 1
            goto L_0x0349
        L_0x02d2:
            if (r2 == r13) goto L_0x02d8
            if (r5 == r13) goto L_0x02d8
            r4 = 4
            goto L_0x02d9
        L_0x02d8:
            r4 = 5
        L_0x02d9:
            r14 = r40
            r25 = r4
            r22 = r16
            r4 = 1
            r15 = 5
            r23 = 1
            r24 = 1
            r26 = 4
            goto L_0x0351
        L_0x02e9:
            r14 = r40
            r4 = 1
            r15 = 5
            r22 = 1
            r23 = 1
            goto L_0x0347
        L_0x02f2:
            r18 = r14
            r14 = r40
            r4 = 0
            r15 = 5
            r22 = 0
            goto L_0x0345
        L_0x02fb:
            r18 = r14
            r17 = 8
            boolean r4 = r7.f5055f
            if (r4 == 0) goto L_0x033f
            boolean r4 = r6.f5055f
            if (r4 == 0) goto L_0x033f
            int r2 = r43.mo8252e()
            int r3 = r44.mo8252e()
            r4 = 8
            r50 = r34
            r51 = r9
            r52 = r7
            r53 = r2
            r54 = r49
            r55 = r6
            r56 = r8
            r57 = r3
            r58 = r4
            r50.mo8224b(r51, r52, r53, r54, r55, r56, r57, r58)
            if (r36 == 0) goto L_0x033e
            if (r11 == 0) goto L_0x033e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.f5105f
            if (r2 == 0) goto L_0x0335
            int r1 = r44.mo8252e()
            r14 = r40
            goto L_0x0338
        L_0x0335:
            r14 = r40
            r1 = 0
        L_0x0338:
            if (r6 == r14) goto L_0x033e
            r15 = 5
            r10.mo8228f(r14, r8, r1, r15)
        L_0x033e:
            return
        L_0x033f:
            r14 = r40
            r15 = 5
            r4 = 1
            r22 = 1
        L_0x0345:
            r23 = 0
        L_0x0347:
            r24 = 4
        L_0x0349:
            r25 = r15
            r26 = r24
        L_0x034d:
            r24 = r22
            r22 = r16
        L_0x0351:
            if (r24 == 0) goto L_0x035c
            if (r7 != r6) goto L_0x035c
            if (r2 == r13) goto L_0x035c
            r24 = 0
            r27 = 0
            goto L_0x0360
        L_0x035c:
            r27 = r24
            r24 = 1
        L_0x0360:
            if (r4 == 0) goto L_0x03a8
            if (r19 != 0) goto L_0x0375
            if (r51 != 0) goto L_0x0375
            if (r53 != 0) goto L_0x0375
            if (r7 != r3) goto L_0x0375
            if (r6 != r14) goto L_0x0375
            r25 = r17
            r28 = r25
            r22 = 0
            r24 = 0
            goto L_0x037b
        L_0x0375:
            r28 = r25
            r25 = r22
            r22 = r36
        L_0x037b:
            int r4 = r43.mo8252e()
            int r29 = r44.mo8252e()
            r15 = r1
            r1 = r34
            r14 = r2
            r2 = r9
            r38 = r11
            r11 = r3
            r3 = r7
            r41 = r12
            r21 = 0
            r12 = r5
            r5 = r49
            r35 = r6
            r11 = r17
            r30 = r7
            r7 = r8
            r31 = r8
            r8 = r29
            r32 = r9
            r9 = r25
            r1.mo8224b(r2, r3, r4, r5, r6, r7, r8, r9)
            r25 = r28
            goto L_0x03bb
        L_0x03a8:
            r15 = r1
            r14 = r2
            r35 = r6
            r30 = r7
            r31 = r8
            r32 = r9
            r38 = r11
            r41 = r12
            r11 = r17
            r12 = r5
            r22 = r36
        L_0x03bb:
            int r1 = r0.f5143d0
            if (r1 != r11) goto L_0x03d0
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r1 = r15.f5100a
            if (r1 != 0) goto L_0x03c4
            goto L_0x03cc
        L_0x03c4:
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03cc
            r6 = 1
            goto L_0x03cd
        L_0x03cc:
            r6 = 0
        L_0x03cd:
            if (r6 != 0) goto L_0x03d0
            return
        L_0x03d0:
            if (r27 == 0) goto L_0x03ff
            r2 = r35
            r1 = r30
            if (r22 == 0) goto L_0x03e7
            if (r1 == r2) goto L_0x03e7
            if (r19 != 0) goto L_0x03e7
            boolean r3 = r14 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r3 != 0) goto L_0x03e4
            boolean r3 = r12 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r3 == 0) goto L_0x03e7
        L_0x03e4:
            r3 = r16
            goto L_0x03e9
        L_0x03e7:
            r3 = r25
        L_0x03e9:
            int r4 = r43.mo8252e()
            r5 = r32
            r10.mo8228f(r5, r1, r4, r3)
            int r4 = r44.mo8252e()
            int r4 = -r4
            r6 = r31
            r10.mo8229g(r6, r2, r4, r3)
            r25 = r3
            goto L_0x0407
        L_0x03ff:
            r2 = r35
            r1 = r30
            r6 = r31
            r5 = r32
        L_0x0407:
            if (r22 == 0) goto L_0x0419
            if (r54 == 0) goto L_0x0419
            boolean r3 = r14 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r3 != 0) goto L_0x0419
            boolean r3 = r12 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r3 != 0) goto L_0x0419
            r3 = r16
            r4 = r3
            r20 = 1
            goto L_0x041f
        L_0x0419:
            r20 = r24
            r3 = r25
            r4 = r26
        L_0x041f:
            if (r20 == 0) goto L_0x046c
            if (r23 == 0) goto L_0x044c
            if (r53 == 0) goto L_0x0427
            if (r37 == 0) goto L_0x044c
        L_0x0427:
            if (r14 == r13) goto L_0x042e
            if (r12 != r13) goto L_0x042c
            goto L_0x042e
        L_0x042c:
            r16 = r4
        L_0x042e:
            boolean r7 = r14 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r7 != 0) goto L_0x0436
            boolean r7 = r12 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r7 == 0) goto L_0x0438
        L_0x0436:
            r16 = 5
        L_0x0438:
            boolean r7 = r14 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r7 != 0) goto L_0x0440
            boolean r7 = r12 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r7 == 0) goto L_0x0442
        L_0x0440:
            r16 = 5
        L_0x0442:
            if (r53 == 0) goto L_0x0446
            r7 = 5
            goto L_0x0448
        L_0x0446:
            r7 = r16
        L_0x0448:
            int r4 = java.lang.Math.max(r7, r4)
        L_0x044c:
            if (r22 == 0) goto L_0x045d
            int r3 = java.lang.Math.min(r3, r4)
            if (r50 == 0) goto L_0x045c
            if (r53 != 0) goto L_0x045c
            if (r14 == r13) goto L_0x045a
            if (r12 != r13) goto L_0x045c
        L_0x045a:
            r4 = 4
            goto L_0x045d
        L_0x045c:
            r4 = r3
        L_0x045d:
            int r3 = r43.mo8252e()
            r10.mo8227e(r5, r1, r3, r4)
            int r3 = r44.mo8252e()
            int r3 = -r3
            r10.mo8227e(r6, r2, r3, r4)
        L_0x046c:
            if (r22 == 0) goto L_0x0480
            r3 = r39
            r4 = r11
            if (r3 != r1) goto L_0x0478
            int r7 = r43.mo8252e()
            goto L_0x0479
        L_0x0478:
            r7 = 0
        L_0x0479:
            if (r1 == r3) goto L_0x0481
            r1 = 5
            r10.mo8228f(r5, r3, r7, r1)
            goto L_0x0482
        L_0x0480:
            r4 = r11
        L_0x0481:
            r1 = 5
        L_0x0482:
            if (r22 == 0) goto L_0x049b
            if (r19 == 0) goto L_0x049b
            if (r47 != 0) goto L_0x049b
            if (r41 != 0) goto L_0x049b
            if (r19 == 0) goto L_0x0496
            r14 = r18
            r3 = 3
            if (r14 != r3) goto L_0x0496
            r7 = 0
            r10.mo8228f(r6, r5, r7, r4)
            goto L_0x049f
        L_0x0496:
            r7 = 0
            r10.mo8228f(r6, r5, r7, r1)
            goto L_0x049f
        L_0x049b:
            r7 = 0
            goto L_0x049f
        L_0x049d:
            r22 = r36
        L_0x049f:
            if (r22 == 0) goto L_0x04b6
            if (r38 == 0) goto L_0x04b6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.f5105f
            if (r3 == 0) goto L_0x04af
            int r3 = r44.mo8252e()
            r8 = r40
            r7 = r3
            goto L_0x04b1
        L_0x04af:
            r8 = r40
        L_0x04b1:
            if (r2 == r8) goto L_0x04b6
            r10.mo8228f(r8, r6, r7, r1)
        L_0x04b6:
            return
        L_0x04b7:
            r3 = r39
            r6 = r8
            r5 = r9
            r38 = r11
            r1 = r24
            r4 = 8
            r7 = 0
            r8 = r40
            r2 = 2
        L_0x04c5:
            if (r1 >= r2) goto L_0x0502
            if (r36 == 0) goto L_0x0502
            if (r38 == 0) goto L_0x0502
            r10.mo8228f(r5, r3, r7, r4)
            if (r35 != 0) goto L_0x04d9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.f5118I
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.f5105f
            if (r1 != 0) goto L_0x04d7
            goto L_0x04d9
        L_0x04d7:
            r1 = r7
            goto L_0x04da
        L_0x04d9:
            r1 = 1
        L_0x04da:
            if (r35 != 0) goto L_0x04fc
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.f5118I
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5105f
            if (r2 == 0) goto L_0x04fc
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r2.f5103d
            float r2 = r1.f5129T
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x04fa
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.f5125P
            r2 = r1[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x04fa
            r2 = 1
            r1 = r1[r2]
            if (r1 != r3) goto L_0x04fa
            r11 = r2
            goto L_0x04fd
        L_0x04fa:
            r11 = r7
            goto L_0x04fd
        L_0x04fc:
            r11 = r1
        L_0x04fd:
            if (r11 == 0) goto L_0x0502
            r10.mo8228f(r8, r6, r7, r4)
        L_0x0502:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.mo8278g(androidx.constraintlayout.solver.c, boolean, boolean, boolean, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: h */
    public final void mo8279h(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type != type5) {
            ConstraintAnchor.Type type6 = ConstraintAnchor.Type.CENTER_X;
            if (type == type6 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
                ConstraintAnchor m = mo8284m(type4);
                ConstraintAnchor m2 = constraintWidget.mo8284m(type2);
                ConstraintAnchor m3 = mo8284m(ConstraintAnchor.Type.RIGHT);
                m.mo8248a(m2, 0);
                m3.mo8248a(m2, 0);
                mo8284m(type6).mo8248a(m2, 0);
                return;
            }
            ConstraintAnchor.Type type7 = ConstraintAnchor.Type.CENTER_Y;
            if (type == type7 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
                ConstraintAnchor m4 = constraintWidget.mo8284m(type2);
                mo8284m(type3).mo8248a(m4, 0);
                mo8284m(ConstraintAnchor.Type.BOTTOM).mo8248a(m4, 0);
                mo8284m(type7).mo8248a(m4, 0);
            } else if (type == type6 && type2 == type6) {
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
                mo8284m(type8).mo8248a(constraintWidget.mo8284m(type8), 0);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
                mo8284m(type9).mo8248a(constraintWidget.mo8284m(type9), 0);
                mo8284m(type6).mo8248a(constraintWidget.mo8284m(type2), 0);
            } else if (type == type7 && type2 == type7) {
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
                mo8284m(type10).mo8248a(constraintWidget.mo8284m(type10), 0);
                ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
                mo8284m(type11).mo8248a(constraintWidget.mo8284m(type11), 0);
                mo8284m(type7).mo8248a(constraintWidget.mo8284m(type2), 0);
            } else {
                ConstraintAnchor m5 = mo8284m(type);
                ConstraintAnchor m6 = constraintWidget.mo8284m(type2);
                if (m5.mo8256i(m6)) {
                    ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BASELINE;
                    if (type == type12) {
                        ConstraintAnchor m7 = mo8284m(ConstraintAnchor.Type.TOP);
                        ConstraintAnchor m8 = mo8284m(ConstraintAnchor.Type.BOTTOM);
                        if (m7 != null) {
                            m7.mo8257j();
                        }
                        if (m8 != null) {
                            m8.mo8257j();
                        }
                        i = 0;
                    } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                        ConstraintAnchor m9 = mo8284m(type12);
                        if (m9 != null) {
                            m9.mo8257j();
                        }
                        ConstraintAnchor m10 = mo8284m(type5);
                        if (m10.f5105f != m6) {
                            m10.mo8257j();
                        }
                        ConstraintAnchor f = mo8284m(type).mo8253f();
                        ConstraintAnchor m11 = mo8284m(type7);
                        if (m11.mo8255h()) {
                            f.mo8257j();
                            m11.mo8257j();
                        }
                    } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor m12 = mo8284m(type5);
                        if (m12.f5105f != m6) {
                            m12.mo8257j();
                        }
                        ConstraintAnchor f2 = mo8284m(type).mo8253f();
                        ConstraintAnchor m13 = mo8284m(type6);
                        if (m13.mo8255h()) {
                            f2.mo8257j();
                            m13.mo8257j();
                        }
                    }
                    m5.mo8248a(m6, i);
                }
            }
        } else if (type2 == type5) {
            ConstraintAnchor.Type type13 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor m14 = mo8284m(type13);
            ConstraintAnchor.Type type14 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor m15 = mo8284m(type14);
            ConstraintAnchor.Type type15 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor m16 = mo8284m(type15);
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor m17 = mo8284m(type16);
            boolean z2 = true;
            if ((m14 == null || !m14.mo8255h()) && (m15 == null || !m15.mo8255h())) {
                mo8279h(type13, constraintWidget, type13, 0);
                mo8279h(type14, constraintWidget, type14, 0);
                z = true;
            } else {
                z = false;
            }
            if ((m16 == null || !m16.mo8255h()) && (m17 == null || !m17.mo8255h())) {
                mo8279h(type15, constraintWidget, type15, 0);
                mo8279h(type16, constraintWidget, type16, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo8284m(type5).mo8248a(constraintWidget.mo8284m(type5), 0);
            } else if (z) {
                ConstraintAnchor.Type type17 = ConstraintAnchor.Type.CENTER_X;
                mo8284m(type17).mo8248a(constraintWidget.mo8284m(type17), 0);
            } else if (z2) {
                ConstraintAnchor.Type type18 = ConstraintAnchor.Type.CENTER_Y;
                mo8284m(type18).mo8248a(constraintWidget.mo8284m(type18), 0);
            }
        } else {
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.LEFT;
            if (type2 == type19 || type2 == ConstraintAnchor.Type.RIGHT) {
                mo8279h(type19, constraintWidget, type2, 0);
                mo8279h(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                mo8284m(type5).mo8248a(constraintWidget.mo8284m(type2), 0);
                return;
            }
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.TOP;
            if (type2 == type20 || type2 == ConstraintAnchor.Type.BOTTOM) {
                mo8279h(type20, constraintWidget, type2, 0);
                mo8279h(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                mo8284m(type5).mo8248a(constraintWidget.mo8284m(type2), 0);
            }
        }
    }

    /* renamed from: i */
    public final void mo8280i(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.f5103d == this) {
            mo8279h(constraintAnchor.f5104e, constraintAnchor2.f5103d, constraintAnchor2.f5104e, i);
        }
    }

    /* renamed from: j */
    public void mo8281j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.f5156k = constraintWidget.f5156k;
        this.f5158l = constraintWidget.f5158l;
        this.f5160m = constraintWidget.f5160m;
        this.f5162n = constraintWidget.f5162n;
        int[] iArr = this.f5164o;
        int[] iArr2 = constraintWidget.f5164o;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f5166p = constraintWidget.f5166p;
        this.f5167q = constraintWidget.f5167q;
        this.f5169s = constraintWidget.f5169s;
        this.f5170t = constraintWidget.f5170t;
        this.f5171u = constraintWidget.f5171u;
        this.f5172v = constraintWidget.f5172v;
        this.f5173w = constraintWidget.f5173w;
        int[] iArr3 = constraintWidget.f5174x;
        this.f5174x = Arrays.copyOf(iArr3, iArr3.length);
        this.f5175y = constraintWidget.f5175y;
        this.f5176z = constraintWidget.f5176z;
        this.f5110A = constraintWidget.f5110A;
        this.f5114E.mo8257j();
        this.f5115F.mo8257j();
        this.f5116G.mo8257j();
        this.f5117H.mo8257j();
        this.f5118I.mo8257j();
        this.f5119J.mo8257j();
        this.f5120K.mo8257j();
        this.f5121L.mo8257j();
        this.f5125P = (DimensionBehaviour[]) Arrays.copyOf(this.f5125P, 2);
        ConstraintWidget constraintWidget2 = null;
        this.f5126Q = this.f5126Q == null ? null : hashMap.get(constraintWidget.f5126Q);
        this.f5127R = constraintWidget.f5127R;
        this.f5128S = constraintWidget.f5128S;
        this.f5129T = constraintWidget.f5129T;
        this.f5130U = constraintWidget.f5130U;
        this.f5131V = constraintWidget.f5131V;
        this.f5132W = constraintWidget.f5132W;
        this.f5133X = constraintWidget.f5133X;
        this.f5134Y = constraintWidget.f5134Y;
        this.f5135Z = constraintWidget.f5135Z;
        this.f5137a0 = constraintWidget.f5137a0;
        this.f5139b0 = constraintWidget.f5139b0;
        this.f5141c0 = constraintWidget.f5141c0;
        this.f5143d0 = constraintWidget.f5143d0;
        this.f5145e0 = constraintWidget.f5145e0;
        this.f5147f0 = constraintWidget.f5147f0;
        this.f5149g0 = constraintWidget.f5149g0;
        this.f5151h0 = constraintWidget.f5151h0;
        float[] fArr = this.f5153i0;
        float[] fArr2 = constraintWidget.f5153i0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.f5155j0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.f5155j0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.f5157k0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.f5157k0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.f5159l0;
        this.f5159l0 = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.f5161m0;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.f5161m0 = constraintWidget2;
    }

    /* renamed from: k */
    public final void mo8282k(C2190c cVar) {
        cVar.mo8233k(this.f5114E);
        cVar.mo8233k(this.f5115F);
        cVar.mo8233k(this.f5116G);
        cVar.mo8233k(this.f5117H);
        if (this.f5133X > 0) {
            cVar.mo8233k(this.f5118I);
        }
    }

    /* renamed from: l */
    public final void mo8283l() {
        if (this.f5142d == null) {
            this.f5142d = new C2211k(this);
        }
        if (this.f5144e == null) {
            this.f5144e = new C2214m(this);
        }
    }

    /* renamed from: m */
    public ConstraintAnchor mo8284m(ConstraintAnchor.Type type) {
        switch (C2196a.f5177a[type.ordinal()]) {
            case 1:
                return this.f5114E;
            case 2:
                return this.f5115F;
            case 3:
                return this.f5116G;
            case 4:
                return this.f5117H;
            case 5:
                return this.f5118I;
            case 6:
                return this.f5121L;
            case 7:
                return this.f5119J;
            case 8:
                return this.f5120K;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* renamed from: n */
    public final DimensionBehaviour mo8285n(int i) {
        if (i == 0) {
            return this.f5125P[0];
        }
        if (i == 1) {
            return this.f5125P[1];
        }
        return null;
    }

    /* renamed from: o */
    public final int mo8286o() {
        if (this.f5143d0 == 8) {
            return 0;
        }
        return this.f5128S;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f5117H;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.solver.widgets.ConstraintWidget mo8287p(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.f5105f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.f5105f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.f5103d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.f5117H
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.f5105f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.f5105f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.f5103d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.mo8287p(int):androidx.constraintlayout.solver.widgets.ConstraintWidget");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f5115F;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.solver.widgets.ConstraintWidget mo8288q(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.f5105f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.f5105f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.f5103d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.f5105f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.f5105f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.f5103d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.mo8288q(int):androidx.constraintlayout.solver.widgets.ConstraintWidget");
    }

    /* renamed from: r */
    public final int mo8289r() {
        if (this.f5143d0 == 8) {
            return 0;
        }
        return this.f5127R;
    }

    /* renamed from: s */
    public final int mo8290s() {
        ConstraintWidget constraintWidget = this.f5126Q;
        return (constraintWidget == null || !(constraintWidget instanceof C2220d)) ? this.f5131V : ((C2220d) constraintWidget).f5275v0 + this.f5131V;
    }

    /* renamed from: t */
    public final int mo8291t() {
        ConstraintWidget constraintWidget = this.f5126Q;
        return (constraintWidget == null || !(constraintWidget instanceof C2220d)) ? this.f5132W : ((C2220d) constraintWidget).f5276w0 + this.f5132W;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(this.f5147f0 != null ? C0023f.m110k(C0072d.m201h("type: "), this.f5147f0, " ") : str);
        if (this.f5145e0 != null) {
            str = C0023f.m110k(C0072d.m201h("id: "), this.f5145e0, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f5131V);
        sb.append(", ");
        sb.append(this.f5132W);
        sb.append(") - (");
        sb.append(this.f5127R);
        sb.append(" x ");
        return C0071c.m191c(sb, this.f5128S, ")");
    }

    /* renamed from: u */
    public final boolean mo8293u(int i) {
        if (i == 0) {
            return (this.f5114E.f5105f != null ? 1 : 0) + (this.f5116G.f5105f != null ? 1 : 0) < 2;
        }
        return ((this.f5115F.f5105f != null ? 1 : 0) + (this.f5117H.f5105f != null ? 1 : 0)) + (this.f5118I.f5105f != null ? 1 : 0) < 2;
    }

    /* renamed from: v */
    public final void mo8294v(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        mo8284m(type).mo8249b(constraintWidget.mo8284m(type2), i, i2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r5 = r0[r5 + 1];
        r0 = r5.f5105f;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8295w(int r5) {
        /*
            r4 = this;
            int r5 = r5 * 2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r4.f5122M
            r1 = r0[r5]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.f5105f
            r3 = 1
            if (r2 == 0) goto L_0x001b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5105f
            if (r2 == r1) goto L_0x001b
            int r5 = r5 + r3
            r5 = r0[r5]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r5.f5105f
            if (r0 == 0) goto L_0x001b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5105f
            if (r0 != r5) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.mo8295w(int):boolean");
    }

    /* renamed from: x */
    public final boolean mo8296x() {
        ConstraintAnchor constraintAnchor = this.f5114E;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f5105f;
        if (constraintAnchor2 != null && constraintAnchor2.f5105f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f5116G;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f5105f;
        return constraintAnchor4 != null && constraintAnchor4.f5105f == constraintAnchor3;
    }

    /* renamed from: y */
    public final boolean mo8297y() {
        ConstraintAnchor constraintAnchor = this.f5115F;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f5105f;
        if (constraintAnchor2 != null && constraintAnchor2.f5105f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f5117H;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f5105f;
        return constraintAnchor4 != null && constraintAnchor4.f5105f == constraintAnchor3;
    }

    /* renamed from: z */
    public final boolean mo8298z() {
        return this.f5148g && this.f5143d0 != 8;
    }
}

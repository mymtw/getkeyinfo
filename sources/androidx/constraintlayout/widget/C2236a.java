package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.C2114a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.reflect.C19421p;
import org.xmlpull.v1.XmlPullParserException;
import p184n0.C7363c;
import p212q0.C7713c;

/* renamed from: androidx.constraintlayout.widget.a */
public final class C2236a {

    /* renamed from: d */
    public static final int[] f5371d = {0, 4, 8};

    /* renamed from: e */
    public static SparseIntArray f5372e;

    /* renamed from: a */
    public HashMap<String, ConstraintAttribute> f5373a = new HashMap<>();

    /* renamed from: b */
    public boolean f5374b = true;

    /* renamed from: c */
    public HashMap<Integer, C2237a> f5375c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.a$a */
    public static class C2237a {

        /* renamed from: a */
        public int f5376a;

        /* renamed from: b */
        public final C2240d f5377b = new C2240d();

        /* renamed from: c */
        public final C2239c f5378c = new C2239c();

        /* renamed from: d */
        public final C2238b f5379d = new C2238b();

        /* renamed from: e */
        public final C2241e f5380e = new C2241e();

        /* renamed from: f */
        public HashMap<String, ConstraintAttribute> f5381f = new HashMap<>();

        /* renamed from: a */
        public final void mo8495a(ConstraintLayout.LayoutParams layoutParams) {
            C2238b bVar = this.f5379d;
            layoutParams.leftToLeft = bVar.f5423h;
            layoutParams.leftToRight = bVar.f5425i;
            layoutParams.rightToLeft = bVar.f5427j;
            layoutParams.rightToRight = bVar.f5429k;
            layoutParams.topToTop = bVar.f5430l;
            layoutParams.topToBottom = bVar.f5431m;
            layoutParams.bottomToTop = bVar.f5432n;
            layoutParams.bottomToBottom = bVar.f5433o;
            layoutParams.baselineToBaseline = bVar.f5434p;
            layoutParams.startToEnd = bVar.f5435q;
            layoutParams.startToStart = bVar.f5436r;
            layoutParams.endToStart = bVar.f5437s;
            layoutParams.endToEnd = bVar.f5438t;
            layoutParams.leftMargin = bVar.f5386D;
            layoutParams.rightMargin = bVar.f5387E;
            layoutParams.topMargin = bVar.f5388F;
            layoutParams.bottomMargin = bVar.f5389G;
            layoutParams.goneStartMargin = bVar.f5397O;
            layoutParams.goneEndMargin = bVar.f5396N;
            layoutParams.goneTopMargin = bVar.f5393K;
            layoutParams.goneBottomMargin = bVar.f5395M;
            layoutParams.horizontalBias = bVar.f5439u;
            layoutParams.verticalBias = bVar.f5440v;
            layoutParams.circleConstraint = bVar.f5442x;
            layoutParams.circleRadius = bVar.f5443y;
            layoutParams.circleAngle = bVar.f5444z;
            layoutParams.dimensionRatio = bVar.f5441w;
            layoutParams.editorAbsoluteX = bVar.f5383A;
            layoutParams.editorAbsoluteY = bVar.f5384B;
            layoutParams.verticalWeight = bVar.f5398P;
            layoutParams.horizontalWeight = bVar.f5399Q;
            layoutParams.verticalChainStyle = bVar.f5401S;
            layoutParams.horizontalChainStyle = bVar.f5400R;
            layoutParams.constrainedWidth = bVar.f5424h0;
            layoutParams.constrainedHeight = bVar.f5426i0;
            layoutParams.matchConstraintDefaultWidth = bVar.f5402T;
            layoutParams.matchConstraintDefaultHeight = bVar.f5403U;
            layoutParams.matchConstraintMaxWidth = bVar.f5404V;
            layoutParams.matchConstraintMaxHeight = bVar.f5405W;
            layoutParams.matchConstraintMinWidth = bVar.f5406X;
            layoutParams.matchConstraintMinHeight = bVar.f5407Y;
            layoutParams.matchConstraintPercentWidth = bVar.f5408Z;
            layoutParams.matchConstraintPercentHeight = bVar.f5410a0;
            layoutParams.orientation = bVar.f5385C;
            layoutParams.guidePercent = bVar.f5421g;
            layoutParams.guideBegin = bVar.f5417e;
            layoutParams.guideEnd = bVar.f5419f;
            layoutParams.width = bVar.f5413c;
            layoutParams.height = bVar.f5415d;
            String str = bVar.f5422g0;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.setMarginStart(bVar.f5391I);
            layoutParams.setMarginEnd(this.f5379d.f5390H);
            layoutParams.validate();
        }

        /* renamed from: b */
        public final void mo8496b(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f5376a = i;
            C2238b bVar = this.f5379d;
            bVar.f5423h = layoutParams.leftToLeft;
            bVar.f5425i = layoutParams.leftToRight;
            bVar.f5427j = layoutParams.rightToLeft;
            bVar.f5429k = layoutParams.rightToRight;
            bVar.f5430l = layoutParams.topToTop;
            bVar.f5431m = layoutParams.topToBottom;
            bVar.f5432n = layoutParams.bottomToTop;
            bVar.f5433o = layoutParams.bottomToBottom;
            bVar.f5434p = layoutParams.baselineToBaseline;
            bVar.f5435q = layoutParams.startToEnd;
            bVar.f5436r = layoutParams.startToStart;
            bVar.f5437s = layoutParams.endToStart;
            bVar.f5438t = layoutParams.endToEnd;
            bVar.f5439u = layoutParams.horizontalBias;
            bVar.f5440v = layoutParams.verticalBias;
            bVar.f5441w = layoutParams.dimensionRatio;
            bVar.f5442x = layoutParams.circleConstraint;
            bVar.f5443y = layoutParams.circleRadius;
            bVar.f5444z = layoutParams.circleAngle;
            bVar.f5383A = layoutParams.editorAbsoluteX;
            bVar.f5384B = layoutParams.editorAbsoluteY;
            bVar.f5385C = layoutParams.orientation;
            bVar.f5421g = layoutParams.guidePercent;
            bVar.f5417e = layoutParams.guideBegin;
            bVar.f5419f = layoutParams.guideEnd;
            bVar.f5413c = layoutParams.width;
            bVar.f5415d = layoutParams.height;
            bVar.f5386D = layoutParams.leftMargin;
            bVar.f5387E = layoutParams.rightMargin;
            bVar.f5388F = layoutParams.topMargin;
            bVar.f5389G = layoutParams.bottomMargin;
            bVar.f5398P = layoutParams.verticalWeight;
            bVar.f5399Q = layoutParams.horizontalWeight;
            bVar.f5401S = layoutParams.verticalChainStyle;
            bVar.f5400R = layoutParams.horizontalChainStyle;
            bVar.f5424h0 = layoutParams.constrainedWidth;
            bVar.f5426i0 = layoutParams.constrainedHeight;
            bVar.f5402T = layoutParams.matchConstraintDefaultWidth;
            bVar.f5403U = layoutParams.matchConstraintDefaultHeight;
            bVar.f5404V = layoutParams.matchConstraintMaxWidth;
            bVar.f5405W = layoutParams.matchConstraintMaxHeight;
            bVar.f5406X = layoutParams.matchConstraintMinWidth;
            bVar.f5407Y = layoutParams.matchConstraintMinHeight;
            bVar.f5408Z = layoutParams.matchConstraintPercentWidth;
            bVar.f5410a0 = layoutParams.matchConstraintPercentHeight;
            bVar.f5422g0 = layoutParams.constraintTag;
            bVar.f5393K = layoutParams.goneTopMargin;
            bVar.f5395M = layoutParams.goneBottomMargin;
            bVar.f5392J = layoutParams.goneLeftMargin;
            bVar.f5394L = layoutParams.goneRightMargin;
            bVar.f5397O = layoutParams.goneStartMargin;
            bVar.f5396N = layoutParams.goneEndMargin;
            bVar.f5390H = layoutParams.getMarginEnd();
            this.f5379d.f5391I = layoutParams.getMarginStart();
        }

        /* renamed from: c */
        public final void mo8497c(int i, Constraints.LayoutParams layoutParams) {
            mo8496b(i, layoutParams);
            this.f5377b.f5456d = layoutParams.alpha;
            C2241e eVar = this.f5380e;
            eVar.f5460b = layoutParams.rotation;
            eVar.f5461c = layoutParams.rotationX;
            eVar.f5462d = layoutParams.rotationY;
            eVar.f5463e = layoutParams.scaleX;
            eVar.f5464f = layoutParams.scaleY;
            eVar.f5465g = layoutParams.transformPivotX;
            eVar.f5466h = layoutParams.transformPivotY;
            eVar.f5467i = layoutParams.translationX;
            eVar.f5468j = layoutParams.translationY;
            eVar.f5469k = layoutParams.translationZ;
            eVar.f5471m = layoutParams.elevation;
            eVar.f5470l = layoutParams.applyElevation;
        }

        public final Object clone() throws CloneNotSupportedException {
            C2237a aVar = new C2237a();
            aVar.f5379d.mo8499a(this.f5379d);
            aVar.f5378c.mo8501a(this.f5378c);
            C2240d dVar = aVar.f5377b;
            C2240d dVar2 = this.f5377b;
            dVar.getClass();
            dVar.f5453a = dVar2.f5453a;
            dVar.f5454b = dVar2.f5454b;
            dVar.f5456d = dVar2.f5456d;
            dVar.f5457e = dVar2.f5457e;
            dVar.f5455c = dVar2.f5455c;
            aVar.f5380e.mo8504a(this.f5380e);
            aVar.f5376a = this.f5376a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    public static class C2238b {

        /* renamed from: k0 */
        public static SparseIntArray f5382k0;

        /* renamed from: A */
        public int f5383A = -1;

        /* renamed from: B */
        public int f5384B = -1;

        /* renamed from: C */
        public int f5385C = -1;

        /* renamed from: D */
        public int f5386D = -1;

        /* renamed from: E */
        public int f5387E = -1;

        /* renamed from: F */
        public int f5388F = -1;

        /* renamed from: G */
        public int f5389G = -1;

        /* renamed from: H */
        public int f5390H = -1;

        /* renamed from: I */
        public int f5391I = -1;

        /* renamed from: J */
        public int f5392J = -1;

        /* renamed from: K */
        public int f5393K = -1;

        /* renamed from: L */
        public int f5394L = -1;

        /* renamed from: M */
        public int f5395M = -1;

        /* renamed from: N */
        public int f5396N = -1;

        /* renamed from: O */
        public int f5397O = -1;

        /* renamed from: P */
        public float f5398P = -1.0f;

        /* renamed from: Q */
        public float f5399Q = -1.0f;

        /* renamed from: R */
        public int f5400R = 0;

        /* renamed from: S */
        public int f5401S = 0;

        /* renamed from: T */
        public int f5402T = 0;

        /* renamed from: U */
        public int f5403U = 0;

        /* renamed from: V */
        public int f5404V = -1;

        /* renamed from: W */
        public int f5405W = -1;

        /* renamed from: X */
        public int f5406X = -1;

        /* renamed from: Y */
        public int f5407Y = -1;

        /* renamed from: Z */
        public float f5408Z = 1.0f;

        /* renamed from: a */
        public boolean f5409a = false;

        /* renamed from: a0 */
        public float f5410a0 = 1.0f;

        /* renamed from: b */
        public boolean f5411b = false;

        /* renamed from: b0 */
        public int f5412b0 = -1;

        /* renamed from: c */
        public int f5413c;

        /* renamed from: c0 */
        public int f5414c0 = 0;

        /* renamed from: d */
        public int f5415d;

        /* renamed from: d0 */
        public int f5416d0 = -1;

        /* renamed from: e */
        public int f5417e = -1;

        /* renamed from: e0 */
        public int[] f5418e0;

        /* renamed from: f */
        public int f5419f = -1;

        /* renamed from: f0 */
        public String f5420f0;

        /* renamed from: g */
        public float f5421g = -1.0f;

        /* renamed from: g0 */
        public String f5422g0;

        /* renamed from: h */
        public int f5423h = -1;

        /* renamed from: h0 */
        public boolean f5424h0 = false;

        /* renamed from: i */
        public int f5425i = -1;

        /* renamed from: i0 */
        public boolean f5426i0 = false;

        /* renamed from: j */
        public int f5427j = -1;

        /* renamed from: j0 */
        public boolean f5428j0 = true;

        /* renamed from: k */
        public int f5429k = -1;

        /* renamed from: l */
        public int f5430l = -1;

        /* renamed from: m */
        public int f5431m = -1;

        /* renamed from: n */
        public int f5432n = -1;

        /* renamed from: o */
        public int f5433o = -1;

        /* renamed from: p */
        public int f5434p = -1;

        /* renamed from: q */
        public int f5435q = -1;

        /* renamed from: r */
        public int f5436r = -1;

        /* renamed from: s */
        public int f5437s = -1;

        /* renamed from: t */
        public int f5438t = -1;

        /* renamed from: u */
        public float f5439u = 0.5f;

        /* renamed from: v */
        public float f5440v = 0.5f;

        /* renamed from: w */
        public String f5441w = null;

        /* renamed from: x */
        public int f5442x = -1;

        /* renamed from: y */
        public int f5443y = 0;

        /* renamed from: z */
        public float f5444z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5382k0 = sparseIntArray;
            sparseIntArray.append(39, 24);
            f5382k0.append(40, 25);
            f5382k0.append(42, 28);
            f5382k0.append(43, 29);
            f5382k0.append(48, 35);
            f5382k0.append(47, 34);
            f5382k0.append(21, 4);
            f5382k0.append(20, 3);
            f5382k0.append(18, 1);
            f5382k0.append(56, 6);
            f5382k0.append(57, 7);
            f5382k0.append(28, 17);
            f5382k0.append(29, 18);
            f5382k0.append(30, 19);
            f5382k0.append(0, 26);
            f5382k0.append(44, 31);
            f5382k0.append(45, 32);
            f5382k0.append(27, 10);
            f5382k0.append(26, 9);
            f5382k0.append(60, 13);
            f5382k0.append(63, 16);
            f5382k0.append(61, 14);
            f5382k0.append(58, 11);
            f5382k0.append(62, 15);
            f5382k0.append(59, 12);
            f5382k0.append(51, 38);
            f5382k0.append(37, 37);
            f5382k0.append(36, 39);
            f5382k0.append(50, 40);
            f5382k0.append(35, 20);
            f5382k0.append(49, 36);
            f5382k0.append(25, 5);
            f5382k0.append(38, 76);
            f5382k0.append(46, 76);
            f5382k0.append(41, 76);
            f5382k0.append(19, 76);
            f5382k0.append(17, 76);
            f5382k0.append(3, 23);
            f5382k0.append(5, 27);
            f5382k0.append(7, 30);
            f5382k0.append(8, 8);
            f5382k0.append(4, 33);
            f5382k0.append(6, 2);
            f5382k0.append(1, 22);
            f5382k0.append(2, 21);
            f5382k0.append(22, 61);
            f5382k0.append(24, 62);
            f5382k0.append(23, 63);
            f5382k0.append(55, 69);
            f5382k0.append(34, 70);
            f5382k0.append(12, 71);
            f5382k0.append(10, 72);
            f5382k0.append(11, 73);
            f5382k0.append(13, 74);
            f5382k0.append(9, 75);
        }

        /* renamed from: a */
        public final void mo8499a(C2238b bVar) {
            this.f5409a = bVar.f5409a;
            this.f5413c = bVar.f5413c;
            this.f5411b = bVar.f5411b;
            this.f5415d = bVar.f5415d;
            this.f5417e = bVar.f5417e;
            this.f5419f = bVar.f5419f;
            this.f5421g = bVar.f5421g;
            this.f5423h = bVar.f5423h;
            this.f5425i = bVar.f5425i;
            this.f5427j = bVar.f5427j;
            this.f5429k = bVar.f5429k;
            this.f5430l = bVar.f5430l;
            this.f5431m = bVar.f5431m;
            this.f5432n = bVar.f5432n;
            this.f5433o = bVar.f5433o;
            this.f5434p = bVar.f5434p;
            this.f5435q = bVar.f5435q;
            this.f5436r = bVar.f5436r;
            this.f5437s = bVar.f5437s;
            this.f5438t = bVar.f5438t;
            this.f5439u = bVar.f5439u;
            this.f5440v = bVar.f5440v;
            this.f5441w = bVar.f5441w;
            this.f5442x = bVar.f5442x;
            this.f5443y = bVar.f5443y;
            this.f5444z = bVar.f5444z;
            this.f5383A = bVar.f5383A;
            this.f5384B = bVar.f5384B;
            this.f5385C = bVar.f5385C;
            this.f5386D = bVar.f5386D;
            this.f5387E = bVar.f5387E;
            this.f5388F = bVar.f5388F;
            this.f5389G = bVar.f5389G;
            this.f5390H = bVar.f5390H;
            this.f5391I = bVar.f5391I;
            this.f5392J = bVar.f5392J;
            this.f5393K = bVar.f5393K;
            this.f5394L = bVar.f5394L;
            this.f5395M = bVar.f5395M;
            this.f5396N = bVar.f5396N;
            this.f5397O = bVar.f5397O;
            this.f5398P = bVar.f5398P;
            this.f5399Q = bVar.f5399Q;
            this.f5400R = bVar.f5400R;
            this.f5401S = bVar.f5401S;
            this.f5402T = bVar.f5402T;
            this.f5403U = bVar.f5403U;
            this.f5404V = bVar.f5404V;
            this.f5405W = bVar.f5405W;
            this.f5406X = bVar.f5406X;
            this.f5407Y = bVar.f5407Y;
            this.f5408Z = bVar.f5408Z;
            this.f5410a0 = bVar.f5410a0;
            this.f5412b0 = bVar.f5412b0;
            this.f5414c0 = bVar.f5414c0;
            this.f5416d0 = bVar.f5416d0;
            this.f5422g0 = bVar.f5422g0;
            int[] iArr = bVar.f5418e0;
            if (iArr != null) {
                this.f5418e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f5418e0 = null;
            }
            this.f5420f0 = bVar.f5420f0;
            this.f5424h0 = bVar.f5424h0;
            this.f5426i0 = bVar.f5426i0;
            this.f5428j0 = bVar.f5428j0;
        }

        /* renamed from: b */
        public final void mo8500b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43335y);
            this.f5411b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f5382k0.get(index);
                if (i2 == 80) {
                    this.f5424h0 = obtainStyledAttributes.getBoolean(index, this.f5424h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f5434p = C2236a.m4923m(obtainStyledAttributes, index, this.f5434p);
                            break;
                        case 2:
                            this.f5389G = obtainStyledAttributes.getDimensionPixelSize(index, this.f5389G);
                            break;
                        case 3:
                            this.f5433o = C2236a.m4923m(obtainStyledAttributes, index, this.f5433o);
                            break;
                        case 4:
                            this.f5432n = C2236a.m4923m(obtainStyledAttributes, index, this.f5432n);
                            break;
                        case 5:
                            this.f5441w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f5383A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5383A);
                            break;
                        case 7:
                            this.f5384B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5384B);
                            break;
                        case 8:
                            this.f5390H = obtainStyledAttributes.getDimensionPixelSize(index, this.f5390H);
                            break;
                        case 9:
                            this.f5438t = C2236a.m4923m(obtainStyledAttributes, index, this.f5438t);
                            break;
                        case 10:
                            this.f5437s = C2236a.m4923m(obtainStyledAttributes, index, this.f5437s);
                            break;
                        case 11:
                            this.f5395M = obtainStyledAttributes.getDimensionPixelSize(index, this.f5395M);
                            break;
                        case 12:
                            this.f5396N = obtainStyledAttributes.getDimensionPixelSize(index, this.f5396N);
                            break;
                        case 13:
                            this.f5392J = obtainStyledAttributes.getDimensionPixelSize(index, this.f5392J);
                            break;
                        case 14:
                            this.f5394L = obtainStyledAttributes.getDimensionPixelSize(index, this.f5394L);
                            break;
                        case 15:
                            this.f5397O = obtainStyledAttributes.getDimensionPixelSize(index, this.f5397O);
                            break;
                        case 16:
                            this.f5393K = obtainStyledAttributes.getDimensionPixelSize(index, this.f5393K);
                            break;
                        case 17:
                            this.f5417e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5417e);
                            break;
                        case 18:
                            this.f5419f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5419f);
                            break;
                        case 19:
                            this.f5421g = obtainStyledAttributes.getFloat(index, this.f5421g);
                            break;
                        case 20:
                            this.f5439u = obtainStyledAttributes.getFloat(index, this.f5439u);
                            break;
                        case 21:
                            this.f5415d = obtainStyledAttributes.getLayoutDimension(index, this.f5415d);
                            break;
                        case 22:
                            this.f5413c = obtainStyledAttributes.getLayoutDimension(index, this.f5413c);
                            break;
                        case 23:
                            this.f5386D = obtainStyledAttributes.getDimensionPixelSize(index, this.f5386D);
                            break;
                        case 24:
                            this.f5423h = C2236a.m4923m(obtainStyledAttributes, index, this.f5423h);
                            break;
                        case 25:
                            this.f5425i = C2236a.m4923m(obtainStyledAttributes, index, this.f5425i);
                            break;
                        case 26:
                            this.f5385C = obtainStyledAttributes.getInt(index, this.f5385C);
                            break;
                        case 27:
                            this.f5387E = obtainStyledAttributes.getDimensionPixelSize(index, this.f5387E);
                            break;
                        case 28:
                            this.f5427j = C2236a.m4923m(obtainStyledAttributes, index, this.f5427j);
                            break;
                        case 29:
                            this.f5429k = C2236a.m4923m(obtainStyledAttributes, index, this.f5429k);
                            break;
                        case 30:
                            this.f5391I = obtainStyledAttributes.getDimensionPixelSize(index, this.f5391I);
                            break;
                        case 31:
                            this.f5435q = C2236a.m4923m(obtainStyledAttributes, index, this.f5435q);
                            break;
                        case 32:
                            this.f5436r = C2236a.m4923m(obtainStyledAttributes, index, this.f5436r);
                            break;
                        case 33:
                            this.f5388F = obtainStyledAttributes.getDimensionPixelSize(index, this.f5388F);
                            break;
                        case 34:
                            this.f5431m = C2236a.m4923m(obtainStyledAttributes, index, this.f5431m);
                            break;
                        case 35:
                            this.f5430l = C2236a.m4923m(obtainStyledAttributes, index, this.f5430l);
                            break;
                        case 36:
                            this.f5440v = obtainStyledAttributes.getFloat(index, this.f5440v);
                            break;
                        case 37:
                            this.f5399Q = obtainStyledAttributes.getFloat(index, this.f5399Q);
                            break;
                        case 38:
                            this.f5398P = obtainStyledAttributes.getFloat(index, this.f5398P);
                            break;
                        case 39:
                            this.f5400R = obtainStyledAttributes.getInt(index, this.f5400R);
                            break;
                        case 40:
                            this.f5401S = obtainStyledAttributes.getInt(index, this.f5401S);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f5402T = obtainStyledAttributes.getInt(index, this.f5402T);
                                    break;
                                case 55:
                                    this.f5403U = obtainStyledAttributes.getInt(index, this.f5403U);
                                    break;
                                case 56:
                                    this.f5404V = obtainStyledAttributes.getDimensionPixelSize(index, this.f5404V);
                                    break;
                                case 57:
                                    this.f5405W = obtainStyledAttributes.getDimensionPixelSize(index, this.f5405W);
                                    break;
                                case 58:
                                    this.f5406X = obtainStyledAttributes.getDimensionPixelSize(index, this.f5406X);
                                    break;
                                case 59:
                                    this.f5407Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f5407Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f5442x = C2236a.m4923m(obtainStyledAttributes, index, this.f5442x);
                                            break;
                                        case 62:
                                            this.f5443y = obtainStyledAttributes.getDimensionPixelSize(index, this.f5443y);
                                            break;
                                        case 63:
                                            this.f5444z = obtainStyledAttributes.getFloat(index, this.f5444z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f5408Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f5410a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f5412b0 = obtainStyledAttributes.getInt(index, this.f5412b0);
                                                    break;
                                                case 73:
                                                    this.f5414c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f5414c0);
                                                    break;
                                                case 74:
                                                    this.f5420f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f5428j0 = obtainStyledAttributes.getBoolean(index, this.f5428j0);
                                                    break;
                                                case 76:
                                                    StringBuilder h = C0072d.m201h("unused attribute 0x");
                                                    h.append(Integer.toHexString(index));
                                                    h.append("   ");
                                                    h.append(f5382k0.get(index));
                                                    Log.w("ConstraintSet", h.toString());
                                                    break;
                                                case 77:
                                                    this.f5422g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    StringBuilder h2 = C0072d.m201h("Unknown attribute 0x");
                                                    h2.append(Integer.toHexString(index));
                                                    h2.append("   ");
                                                    h2.append(f5382k0.get(index));
                                                    Log.w("ConstraintSet", h2.toString());
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f5426i0 = obtainStyledAttributes.getBoolean(index, this.f5426i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$c */
    public static class C2239c {

        /* renamed from: h */
        public static SparseIntArray f5445h;

        /* renamed from: a */
        public boolean f5446a = false;

        /* renamed from: b */
        public int f5447b = -1;

        /* renamed from: c */
        public String f5448c = null;

        /* renamed from: d */
        public int f5449d = -1;

        /* renamed from: e */
        public int f5450e = 0;

        /* renamed from: f */
        public float f5451f = Float.NaN;

        /* renamed from: g */
        public float f5452g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5445h = sparseIntArray;
            sparseIntArray.append(2, 1);
            f5445h.append(4, 2);
            f5445h.append(5, 3);
            f5445h.append(1, 4);
            f5445h.append(0, 5);
            f5445h.append(3, 6);
        }

        /* renamed from: a */
        public final void mo8501a(C2239c cVar) {
            this.f5446a = cVar.f5446a;
            this.f5447b = cVar.f5447b;
            this.f5448c = cVar.f5448c;
            this.f5449d = cVar.f5449d;
            this.f5450e = cVar.f5450e;
            this.f5452g = cVar.f5452g;
            this.f5451f = cVar.f5451f;
        }

        /* renamed from: b */
        public final void mo8502b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43299A);
            this.f5446a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f5445h.get(index)) {
                    case 1:
                        this.f5452g = obtainStyledAttributes.getFloat(index, this.f5452g);
                        break;
                    case 2:
                        this.f5449d = obtainStyledAttributes.getInt(index, this.f5449d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f5448c = C7363c.f16409c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f5448c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f5450e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f5447b = C2236a.m4923m(obtainStyledAttributes, index, this.f5447b);
                        break;
                    case 6:
                        this.f5451f = obtainStyledAttributes.getFloat(index, this.f5451f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$d */
    public static class C2240d {

        /* renamed from: a */
        public boolean f5453a = false;

        /* renamed from: b */
        public int f5454b = 0;

        /* renamed from: c */
        public int f5455c = 0;

        /* renamed from: d */
        public float f5456d = 1.0f;

        /* renamed from: e */
        public float f5457e = Float.NaN;

        /* renamed from: a */
        public final void mo8503a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43306H);
            this.f5453a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f5456d = obtainStyledAttributes.getFloat(index, this.f5456d);
                } else if (index == 0) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f5454b);
                    this.f5454b = i2;
                    this.f5454b = C2236a.f5371d[i2];
                } else if (index == 4) {
                    this.f5455c = obtainStyledAttributes.getInt(index, this.f5455c);
                } else if (index == 3) {
                    this.f5457e = obtainStyledAttributes.getFloat(index, this.f5457e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$e */
    public static class C2241e {

        /* renamed from: n */
        public static SparseIntArray f5458n;

        /* renamed from: a */
        public boolean f5459a = false;

        /* renamed from: b */
        public float f5460b = 0.0f;

        /* renamed from: c */
        public float f5461c = 0.0f;

        /* renamed from: d */
        public float f5462d = 0.0f;

        /* renamed from: e */
        public float f5463e = 1.0f;

        /* renamed from: f */
        public float f5464f = 1.0f;

        /* renamed from: g */
        public float f5465g = Float.NaN;

        /* renamed from: h */
        public float f5466h = Float.NaN;

        /* renamed from: i */
        public float f5467i = 0.0f;

        /* renamed from: j */
        public float f5468j = 0.0f;

        /* renamed from: k */
        public float f5469k = 0.0f;

        /* renamed from: l */
        public boolean f5470l = false;

        /* renamed from: m */
        public float f5471m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5458n = sparseIntArray;
            sparseIntArray.append(6, 1);
            f5458n.append(7, 2);
            f5458n.append(8, 3);
            f5458n.append(4, 4);
            f5458n.append(5, 5);
            f5458n.append(0, 6);
            f5458n.append(1, 7);
            f5458n.append(2, 8);
            f5458n.append(3, 9);
            f5458n.append(9, 10);
            f5458n.append(10, 11);
        }

        /* renamed from: a */
        public final void mo8504a(C2241e eVar) {
            this.f5459a = eVar.f5459a;
            this.f5460b = eVar.f5460b;
            this.f5461c = eVar.f5461c;
            this.f5462d = eVar.f5462d;
            this.f5463e = eVar.f5463e;
            this.f5464f = eVar.f5464f;
            this.f5465g = eVar.f5465g;
            this.f5466h = eVar.f5466h;
            this.f5467i = eVar.f5467i;
            this.f5468j = eVar.f5468j;
            this.f5469k = eVar.f5469k;
            this.f5470l = eVar.f5470l;
            this.f5471m = eVar.f5471m;
        }

        /* renamed from: b */
        public final void mo8505b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43309K);
            this.f5459a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f5458n.get(index)) {
                    case 1:
                        this.f5460b = obtainStyledAttributes.getFloat(index, this.f5460b);
                        break;
                    case 2:
                        this.f5461c = obtainStyledAttributes.getFloat(index, this.f5461c);
                        break;
                    case 3:
                        this.f5462d = obtainStyledAttributes.getFloat(index, this.f5462d);
                        break;
                    case 4:
                        this.f5463e = obtainStyledAttributes.getFloat(index, this.f5463e);
                        break;
                    case 5:
                        this.f5464f = obtainStyledAttributes.getFloat(index, this.f5464f);
                        break;
                    case 6:
                        this.f5465g = obtainStyledAttributes.getDimension(index, this.f5465g);
                        break;
                    case 7:
                        this.f5466h = obtainStyledAttributes.getDimension(index, this.f5466h);
                        break;
                    case 8:
                        this.f5467i = obtainStyledAttributes.getDimension(index, this.f5467i);
                        break;
                    case 9:
                        this.f5468j = obtainStyledAttributes.getDimension(index, this.f5468j);
                        break;
                    case 10:
                        this.f5469k = obtainStyledAttributes.getDimension(index, this.f5469k);
                        break;
                    case 11:
                        this.f5470l = true;
                        this.f5471m = obtainStyledAttributes.getDimension(index, this.f5471m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5372e = sparseIntArray;
        sparseIntArray.append(77, 25);
        f5372e.append(78, 26);
        f5372e.append(80, 29);
        f5372e.append(81, 30);
        f5372e.append(87, 36);
        f5372e.append(86, 35);
        f5372e.append(59, 4);
        f5372e.append(58, 3);
        f5372e.append(56, 1);
        f5372e.append(95, 6);
        f5372e.append(96, 7);
        f5372e.append(66, 17);
        f5372e.append(67, 18);
        f5372e.append(68, 19);
        f5372e.append(0, 27);
        f5372e.append(82, 32);
        f5372e.append(83, 33);
        f5372e.append(65, 10);
        f5372e.append(64, 9);
        f5372e.append(99, 13);
        f5372e.append(102, 16);
        f5372e.append(100, 14);
        f5372e.append(97, 11);
        f5372e.append(101, 15);
        f5372e.append(98, 12);
        f5372e.append(90, 40);
        f5372e.append(75, 39);
        f5372e.append(74, 41);
        f5372e.append(89, 42);
        f5372e.append(73, 20);
        f5372e.append(88, 37);
        f5372e.append(63, 5);
        f5372e.append(76, 82);
        f5372e.append(85, 82);
        f5372e.append(79, 82);
        f5372e.append(57, 82);
        f5372e.append(55, 82);
        f5372e.append(5, 24);
        f5372e.append(7, 28);
        f5372e.append(23, 31);
        f5372e.append(24, 8);
        f5372e.append(6, 34);
        f5372e.append(8, 2);
        f5372e.append(3, 23);
        f5372e.append(4, 21);
        f5372e.append(2, 22);
        f5372e.append(13, 43);
        f5372e.append(26, 44);
        f5372e.append(21, 45);
        f5372e.append(22, 46);
        f5372e.append(20, 60);
        f5372e.append(18, 47);
        f5372e.append(19, 48);
        f5372e.append(14, 49);
        f5372e.append(15, 50);
        f5372e.append(16, 51);
        f5372e.append(17, 52);
        f5372e.append(25, 53);
        f5372e.append(91, 54);
        f5372e.append(69, 55);
        f5372e.append(92, 56);
        f5372e.append(70, 57);
        f5372e.append(93, 58);
        f5372e.append(71, 59);
        f5372e.append(60, 61);
        f5372e.append(62, 62);
        f5372e.append(61, 63);
        f5372e.append(27, 64);
        f5372e.append(107, 65);
        f5372e.append(34, 66);
        f5372e.append(108, 67);
        f5372e.append(104, 79);
        f5372e.append(1, 38);
        f5372e.append(103, 68);
        f5372e.append(94, 69);
        f5372e.append(72, 70);
        f5372e.append(31, 71);
        f5372e.append(29, 72);
        f5372e.append(30, 73);
        f5372e.append(32, 74);
        f5372e.append(28, 75);
        f5372e.append(105, 76);
        f5372e.append(84, 77);
        f5372e.append(109, 78);
        f5372e.append(54, 80);
        f5372e.append(53, 81);
    }

    /* renamed from: h */
    public static int[] m4921h(Barrier barrier, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C7713c.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: i */
    public static C2237a m4922i(Context context, AttributeSet attributeSet) {
        C2237a aVar = new C2237a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43324n);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (!(index == 1 || 23 == index || 24 == index)) {
                aVar.f5378c.f5446a = true;
                aVar.f5379d.f5411b = true;
                aVar.f5377b.f5453a = true;
                aVar.f5380e.f5459a = true;
            }
            switch (f5372e.get(index)) {
                case 1:
                    C2238b bVar = aVar.f5379d;
                    bVar.f5434p = m4923m(obtainStyledAttributes, index, bVar.f5434p);
                    break;
                case 2:
                    C2238b bVar2 = aVar.f5379d;
                    bVar2.f5389G = obtainStyledAttributes.getDimensionPixelSize(index, bVar2.f5389G);
                    break;
                case 3:
                    C2238b bVar3 = aVar.f5379d;
                    bVar3.f5433o = m4923m(obtainStyledAttributes, index, bVar3.f5433o);
                    break;
                case 4:
                    C2238b bVar4 = aVar.f5379d;
                    bVar4.f5432n = m4923m(obtainStyledAttributes, index, bVar4.f5432n);
                    break;
                case 5:
                    aVar.f5379d.f5441w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    C2238b bVar5 = aVar.f5379d;
                    bVar5.f5383A = obtainStyledAttributes.getDimensionPixelOffset(index, bVar5.f5383A);
                    break;
                case 7:
                    C2238b bVar6 = aVar.f5379d;
                    bVar6.f5384B = obtainStyledAttributes.getDimensionPixelOffset(index, bVar6.f5384B);
                    break;
                case 8:
                    C2238b bVar7 = aVar.f5379d;
                    bVar7.f5390H = obtainStyledAttributes.getDimensionPixelSize(index, bVar7.f5390H);
                    break;
                case 9:
                    C2238b bVar8 = aVar.f5379d;
                    bVar8.f5438t = m4923m(obtainStyledAttributes, index, bVar8.f5438t);
                    break;
                case 10:
                    C2238b bVar9 = aVar.f5379d;
                    bVar9.f5437s = m4923m(obtainStyledAttributes, index, bVar9.f5437s);
                    break;
                case 11:
                    C2238b bVar10 = aVar.f5379d;
                    bVar10.f5395M = obtainStyledAttributes.getDimensionPixelSize(index, bVar10.f5395M);
                    break;
                case 12:
                    C2238b bVar11 = aVar.f5379d;
                    bVar11.f5396N = obtainStyledAttributes.getDimensionPixelSize(index, bVar11.f5396N);
                    break;
                case 13:
                    C2238b bVar12 = aVar.f5379d;
                    bVar12.f5392J = obtainStyledAttributes.getDimensionPixelSize(index, bVar12.f5392J);
                    break;
                case 14:
                    C2238b bVar13 = aVar.f5379d;
                    bVar13.f5394L = obtainStyledAttributes.getDimensionPixelSize(index, bVar13.f5394L);
                    break;
                case 15:
                    C2238b bVar14 = aVar.f5379d;
                    bVar14.f5397O = obtainStyledAttributes.getDimensionPixelSize(index, bVar14.f5397O);
                    break;
                case 16:
                    C2238b bVar15 = aVar.f5379d;
                    bVar15.f5393K = obtainStyledAttributes.getDimensionPixelSize(index, bVar15.f5393K);
                    break;
                case 17:
                    C2238b bVar16 = aVar.f5379d;
                    bVar16.f5417e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f5417e);
                    break;
                case 18:
                    C2238b bVar17 = aVar.f5379d;
                    bVar17.f5419f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f5419f);
                    break;
                case 19:
                    C2238b bVar18 = aVar.f5379d;
                    bVar18.f5421g = obtainStyledAttributes.getFloat(index, bVar18.f5421g);
                    break;
                case 20:
                    C2238b bVar19 = aVar.f5379d;
                    bVar19.f5439u = obtainStyledAttributes.getFloat(index, bVar19.f5439u);
                    break;
                case 21:
                    C2238b bVar20 = aVar.f5379d;
                    bVar20.f5415d = obtainStyledAttributes.getLayoutDimension(index, bVar20.f5415d);
                    break;
                case 22:
                    C2240d dVar = aVar.f5377b;
                    dVar.f5454b = obtainStyledAttributes.getInt(index, dVar.f5454b);
                    C2240d dVar2 = aVar.f5377b;
                    dVar2.f5454b = f5371d[dVar2.f5454b];
                    break;
                case 23:
                    C2238b bVar21 = aVar.f5379d;
                    bVar21.f5413c = obtainStyledAttributes.getLayoutDimension(index, bVar21.f5413c);
                    break;
                case 24:
                    C2238b bVar22 = aVar.f5379d;
                    bVar22.f5386D = obtainStyledAttributes.getDimensionPixelSize(index, bVar22.f5386D);
                    break;
                case 25:
                    C2238b bVar23 = aVar.f5379d;
                    bVar23.f5423h = m4923m(obtainStyledAttributes, index, bVar23.f5423h);
                    break;
                case 26:
                    C2238b bVar24 = aVar.f5379d;
                    bVar24.f5425i = m4923m(obtainStyledAttributes, index, bVar24.f5425i);
                    break;
                case 27:
                    C2238b bVar25 = aVar.f5379d;
                    bVar25.f5385C = obtainStyledAttributes.getInt(index, bVar25.f5385C);
                    break;
                case 28:
                    C2238b bVar26 = aVar.f5379d;
                    bVar26.f5387E = obtainStyledAttributes.getDimensionPixelSize(index, bVar26.f5387E);
                    break;
                case 29:
                    C2238b bVar27 = aVar.f5379d;
                    bVar27.f5427j = m4923m(obtainStyledAttributes, index, bVar27.f5427j);
                    break;
                case 30:
                    C2238b bVar28 = aVar.f5379d;
                    bVar28.f5429k = m4923m(obtainStyledAttributes, index, bVar28.f5429k);
                    break;
                case 31:
                    C2238b bVar29 = aVar.f5379d;
                    bVar29.f5391I = obtainStyledAttributes.getDimensionPixelSize(index, bVar29.f5391I);
                    break;
                case 32:
                    C2238b bVar30 = aVar.f5379d;
                    bVar30.f5435q = m4923m(obtainStyledAttributes, index, bVar30.f5435q);
                    break;
                case 33:
                    C2238b bVar31 = aVar.f5379d;
                    bVar31.f5436r = m4923m(obtainStyledAttributes, index, bVar31.f5436r);
                    break;
                case 34:
                    C2238b bVar32 = aVar.f5379d;
                    bVar32.f5388F = obtainStyledAttributes.getDimensionPixelSize(index, bVar32.f5388F);
                    break;
                case 35:
                    C2238b bVar33 = aVar.f5379d;
                    bVar33.f5431m = m4923m(obtainStyledAttributes, index, bVar33.f5431m);
                    break;
                case 36:
                    C2238b bVar34 = aVar.f5379d;
                    bVar34.f5430l = m4923m(obtainStyledAttributes, index, bVar34.f5430l);
                    break;
                case 37:
                    C2238b bVar35 = aVar.f5379d;
                    bVar35.f5440v = obtainStyledAttributes.getFloat(index, bVar35.f5440v);
                    break;
                case 38:
                    aVar.f5376a = obtainStyledAttributes.getResourceId(index, aVar.f5376a);
                    break;
                case 39:
                    C2238b bVar36 = aVar.f5379d;
                    bVar36.f5399Q = obtainStyledAttributes.getFloat(index, bVar36.f5399Q);
                    break;
                case 40:
                    C2238b bVar37 = aVar.f5379d;
                    bVar37.f5398P = obtainStyledAttributes.getFloat(index, bVar37.f5398P);
                    break;
                case 41:
                    C2238b bVar38 = aVar.f5379d;
                    bVar38.f5400R = obtainStyledAttributes.getInt(index, bVar38.f5400R);
                    break;
                case 42:
                    C2238b bVar39 = aVar.f5379d;
                    bVar39.f5401S = obtainStyledAttributes.getInt(index, bVar39.f5401S);
                    break;
                case 43:
                    C2240d dVar3 = aVar.f5377b;
                    dVar3.f5456d = obtainStyledAttributes.getFloat(index, dVar3.f5456d);
                    break;
                case 44:
                    C2241e eVar = aVar.f5380e;
                    eVar.f5470l = true;
                    eVar.f5471m = obtainStyledAttributes.getDimension(index, eVar.f5471m);
                    break;
                case 45:
                    C2241e eVar2 = aVar.f5380e;
                    eVar2.f5461c = obtainStyledAttributes.getFloat(index, eVar2.f5461c);
                    break;
                case 46:
                    C2241e eVar3 = aVar.f5380e;
                    eVar3.f5462d = obtainStyledAttributes.getFloat(index, eVar3.f5462d);
                    break;
                case 47:
                    C2241e eVar4 = aVar.f5380e;
                    eVar4.f5463e = obtainStyledAttributes.getFloat(index, eVar4.f5463e);
                    break;
                case 48:
                    C2241e eVar5 = aVar.f5380e;
                    eVar5.f5464f = obtainStyledAttributes.getFloat(index, eVar5.f5464f);
                    break;
                case 49:
                    C2241e eVar6 = aVar.f5380e;
                    eVar6.f5465g = obtainStyledAttributes.getDimension(index, eVar6.f5465g);
                    break;
                case 50:
                    C2241e eVar7 = aVar.f5380e;
                    eVar7.f5466h = obtainStyledAttributes.getDimension(index, eVar7.f5466h);
                    break;
                case 51:
                    C2241e eVar8 = aVar.f5380e;
                    eVar8.f5467i = obtainStyledAttributes.getDimension(index, eVar8.f5467i);
                    break;
                case 52:
                    C2241e eVar9 = aVar.f5380e;
                    eVar9.f5468j = obtainStyledAttributes.getDimension(index, eVar9.f5468j);
                    break;
                case 53:
                    C2241e eVar10 = aVar.f5380e;
                    eVar10.f5469k = obtainStyledAttributes.getDimension(index, eVar10.f5469k);
                    break;
                case 54:
                    C2238b bVar40 = aVar.f5379d;
                    bVar40.f5402T = obtainStyledAttributes.getInt(index, bVar40.f5402T);
                    break;
                case 55:
                    C2238b bVar41 = aVar.f5379d;
                    bVar41.f5403U = obtainStyledAttributes.getInt(index, bVar41.f5403U);
                    break;
                case 56:
                    C2238b bVar42 = aVar.f5379d;
                    bVar42.f5404V = obtainStyledAttributes.getDimensionPixelSize(index, bVar42.f5404V);
                    break;
                case 57:
                    C2238b bVar43 = aVar.f5379d;
                    bVar43.f5405W = obtainStyledAttributes.getDimensionPixelSize(index, bVar43.f5405W);
                    break;
                case 58:
                    C2238b bVar44 = aVar.f5379d;
                    bVar44.f5406X = obtainStyledAttributes.getDimensionPixelSize(index, bVar44.f5406X);
                    break;
                case 59:
                    C2238b bVar45 = aVar.f5379d;
                    bVar45.f5407Y = obtainStyledAttributes.getDimensionPixelSize(index, bVar45.f5407Y);
                    break;
                case 60:
                    C2241e eVar11 = aVar.f5380e;
                    eVar11.f5460b = obtainStyledAttributes.getFloat(index, eVar11.f5460b);
                    break;
                case 61:
                    C2238b bVar46 = aVar.f5379d;
                    bVar46.f5442x = m4923m(obtainStyledAttributes, index, bVar46.f5442x);
                    break;
                case 62:
                    C2238b bVar47 = aVar.f5379d;
                    bVar47.f5443y = obtainStyledAttributes.getDimensionPixelSize(index, bVar47.f5443y);
                    break;
                case 63:
                    C2238b bVar48 = aVar.f5379d;
                    bVar48.f5444z = obtainStyledAttributes.getFloat(index, bVar48.f5444z);
                    break;
                case 64:
                    C2239c cVar = aVar.f5378c;
                    cVar.f5447b = m4923m(obtainStyledAttributes, index, cVar.f5447b);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        aVar.f5378c.f5448c = C7363c.f16409c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f5378c.f5448c = obtainStyledAttributes.getString(index);
                        break;
                    }
                case 66:
                    aVar.f5378c.f5450e = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    C2239c cVar2 = aVar.f5378c;
                    cVar2.f5452g = obtainStyledAttributes.getFloat(index, cVar2.f5452g);
                    break;
                case 68:
                    C2240d dVar4 = aVar.f5377b;
                    dVar4.f5457e = obtainStyledAttributes.getFloat(index, dVar4.f5457e);
                    break;
                case 69:
                    aVar.f5379d.f5408Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f5379d.f5410a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C2238b bVar49 = aVar.f5379d;
                    bVar49.f5412b0 = obtainStyledAttributes.getInt(index, bVar49.f5412b0);
                    break;
                case 73:
                    C2238b bVar50 = aVar.f5379d;
                    bVar50.f5414c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar50.f5414c0);
                    break;
                case 74:
                    aVar.f5379d.f5420f0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    C2238b bVar51 = aVar.f5379d;
                    bVar51.f5428j0 = obtainStyledAttributes.getBoolean(index, bVar51.f5428j0);
                    break;
                case 76:
                    C2239c cVar3 = aVar.f5378c;
                    cVar3.f5449d = obtainStyledAttributes.getInt(index, cVar3.f5449d);
                    break;
                case 77:
                    aVar.f5379d.f5422g0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    C2240d dVar5 = aVar.f5377b;
                    dVar5.f5455c = obtainStyledAttributes.getInt(index, dVar5.f5455c);
                    break;
                case 79:
                    C2239c cVar4 = aVar.f5378c;
                    cVar4.f5451f = obtainStyledAttributes.getFloat(index, cVar4.f5451f);
                    break;
                case 80:
                    C2238b bVar52 = aVar.f5379d;
                    bVar52.f5424h0 = obtainStyledAttributes.getBoolean(index, bVar52.f5424h0);
                    break;
                case 81:
                    C2238b bVar53 = aVar.f5379d;
                    bVar53.f5426i0 = obtainStyledAttributes.getBoolean(index, bVar53.f5426i0);
                    break;
                case 82:
                    StringBuilder h = C0072d.m201h("unused attribute 0x");
                    h.append(Integer.toHexString(index));
                    h.append("   ");
                    h.append(f5372e.get(index));
                    Log.w("ConstraintSet", h.toString());
                    break;
                default:
                    StringBuilder h2 = C0072d.m201h("Unknown attribute 0x");
                    h2.append(Integer.toHexString(index));
                    h2.append("   ");
                    h2.append(f5372e.get(index));
                    Log.w("ConstraintSet", h2.toString());
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: m */
    public static int m4923m(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: p */
    public static String m4924p(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return ResponseConstants.PROMOTION_END;
            default:
                return "undefined";
        }
    }

    /* renamed from: a */
    public final void mo8483a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f5375c.containsKey(Integer.valueOf(id))) {
                C2114a.m4567c(childAt);
            } else if (this.f5374b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f5375c.containsKey(Integer.valueOf(id))) {
                ConstraintAttribute.m4913f(childAt, this.f5375c.get(Integer.valueOf(id)).f5381f);
            }
        }
    }

    /* renamed from: b */
    public final void mo8484b(ConstraintLayout constraintLayout) {
        mo8485c(constraintLayout);
        constraintLayout.setConstraintSet((C2236a) null);
        constraintLayout.requestLayout();
    }

    /* renamed from: c */
    public final void mo8485c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f5375c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f5375c.containsKey(Integer.valueOf(id))) {
                StringBuilder h = C0072d.m201h("id unknown ");
                h.append(C2114a.m4567c(childAt));
                Log.w("ConstraintSet", h.toString());
            } else if (this.f5374b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1 && this.f5375c.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C2237a aVar = this.f5375c.get(Integer.valueOf(id));
                if (childAt instanceof Barrier) {
                    aVar.f5379d.f5416d0 = 1;
                }
                int i2 = aVar.f5379d.f5416d0;
                if (i2 != -1 && i2 == 1) {
                    Barrier barrier = (Barrier) childAt;
                    barrier.setId(id);
                    barrier.setType(aVar.f5379d.f5412b0);
                    barrier.setMargin(aVar.f5379d.f5414c0);
                    barrier.setAllowsGoneWidget(aVar.f5379d.f5428j0);
                    C2238b bVar = aVar.f5379d;
                    int[] iArr = bVar.f5418e0;
                    if (iArr != null) {
                        barrier.setReferencedIds(iArr);
                    } else {
                        String str = bVar.f5420f0;
                        if (str != null) {
                            bVar.f5418e0 = m4921h(barrier, str);
                            barrier.setReferencedIds(aVar.f5379d.f5418e0);
                        }
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.validate();
                aVar.mo8495a(layoutParams);
                ConstraintAttribute.m4913f(childAt, aVar.f5381f);
                childAt.setLayoutParams(layoutParams);
                C2240d dVar = aVar.f5377b;
                if (dVar.f5455c == 0) {
                    childAt.setVisibility(dVar.f5454b);
                }
                childAt.setAlpha(aVar.f5377b.f5456d);
                childAt.setRotation(aVar.f5380e.f5460b);
                childAt.setRotationX(aVar.f5380e.f5461c);
                childAt.setRotationY(aVar.f5380e.f5462d);
                childAt.setScaleX(aVar.f5380e.f5463e);
                childAt.setScaleY(aVar.f5380e.f5464f);
                if (!Float.isNaN(aVar.f5380e.f5465g)) {
                    childAt.setPivotX(aVar.f5380e.f5465g);
                }
                if (!Float.isNaN(aVar.f5380e.f5466h)) {
                    childAt.setPivotY(aVar.f5380e.f5466h);
                }
                childAt.setTranslationX(aVar.f5380e.f5467i);
                childAt.setTranslationY(aVar.f5380e.f5468j);
                childAt.setTranslationZ(aVar.f5380e.f5469k);
                C2241e eVar = aVar.f5380e;
                if (eVar.f5470l) {
                    childAt.setElevation(eVar.f5471m);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C2237a aVar2 = this.f5375c.get(num);
            int i3 = aVar2.f5379d.f5416d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C2238b bVar2 = aVar2.f5379d;
                int[] iArr2 = bVar2.f5418e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f5420f0;
                    if (str2 != null) {
                        bVar2.f5418e0 = m4921h(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f5379d.f5418e0);
                    }
                }
                barrier2.setType(aVar2.f5379d.f5412b0);
                barrier2.setMargin(aVar2.f5379d.f5414c0);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.validateParams();
                aVar2.mo8495a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f5379d.f5409a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo8495a(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: d */
    public final void mo8486d(int i, int i2) {
        if (this.f5375c.containsKey(Integer.valueOf(i))) {
            C2237a aVar = this.f5375c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C2238b bVar = aVar.f5379d;
                    bVar.f5425i = -1;
                    bVar.f5423h = -1;
                    bVar.f5386D = -1;
                    bVar.f5392J = -1;
                    return;
                case 2:
                    C2238b bVar2 = aVar.f5379d;
                    bVar2.f5429k = -1;
                    bVar2.f5427j = -1;
                    bVar2.f5387E = -1;
                    bVar2.f5394L = -1;
                    return;
                case 3:
                    C2238b bVar3 = aVar.f5379d;
                    bVar3.f5431m = -1;
                    bVar3.f5430l = -1;
                    bVar3.f5388F = -1;
                    bVar3.f5393K = -1;
                    return;
                case 4:
                    C2238b bVar4 = aVar.f5379d;
                    bVar4.f5432n = -1;
                    bVar4.f5433o = -1;
                    bVar4.f5389G = -1;
                    bVar4.f5395M = -1;
                    return;
                case 5:
                    aVar.f5379d.f5434p = -1;
                    return;
                case 6:
                    C2238b bVar5 = aVar.f5379d;
                    bVar5.f5435q = -1;
                    bVar5.f5436r = -1;
                    bVar5.f5391I = -1;
                    bVar5.f5397O = -1;
                    return;
                case 7:
                    C2238b bVar6 = aVar.f5379d;
                    bVar6.f5437s = -1;
                    bVar6.f5438t = -1;
                    bVar6.f5390H = -1;
                    bVar6.f5396N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: e */
    public final void mo8487e(ConstraintLayout constraintLayout) {
        C2236a aVar = this;
        int childCount = constraintLayout.getChildCount();
        aVar.f5375c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!aVar.f5374b || id != -1) {
                if (!aVar.f5375c.containsKey(Integer.valueOf(id))) {
                    aVar.f5375c.put(Integer.valueOf(id), new C2237a());
                }
                C2237a aVar2 = aVar.f5375c.get(Integer.valueOf(id));
                HashMap<String, ConstraintAttribute> hashMap = aVar.f5373a;
                HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String next : hashMap.keySet()) {
                    ConstraintAttribute constraintAttribute = hashMap.get(next);
                    try {
                        if (next.equals("BackgroundColor")) {
                            hashMap2.put(next, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            try {
                                hashMap2.put(next, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (NoSuchMethodException e) {
                                e = e;
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                e.printStackTrace();
                            }
                        }
                    } catch (NoSuchMethodException e4) {
                        e = e4;
                        e.printStackTrace();
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        e.printStackTrace();
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        e.printStackTrace();
                    }
                }
                aVar2.f5381f = hashMap2;
                aVar2.mo8496b(id, layoutParams);
                aVar2.f5377b.f5454b = childAt.getVisibility();
                aVar2.f5377b.f5456d = childAt.getAlpha();
                aVar2.f5380e.f5460b = childAt.getRotation();
                aVar2.f5380e.f5461c = childAt.getRotationX();
                aVar2.f5380e.f5462d = childAt.getRotationY();
                aVar2.f5380e.f5463e = childAt.getScaleX();
                aVar2.f5380e.f5464f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == ShadowDrawableWrapper.COS_45 && ((double) pivotY) == ShadowDrawableWrapper.COS_45)) {
                    C2241e eVar = aVar2.f5380e;
                    eVar.f5465g = pivotX;
                    eVar.f5466h = pivotY;
                }
                aVar2.f5380e.f5467i = childAt.getTranslationX();
                aVar2.f5380e.f5468j = childAt.getTranslationY();
                aVar2.f5380e.f5469k = childAt.getTranslationZ();
                C2241e eVar2 = aVar2.f5380e;
                if (eVar2.f5470l) {
                    eVar2.f5471m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar2.f5379d.f5428j0 = barrier.allowsGoneWidget();
                    aVar2.f5379d.f5418e0 = barrier.getReferencedIds();
                    aVar2.f5379d.f5412b0 = barrier.getType();
                    aVar2.f5379d.f5414c0 = barrier.getMargin();
                }
                i++;
                aVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: f */
    public final void mo8488f(int i, int i2, int i3, int i4) {
        if (!this.f5375c.containsKey(Integer.valueOf(i))) {
            this.f5375c.put(Integer.valueOf(i), new C2237a());
        }
        C2237a aVar = this.f5375c.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C2238b bVar = aVar.f5379d;
                    bVar.f5423h = i3;
                    bVar.f5425i = -1;
                    return;
                } else if (i4 == 2) {
                    C2238b bVar2 = aVar.f5379d;
                    bVar2.f5425i = i3;
                    bVar2.f5423h = -1;
                    return;
                } else {
                    StringBuilder h = C0072d.m201h("left to ");
                    h.append(m4924p(i4));
                    h.append(" undefined");
                    throw new IllegalArgumentException(h.toString());
                }
            case 2:
                if (i4 == 1) {
                    C2238b bVar3 = aVar.f5379d;
                    bVar3.f5427j = i3;
                    bVar3.f5429k = -1;
                    return;
                } else if (i4 == 2) {
                    C2238b bVar4 = aVar.f5379d;
                    bVar4.f5429k = i3;
                    bVar4.f5427j = -1;
                    return;
                } else {
                    StringBuilder h2 = C0072d.m201h("right to ");
                    h2.append(m4924p(i4));
                    h2.append(" undefined");
                    throw new IllegalArgumentException(h2.toString());
                }
            case 3:
                if (i4 == 3) {
                    C2238b bVar5 = aVar.f5379d;
                    bVar5.f5430l = i3;
                    bVar5.f5431m = -1;
                    bVar5.f5434p = -1;
                    return;
                } else if (i4 == 4) {
                    C2238b bVar6 = aVar.f5379d;
                    bVar6.f5431m = i3;
                    bVar6.f5430l = -1;
                    bVar6.f5434p = -1;
                    return;
                } else {
                    StringBuilder h3 = C0072d.m201h("right to ");
                    h3.append(m4924p(i4));
                    h3.append(" undefined");
                    throw new IllegalArgumentException(h3.toString());
                }
            case 4:
                if (i4 == 4) {
                    C2238b bVar7 = aVar.f5379d;
                    bVar7.f5433o = i3;
                    bVar7.f5432n = -1;
                    bVar7.f5434p = -1;
                    return;
                } else if (i4 == 3) {
                    C2238b bVar8 = aVar.f5379d;
                    bVar8.f5432n = i3;
                    bVar8.f5433o = -1;
                    bVar8.f5434p = -1;
                    return;
                } else {
                    StringBuilder h4 = C0072d.m201h("right to ");
                    h4.append(m4924p(i4));
                    h4.append(" undefined");
                    throw new IllegalArgumentException(h4.toString());
                }
            case 5:
                if (i4 == 5) {
                    C2238b bVar9 = aVar.f5379d;
                    bVar9.f5434p = i3;
                    bVar9.f5433o = -1;
                    bVar9.f5432n = -1;
                    bVar9.f5430l = -1;
                    bVar9.f5431m = -1;
                    return;
                }
                StringBuilder h5 = C0072d.m201h("right to ");
                h5.append(m4924p(i4));
                h5.append(" undefined");
                throw new IllegalArgumentException(h5.toString());
            case 6:
                if (i4 == 6) {
                    C2238b bVar10 = aVar.f5379d;
                    bVar10.f5436r = i3;
                    bVar10.f5435q = -1;
                    return;
                } else if (i4 == 7) {
                    C2238b bVar11 = aVar.f5379d;
                    bVar11.f5435q = i3;
                    bVar11.f5436r = -1;
                    return;
                } else {
                    StringBuilder h6 = C0072d.m201h("right to ");
                    h6.append(m4924p(i4));
                    h6.append(" undefined");
                    throw new IllegalArgumentException(h6.toString());
                }
            case 7:
                if (i4 == 7) {
                    C2238b bVar12 = aVar.f5379d;
                    bVar12.f5438t = i3;
                    bVar12.f5437s = -1;
                    return;
                } else if (i4 == 6) {
                    C2238b bVar13 = aVar.f5379d;
                    bVar13.f5437s = i3;
                    bVar13.f5438t = -1;
                    return;
                } else {
                    StringBuilder h7 = C0072d.m201h("right to ");
                    h7.append(m4924p(i4));
                    h7.append(" undefined");
                    throw new IllegalArgumentException(h7.toString());
                }
            default:
                throw new IllegalArgumentException(m4924p(i2) + " to " + m4924p(i4) + " unknown");
        }
    }

    /* renamed from: g */
    public final void mo8489g(int i, int i2, int i3, int i4, int i5) {
        if (!this.f5375c.containsKey(Integer.valueOf(i))) {
            this.f5375c.put(Integer.valueOf(i), new C2237a());
        }
        C2237a aVar = this.f5375c.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C2238b bVar = aVar.f5379d;
                    bVar.f5423h = i3;
                    bVar.f5425i = -1;
                } else if (i4 == 2) {
                    C2238b bVar2 = aVar.f5379d;
                    bVar2.f5425i = i3;
                    bVar2.f5423h = -1;
                } else {
                    StringBuilder h = C0072d.m201h("Left to ");
                    h.append(m4924p(i4));
                    h.append(" undefined");
                    throw new IllegalArgumentException(h.toString());
                }
                aVar.f5379d.f5386D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    C2238b bVar3 = aVar.f5379d;
                    bVar3.f5427j = i3;
                    bVar3.f5429k = -1;
                } else if (i4 == 2) {
                    C2238b bVar4 = aVar.f5379d;
                    bVar4.f5429k = i3;
                    bVar4.f5427j = -1;
                } else {
                    StringBuilder h2 = C0072d.m201h("right to ");
                    h2.append(m4924p(i4));
                    h2.append(" undefined");
                    throw new IllegalArgumentException(h2.toString());
                }
                aVar.f5379d.f5387E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    C2238b bVar5 = aVar.f5379d;
                    bVar5.f5430l = i3;
                    bVar5.f5431m = -1;
                    bVar5.f5434p = -1;
                } else if (i4 == 4) {
                    C2238b bVar6 = aVar.f5379d;
                    bVar6.f5431m = i3;
                    bVar6.f5430l = -1;
                    bVar6.f5434p = -1;
                } else {
                    StringBuilder h3 = C0072d.m201h("right to ");
                    h3.append(m4924p(i4));
                    h3.append(" undefined");
                    throw new IllegalArgumentException(h3.toString());
                }
                aVar.f5379d.f5388F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    C2238b bVar7 = aVar.f5379d;
                    bVar7.f5433o = i3;
                    bVar7.f5432n = -1;
                    bVar7.f5434p = -1;
                } else if (i4 == 3) {
                    C2238b bVar8 = aVar.f5379d;
                    bVar8.f5432n = i3;
                    bVar8.f5433o = -1;
                    bVar8.f5434p = -1;
                } else {
                    StringBuilder h4 = C0072d.m201h("right to ");
                    h4.append(m4924p(i4));
                    h4.append(" undefined");
                    throw new IllegalArgumentException(h4.toString());
                }
                aVar.f5379d.f5389G = i5;
                return;
            case 5:
                if (i4 == 5) {
                    C2238b bVar9 = aVar.f5379d;
                    bVar9.f5434p = i3;
                    bVar9.f5433o = -1;
                    bVar9.f5432n = -1;
                    bVar9.f5430l = -1;
                    bVar9.f5431m = -1;
                    return;
                }
                StringBuilder h5 = C0072d.m201h("right to ");
                h5.append(m4924p(i4));
                h5.append(" undefined");
                throw new IllegalArgumentException(h5.toString());
            case 6:
                if (i4 == 6) {
                    C2238b bVar10 = aVar.f5379d;
                    bVar10.f5436r = i3;
                    bVar10.f5435q = -1;
                } else if (i4 == 7) {
                    C2238b bVar11 = aVar.f5379d;
                    bVar11.f5435q = i3;
                    bVar11.f5436r = -1;
                } else {
                    StringBuilder h6 = C0072d.m201h("right to ");
                    h6.append(m4924p(i4));
                    h6.append(" undefined");
                    throw new IllegalArgumentException(h6.toString());
                }
                aVar.f5379d.f5391I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    C2238b bVar12 = aVar.f5379d;
                    bVar12.f5438t = i3;
                    bVar12.f5437s = -1;
                } else if (i4 == 6) {
                    C2238b bVar13 = aVar.f5379d;
                    bVar13.f5437s = i3;
                    bVar13.f5438t = -1;
                } else {
                    StringBuilder h7 = C0072d.m201h("right to ");
                    h7.append(m4924p(i4));
                    h7.append(" undefined");
                    throw new IllegalArgumentException(h7.toString());
                }
                aVar.f5379d.f5390H = i5;
                return;
            default:
                throw new IllegalArgumentException(m4924p(i2) + " to " + m4924p(i4) + " unknown");
        }
    }

    /* renamed from: j */
    public final C2237a mo8490j(int i) {
        if (!this.f5375c.containsKey(Integer.valueOf(i))) {
            this.f5375c.put(Integer.valueOf(i), new C2237a());
        }
        return this.f5375c.get(Integer.valueOf(i));
    }

    /* renamed from: k */
    public final void mo8491k(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C2237a i2 = m4922i(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        i2.f5379d.f5409a = true;
                    }
                    this.f5375c.put(Integer.valueOf(i2.f5376a), i2);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0179, code lost:
        continue;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8492l(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x0188
            if (r0 == 0) goto L_0x0176
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x0179
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0179
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.a$a> r0 = r9.f5375c     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r3 = r2.f5376a     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2 = r1
            goto L_0x0179
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = r6
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = r3
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = r7
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016c;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0179
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.f5381f     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.ConstraintAttribute.m4912e(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.a$c r0 = r2.f5378c     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo8502b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.a$b r0 = r2.f5379d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo8500b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.a$e r0 = r2.f5380e     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo8505b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.a$d r0 = r2.f5377b     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo8503a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.a$a r0 = m4922i(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.a$b r2 = r0.f5379d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f5416d0 = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.a$a r0 = m4922i(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.a$b r2 = r0.f5379d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f5409a = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f5411b = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x016c:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.a$a r0 = m4922i(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0174:
            r2 = r0
            goto L_0x0179
        L_0x0176:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0179:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0006
        L_0x017f:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0188
        L_0x0184:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C2236a.mo8492l(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: n */
    public final void mo8493n(float f, int i) {
        mo8490j(i).f5377b.f5456d = f;
    }

    /* renamed from: o */
    public final void mo8494o(int i, int i2, int i3) {
        C2237a j = mo8490j(i);
        switch (i2) {
            case 1:
                j.f5379d.f5386D = i3;
                return;
            case 2:
                j.f5379d.f5387E = i3;
                return;
            case 3:
                j.f5379d.f5388F = i3;
                return;
            case 4:
                j.f5379d.f5389G = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                j.f5379d.f5391I = i3;
                return;
            case 7:
                j.f5379d.f5390H = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }
}

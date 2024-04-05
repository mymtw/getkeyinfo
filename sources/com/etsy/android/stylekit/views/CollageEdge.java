package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388lb.C13006a;
import p435rb.C13350a;

public final class CollageEdge extends AppCompatImageView {
    public static final int $stable = 8;
    private EdgeType edgeType;
    private EdgePosition position;
    private EdgeSize size;

    public enum EdgePosition {
        BOTTOM,
        TOP
    }

    public enum EdgeSize {
        SMALL,
        BASE,
        LARGE
    }

    public enum EdgeType {
        EDGE01,
        EDGE02,
        EDGE03,
        EDGE04,
        EDGE05
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageEdge$a */
    public /* synthetic */ class C9037a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19906a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f19907b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f19908c;

        static {
            int[] iArr = new int[EdgeSize.values().length];
            iArr[EdgeSize.SMALL.ordinal()] = 1;
            iArr[EdgeSize.BASE.ordinal()] = 2;
            iArr[EdgeSize.LARGE.ordinal()] = 3;
            f19906a = iArr;
            int[] iArr2 = new int[EdgeType.values().length];
            iArr2[EdgeType.EDGE01.ordinal()] = 1;
            iArr2[EdgeType.EDGE02.ordinal()] = 2;
            iArr2[EdgeType.EDGE03.ordinal()] = 3;
            iArr2[EdgeType.EDGE04.ordinal()] = 4;
            iArr2[EdgeType.EDGE05.ordinal()] = 5;
            f19907b = iArr2;
            int[] iArr3 = new int[EdgePosition.values().length];
            iArr3[EdgePosition.BOTTOM.ordinal()] = 1;
            iArr3[EdgePosition.TOP.ordinal()] = 2;
            f19908c = iArr3;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageEdge(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageEdge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageEdge(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void updateImage() {
        int i = C9037a.f19907b[this.edgeType.ordinal()];
        if (i == 1) {
            int i2 = C9037a.f19906a[this.size.ordinal()];
            if (i2 == 1) {
                setImageResource(R.drawable.clg_edge01_smaller);
            } else if (i2 == 2) {
                setImageResource(R.drawable.clg_edge01_base);
            } else if (i2 == 3) {
                setImageResource(R.drawable.clg_edge01_larger);
            }
        } else if (i == 2) {
            int i3 = C9037a.f19906a[this.size.ordinal()];
            if (i3 == 1) {
                setImageResource(R.drawable.clg_edge02_smaller);
            } else if (i3 == 2) {
                setImageResource(R.drawable.clg_edge02_base);
            } else if (i3 == 3) {
                setImageResource(R.drawable.clg_edge02_larger);
            }
        } else if (i == 3) {
            int i4 = C9037a.f19906a[this.size.ordinal()];
            if (i4 == 1) {
                setImageResource(R.drawable.clg_edge03_smaller);
            } else if (i4 == 2) {
                setImageResource(R.drawable.clg_edge03_base);
            } else if (i4 == 3) {
                setImageResource(R.drawable.clg_edge03_larger);
            }
        } else if (i == 4) {
            int i5 = C9037a.f19906a[this.size.ordinal()];
            if (i5 == 1) {
                setImageResource(R.drawable.clg_edge04_smaller);
            } else if (i5 == 2) {
                setImageResource(R.drawable.clg_edge04_base);
            } else if (i5 == 3) {
                setImageResource(R.drawable.clg_edge04_larger);
            }
        } else if (i == 5) {
            int i6 = C9037a.f19906a[this.size.ordinal()];
            if (i6 == 1) {
                setImageResource(R.drawable.clg_edge05_smaller);
            } else if (i6 == 2) {
                setImageResource(R.drawable.clg_edge05_base);
            } else if (i6 == 3) {
                setImageResource(R.drawable.clg_edge05_larger);
            }
        }
    }

    private final void updatePosition() {
        int i = C9037a.f19908c[this.position.ordinal()];
        if (i == 1) {
            setScaleY(1.0f);
            setRotationY(0.0f);
        } else if (i == 2) {
            setScaleY(-1.0f);
            setRotationY(180.0f);
        }
    }

    public final EdgeType getEdgeType() {
        return this.edgeType;
    }

    public final EdgePosition getPosition() {
        return this.position;
    }

    public final EdgeSize getSize() {
        return this.size;
    }

    public final void setEdgeType(EdgeType edgeType2) {
        C19383o.m32797g(edgeType2, "value");
        this.edgeType = edgeType2;
        updateImage();
    }

    public final void setPosition(EdgePosition edgePosition) {
        C19383o.m32797g(edgePosition, "value");
        this.position = edgePosition;
        updatePosition();
    }

    public final void setSize(EdgeSize edgeSize) {
        C19383o.m32797g(edgeSize, "value");
        this.size = edgeSize;
        updateImage();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageEdge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        EdgeSize edgeSize = EdgeSize.BASE;
        this.size = edgeSize;
        EdgeType edgeType2 = EdgeType.EDGE01;
        this.edgeType = edgeType2;
        EdgePosition edgePosition = EdgePosition.BOTTOM;
        this.position = edgePosition;
        ColorStateList valueOf = ColorStateList.valueOf(C13350a.m21013d(context, R.attr.clg_color_bg_edge));
        C19383o.m32796f(valueOf, "valueOf(context.colorFro….attr.clg_color_bg_edge))");
        if (getImageTintList() == null) {
            setImageTintList(valueOf);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28644k);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.CollageEdge)");
            setSize(EdgeSize.values()[obtainStyledAttributes.getInt(2, edgeSize.ordinal())]);
            setPosition(EdgePosition.values()[obtainStyledAttributes.getInt(1, edgePosition.ordinal())]);
            setEdgeType(EdgeType.values()[obtainStyledAttributes.getInt(0, edgeType2.ordinal())]);
            obtainStyledAttributes.recycle();
        }
        setImportantForAccessibility(2);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        updateImage();
        updatePosition();
    }
}

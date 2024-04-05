package com.etsy.android.stylekit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CenteredImageSpan extends ImageSpan {
    public static final int $stable = 8;
    private WeakReference<Drawable> drawableRef;
    private final int iconSize;
    private final Integer iconTint;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CenteredImageSpan(Context context, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : num);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001d: MOVE  (r3v1 android.graphics.drawable.Drawable) = (r0v2 android.graphics.drawable.Drawable)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    private final android.graphics.drawable.Drawable getCachedDrawable() {
        /*
            r5 = this;
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r0 = r5.drawableRef
            r1 = 0
            if (r0 == 0) goto L_0x000a
            java.lang.Object r0 = r0.get()
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 != 0) goto L_0x0018
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            r5.drawableRef = r2
        L_0x0018:
            int r2 = r5.iconSize
            if (r2 == 0) goto L_0x0025
            r3 = r0
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            if (r3 == 0) goto L_0x0025
            r4 = 0
            r3.setBounds(r4, r4, r2, r2)
        L_0x0025:
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r1 = r0.mutate()
        L_0x002d:
            java.lang.Integer r0 = r5.iconTint
            if (r0 == 0) goto L_0x003f
            r0.intValue()
            if (r1 == 0) goto L_0x003f
            java.lang.Integer r0 = r5.iconTint
            int r0 = r0.intValue()
            r1.setTint(r0)
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.stylekit.CenteredImageSpan.getCachedDrawable():android.graphics.drawable.Drawable");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C19383o.m32797g(canvas, "canvas");
        C19383o.m32797g(charSequence, "text");
        C19383o.m32797g(paint, "paint");
        Drawable cachedDrawable = getCachedDrawable();
        C19383o.m32794d(cachedDrawable);
        canvas.save();
        int i6 = this.iconSize;
        if (i6 == 0) {
            i6 = cachedDrawable.getIntrinsicHeight();
        }
        canvas.translate(f, (float) ((((i6 - paint.getFontMetricsInt().descent) + paint.getFontMetricsInt().ascent) / 2) + (i5 - cachedDrawable.getBounds().bottom)));
        cachedDrawable.draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C19383o.m32797g(paint, "paint");
        C19383o.m32797g(charSequence, "text");
        Drawable cachedDrawable = getCachedDrawable();
        C19383o.m32794d(cachedDrawable);
        Rect bounds = cachedDrawable.getBounds();
        C19383o.m32796f(bounds, "d!!.bounds");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CenteredImageSpan(Context context, int i, int i2, Integer num) {
        super(context, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.iconSize = i2;
        this.iconTint = num;
    }
}

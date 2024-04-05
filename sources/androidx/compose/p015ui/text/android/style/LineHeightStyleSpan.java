package androidx.compose.p015ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.LineHeightStyleSpan */
public final class LineHeightStyleSpan implements LineHeightSpan {
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int startIndex;
    private final int topPercentage;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    public LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, int i3) {
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topPercentage = i3;
        boolean z3 = true;
        if (!(i3 >= 0 && i3 < 101) && i3 != -1) {
            z3 = false;
        }
        if (!z3) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        C19383o.m32797g(fontMetricsInt, "<this>");
        int i = fontMetricsInt.descent - fontMetricsInt.ascent;
        int ceil = (int) ((float) Math.ceil((double) this.lineHeight));
        int i2 = ceil - i;
        int i3 = this.topPercentage;
        if (i3 == -1) {
            i3 = (int) ((Math.abs((float) fontMetricsInt.ascent) / ((float) (fontMetricsInt.descent - fontMetricsInt.ascent))) * 100.0f);
        }
        double ceil2 = i2 <= 0 ? Math.ceil((double) (((float) (i2 * i3)) / 100.0f)) : Math.ceil((double) (((float) ((100 - i3) * i2)) / 100.0f));
        int i4 = fontMetricsInt.descent;
        int i5 = ((int) ((float) ceil2)) + i4;
        this.descent = i5;
        int i6 = i5 - ceil;
        this.ascent = i6;
        if (this.trimFirstLineTop) {
            i6 = fontMetricsInt.ascent;
        }
        this.firstAscent = i6;
        if (this.trimLastLineBottom) {
            i5 = i4;
        }
        this.lastDescent = i5;
        this.firstAscentDiff = fontMetricsInt.ascent - i6;
        this.lastDescentDiff = i5 - i4;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        C19383o.m32797g(charSequence, "text");
        C19383o.m32797g(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent > 0) {
            boolean z = true;
            boolean z2 = i == this.startIndex;
            if (i2 != this.endIndex) {
                z = false;
            }
            if (!z2 || !z || !this.trimFirstLineTop || !this.trimLastLineBottom) {
                if (z2) {
                    calculateTargetMetrics(fontMetricsInt);
                }
                fontMetricsInt.ascent = z2 ? this.firstAscent : this.ascent;
                fontMetricsInt.descent = z ? this.lastDescent : this.descent;
            }
        }
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }
}

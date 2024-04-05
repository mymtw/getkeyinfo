package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.emoji2.text.flatbuffer.C2676a;

public abstract class EmojiSpan extends ReplacementSpan {
    private short mHeight = -1;
    private final C2680h mMetadata;
    private float mRatio = 1.0f;
    private final Paint.FontMetricsInt mTmpFontMetrics = new Paint.FontMetricsInt();
    private short mWidth = -1;

    public EmojiSpan(C2680h hVar) {
        if (hVar != null) {
            this.mMetadata = hVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final int getId() {
        return getMetadata().mo10076c();
    }

    public final C2680h getMetadata() {
        return this.mMetadata;
    }

    public final float getRatio() {
        return this.mRatio;
    }

    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.mTmpFontMetrics);
        Paint.FontMetricsInt fontMetricsInt2 = this.mTmpFontMetrics;
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        C2676a d = this.mMetadata.mo10077d();
        int a = d.mo10072a(14);
        short s = 0;
        this.mRatio = abs / ((float) (a != 0 ? d.f6028b.getShort(a + d.f6027a) : 0));
        C2676a d2 = this.mMetadata.mo10077d();
        int a2 = d2.mo10072a(14);
        this.mHeight = (short) ((int) (((float) (a2 != 0 ? d2.f6028b.getShort(a2 + d2.f6027a) : 0)) * this.mRatio));
        C2676a d3 = this.mMetadata.mo10077d();
        int a3 = d3.mo10072a(12);
        if (a3 != 0) {
            s = d3.f6028b.getShort(a3 + d3.f6027a);
        }
        short s2 = (short) ((int) (((float) s) * this.mRatio));
        this.mWidth = s2;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.mTmpFontMetrics;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s2;
    }

    public final int getWidth() {
        return this.mWidth;
    }
}

package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;

public final class TypefaceEmojiSpan extends EmojiSpan {
    private static Paint sDebugPaint;

    public TypefaceEmojiSpan(C2680h hVar) {
        super(hVar);
    }

    private static Paint getDebugPaint() {
        if (sDebugPaint == null) {
            TextPaint textPaint = new TextPaint();
            sDebugPaint = textPaint;
            textPaint.setColor(C2665e.m6414a().f6011g);
            sDebugPaint.setStyle(Paint.Style.FILL);
        }
        return sDebugPaint;
    }

    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        C2665e.m6414a().getClass();
        C2680h metadata = getMetadata();
        Typeface typeface = metadata.f6035b.f6061d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i6 = metadata.f6034a * 2;
        char[] cArr = metadata.f6035b.f6059b;
        canvas.drawText(cArr, i6, 2, f, (float) i4, paint);
        paint2.setTypeface(typeface2);
    }
}

package com.etsy.android.stylekit.typefaces;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p280x0.C8292f;
import p441sb.C13367a;

public abstract class StyleKitSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final Typeface loadedTypeface;

    public static final class BoldSpan extends StyleKitSpan {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BoldSpan(Context context) {
            super(context, new C13367a.C13368a(), (DefaultConstructorMarker) null);
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
        }
    }

    public static final class DisplaySpan extends StyleKitSpan {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DisplaySpan(Context context) {
            super(context, new C13367a.C13369b(), (DefaultConstructorMarker) null);
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
        }
    }

    public static final class NormalSpan extends StyleKitSpan {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NormalSpan(Context context) {
            super(context, new C13367a.C13370c(), (DefaultConstructorMarker) null);
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
        }
    }

    private StyleKitSpan(Context context, C13367a aVar) {
        Typeface a = C8292f.m16582a(context, aVar.f29297a);
        if (a != null) {
            this.loadedTypeface = a;
            return;
        }
        throw new Exception("unable to create a TypefaceSpan with a null Typeface");
    }

    public /* synthetic */ StyleKitSpan(Context context, C13367a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar);
    }

    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setTypeface(this.loadedTypeface);
        }
    }

    public void updateMeasureState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.setTypeface(this.loadedTypeface);
    }
}

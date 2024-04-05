package androidx.core.text;

import android.os.Build;
import android.os.Trace;
import android.support.p013v4.media.C0072d;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import p001a0.C0005b;
import p002a1.C0013g;

public class PrecomputedTextCompat implements Spannable {
    private static final char LINE_FEED = '\n';
    private static Executor sExecutor;
    private static final Object sLock = new Object();
    private final int[] mParagraphEnds;
    private final C2270a mParams;
    private final Spannable mText;
    private final PrecomputedText mWrapped;

    /* renamed from: androidx.core.text.PrecomputedTextCompat$b */
    public static class C2271b extends FutureTask<PrecomputedTextCompat> {

        /* renamed from: androidx.core.text.PrecomputedTextCompat$b$a */
        public static class C2272a implements Callable<PrecomputedTextCompat> {

            /* renamed from: b */
            public C2270a f5532b;

            /* renamed from: c */
            public CharSequence f5533c;

            public C2272a(CharSequence charSequence, C2270a aVar) {
                this.f5532b = aVar;
                this.f5533c = charSequence;
            }

            public final Object call() throws Exception {
                return PrecomputedTextCompat.create(this.f5533c, this.f5532b);
            }
        }

        public C2271b(CharSequence charSequence, C2270a aVar) {
            super(new C2272a(charSequence, aVar));
        }
    }

    private PrecomputedTextCompat(CharSequence charSequence, C2270a aVar, int[] iArr) {
        this.mText = new SpannableString(charSequence);
        this.mParams = aVar;
        this.mParagraphEnds = iArr;
        this.mWrapped = null;
    }

    public static PrecomputedTextCompat create(CharSequence charSequence, C2270a aVar) {
        PrecomputedText.Params params;
        charSequence.getClass();
        aVar.getClass();
        try {
            int i = C0013g.f24a;
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT < 29 || (params = aVar.f5531e) == null) {
                ArrayList arrayList = new ArrayList();
                int length = charSequence.length();
                int i2 = 0;
                while (i2 < length) {
                    int indexOf = TextUtils.indexOf(charSequence, 10, i2, length);
                    i2 = indexOf < 0 ? length : indexOf + 1;
                    arrayList.add(Integer.valueOf(i2));
                }
                int[] iArr = new int[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.f5527a, Api.BaseClientBuilder.API_PRIORITY_OTHER).setBreakStrategy(aVar.f5529c).setHyphenationFrequency(aVar.f5530d).setTextDirection(aVar.f5528b).build();
                PrecomputedTextCompat precomputedTextCompat = new PrecomputedTextCompat(charSequence, aVar, iArr);
                Trace.endSection();
                return precomputedTextCompat;
            }
            PrecomputedTextCompat precomputedTextCompat2 = new PrecomputedTextCompat(PrecomputedText.create(charSequence, params), aVar);
            Trace.endSection();
            return precomputedTextCompat2;
        } catch (Throwable th) {
            int i4 = C0013g.f24a;
            Trace.endSection();
            throw th;
        }
    }

    public static Future<PrecomputedTextCompat> getTextFuture(CharSequence charSequence, C2270a aVar, Executor executor) {
        C2271b bVar = new C2271b(charSequence, aVar);
        if (executor == null) {
            synchronized (sLock) {
                if (sExecutor == null) {
                    sExecutor = Executors.newFixedThreadPool(1);
                }
                executor = sExecutor;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    public char charAt(int i) {
        return this.mText.charAt(i);
    }

    public int getParagraphCount() {
        return Build.VERSION.SDK_INT >= 29 ? this.mWrapped.getParagraphCount() : this.mParagraphEnds.length;
    }

    public int getParagraphEnd(int i) {
        C0005b.m21O(i, getParagraphCount(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.mWrapped.getParagraphEnd(i) : this.mParagraphEnds[i];
    }

    public int getParagraphStart(int i) {
        C0005b.m21O(i, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.mWrapped.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.mParagraphEnds[i - 1];
    }

    public C2270a getParams() {
        return this.mParams;
    }

    public PrecomputedText getPrecomputedText() {
        Spannable spannable = this.mText;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public int getSpanEnd(Object obj) {
        return this.mText.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.mText.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.mText.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.mWrapped.getSpans(i, i2, cls) : this.mText.getSpans(i, i2, cls);
    }

    public int length() {
        return this.mText.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.mText.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.mWrapped.removeSpan(obj);
        } else {
            this.mText.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.mWrapped.setSpan(obj, i, i2, i3);
        } else {
            this.mText.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.mText.subSequence(i, i2);
    }

    public String toString() {
        return this.mText.toString();
    }

    private PrecomputedTextCompat(PrecomputedText precomputedText, C2270a aVar) {
        this.mText = precomputedText;
        this.mParams = aVar;
        this.mParagraphEnds = null;
        this.mWrapped = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* renamed from: androidx.core.text.PrecomputedTextCompat$a */
    public static final class C2270a {

        /* renamed from: a */
        public final TextPaint f5527a;

        /* renamed from: b */
        public final TextDirectionHeuristic f5528b;

        /* renamed from: c */
        public final int f5529c;

        /* renamed from: d */
        public final int f5530d;

        /* renamed from: e */
        public final PrecomputedText.Params f5531e;

        public C2270a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f5531e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f5531e = null;
            }
            this.f5527a = textPaint;
            this.f5528b = textDirectionHeuristic;
            this.f5529c = i;
            this.f5530d = i2;
        }

        /* renamed from: a */
        public final boolean mo8799a(C2270a aVar) {
            if (this.f5529c == aVar.f5529c && this.f5530d == aVar.f5530d && this.f5527a.getTextSize() == aVar.f5527a.getTextSize() && this.f5527a.getTextScaleX() == aVar.f5527a.getTextScaleX() && this.f5527a.getTextSkewX() == aVar.f5527a.getTextSkewX() && this.f5527a.getLetterSpacing() == aVar.f5527a.getLetterSpacing() && TextUtils.equals(this.f5527a.getFontFeatureSettings(), aVar.f5527a.getFontFeatureSettings()) && this.f5527a.getFlags() == aVar.f5527a.getFlags() && this.f5527a.getTextLocales().equals(aVar.f5527a.getTextLocales())) {
                return this.f5527a.getTypeface() == null ? aVar.f5527a.getTypeface() == null : this.f5527a.getTypeface().equals(aVar.f5527a.getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2270a)) {
                return false;
            }
            C2270a aVar = (C2270a) obj;
            return mo8799a(aVar) && this.f5528b == aVar.f5528b;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{Float.valueOf(this.f5527a.getTextSize()), Float.valueOf(this.f5527a.getTextScaleX()), Float.valueOf(this.f5527a.getTextSkewX()), Float.valueOf(this.f5527a.getLetterSpacing()), Integer.valueOf(this.f5527a.getFlags()), this.f5527a.getTextLocales(), this.f5527a.getTypeface(), Boolean.valueOf(this.f5527a.isElegantTextHeight()), this.f5528b, Integer.valueOf(this.f5529c), Integer.valueOf(this.f5530d)});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder h = C0072d.m201h("textSize=");
            h.append(this.f5527a.getTextSize());
            sb.append(h.toString());
            sb.append(", textScaleX=" + this.f5527a.getTextScaleX());
            sb.append(", textSkewX=" + this.f5527a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f5527a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f5527a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f5527a.getTextLocales());
            sb.append(", typeface=" + this.f5527a.getTypeface());
            sb.append(", variationSettings=" + this.f5527a.getFontVariationSettings());
            sb.append(", textDir=" + this.f5528b);
            sb.append(", breakStrategy=" + this.f5529c);
            sb.append(", hyphenationFrequency=" + this.f5530d);
            sb.append("}");
            return sb.toString();
        }

        public C2270a(PrecomputedText.Params params) {
            this.f5527a = params.getTextPaint();
            this.f5528b = params.getTextDirection();
            this.f5529c = params.getBreakStrategy();
            this.f5530d = params.getHyphenationFrequency();
            this.f5531e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}

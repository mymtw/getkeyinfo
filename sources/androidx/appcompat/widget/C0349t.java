package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.t */
public final class C0349t {

    /* renamed from: l */
    public static final RectF f921l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    public static ConcurrentHashMap<String, Method> f922m = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f923a = 0;

    /* renamed from: b */
    public boolean f924b = false;

    /* renamed from: c */
    public float f925c = -1.0f;

    /* renamed from: d */
    public float f926d = -1.0f;

    /* renamed from: e */
    public float f927e = -1.0f;

    /* renamed from: f */
    public int[] f928f = new int[0];

    /* renamed from: g */
    public boolean f929g = false;

    /* renamed from: h */
    public TextPaint f930h;

    /* renamed from: i */
    public final TextView f931i;

    /* renamed from: j */
    public final Context f932j;

    /* renamed from: k */
    public final C0350a f933k;

    /* renamed from: androidx.appcompat.widget.t$a */
    public static class C0350a extends C0352c {
        /* renamed from: b */
        public void mo3170b(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0349t.m949e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.t$b */
    public static class C0351b extends C0350a {
        /* renamed from: a */
        public boolean mo3171a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        /* renamed from: b */
        public void mo3170b(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    /* renamed from: androidx.appcompat.widget.t$c */
    public static class C0352c {
        /* renamed from: a */
        public boolean mo3171a(TextView textView) {
            return ((Boolean) C0349t.m949e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public C0349t(TextView textView) {
        this.f931i = textView;
        this.f932j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f933k = new C0351b();
        } else {
            this.f933k = new C0350a();
        }
    }

    /* renamed from: b */
    public static int[] m947b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    public static Method m948d(String str) {
        try {
            Method method = f922m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f922m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: e */
    public static <T> T m949e(Object obj, String str, T t) {
        try {
            return m948d(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: a */
    public final void mo3163a() {
        if (mo3168i() && this.f923a != 0) {
            if (this.f924b) {
                if (this.f931i.getMeasuredHeight() > 0 && this.f931i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f933k.mo3171a(this.f931i) ? 1048576 : (this.f931i.getMeasuredWidth() - this.f931i.getTotalPaddingLeft()) - this.f931i.getTotalPaddingRight();
                    int height = (this.f931i.getHeight() - this.f931i.getCompoundPaddingBottom()) - this.f931i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f921l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float c = (float) mo3164c(rectF);
                            if (c != this.f931i.getTextSize()) {
                                mo3165f(c, 0);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f924b = true;
        }
    }

    /* renamed from: c */
    public final int mo3164c(RectF rectF) {
        CharSequence transformation;
        int length = this.f928f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.f928f[i4];
                CharSequence text = this.f931i.getText();
                TransformationMethod transformationMethod = this.f931i.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f931i)) == null)) {
                    text = transformation;
                }
                int maxLines = this.f931i.getMaxLines();
                TextPaint textPaint = this.f930h;
                if (textPaint == null) {
                    this.f930h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f930h.set(this.f931i.getPaint());
                this.f930h.setTextSize((float) i5);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f930h, Math.round(rectF.right));
                obtain.setAlignment((Layout.Alignment) m949e(this.f931i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.f931i.getLineSpacingExtra(), this.f931i.getLineSpacingMultiplier()).setIncludePad(this.f931i.getIncludeFontPadding()).setBreakStrategy(this.f931i.getBreakStrategy()).setHyphenationFrequency(this.f931i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : maxLines);
                try {
                    this.f933k.mo3170b(obtain, this.f931i);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f928f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: f */
    public final void mo3165f(float f, int i) {
        Context context = this.f932j;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f931i.getPaint().getTextSize()) {
            this.f931i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f931i.isInLayout();
            if (this.f931i.getLayout() != null) {
                this.f924b = false;
                try {
                    Method d = m948d("nullLayouts");
                    if (d != null) {
                        d.invoke(this.f931i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f931i.requestLayout();
                } else {
                    this.f931i.forceLayout();
                }
                this.f931i.invalidate();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo3166g() {
        if (!mo3168i() || this.f923a != 1) {
            this.f924b = false;
        } else {
            if (!this.f929g || this.f928f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f927e - this.f926d) / this.f925c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((((float) i) * this.f925c) + this.f926d);
                }
                this.f928f = m947b(iArr);
            }
            this.f924b = true;
        }
        return this.f924b;
    }

    /* renamed from: h */
    public final boolean mo3167h() {
        int[] iArr = this.f928f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f929g = z;
        if (z) {
            this.f923a = 1;
            this.f926d = (float) iArr[0];
            this.f927e = (float) iArr[length - 1];
            this.f925c = -1.0f;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo3168i() {
        return !(this.f931i instanceof AppCompatEditText);
    }

    /* renamed from: j */
    public final void mo3169j(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f923a = 1;
            this.f926d = f;
            this.f927e = f2;
            this.f925c = f3;
            this.f929g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }
}

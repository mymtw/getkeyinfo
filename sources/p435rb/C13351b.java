package p435rb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.CenteredImageSpan;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: rb.b */
public final class C13351b {
    /* renamed from: a */
    public static final void m21017a(TextView textView, Integer num) {
        C19383o.m32797g(textView, "<this>");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        Context context = textView.getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        spannableStringBuilder.setSpan(new CenteredImageSpan(context, R.drawable.clg_icon_core_rightarrow_v1, 0, num, 4, (DefaultConstructorMarker) null), length, length + 1, 33);
        textView.setText(spannableStringBuilder);
    }

    @SuppressLint({"TextAppearance"})
    /* renamed from: b */
    public static final void m21018b(TextView textView, int i) {
        C19383o.m32797g(textView, "<this>");
        textView.setTextAppearance(i);
        int i2 = Build.VERSION.SDK_INT;
        TypedArray obtainStyledAttributes = textView.getContext().getTheme().obtainStyledAttributes(i, i2 >= 28 ? new int[]{16843103, 16843287, 16843288, 16844159} : new int[]{16843103, 16843287, 16843288});
        textView.setIncludeFontPadding(obtainStyledAttributes.getBoolean(0, true));
        textView.setLineSpacing((float) obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getFloat(2, 1.0f));
        if (i2 >= 28) {
            textView.setLineHeight(obtainStyledAttributes.getDimensionPixelSize(3, textView.getLineHeight()));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static final void m21019c(TextView textView) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
        spannableStringBuilder.append(textView.getText());
        Context context = textView.getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        spannableStringBuilder.setSpan(new CenteredImageSpan(context, R.drawable.clg_icon_core_yield_v1, 0, (Integer) null, 12, (DefaultConstructorMarker) null), 0, 1, 33);
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: d */
    public static void m21020d(TextView textView, Drawable drawable, Drawable drawable2, int i) {
        if ((i & 1) != 0) {
            drawable = null;
        }
        if ((i & 4) != 0) {
            drawable2 = null;
        }
        C19383o.m32797g(textView, "<this>");
        textView.setCompoundDrawables(drawable, (Drawable) null, drawable2, (Drawable) null);
    }
}

package p435rb;

import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0069a;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextViewStyleApplier;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.button.MaterialButton;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import p242t3.C7955e;
import p260v0.C8184a;

/* renamed from: rb.a */
public final class C13350a {
    @SuppressLint({"ResourceType"})
    /* renamed from: a */
    public static final void m21010a(Button button, int i) {
        C19383o.m32797g(button, "<this>");
        new TextViewStyleApplier(button).mo14737a(new C7955e(i));
        TypedArray obtainStyledAttributes = button.getContext().obtainStyledAttributes(i, new int[]{R.attr.drawableTint, 16843103, 16843848, R.attr.iconSize, R.attr.iconPadding, R.attr.iconGravity, R.attr.iconTint});
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styleRes, attrs)");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, button.getContext().getResources().getDimensionPixelSize(R.dimen.clg_icon_size));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(4, button.getContext().getResources().getDimensionPixelSize(R.dimen.clg_space_8));
        int i2 = obtainStyledAttributes.getInt(5, 2);
        int resourceId2 = obtainStyledAttributes.getResourceId(6, R.color.clg_color_black);
        obtainStyledAttributes.recycle();
        Drawable[] compoundDrawables = button.getCompoundDrawables();
        C19383o.m32796f(compoundDrawables, "compoundDrawables");
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setColorFilter(colorStateList != null ? colorStateList.getDefaultColor() : -65281, PorterDuff.Mode.SRC_ATOP);
            }
        }
        button.setIncludeFontPadding(z);
        button.setStateListAnimator(resourceId > 0 ? AnimatorInflater.loadStateListAnimator(button.getContext(), resourceId) : null);
        if (button instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) button;
            materialButton.setIconSize(dimensionPixelSize);
            materialButton.setIconPadding(dimensionPixelSize2);
            materialButton.setIconGravity(i2);
            materialButton.setIconTintResource(resourceId2);
        }
    }

    /* renamed from: b */
    public static final void m21011b(Button button, int i) {
        C19383o.m32797g(button, "<this>");
        TypedValue typedValue = new TypedValue();
        button.getContext().getTheme().resolveAttribute(i, typedValue, true);
        m21010a(button, typedValue.resourceId);
    }

    /* renamed from: c */
    public static final int m21012c(Context context, int i) {
        C19383o.m32797g(context, "<this>");
        Object obj = C8184a.f17966a;
        return C8184a.C8188d.m16468a(context, i);
    }

    /* renamed from: d */
    public static final int m21013d(Context context, int i) {
        C19383o.m32797g(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return m21012c(context, typedValue.resourceId);
    }

    /* renamed from: e */
    public static final int m21014e(Number number, Context context) {
        C19383o.m32797g(number, "<this>");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return (int) TypedValue.applyDimension(1, number.floatValue(), context.getResources().getDisplayMetrics());
    }

    /* renamed from: f */
    public static final int m21015f(Integer num, Context context) {
        C19383o.m32797g(num, "<this>");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return (int) TypedValue.applyDimension(2, num.floatValue(), context.getResources().getDisplayMetrics());
    }

    /* renamed from: g */
    public static final String m21016g(Context context, int i, Object... objArr) {
        C19383o.m32797g(context, "<this>");
        TypedValue typedValue = new TypedValue();
        boolean z = true;
        context.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            z = false;
        }
        if (z) {
            String string = context.getString(i2, Arrays.copyOf(objArr, objArr.length));
            C19383o.m32796f(string, "getString(typedValue.resourceId, *formatArgs)");
            return string;
        }
        throw new IllegalArgumentException(C0069a.m175f("The current theme is missing ", i, ". Toolkit components like Selects and Text Inputs need strings to be defined in your theme.").toString());
    }
}

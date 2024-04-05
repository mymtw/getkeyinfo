package p257u8;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.widget.Toolbar;
import com.cardinalcommerce.shared.models.enums.ButtonType;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6319a;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAButton;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView;
import com.cardinalcommerce.shared.userinterfaces.ButtonCustomization;
import com.cardinalcommerce.shared.userinterfaces.LabelCustomization;
import com.cardinalcommerce.shared.userinterfaces.ToolbarCustomization;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import com.etsy.android.R;

/* renamed from: u8.g */
public final class C8178g {

    /* renamed from: a */
    public static final C8172b f17954a = C8172b.m16432f();

    /* renamed from: a */
    public static Typeface m16449a(Activity activity, String str) {
        try {
            return Typeface.createFromAsset(activity.getAssets(), str);
        } catch (Exception e) {
            f17954a.mo19177d(String.valueOf(13201), e.getMessage(), (String) null);
            return null;
        }
    }

    /* renamed from: b */
    public static void m16450b(Toolbar toolbar, UiCustomization uiCustomization, Activity activity) {
        if (uiCustomization.getToolbarCustomization() == null) {
            toolbar.setTitle((int) R.string.secured_checkout);
            CCATextView cCATextView = (CCATextView) activity.findViewById(R.id.toolbarButton);
            cCATextView.setCCAText(activity.getResources().getString(R.string.cancel));
            cCATextView.setTextColor(activity.getResources().getColor(R.color.colorBlack));
            return;
        }
        ToolbarCustomization toolbarCustomization = uiCustomization.getToolbarCustomization();
        if (toolbarCustomization.getBackgroundColor() != null) {
            toolbar.setBackgroundColor(Color.parseColor(toolbarCustomization.getBackgroundColor()));
        }
        if (toolbarCustomization.getHeaderText() != null) {
            toolbar.setTitle((CharSequence) toolbarCustomization.getHeaderText());
        }
        if (toolbarCustomization.getTextColor() != null) {
            toolbar.setTitleTextColor(Color.parseColor(toolbarCustomization.getTextColor()));
        }
        CCATextView cCATextView2 = (CCATextView) activity.findViewById(R.id.toolbarButton);
        if (toolbarCustomization.getButtonText() != null) {
            cCATextView2.setCCAText(toolbarCustomization.getButtonText());
        }
    }

    /* renamed from: c */
    public static void m16451c(CCAButton cCAButton, ButtonCustomization buttonCustomization, Activity activity) {
        Typeface a;
        if (buttonCustomization.getTextColor() != null) {
            cCAButton.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
        }
        if (buttonCustomization.getTextFontSize() > 0) {
            cCAButton.setTextSize((float) buttonCustomization.getTextFontSize());
        }
        if (!(buttonCustomization.getTextFontName() == null || (a = m16449a(activity, buttonCustomization.getTextFontName())) == null)) {
            cCAButton.setTypeface(a);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (buttonCustomization.getBackgroundColor() != null) {
            gradientDrawable.setColor(Color.parseColor(buttonCustomization.getBackgroundColor()));
        }
        if (buttonCustomization.getCornerRadius() > 0) {
            gradientDrawable.setCornerRadius((float) buttonCustomization.getCornerRadius());
        }
        cCAButton.setBackground(gradientDrawable);
    }

    /* renamed from: d */
    public static void m16452d(CCATextView cCATextView, UiCustomization uiCustomization, Activity activity) {
        Typeface a;
        if (cCATextView != null) {
            ButtonType buttonType = ButtonType.CANCEL;
            if (uiCustomization.getButtonCustomization(buttonType) != null) {
                ButtonCustomization buttonCustomization = uiCustomization.getButtonCustomization(buttonType);
                if (buttonCustomization.getTextColor() != null) {
                    cCATextView.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
                }
                if (buttonCustomization.getTextFontSize() > 0) {
                    cCATextView.setTextSize((float) buttonCustomization.getTextFontSize());
                }
                if (!(buttonCustomization.getTextFontName() == null || (a = m16449a(activity, buttonCustomization.getTextFontName())) == null)) {
                    cCATextView.setTypeface(a);
                }
                cCATextView.setBackgroundColor(Color.parseColor("#00FF0000"));
                GradientDrawable gradientDrawable = new GradientDrawable();
                if (buttonCustomization.getBackgroundColor() != null) {
                    gradientDrawable.setColor(Color.parseColor(buttonCustomization.getBackgroundColor()));
                }
                if (buttonCustomization.getCornerRadius() > 0) {
                    gradientDrawable.setCornerRadius((float) buttonCustomization.getCornerRadius());
                }
                cCATextView.setBackground(gradientDrawable);
            }
        }
    }

    /* renamed from: e */
    public static void m16453e(C6319a aVar, UiCustomization uiCustomization, Activity activity) {
        Typeface a;
        if (uiCustomization.getLabelCustomization() != null) {
            LabelCustomization labelCustomization = uiCustomization.getLabelCustomization();
            if (labelCustomization.getTextFontSize() > 0) {
                aVar.setTextSize((float) labelCustomization.getTextFontSize());
            }
            if (labelCustomization.getTextColor() != null) {
                aVar.setTextColor(Color.parseColor(labelCustomization.getTextColor()));
            }
            if (!(labelCustomization.getTextFontName() == null || (a = m16449a(activity, labelCustomization.getTextFontName())) == null)) {
                aVar.setTypeface(a);
            }
        }
        int[][] iArr = {new int[]{-16842912}, new int[]{16842912}};
        int[] iArr2 = new int[2];
        ButtonType buttonType = ButtonType.VERIFY;
        iArr2[0] = uiCustomization.getButtonCustomization(buttonType) != null ? Color.parseColor(uiCustomization.getButtonCustomization(buttonType).getBackgroundColor()) : activity.getResources().getColor(R.color.blue);
        iArr2[1] = -12303292;
        ColorStateList colorStateList = new ColorStateList(iArr, iArr2);
        aVar.setButtonTintList(colorStateList);
        Drawable buttonDrawable = aVar.getButtonDrawable();
        if (uiCustomization.getButtonCustomization(buttonType) != null) {
            buttonDrawable.setTint(Color.parseColor(uiCustomization.getButtonCustomization(buttonType).getBackgroundColor()));
            aVar.setButtonTintList(colorStateList);
            return;
        }
        buttonDrawable.setTint(activity.getResources().getColor(R.color.blue));
    }

    /* renamed from: f */
    public static void m16454f(CCATextView cCATextView, UiCustomization uiCustomization, Activity activity) {
        Typeface a;
        if (uiCustomization.getLabelCustomization() != null) {
            LabelCustomization labelCustomization = uiCustomization.getLabelCustomization();
            if (labelCustomization.getTextFontSize() > 0) {
                cCATextView.setTextSize((float) labelCustomization.getTextFontSize());
            }
            if (labelCustomization.getTextColor() != null) {
                cCATextView.setTextColor(Color.parseColor(labelCustomization.getTextColor()));
                for (Drawable drawable : cCATextView.getCompoundDrawablesRelative()) {
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(Color.parseColor(labelCustomization.getTextColor()), PorterDuff.Mode.SRC_IN));
                    }
                }
            }
            if (labelCustomization.getTextFontName() != null && (a = m16449a(activity, labelCustomization.getTextFontName())) != null) {
                cCATextView.setTypeface(a);
            }
        }
    }
}

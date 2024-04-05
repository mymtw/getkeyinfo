package com.etsy.android.p327ui.favorites;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435rb.C13350a;
import p435rb.C13351b;
import p504ai.C13983i;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.favorites.FavoritesHeaderView */
public final class FavoritesHeaderView extends ConstraintLayout {
    public static final int $stable = 8;
    public static final C9737a Companion = new C9737a();
    private static final int MAX_VISIBLE_TABS = 3;
    public Map<Integer, View> _$_findViewCache;
    private int radioButtonWidth;
    private final C19285c radioGroup$delegate;

    /* renamed from: com.etsy.android.ui.favorites.FavoritesHeaderView$a */
    public static final class C9737a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FavoritesHeaderView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FavoritesHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        this.radioGroup$delegate = C19350d.m32677b(new FavoritesHeaderView$radioGroup$2(this));
        this.radioButtonWidth = -2;
        LayoutInflater.from(context).inflate(R.layout.favorites_header_view, this, true);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(C13350a.m21013d(context, R.attr.clg_color_bg_primary)));
        materialShapeDrawable.setElevation((float) context.getResources().getDimensionPixelSize(R.dimen.app_bar_elevation));
        setBackground(materialShapeDrawable);
        setLayoutTransition(new LayoutTransition());
    }

    private final RadioGroup getRadioGroup() {
        return (RadioGroup) this.radioGroup$delegate.getValue();
    }

    private final RadioButton getTab(String str, boolean z, int i, C9896u uVar) {
        RadioButton radioButton = new RadioButton(getContext());
        radioButton.setId(View.generateViewId());
        radioButton.setText(str);
        radioButton.setGravity(17);
        radioButton.setButtonDrawable((Drawable) null);
        radioButton.setChecked(z);
        radioButton.setMaxLines(1);
        radioButton.setEllipsize(TextUtils.TruncateAt.END);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(this.radioButtonWidth, -2);
        layoutParams.setMargins(radioButton.getResources().getDimensionPixelSize(R.dimen.clg_space_4), 0, radioButton.getResources().getDimensionPixelSize(R.dimen.clg_space_4), 0);
        radioButton.setLayoutParams(layoutParams);
        radioButton.setBackgroundResource(R.drawable.clg_actiongroup_bg);
        radioButton.setPadding(0, radioButton.getResources().getDimensionPixelSize(R.dimen.clg_space_8), 0, radioButton.getResources().getDimensionPixelSize(R.dimen.clg_space_8));
        radioButton.setOnClickListener(new C9864p(uVar, i, 0));
        C13351b.m21018b(radioButton, R.style.clg_text_title);
        return radioButton;
    }

    /* access modifiers changed from: private */
    /* renamed from: getTab$lambda-3$lambda-2  reason: not valid java name */
    public static final void m34970getTab$lambda3$lambda2(C9896u uVar, int i, View view) {
        C19383o.m32797g(uVar, "$onUpdateSelectedPage");
        uVar.updateSelectedPage(i);
    }

    private final void setRadioButtonWidth(int i) {
        if (i > 3) {
            i = 3;
        }
        this.radioButtonWidth = (getResources().getDisplayMetrics().widthPixels - getResources().getDimensionPixelSize(R.dimen.clg_space_36)) / i;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setUpTabs(List<String> list, int i, C9896u uVar) {
        C19383o.m32797g(list, "tabs");
        C19383o.m32797g(uVar, "onUpdateSelectedPage");
        RadioGroup radioGroup = getRadioGroup();
        if (radioGroup != null) {
            radioGroup.removeAllViews();
        }
        setRadioButtonWidth(list.size());
        int i2 = 0;
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String str = (String) next;
                RadioGroup radioGroup2 = getRadioGroup();
                if (radioGroup2 != null) {
                    radioGroup2.addView(getTab(str, i == i2, i2, uVar));
                }
                i2 = i3;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
    }

    public final void updateSelectedTab(int i) {
        RadioGroup radioGroup = getRadioGroup();
        View childAt = radioGroup != null ? radioGroup.getChildAt(i) : null;
        C19383o.m32795e(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FavoritesHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

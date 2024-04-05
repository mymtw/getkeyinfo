package com.etsy.android.stylekit.views.ratings;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.braze.p044ui.inappmessage.views.C5701g;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.C9059j;
import com.etsy.android.stylekit.views.C9060k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p114g4.C6865e;
import p388lb.C13006a;
import p435rb.C13350a;

public final class CollageRatingButtons extends ConstraintLayout {
    public static final int $stable = 8;
    private String label;
    private C9070a listener;
    private int rating;
    private final ColorStateList selectedTint;
    private final ImageButton star1;
    private final ImageButton star2;
    private final ImageButton star3;
    private final ImageButton star4;
    private final ImageButton star5;
    private ColorStateList unselectedTint;

    public enum StarSize {
        ;

        public static final class BASE extends StarSize {
            public BASE(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            public int getPadding(Resources resources) {
                C19383o.m32797g(resources, "resources");
                return 0;
            }
        }

        public static final class MEDIUM extends StarSize {
            public MEDIUM(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            public int getPadding(Resources resources) {
                C19383o.m32797g(resources, "resources");
                return resources.getDimensionPixelSize(R.dimen.clg_space_4);
            }
        }

        public static final class SMALL extends StarSize {
            public SMALL(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            public int getPadding(Resources resources) {
                C19383o.m32797g(resources, "resources");
                return resources.getDimensionPixelSize(R.dimen.clg_space_8);
            }
        }

        public abstract int getPadding(Resources resources);
    }

    /* renamed from: com.etsy.android.stylekit.views.ratings.CollageRatingButtons$a */
    public interface C9070a {
        /* renamed from: a */
        void mo31180a(int i, boolean z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRatingButtons(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRatingButtons(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageRatingButtons(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-1  reason: not valid java name */
    public static final void m34907_init_$lambda1(CollageRatingButtons collageRatingButtons, View view) {
        C19383o.m32797g(collageRatingButtons, "this$0");
        collageRatingButtons.setRating(1, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-2  reason: not valid java name */
    public static final void m34908_init_$lambda2(CollageRatingButtons collageRatingButtons, View view) {
        C19383o.m32797g(collageRatingButtons, "this$0");
        collageRatingButtons.setRating(2, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-3  reason: not valid java name */
    public static final void m34909_init_$lambda3(CollageRatingButtons collageRatingButtons, View view) {
        C19383o.m32797g(collageRatingButtons, "this$0");
        collageRatingButtons.setRating(3, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-4  reason: not valid java name */
    public static final void m34910_init_$lambda4(CollageRatingButtons collageRatingButtons, View view) {
        C19383o.m32797g(collageRatingButtons, "this$0");
        collageRatingButtons.setRating(4, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-5  reason: not valid java name */
    public static final void m34911_init_$lambda5(CollageRatingButtons collageRatingButtons, View view) {
        C19383o.m32797g(collageRatingButtons, "this$0");
        collageRatingButtons.setRating(5, true);
    }

    private final String getContentDescriptionFor(int i) {
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        return C13350a.m21016g(context, R.attr.clg_rating_button_single_content_description, String.valueOf(i), "5");
    }

    private final void resetStarTint() {
        this.star1.setImageTintList(this.unselectedTint);
        this.star2.setImageTintList(this.unselectedTint);
        this.star3.setImageTintList(this.unselectedTint);
        this.star4.setImageTintList(this.unselectedTint);
        this.star5.setImageTintList(this.unselectedTint);
    }

    private final void setButtonRatingState(int i) {
        resetStarTint();
        setRatingSelectionImage(i);
        setRatingSelectionTint(i);
    }

    private final void setRatingSelectionImage(int i) {
        this.star1.setImageResource(R.drawable.clg_icon_core_star_v1);
        this.star2.setImageResource(R.drawable.clg_icon_core_star_v1);
        this.star3.setImageResource(R.drawable.clg_icon_core_star_v1);
        this.star4.setImageResource(R.drawable.clg_icon_core_star_v1);
        this.star5.setImageResource(R.drawable.clg_icon_core_star_v1);
        if (i > 0) {
            this.star1.setImageResource(R.drawable.clg_icon_core_star_fill_v1);
        }
        if (i > 1) {
            this.star2.setImageResource(R.drawable.clg_icon_core_star_fill_v1);
        }
        if (i > 2) {
            this.star3.setImageResource(R.drawable.clg_icon_core_star_fill_v1);
        }
        if (i > 3) {
            this.star4.setImageResource(R.drawable.clg_icon_core_star_fill_v1);
        }
        if (i > 4) {
            this.star5.setImageResource(R.drawable.clg_icon_core_star_fill_v1);
        }
    }

    private final void setRatingSelectionTint(int i) {
        if (i > 0) {
            this.star1.setImageTintList(this.selectedTint);
        }
        if (i > 1) {
            this.star2.setImageTintList(this.selectedTint);
        }
        if (i > 2) {
            this.star3.setImageTintList(this.selectedTint);
        }
        if (i > 3) {
            this.star4.setImageTintList(this.selectedTint);
        }
        if (i > 4) {
            this.star5.setImageTintList(this.selectedTint);
        }
    }

    private final void setStarPadding(int i) {
        setViewPadding(this.star1, i);
        setViewPadding(this.star2, i);
        setViewPadding(this.star3, i);
        setViewPadding(this.star4, i);
        setViewPadding(this.star5, i);
    }

    private final void setViewPadding(View view, int i) {
        view.setPadding(i, i, i, i);
    }

    private final void updateContentDescription(int i) {
        if (!isInEditMode()) {
            String str = this.label;
            if (!(str != null && str.length() == 0)) {
                String str2 = "";
                if (this.label == null) {
                    this.label = str2;
                }
                this.star1.setContentDescription(getContentDescriptionFor(1));
                this.star2.setContentDescription(getContentDescriptionFor(2));
                this.star3.setContentDescription(getContentDescriptionFor(3));
                this.star4.setContentDescription(getContentDescriptionFor(4));
                this.star5.setContentDescription(getContentDescriptionFor(5));
                this.star1.setSelected(false);
                this.star2.setSelected(false);
                this.star3.setSelected(false);
                this.star4.setSelected(false);
                this.star5.setSelected(false);
                if (i > 0) {
                    this.star1.setContentDescription(getContentDescriptionFor(1));
                    this.star1.setSelected(true);
                }
                if (i > 1) {
                    this.star2.setContentDescription(getContentDescriptionFor(2));
                    this.star2.setSelected(true);
                }
                if (i > 2) {
                    this.star3.setContentDescription(getContentDescriptionFor(3));
                    this.star3.setSelected(true);
                }
                if (i > 3) {
                    this.star4.setContentDescription(getContentDescriptionFor(4));
                    this.star4.setSelected(true);
                }
                if (i > 4) {
                    this.star5.setContentDescription(getContentDescriptionFor(5));
                    this.star5.setSelected(true);
                }
                Context context = getContext();
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                Object[] objArr = new Object[3];
                String str3 = this.label;
                if (str3 != null) {
                    str2 = str3;
                }
                objArr[0] = str2;
                objArr[1] = Integer.valueOf(i);
                objArr[2] = "5";
                setContentDescription(C13350a.m21016g(context, R.attr.clg_rating_button_overall_content_description, objArr));
                return;
            }
            throw new IllegalArgumentException("CollageRatingButtons requires a label for accessibility. Call setLabelForAccessibility before setting the rating.");
        }
    }

    public final void setLabelForAccessibility(String str) {
        C19383o.m32797g(str, ResponseConstants.LABEL);
        this.label = str;
        updateContentDescription(this.rating);
    }

    public final void setOnSelectedListener(C9070a aVar) {
        this.listener = aVar;
    }

    public final void setRating(int i) {
        setRating(i, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageRatingButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.clg_rating_buttons, this, true);
        setFocusable(true);
        View findViewById = findViewById(R.id.rating_star_1);
        C19383o.m32796f(findViewById, "findViewById(R.id.rating_star_1)");
        ImageButton imageButton = (ImageButton) findViewById;
        this.star1 = imageButton;
        View findViewById2 = findViewById(R.id.rating_star_2);
        C19383o.m32796f(findViewById2, "findViewById(R.id.rating_star_2)");
        ImageButton imageButton2 = (ImageButton) findViewById2;
        this.star2 = imageButton2;
        View findViewById3 = findViewById(R.id.rating_star_3);
        C19383o.m32796f(findViewById3, "findViewById(R.id.rating_star_3)");
        ImageButton imageButton3 = (ImageButton) findViewById3;
        this.star3 = imageButton3;
        View findViewById4 = findViewById(R.id.rating_star_4);
        C19383o.m32796f(findViewById4, "findViewById(R.id.rating_star_4)");
        ImageButton imageButton4 = (ImageButton) findViewById4;
        this.star4 = imageButton4;
        View findViewById5 = findViewById(R.id.rating_star_5);
        C19383o.m32796f(findViewById5, "findViewById(R.id.rating_star_5)");
        ImageButton imageButton5 = (ImageButton) findViewById5;
        this.star5 = imageButton5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28650q);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…ble.CollageRatingButtons)");
            i3 = (int) obtainStyledAttributes.getFloat(0, 0.0f);
            StarSize starSize = StarSize.values()[obtainStyledAttributes.getInt(1, 2)];
            Resources resources = getResources();
            C19383o.m32796f(resources, "resources");
            i2 = starSize.getPadding(resources);
            obtainStyledAttributes.recycle();
        } else {
            i3 = 0;
            i2 = 0;
        }
        this.selectedTint = null;
        this.unselectedTint = ColorStateList.valueOf(C13350a.m21013d(context, R.attr.clg_color_text_secondary));
        imageButton.setOnClickListener(new C9059j(this, 1));
        imageButton2.setOnClickListener(new C5701g(this, 2));
        imageButton3.setOnClickListener(new C9060k(this, 1));
        imageButton4.setOnClickListener(new C6865e(this, 2));
        imageButton5.setOnClickListener(new C9072a(this, 0));
        setRating(i3, true);
        setStarPadding(i2);
    }

    private final void setRating(int i, boolean z) {
        this.rating = i;
        setButtonRatingState(i);
        updateContentDescription(i);
        C9070a aVar = this.listener;
        if (aVar != null) {
            aVar.mo31180a(i, z);
        }
    }
}

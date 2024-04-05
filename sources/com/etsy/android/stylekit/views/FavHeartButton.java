package com.etsy.android.stylekit.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.C19383o;
import p435rb.C13350a;

public final class FavHeartButton extends MaterialButton {
    public static final int $stable = 0;

    /* renamed from: com.etsy.android.stylekit.views.FavHeartButton$a */
    public static final class C9048a extends Animatable2Compat.C3306a {

        /* renamed from: b */
        public final /* synthetic */ FavHeartButton f19918b;

        public C9048a(FavHeartButton favHeartButton) {
            this.f19918b = favHeartButton;
        }

        /* renamed from: a */
        public final void mo12418a() {
            this.f19918b.setIconResource(R.drawable.clg_icon_favorited_on_light);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FavHeartButton(Context context) {
        this(context, (AttributeSet) null, R.attr.clg_button_favorite);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    private final void animate(boolean z) {
        if (z) {
            AnimatedVectorDrawableCompat create = AnimatedVectorDrawableCompat.create(getContext(), R.drawable.clg_anim_fav_heart);
            setIcon(create);
            if (create != null) {
                create.registerAnimationCallback(new C9048a(this));
            }
            if (create != null) {
                create.start();
                return;
            }
            return;
        }
        if (getIcon() instanceof AnimatedVectorDrawableCompat) {
            Drawable icon = getIcon();
            C19383o.m32795e(icon, "null cannot be cast to non-null type androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat");
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) icon;
            animatedVectorDrawableCompat.clearAnimationCallbacks();
            animatedVectorDrawableCompat.stop();
        }
        setIconResource(R.drawable.clg_icon_unfavorited_on_light);
    }

    public static /* synthetic */ void setFav$default(FavHeartButton favHeartButton, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        favHeartButton.setFav(z, str, z2);
    }

    public final void setFav(boolean z, String str, boolean z2) {
        C19383o.m32797g(str, "listingTitle");
        int i = z ? R.attr.clg_remove_from_favs_content_description : R.attr.clg_add_to_favs_content_description;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        setContentDescription(C13350a.m21016g(context, i, str));
        if (z2) {
            animate(z);
            return;
        }
        int i2 = z ? R.drawable.clg_icon_favorited_on_light : R.drawable.clg_icon_unfavorited_on_light;
        if (!(getIcon() instanceof AnimatedVectorDrawableCompat)) {
            setIconResource(i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FavHeartButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.clg_button_favorite);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavHeartButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.clg_button_favorite);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        setFav$default(this, false, (String) null, false, 2, (Object) null);
    }
}

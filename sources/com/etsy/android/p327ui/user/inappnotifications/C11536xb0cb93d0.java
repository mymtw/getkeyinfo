package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import android.widget.ImageView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANShopCardViewHolderBinder$bindAvatarUrl$lambda-1$$inlined$doOnNextLayout$1 */
public final class C11536xb0cb93d0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ String $avatarUrl$inlined;
    public final /* synthetic */ View $shopView$inlined;

    public C11536xb0cb93d0(View view, String str) {
        this.$shopView$inlined = view;
        this.$avatarUrl$inlined = str;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        C0114h.m272C0(this.$shopView$inlined).load(this.$avatarUrl$inlined).mo16816M((ImageView) this.$shopView$inlined.findViewById(R.id.shop_avatar));
    }
}

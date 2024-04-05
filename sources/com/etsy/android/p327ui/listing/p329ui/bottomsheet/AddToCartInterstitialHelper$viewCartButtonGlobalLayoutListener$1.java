package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.AddToCartInterstitialHelper$viewCartButtonGlobalLayoutListener$1 */
public final class AddToCartInterstitialHelper$viewCartButtonGlobalLayoutListener$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AddToCartInterstitialHelper this$0;

    public AddToCartInterstitialHelper$viewCartButtonGlobalLayoutListener$1(AddToCartInterstitialHelper addToCartInterstitialHelper) {
        this.this$0 = addToCartInterstitialHelper;
    }

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.this$0.f22421n;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.listing_image_card);
            C19383o.m32796f(findViewById, "bottomSheet.findViewById(R.id.listing_image_card)");
            CardView cardView = (CardView) findViewById;
            View findViewById2 = viewGroup.findViewById(R.id.checkmark_badge);
            C19383o.m32796f(findViewById2, "bottomSheet.findViewById(R.id.checkmark_badge)");
            ImageView imageView = (ImageView) findViewById2;
            View findViewById3 = viewGroup.findViewById(R.id.added_to_cart_confirmation_text);
            C19383o.m32796f(findViewById3, "bottomSheet.findViewById…o_cart_confirmation_text)");
            TextView textView = (TextView) findViewById3;
            View findViewById4 = viewGroup.findViewById(R.id.view_cart_button);
            C19383o.m32796f(findViewById4, "bottomSheet.findViewById(R.id.view_cart_button)");
            CollageButton collageButton = (CollageButton) findViewById4;
            if (collageButton.getLineCount() > 1 || textView.getLineCount() > 1) {
                ViewExtensions.m12863g(textView);
                ViewParent parent = collageButton.getParent();
                C19383o.m32795e(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                C2236a aVar = new C2236a();
                aVar.mo8487e(constraintLayout);
                aVar.mo8489g(collageButton.getId(), 6, cardView.getId(), 7, viewGroup.getResources().getDimensionPixelSize(R.dimen.clg_space_12));
                aVar.mo8484b(constraintLayout);
                imageView.setContentDescription(viewGroup.getResources().getString(R.string.added_to_cart_confirmation));
                imageView.setImportantForAccessibility(1);
            }
            NavigationExtensionsKt.m17420a(viewGroup, 100);
            collageButton.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}

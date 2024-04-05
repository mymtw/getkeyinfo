package com.etsy.android.p327ui.user.addresses;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.AddressUIBuilder */
public final class AddressUIBuilder {

    /* renamed from: com.etsy.android.ui.user.addresses.AddressUIBuilder$ButtonPlacement */
    public enum ButtonPlacement {
        LEFT,
        RIGHT,
        FULL_WIDTH
    }

    /* renamed from: com.etsy.android.ui.user.addresses.AddressUIBuilder$a */
    public /* synthetic */ class C11377a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25098a;

        static {
            int[] iArr = new int[ButtonPlacement.values().length];
            iArr[ButtonPlacement.LEFT.ordinal()] = 1;
            iArr[ButtonPlacement.RIGHT.ordinal()] = 2;
            iArr[ButtonPlacement.FULL_WIDTH.ordinal()] = 3;
            f25098a = iArr;
        }
    }

    /* renamed from: a */
    public static Button m19254a(Context context, int i, ButtonPlacement buttonPlacement) {
        int i2;
        C19383o.m32797g(buttonPlacement, "buttonPlacement");
        Button button = new Button(context, (AttributeSet) null, 0, i);
        button.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        int i3 = C11377a.f25098a[buttonPlacement.ordinal()];
        int i4 = R.dimen.clg_space_8;
        if (i3 == 1) {
            i2 = R.dimen.clg_space_8;
            i4 = R.dimen.clg_space_16;
        } else if (i3 == 2) {
            i2 = R.dimen.clg_space_16;
        } else if (i3 != 3) {
            i2 = R.dimen.clg_space_8;
        } else {
            i2 = R.dimen.clg_space_16;
            i4 = i2;
        }
        layoutParams.setMargins((int) context.getResources().getDimension(i4), (int) context.getResources().getDimension(R.dimen.clg_space_16), (int) context.getResources().getDimension(i2), (int) context.getResources().getDimension(R.dimen.clg_space_16));
        button.setLayoutParams(layoutParams);
        return button;
    }
}

package com.etsy.android.p327ui.favorites;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.CreateAListBottomSheetKey;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.favorites.CreateACollectionClickHandler */
public final class CreateACollectionClickHandler implements View.OnClickListener {
    public static final int $stable = 0;

    public void onClick(View view) {
        if (view != null) {
            Context context = view.getContext();
            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            C12788a.m20424c(fragmentActivity, new CreateAListBottomSheetKey(C19421p.m32935c0(fragmentActivity)));
        }
    }
}

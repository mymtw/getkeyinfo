package com.etsy.android.p327ui.home.tabs;

import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.p327ui.search.C10866i;
import com.etsy.android.uikit.AppBarHelper;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerFragment$initializeSearchBar$3$1 */
public final class HomePagerFragment$initializeSearchBar$3$1 implements C2857f {

    /* renamed from: b */
    public final /* synthetic */ C10866i f22113b;

    /* renamed from: c */
    public final /* synthetic */ HomePagerFragment f22114c;

    public HomePagerFragment$initializeSearchBar$3$1(C10866i iVar, HomePagerFragment homePagerFragment) {
        this.f22113b = iVar;
        this.f22114c = homePagerFragment;
    }

    public final void onPause(C2887s sVar) {
        C10866i iVar = this.f22113b;
        String string = this.f22114c.getString(R.string.abc_action_bar_up_description);
        AppBarHelper appBarHelper = iVar.f24098b;
        if (appBarHelper != null) {
            appBarHelper.setNavigationIconContentDescription((CharSequence) string);
        }
    }

    public final void onStart(C2887s sVar) {
        C10866i iVar = this.f22113b;
        String string = this.f22114c.getString(R.string.search_for_anything_on_etsy_search_field_hint);
        AppBarHelper appBarHelper = iVar.f24098b;
        if (appBarHelper != null) {
            appBarHelper.setNavigationIconContentDescription((CharSequence) string);
        }
        this.f22113b.mo36070b();
        if (this.f22114c.isNativeFlagEnabled(C8617e.f18938g)) {
            ViewExtensions.m12869m(this.f22113b.f24106j);
        }
    }

    public final void onStop(C2887s sVar) {
        ViewExtensions.m12860d(this.f22113b.f24106j);
    }
}

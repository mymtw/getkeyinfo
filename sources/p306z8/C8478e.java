package p306z8;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.utils.DialogMaker;

/* renamed from: z8.e */
public final /* synthetic */ class C8478e implements Preference.C3012f, Toolbar.C0294e, DialogMaker.NegativeClickListener {

    /* renamed from: b */
    public final /* synthetic */ Object f18503b;

    public /* synthetic */ C8478e(Object obj) {
        this.f18503b = obj;
    }

    /* renamed from: c */
    public final CharSequence mo11017c(Preference preference) {
        return ConfigPreferencesHelper.m34842setUpFeaturesOverridePreference$lambda1((ConfigPreferencesHelper) this.f18503b, (EditTextPreference) preference);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((ConversationComposeFragment) this.f18503b).lambda$setupToolbar$3(menuItem);
    }

    public final void onNegativeClick(DialogMaker dialogMaker) {
        PayPalSnappingRecyclerView.m35370showOfferDialog$lambda24((PEnums.TransitionName) this.f18503b, dialogMaker);
    }
}

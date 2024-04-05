package com.etsy.android.p327ui.user.help;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.user.help.HelpFragment */
public final class HelpFragment extends TrackingBaseFragment implements C13366a, C9731e0.C9733b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8591a config;

    private final void setupOption(View view, C11528a aVar) {
        ((ImageView) view.findViewById(R.id.help_button_image)).setImageResource(aVar.f25429c);
        ((TextView) view.findViewById(R.id.help_button_name)).setText(getString(aVar.f25427a));
        ((TextView) view.findViewById(R.id.help_button_description)).setText(getString(aVar.f25428b));
        view.setOnClickListener(aVar.f25430d);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C8591a getConfig() {
        C8591a aVar = this.config;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("config");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.helpdesk_help;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            android.view.View r8 = super.onCreateView(r6, r7, r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto L_0x001d
            r8 = 2131624154(0x7f0e00da, float:1.887548E38)
            r0 = 0
            android.view.View r6 = r6.inflate(r8, r7, r0)
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.C19383o.m32795e(r6, r7)
            r8 = r6
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
        L_0x001d:
            com.etsy.android.ui.user.help.a r6 = new com.etsy.android.ui.user.help.a
            r7 = 2131952346(0x7f1302da, float:1.9541132E38)
            r0 = 2131952347(0x7f1302db, float:1.9541134E38)
            r1 = 2131231410(0x7f0802b2, float:1.80789E38)
            com.etsy.android.ui.user.help.HelpFragment$onCreateView$helpCenter$1 r2 = new com.etsy.android.ui.user.help.HelpFragment$onCreateView$helpCenter$1
            r2.<init>(r5)
            r6.<init>(r7, r0, r1, r2)
            r7 = 2131952344(0x7f1302d8, float:1.9541128E38)
            r0 = 2131952345(0x7f1302d9, float:1.954113E38)
            com.etsy.android.ui.user.help.a r1 = new com.etsy.android.ui.user.help.a
            r2 = 2131231439(0x7f0802cf, float:1.807896E38)
            com.etsy.android.ui.user.help.HelpFragment$onCreateView$contactShop$1 r3 = new com.etsy.android.ui.user.help.HelpFragment$onCreateView$contactShop$1
            java.lang.String r4 = "help_in_app_help_with_an_order"
            r3.<init>(r5, r4)
            r1.<init>(r7, r0, r2, r3)
            r7 = 2131428474(0x7f0b047a, float:1.8478594E38)
            android.view.View r7 = r8.findViewById(r7)
            java.lang.String r0 = "view.findViewById(R.id.f…ment_help_btn_helpcenter)"
            kotlin.jvm.internal.C19383o.m32796f(r7, r0)
            r5.setupOption(r7, r6)
            r6 = 2131428473(0x7f0b0479, float:1.8478591E38)
            android.view.View r6 = r8.findViewById(r6)
            java.lang.String r7 = "view.findViewById(R.id.f…ent_help_btn_contactshop)"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)
            r5.setupOption(r6, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.help.HelpFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        FragmentActivity activity = getActivity();
        BOEActivity bOEActivity = activity instanceof BOEActivity ? (BOEActivity) activity : null;
        return bOEActivity != null ? bOEActivity.navigateUpAsBack() : super.onOptionsItemSelected(menuItem);
    }

    public final void setConfig(C8591a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.config = aVar;
    }
}

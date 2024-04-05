package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.CollectionV3;
import com.etsy.android.p327ui.favorites.add.C9779q;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.NameAListPresenter$createThatList$2 */
final class NameAListPresenter$createThatList$2 extends Lambda implements C19857l<C9779q, C19394m> {
    public final /* synthetic */ NameAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListPresenter$createThatList$2(NameAListPresenter nameAListPresenter) {
        super(1);
        this.this$0 = nameAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9779q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9779q qVar) {
        C9779q qVar2 = qVar;
        this.this$0.mo32741a(true);
        if (qVar2 instanceof C9779q.C9781b) {
            NameAListPresenter nameAListPresenter = this.this$0;
            CollectionV3 collectionV3 = ((C9779q.C9781b) qVar2).f21623a;
            nameAListPresenter.f21568a.getAnalyticsContext().mo21333d("collections_sheet_list_created", (Map<? extends AnalyticsProperty, Object>) null);
            ViewExtensions.m12860d((LoadingIndicatorView) nameAListPresenter.f21568a._$_findCachedViewById(R.id.name_list_loading));
            WeakReference weakReference = new WeakReference(nameAListPresenter.f21568a);
            NameAListFragment nameAListFragment = nameAListPresenter.f21568a;
            String string = nameAListPresenter.f21568a.getString(R.string.add_single_listing_to_collection_alert, collectionV3.getName());
            C19383o.m32796f(string, "fragment.getString(R.str…n_alert, collection.name)");
            AlertData alertData = r6;
            AlertData alertData2 = new AlertData(R.drawable.clg_icon_core_heart_fill_v1, string, nameAListPresenter.f21568a.getString(collectionV3.getPrivacyLevel().getLabel()), Integer.valueOf(collectionV3.getPrivacyLevel().getIcon()), CollageAlert.AlertType.SUCCESS, 0, new NameAListPresenter$handleCollectionCreatedSuccess$1(weakReference, nameAListPresenter), 32, (DefaultConstructorMarker) null);
            nameAListFragment.showAlert(alertData);
            nameAListPresenter.f21568a.done();
        } else if (qVar2 instanceof C9779q.C9780a) {
            ViewExtensions.m12860d((LoadingIndicatorView) this.this$0.f21568a._$_findCachedViewById(R.id.name_list_loading));
            String str = ((C9779q.C9780a) qVar2).f21622a;
            if (str == null) {
                str = this.this$0.f21568a.getResources().getString(R.string.create_list_generic_error_msg);
                C19383o.m32796f(str, "fragment.resources.getSt…e_list_generic_error_msg)");
            }
            this.this$0.mo32742b(str);
        } else if (qVar2 instanceof C9779q.C9782c) {
            ViewExtensions.m12869m((LoadingIndicatorView) this.this$0.f21568a._$_findCachedViewById(R.id.name_list_loading));
        }
    }
}

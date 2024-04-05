package com.etsy.android.p327ui.favorites.search;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.animation.C0388a;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.favorites.search.c */
public final class C9887c extends C12086e<C9886b> {

    /* renamed from: c */
    public final C8672b f21809c;

    /* renamed from: d */
    public final C19285c f21810d = C19350d.m32677b(new NoResultsViewHolder$errorMessage$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9887c(ViewGroup viewGroup, C8703p pVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_search_in_favorites_no_results, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f21809c = pVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        String str;
        C9886b bVar = (C9886b) obj;
        C19383o.m32797g(bVar, "data");
        this.f21809c.mo21333d(FavoriteSearchAnalytics.COLLECTION_SEARCH.getAnalyticsId(), (Map<? extends AnalyticsProperty, Object>) null);
        Object value = this.f21810d.getValue();
        C19383o.m32796f(value, "<get-errorMessage>(...)");
        TextView textView = (TextView) value;
        if (C18263b.m30837c0(bVar.f21808b)) {
            String string = textView.getResources().getString(R.string.collection_error_state_search_with_query);
            C19383o.m32796f(string, "resources.getString(R.st…_state_search_with_query)");
            str = C0388a.m1049e(new Object[]{bVar.f21808b}, 1, string, "format(format, *args)");
        } else {
            str = textView.getResources().getString(R.string.collection_error_state_search);
        }
        textView.setText(str);
    }
}

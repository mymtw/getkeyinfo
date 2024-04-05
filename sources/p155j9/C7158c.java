package p155j9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.SearchBar;
import com.etsy.android.p327ui.conversation.list.ccm.C9581e;
import com.etsy.android.p327ui.search.C10866i;
import com.etsy.android.p327ui.search.C10884j;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.ratings.C9072a;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;

/* renamed from: j9.c */
public final class C7158c extends C12086e<SearchBar> {

    /* renamed from: c */
    public final C10866i f15924c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7158c(ViewGroup viewGroup, C8703p pVar) {
        super(new FrameLayout(viewGroup.getContext()));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        Context context = viewGroup.getContext();
        C19383o.m32795e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C10866i iVar = new C10866i((FragmentActivity) context, pVar, (String) null, (AppBarHelper) null, (View.OnFocusChangeListener) null, (SearchView.C0283l) null, (C9581e) null, (C9072a) null, (C9053d) null, 1020);
        this.f15924c = iVar;
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).addView(iVar.f24104h);
        Context context2 = this.itemView.getContext();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.clg_space_4);
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.clg_space_24);
        this.itemView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        SearchBar searchBar = (SearchBar) obj;
        C19383o.m32797g(searchBar, "data");
        C10866i iVar = this.f15924c;
        iVar.f24103g.setQueryHint(searchBar.getHint());
        C10866i iVar2 = this.f15924c;
        iVar2.f24099c = new C7157b(searchBar, this);
        iVar2.f24103g.setOnQueryTextListener(new C10884j(iVar2));
    }
}

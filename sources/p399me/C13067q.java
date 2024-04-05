package p399me;

import android.view.ViewGroup;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.filters.refactor.SortBySelectItem;
import com.etsy.android.stylekit.views.CollageRadioButton;
import java.util.LinkedHashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: me.q */
public final class C13067q extends C13064n {

    /* renamed from: e */
    public final C19857l<C10813l, C19394m> f28736e;

    /* renamed from: f */
    public final LinkedHashMap f28737f = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13067q(ViewGroup viewGroup, C19857l<? super C10813l, C19394m> lVar) {
        super(viewGroup);
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onChange");
        this.f28736e = lVar;
        this.f28729c.setOnCheckedChangeListener(new C13066p(this));
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.SortBy) {
            this.f28728b.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f28728b.setDescription(searchFiltersUiGroupItem.mo35794c());
            this.f28737f.clear();
            SearchFiltersUiGroupItem.SortBy sortBy = (SearchFiltersUiGroupItem.SortBy) searchFiltersUiGroupItem;
            mo45822f(sortBy.f23838d.size());
            int i = 0;
            for (T next : sortBy.f23838d) {
                int i2 = i + 1;
                if (i >= 0) {
                    SortBySelectItem sortBySelectItem = (SortBySelectItem) next;
                    CollageRadioButton collageRadioButton = (CollageRadioButton) this.f28730d.get(i);
                    ViewExtensions.m12869m(collageRadioButton);
                    collageRadioButton.setText(sortBySelectItem.f23886b);
                    collageRadioButton.setChecked(sortBySelectItem.f23887c);
                    this.f28737f.put(collageRadioButton, sortBySelectItem);
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
        }
    }
}

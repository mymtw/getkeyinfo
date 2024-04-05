package p399me;

import android.view.ViewGroup;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.ItemTypeSelectItem;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.stylekit.views.CollageRadioButton;
import java.util.LinkedHashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: me.j */
public final class C13060j extends C13064n {

    /* renamed from: e */
    public final C19857l<C10813l, C19394m> f28717e;

    /* renamed from: f */
    public final LinkedHashMap f28718f = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13060j(ViewGroup viewGroup, C19857l<? super C10813l, C19394m> lVar) {
        super(viewGroup);
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onChange");
        this.f28717e = lVar;
        this.f28729c.setOnCheckedChangeListener(new C13059i(this));
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.ItemType) {
            this.f28728b.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f28728b.setDescription(searchFiltersUiGroupItem.mo35794c());
            this.f28718f.clear();
            SearchFiltersUiGroupItem.ItemType itemType = (SearchFiltersUiGroupItem.ItemType) searchFiltersUiGroupItem;
            mo45822f(itemType.f23809d.size());
            int i = 0;
            for (T next : itemType.f23809d) {
                int i2 = i + 1;
                if (i >= 0) {
                    ItemTypeSelectItem itemTypeSelectItem = (ItemTypeSelectItem) next;
                    CollageRadioButton collageRadioButton = (CollageRadioButton) this.f28730d.get(i);
                    ViewExtensions.m12869m(collageRadioButton);
                    collageRadioButton.setText(itemTypeSelectItem.f23783b);
                    collageRadioButton.setChecked(itemTypeSelectItem.f23784c);
                    this.f28718f.put(collageRadioButton, itemTypeSelectItem);
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
        }
    }
}

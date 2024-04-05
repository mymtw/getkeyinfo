package p399me;

import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.ItemTypeSelectItem;
import com.etsy.android.stylekit.views.CollageRadioButton;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import kotlin.jvm.internal.C19383o;

/* renamed from: me.i */
public final class C13059i implements CollageRadioGroup.C9044a {

    /* renamed from: a */
    public final /* synthetic */ C13060j f28716a;

    public C13059i(C13060j jVar) {
        this.f28716a = jVar;
    }

    /* renamed from: a */
    public final void mo30994a(boolean z, CollageRadioButton collageRadioButton) {
        C19383o.m32797g(collageRadioButton, "selectedButton");
        ItemTypeSelectItem itemTypeSelectItem = (ItemTypeSelectItem) this.f28716a.f28718f.get(collageRadioButton);
        if (itemTypeSelectItem != null) {
            this.f28716a.f28717e.invoke(new C10813l.C10818e(itemTypeSelectItem));
        }
    }
}

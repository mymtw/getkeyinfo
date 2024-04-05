package p415of;

import android.view.ViewGroup;
import androidx.compose.foundation.layout.C0761x;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.BaseBackgroundColorFieldModel;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.CollectionV3;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.lib.models.interfaces.IFormattedListingCard;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.uikit.adapter.C11832c;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.viewholder.ListingCardUiModel;
import com.etsy.android.vespa.IVespaListSectionHeader;
import com.etsy.android.vespa.viewholders.C12086e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p357gf.C12796e;
import p487ya.C13895a;

/* renamed from: of.c */
public class C13173c extends C11832c<C13186o> implements C13180i {

    /* renamed from: c */
    public C13172b f28991c;

    /* renamed from: d */
    public final C13182k f28992d;

    /* renamed from: e */
    public boolean f28993e;

    /* renamed from: f */
    public boolean f28994f = false;

    /* renamed from: g */
    public C8703p f28995g;

    /* renamed from: h */
    public C13174a f28996h = new C13174a();

    /* renamed from: of.c$a */
    public class C13174a extends GridLayoutManager.C3075b {
        public C13174a() {
        }

        /* renamed from: d */
        public final int mo11265d(int i) {
            C13173c cVar = C13173c.this;
            return cVar.f28991c.mo33127g(cVar.getListItemViewType(i), i);
        }
    }

    public C13173c(Fragment fragment, C8703p pVar, C13182k kVar, C13895a aVar, C8923u uVar, C12796e eVar) {
        super(fragment.requireActivity());
        new WeakReference(fragment);
        this.f28995g = pVar;
        this.f28992d = kVar;
        this.f28991c = mo33108l(aVar, uVar, fragment, eVar);
    }

    /* renamed from: b */
    public void mo31298b(int i) {
        if (mo31808k()) {
            removeItem(i);
        }
    }

    public final int getListItemViewType(int i) {
        return this.f28991c.mo36216f((C13186o) getItems().get(i));
    }

    /* renamed from: i */
    public void mo31300i(int i) {
        notifyItemChanged(i);
    }

    /* renamed from: j */
    public final void mo45895j(C13184m mVar) {
        C13186o collection;
        if (mVar.getItems() != null && mVar.getItems().size() > 0) {
            if ((mVar.getPageLink() instanceof LandingPageLink) && (mVar.getHeader() instanceof IVespaListSectionHeader)) {
                ((LandingPageLink) mVar.getPageLink()).setPageTitle(((IVespaListSectionHeader) mVar.getHeader()).getTitle());
            }
            if (mVar.getHeader() != null) {
                if (!mVar.isNested() || !this.f28993e) {
                    if (!this.f28993e && (mVar.getHeader().getViewType() == R.id.view_type_section_header_with_page_link || mVar.getHeader().getViewType() == R.id.view_type_carded_section_header_with_page_link)) {
                        addItem(mVar.getHeaderWithViewAll());
                    } else if (!mVar.isNested() && !this.f28993e) {
                        addItem(mVar.getHeader());
                    }
                } else {
                    addItem(mVar.getHeader());
                }
            }
            if ((mVar.isHorizontal() || mVar.isNested()) && !this.f28993e) {
                addItem(mVar);
            } else if (mVar.getViewType() == R.id.view_type_related_link_tag) {
                addItem(mVar);
            } else if (mVar.getViewType() == R.id.view_type_formatted_topic_first_featured) {
                addItem(mVar);
            } else {
                for (C13186o next : mVar.getItems()) {
                    if (next instanceof BaseBackgroundColorFieldModel) {
                        ((BaseBackgroundColorFieldModel) next).setBackgroundColorTop(mVar.getBackgroundColor());
                    }
                    if (!(next instanceof ListingCard) || (next instanceof ListingCardUiModel)) {
                        if (next instanceof IFormattedListingCard) {
                            IFormattedListingCard iFormattedListingCard = (IFormattedListingCard) next;
                            if (!(iFormattedListingCard.getCard() instanceof ListingCardUiModel)) {
                                iFormattedListingCard.setCard(new ListingCardUiModel(iFormattedListingCard.getCard(), true, false, false));
                            }
                        } else if (next instanceof CollectionV3) {
                            collection = new Collection((CollectionV3) next);
                        }
                        addItem(next);
                    } else {
                        collection = new ListingCardUiModel((ListingCard) next, true, false, false);
                    }
                    next = collection;
                    addItem(next);
                }
                C13186o footer = mVar.getFooter();
                if (footer != null && !mVar.isHorizontal()) {
                    addItem(footer);
                }
            }
        }
    }

    /* renamed from: k */
    public boolean mo31808k() {
        return this.f28994f;
    }

    /* renamed from: l */
    public C13172b mo33108l(C13895a aVar, C8923u uVar, Fragment fragment, C12796e eVar) {
        C19383o.m32797g(fragment, "value");
        C8703p pVar = this.f28995g;
        C19383o.m32797g(pVar, "value");
        return new C13172b(new C13179h(fragment, pVar, this, this.f28992d));
    }

    /* renamed from: m */
    public GridLayoutManager.C3075b mo45896m() {
        return this.f28996h;
    }

    /* renamed from: n */
    public void mo31809n(C11869a aVar) {
        Object obj;
        if (aVar != null) {
            Class cls = C13186o.class;
            ArrayList arrayList = null;
            Object b = aVar.mo38345b("KEY_ADAPTER_ITEMS");
            List list = b instanceof List ? (List) b : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object next : list) {
                    try {
                        obj = cls.isPrimitive() ? C0761x.m1715d0(C19386q.m32807a(cls)).cast(next) : cls.cast(next);
                    } catch (ClassCastException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.size() == list.size()) {
                    arrayList = arrayList2;
                }
            }
            if (arrayList != null) {
                replaceList(arrayList);
            }
        }
    }

    /* renamed from: o */
    public void mo31810o(C11869a aVar) {
        if (aVar != null) {
            aVar.mo38349f("KEY_ADAPTER_ITEMS", getItems());
        }
    }

    public void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        int backgroundColorTop;
        if (b0Var instanceof C12086e) {
            C13186o oVar = (C13186o) getItems().get(i);
            ((C12086e) b0Var).mo19450a(oVar);
            if ((oVar instanceof BaseBackgroundColorFieldModel) && (backgroundColorTop = ((BaseBackgroundColorFieldModel) oVar).getBackgroundColorTop()) != 0) {
                b0Var.itemView.setBackgroundColor(backgroundColorTop);
            }
        }
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        return this.f28991c.mo31854b(viewGroup, i);
    }

    /* renamed from: p */
    public final void mo45897p(int i, C13171a aVar) {
        this.f28991c.mo45894i(i, aVar);
    }
}

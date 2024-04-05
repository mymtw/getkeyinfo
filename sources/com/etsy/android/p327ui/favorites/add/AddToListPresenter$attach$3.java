package com.etsy.android.p327ui.favorites.add;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p260v0.C8184a;
import p435rb.C13351b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListPresenter$attach$3 */
final class AddToListPresenter$attach$3 extends Lambda implements C19857l<List<? extends CheckableListingCollection>, C19394m> {
    public final /* synthetic */ boolean $isFavoriting;
    public final /* synthetic */ AddToListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToListPresenter$attach$3(AddToListPresenter addToListPresenter, boolean z) {
        super(1);
        this.this$0 = addToListPresenter;
        this.$isFavoriting = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends CheckableListingCollection>) (List) obj);
        return C19394m.f43287a;
    }

    public final void invoke(List<? extends CheckableListingCollection> list) {
        boolean z;
        T t;
        boolean z2;
        AddToListPresenter addToListPresenter = this.this$0;
        C19383o.m32796f(list, "collections");
        boolean z3 = this.$isFavoriting;
        if (addToListPresenter.f21551a.getView() != null) {
            Set<T> t1 = C19327t.m32664t1(list);
            C19383o.m32797g(t1, "allCollections");
            if (!t1.isEmpty()) {
                Iterator<T> it = t1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CheckableListingCollection checkableListingCollection = (CheckableListingCollection) it.next();
                    if (!checkableListingCollection.getIsChecked() || !checkableListingCollection.isTypeCollection()) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            ((CollageHeadingTextView) addToListPresenter.f21551a._$_findCachedViewById(R.id.add_list_title)).setText(z3 ? R.string.saved_to_favs : z ? R.string.manage_favorites : R.string.add_to_collection_prompt);
            if (z3) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it2.next();
                    if (((CheckableListingCollection) t).isTypeFavorites()) {
                        break;
                    }
                }
                CheckableListingCollection checkableListingCollection2 = (CheckableListingCollection) t;
                if (checkableListingCollection2 != null) {
                    Context requireContext = addToListPresenter.f21551a.requireContext();
                    int icon = checkableListingCollection2.getPrivacyLevel().getIcon();
                    Object obj = C8184a.f17966a;
                    Drawable b = C8184a.C8187c.m16466b(requireContext, icon);
                    if (b != null) {
                        b.setBounds(0, 0, addToListPresenter.f21551a.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller), addToListPresenter.f21551a.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller));
                    }
                    TextView textView = (TextView) addToListPresenter.f21551a._$_findCachedViewById(R.id.subtitle);
                    C19383o.m32796f(textView, "fragment.subtitle");
                    C13351b.m21020d(textView, b, (Drawable) null, 14);
                    ((TextView) addToListPresenter.f21551a._$_findCachedViewById(R.id.subtitle)).setText(addToListPresenter.f21551a.getString(checkableListingCollection2.getPrivacyLevel().getLabel()));
                    ViewExtensions.m12869m((TextView) addToListPresenter.f21551a._$_findCachedViewById(R.id.subtitle));
                }
            }
        }
        AddToListAdapter addToListAdapter = this.this$0.f21558h;
        if (addToListAdapter != null) {
            if (this.$isFavoriting) {
                ArrayList arrayList = new ArrayList();
                for (T next : list) {
                    if (!((CheckableListingCollection) next).isTypeFavorites()) {
                        arrayList.add(next);
                    }
                }
                list = arrayList;
            }
            addToListAdapter.f21545e = list;
            addToListAdapter.notifyDataSetChanged();
            return;
        }
        C19383o.m32805o("adapter");
        throw null;
    }
}

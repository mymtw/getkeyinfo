package p155j9;

import androidx.appcompat.widget.SearchView;
import com.etsy.android.lib.models.apiv3.vespa.SearchBar;
import kotlin.collections.C19294b0;
import p415of.C13191t;

/* renamed from: j9.b */
public final class C7157b implements SearchView.C0283l {

    /* renamed from: b */
    public final /* synthetic */ SearchBar f15922b;

    /* renamed from: c */
    public final /* synthetic */ C7158c f15923c;

    public C7157b(SearchBar searchBar, C7158c cVar) {
        this.f15922b = searchBar;
        this.f15923c = cVar;
    }

    public final boolean onQueryTextChange(String str) {
        return false;
    }

    public final boolean onQueryTextSubmit(String str) {
        String listSectionAnalyticsName;
        C13191t metadataProvider = this.f15922b.getMetadataProvider();
        if (metadataProvider == null || (listSectionAnalyticsName = metadataProvider.getListSectionAnalyticsName()) == null) {
            return false;
        }
        this.f15923c.f26962b.mo21333d(listSectionAnalyticsName, C19294b0.m32559p0());
        return false;
    }
}

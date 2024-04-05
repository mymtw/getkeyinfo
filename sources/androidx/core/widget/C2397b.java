package androidx.core.widget;

import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import p587ii.C17840a;
import p726zi.C18917l;

/* renamed from: androidx.core.widget.b */
public final /* synthetic */ class C2397b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f5677b;

    /* renamed from: c */
    public final /* synthetic */ Object f5678c;

    public /* synthetic */ C2397b(Object obj, int i) {
        this.f5677b = i;
        this.f5678c = obj;
    }

    public final void run() {
        switch (this.f5677b) {
            case 0:
                ((ContentLoadingProgressBar) this.f5678c).showOnUiThread();
                return;
            case 1:
                SearchResultsListingsFragment.m35046showSaveSearchOnboardingPrompt$lambda21$lambda20((SearchResultsListingsFragment) this.f5678c);
                return;
            case 2:
                DefaultDrmSessionManager.C14210d dVar = (DefaultDrmSessionManager.C14210d) this.f5678c;
                if (!dVar.f31557d) {
                    DrmSession drmSession = dVar.f31556c;
                    if (drmSession != null) {
                        drmSession.mo47274b(dVar.f31555b);
                    }
                    DefaultDrmSessionManager.this.f31542o.remove(dVar);
                    dVar.f31557d = true;
                    return;
                }
                return;
            case 3:
                ((C17840a) this.f5678c).getClass();
                throw null;
            default:
                ((C18917l) this.f5678c).mo70352i(2);
                return;
        }
    }
}

package p439rf;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.network.oauth2.signin.C8778g;
import com.etsy.android.vespa.viewholders.C12100o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: rf.a */
public final class C13362a extends RecyclerView.C3108s {

    /* renamed from: b */
    public int f29291b = 0;

    /* renamed from: c */
    public C8778g f29292c;

    /* renamed from: d */
    public int f29293d;

    public C13362a(C8778g gVar) {
        this.f29292c = gVar;
        this.f29293d = -1;
    }

    /* renamed from: a */
    public final void mo46050a(RecyclerView recyclerView) {
        RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
        int i = -1;
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                i = linearLayoutManager.mo11283T0();
            }
        }
        if (this.f29293d != i) {
            C8778g gVar = this.f29292c;
            if (gVar != null) {
                C12100o oVar = (C12100o) gVar.f19320b;
                if (i < 0) {
                    int i2 = C12100o.f26986k;
                    oVar.getClass();
                } else if (oVar.f26990f.getItem(i) instanceof BaseModel) {
                    BaseModel baseModel = (BaseModel) oVar.f26990f.getItem(i);
                    if (!baseModel.getTrackingName().isEmpty()) {
                        oVar.f26993i.mo21333d(baseModel.getTrackingName() + "_viewed", C19388s.m32882r0(baseModel));
                    }
                }
            }
            this.f29293d = i;
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C19383o.m32797g(recyclerView, "recyclerView");
        if (this.f29291b == 0 && i == 0) {
            mo46050a(recyclerView);
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C19383o.m32797g(recyclerView, "recyclerView");
        if (this.f29291b == 1) {
            mo46050a(recyclerView);
        }
    }
}

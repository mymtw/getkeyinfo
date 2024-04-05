package p461uf;

import androidx.activity.C0114h;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.gms.measurement.internal.C14921a0;
import com.google.android.gms.measurement.internal.C15055p;
import p383ke.C12995a;
import p772tq.C20203a;

/* renamed from: uf.j */
public final class C13516j implements FetchedAppSettingsManager.C12257a {
    /* renamed from: a */
    public final void mo39393a() {
    }

    public final void onSuccess() {
        FeatureManager.m20098a(C14921a0.f33259c, FeatureManager.Feature.AAM);
        FeatureManager.m20098a(C0114h.f187x, FeatureManager.Feature.RestrictiveDataFiltering);
        FeatureManager.m20098a(C20203a.f44787q, FeatureManager.Feature.PrivacyProtection);
        FeatureManager.m20098a(C12995a.f28613i, FeatureManager.Feature.EventDeactivation);
        FeatureManager.m20098a(C15055p.f33740c, FeatureManager.Feature.IapLogging);
    }
}

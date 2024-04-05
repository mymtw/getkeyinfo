package androidx.preference;

import androidx.preference.Preference;
import com.google.android.gms.common.api.Api;

/* renamed from: androidx.preference.d */
public final class C3043d implements Preference.C3010d {

    /* renamed from: b */
    public final /* synthetic */ PreferenceGroup f6928b;

    /* renamed from: c */
    public final /* synthetic */ C3040c f6929c;

    public C3043d(C3040c cVar, PreferenceGroup preferenceGroup) {
        this.f6929c = cVar;
        this.f6928b = preferenceGroup;
    }

    /* renamed from: g */
    public final boolean mo412g(Preference preference) {
        this.f6928b.mo11153R(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        C3040c cVar = this.f6929c;
        cVar.f6922f.removeCallbacks(cVar.f6923g);
        cVar.f6922f.post(cVar.f6923g);
        this.f6928b.getClass();
        return true;
    }
}

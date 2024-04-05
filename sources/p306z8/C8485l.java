package p306z8;

import androidx.preference.Preference;
import com.etsy.android.config.PrefsFragment;

/* renamed from: z8.l */
public final /* synthetic */ class C8485l implements Preference.C3010d {

    /* renamed from: b */
    public final /* synthetic */ PrefsFragment f18515b;

    /* renamed from: c */
    public final /* synthetic */ Preference f18516c;

    public /* synthetic */ C8485l(PrefsFragment prefsFragment, Preference preference) {
        this.f18515b = prefsFragment;
        this.f18516c = preference;
    }

    /* renamed from: g */
    public final boolean mo412g(Preference preference) {
        return PrefsFragment.m34857addResetInAppReviewPromptTimeoutPref$lambda5$lambda4(this.f18515b, this.f18516c, preference);
    }
}

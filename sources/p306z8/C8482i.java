package p306z8;

import androidx.preference.Preference;
import com.etsy.android.config.PrefsFragment;

/* renamed from: z8.i */
public final /* synthetic */ class C8482i implements Preference.C3010d {

    /* renamed from: b */
    public final /* synthetic */ PrefsFragment f18508b;

    /* renamed from: c */
    public final /* synthetic */ Preference f18509c;

    public /* synthetic */ C8482i(PrefsFragment prefsFragment, Preference preference) {
        this.f18508b = prefsFragment;
        this.f18509c = preference;
    }

    /* renamed from: g */
    public final boolean mo412g(Preference preference) {
        return PrefsFragment.m34856addPushOptInPrefs$lambda8$lambda7(this.f18508b, this.f18509c, preference);
    }
}

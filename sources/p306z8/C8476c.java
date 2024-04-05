package p306z8;

import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.config.PrefsFragment;

/* renamed from: z8.c */
public final /* synthetic */ class C8476c implements Preference.C3010d, Preference.C3009c {

    /* renamed from: b */
    public final /* synthetic */ Object f18501b;

    public /* synthetic */ C8476c(Object obj) {
        this.f18501b = obj;
    }

    /* renamed from: g */
    public final boolean mo412g(Preference preference) {
        return ConfigPreferencesHelper.m34845setUpSendAllLogsPreference$lambda11((ConfigPreferencesHelper) this.f18501b, preference);
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return PrefsFragment.m34859getUpdatesTimeToDelayPref$lambda20$lambda19((PrefsFragment) this.f18501b, preference, obj);
    }
}

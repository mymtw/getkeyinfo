package p425q9;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.datastore.preferences.protobuf.C2606m;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.network.oauth2.XAuthAccessToken;

/* renamed from: q9.t */
public final class C13270t extends C2606m {
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: d0 */
    public final boolean mo45962d0() {
        SharedPreferences sharedPreferences = EtsyApplication.get().getSharedPreferences("EtsyPrefs", 0);
        boolean contains = sharedPreferences.contains("EtsyApiAccessTokenetsyAccessToken");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("EtsyApiAccessTokenetsyAccessToken");
        edit.remove("EtsyApiAccessTokenetsyAccessSecret");
        edit.commit();
        return contains;
    }

    /* renamed from: e0 */
    public final XAuthAccessToken mo45963e0() {
        SharedPreferences sharedPreferences = EtsyApplication.get().getSharedPreferences("EtsyPrefs", 0);
        String string = sharedPreferences.getString("EtsyApiAccessTokenetsyAccessToken", "");
        String string2 = sharedPreferences.getString("EtsyApiAccessTokenetsyAccessSecret", "");
        if (string.equals("") || string2.equals("")) {
            return null;
        }
        return new XAuthAccessToken(string, string2, "");
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: f0 */
    public final void mo45964f0(XAuthAccessToken xAuthAccessToken) {
        SharedPreferences.Editor edit = EtsyApplication.get().getSharedPreferences("EtsyPrefs", 0).edit();
        edit.putString("EtsyApiAccessTokenetsyAccessToken", xAuthAccessToken.getXAuthToken());
        edit.putString("EtsyApiAccessTokenetsyAccessSecret", xAuthAccessToken.getXAuthTokenSecret());
        edit.commit();
    }
}

package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class SharedPreferencesMigration$4 extends Lambda implements C19846a<SharedPreferences> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $sharedPreferencesName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration$4(Context context, String str) {
        super(0);
        this.$context = context;
        this.$sharedPreferencesName = str;
    }

    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$sharedPreferencesName, 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}

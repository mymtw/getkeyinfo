package p291y3;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.play.core.assetpacks.C15631n0;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import java.util.concurrent.Executor;
import p291y3.C8371b;

/* renamed from: y3.d */
public final class C8375d {

    /* renamed from: y3.d$a */
    public static class C8376a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ SharedPreferences f18363b;

        /* renamed from: c */
        public final /* synthetic */ boolean f18364c;

        /* renamed from: d */
        public final /* synthetic */ Context f18365d;

        /* renamed from: e */
        public final /* synthetic */ int f18366e;

        /* renamed from: y3.d$a$a */
        public class C8377a implements C8371b.C8372a {
            public C8377a() {
            }

            /* renamed from: a */
            public final void mo18908a(C8382g gVar) {
                if (!TextUtils.isEmpty(gVar.f18378d)) {
                    C8371b.C8372a aVar = C8371b.f18351h.f18358f;
                    if (aVar != null) {
                        aVar.mo18908a(gVar);
                    }
                    C8376a.this.f18363b.edit().putBoolean("bitly.should.check.deeplink", false).apply();
                }
            }

            /* renamed from: b */
            public final void mo18909b(C15631n0 n0Var) {
                C8371b.C8372a aVar = C8371b.f18351h.f18358f;
                if (aVar != null) {
                    aVar.mo18909b(n0Var);
                }
            }
        }

        /* renamed from: y3.d$a$b */
        public class C8378b implements C8379b {
            public C8378b() {
            }
        }

        public C8376a(SharedPreferences sharedPreferences, boolean z, Context context, int i) {
            this.f18363b = sharedPreferences;
            this.f18364c = z;
            this.f18365d = context;
            this.f18366e = i;
        }

        public final void run() {
            Log.d("BitlySDK", "Bitly SDK deeplink call started");
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(C8371b.f18352i)) {
                C8371b.f18352i = "https://bit.ly/";
            }
            sb.append(C8371b.f18352i);
            sb.append("v3/deferred_deeplink/lookup");
            C8380e eVar = new C8380e(Uri.parse(sb.toString()).buildUpon().appendQueryParameter("app_id", C8371b.f18351h.f18353a).appendQueryParameter(EventsNameKt.DEVICE_ID, C8371b.f18351h.f18354b).appendQueryParameter("device_id_type", "android").build(), new C8377a(), new C8378b(), (String) null, (String) null);
            Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
            if (executor != null) {
                eVar.executeOnExecutor(executor, new Void[0]);
            } else {
                eVar.execute(new Void[0]);
            }
        }
    }

    /* renamed from: y3.d$b */
    public interface C8379b {
    }

    /* renamed from: a */
    public static void m16722a(Context context, int i, boolean z) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        long j = (long) i;
        if (j <= 8000 && defaultSharedPreferences.getBoolean("bitly.should.check.deeplink", true)) {
            new Handler().postDelayed(new C8376a(defaultSharedPreferences, z, context, i), j);
        } else if (defaultSharedPreferences.getBoolean("bitly.should.check.deeplink", true)) {
            Log.d("BitlySDK", "Bitly SDK found no deeplink");
        }
    }
}

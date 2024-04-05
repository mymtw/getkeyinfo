package p673sl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.splitinstall.zzo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p639ol.C18316c;

/* renamed from: sl.m */
public final class C18533m extends C18316c {

    /* renamed from: j */
    public static C18533m f40801j;

    /* renamed from: g */
    public final Handler f40802g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public final C18526f f40803h;

    /* renamed from: i */
    public final LinkedHashSet f40804i = new LinkedHashSet();

    public C18533m(Context context, zzo zzo) {
        super(new C15032m3("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f40803h = zzo;
    }

    /* renamed from: a */
    public final void mo55341a(Context context, Intent intent) {
        Intent intent2 = intent;
        Bundle bundleExtra = intent2.getBundleExtra("session_state");
        if (bundleExtra != null) {
            C18524d dVar = new C18524d(bundleExtra.getInt("session_id"), bundleExtra.getInt(ResponseConstants.STATUS), bundleExtra.getInt("error_code"), bundleExtra.getLong("bytes_downloaded"), bundleExtra.getLong("total_bytes_to_download"), bundleExtra.getStringArrayList("module_names"), bundleExtra.getStringArrayList(ResponseConstants.LANGUAGES), (PendingIntent) bundleExtra.getParcelable("user_confirmation_intent"), bundleExtra.getParcelableArrayList("split_file_intents"));
            this.f40209a.mo52242b("ListenerRegistryBroadcastReceiver.onReceive: %s", dVar);
            C18527g zza = this.f40803h.zza();
            if (dVar.f40782b != 3 || zza == null) {
                mo70048f(dVar);
            } else {
                zza.mo55527a(dVar.f40789i, new C18531k(this, dVar, intent2, context));
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo70048f(C18524d dVar) {
        Iterator it = new LinkedHashSet(this.f40804i).iterator();
        while (it.hasNext()) {
            ((C18523c) it.next()).mo31232a(dVar);
        }
        mo69856e(dVar);
    }
}

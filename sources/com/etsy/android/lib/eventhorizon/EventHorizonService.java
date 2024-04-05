package com.etsy.android.lib.eventhorizon;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8694h;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p337de.tavendo.autobahn.WebSocketException;
import p337de.tavendo.autobahn.WebSocketWriter;
import p495z9.C13942a;
import p628nj.C18263b;
import p652pp.C18432k;
import p652pp.C18436n;

@SuppressLint({"Registered"})
public class EventHorizonService extends Service {
    private C18432k mConnection;
    private String mServerUrl;

    /* renamed from: com.etsy.android.lib.eventhorizon.EventHorizonService$a */
    public class C8661a extends C15588c1 {
        /* renamed from: B0 */
        public final void mo21278B0(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C8694h hVar = C8694h.f19097a;
                hVar.mo21312f("payload" + str);
                C13942a.m21473a(jSONObject);
            } catch (JSONException e) {
                C8694h.f19097a.mo21309d(e.toString(), e);
            }
        }
    }

    public void connect() {
        C18432k kVar = new C18432k();
        this.mConnection = kVar;
        try {
            kVar.mo69964b(this.mServerUrl, new C8661a());
            C8694h hVar = C8694h.f19097a;
            hVar.mo21310e("Connected successfully to " + this.mServerUrl);
        } catch (WebSocketException e) {
            C8694h.f19097a.mo21309d(e.getLocalizedMessage(), e);
        }
    }

    public void disconnect() {
        WebSocketWriter webSocketWriter = this.mConnection.f40529c;
        if (webSocketWriter != null) {
            webSocketWriter.forward(new C18436n(0));
        } else {
            Log.d("pp.k", "could not send Close .. writer already NULL");
        }
        C8694h hVar = C8694h.f19097a;
        StringBuilder h = C0072d.m201h("Disconnected successfully from ");
        h.append(this.mServerUrl);
        hVar.mo21310e(h.toString());
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        StringBuilder sb = new StringBuilder();
        List<String> list = C8591a.f18700r;
        sb.append(C18263b.f40056T.f18706f.mo21136f(C8592b.f18831t0));
        sb.append("?sample_rate=100");
        this.mServerUrl = sb.toString();
        connect();
    }

    public void onDestroy() {
        disconnect();
        super.onDestroy();
    }
}

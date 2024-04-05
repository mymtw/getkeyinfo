package com.paypal.pyplcheckout.flavorauth;

import android.content.Context;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lib.android.paypal.com.magnessdk.InvalidInputException;
import lib.android.paypal.com.magnessdk.MagnesSource;
import p770sq.C20167a;
import p770sq.C20168b;
import p770sq.C20169c;

public class FoundationRiskConfig {
    private static final String TAG = "FoundationRiskConfig";
    private final String appVersion = "v1.0NativeXO";
    private final Context context;
    private C20167a magnesResult;
    private C20169c magnesSettings;
    private boolean riskInitialized = false;
    private String riskPayload;
    private MagnesSource sourceApp = MagnesSource.PAYPAL;

    public FoundationRiskConfig(Context context2) {
        Objects.requireNonNull(context2);
        this.context = context2;
        initRisk();
    }

    private void generateNewPairingId(String str, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        try {
            this.magnesResult = C20168b.m34473c().mo74414b(this.context, str, (HashMap) map);
        } catch (InvalidInputException e) {
            PLog.m28733eR(TAG, "Exception has occurred when trying to generate PayPal-Client-Metadata-Id", e);
        }
    }

    public void generatePairingIdAndNotifyDyson() {
        generateNewPairingId((String) null, (Map<String, String>) null);
    }

    public String getDysonPairingId() {
        return this.magnesResult.f44664b;
    }

    public String getRiskPayload() {
        return this.magnesResult.f44663a.toString();
    }

    public MagnesSource getSourceApp() {
        return this.sourceApp;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void initRisk() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.riskInitialized     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x003c
            lib.android.paypal.com.magnessdk.MagnesSource r0 = r3.sourceApp     // Catch:{ all -> 0x003e }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x003e }
            sq.c$a r0 = new sq.c$a     // Catch:{ all -> 0x003e }
            android.content.Context r1 = r3.context     // Catch:{ all -> 0x003e }
            r0.<init>(r1)     // Catch:{ all -> 0x003e }
            lib.android.paypal.com.magnessdk.MagnesSource r1 = r3.sourceApp     // Catch:{ all -> 0x003e }
            int r1 = r1.getVersion()     // Catch:{ all -> 0x003e }
            r0.f44675a = r1     // Catch:{ all -> 0x003e }
            sq.c r1 = new sq.c     // Catch:{ all -> 0x003e }
            r1.<init>(r0)     // Catch:{ all -> 0x003e }
            r3.magnesSettings = r1     // Catch:{ all -> 0x003e }
            sq.b r0 = p770sq.C20168b.m34473c()     // Catch:{ all -> 0x003e }
            sq.c r1 = r3.magnesSettings     // Catch:{ all -> 0x003e }
            r0.mo74415d(r1)     // Catch:{ all -> 0x003e }
            sq.b r0 = p770sq.C20168b.m34473c()     // Catch:{ all -> 0x003e }
            android.content.Context r1 = r3.context     // Catch:{ all -> 0x003e }
            r0.getClass()     // Catch:{ all -> 0x003e }
            r2 = 0
            sq.a r2 = r0.mo74413a(r1, r2, r2)     // Catch:{ InvalidInputException -> 0x0037 }
        L_0x0037:
            r3.magnesResult = r2     // Catch:{ all -> 0x003e }
            r0 = 1
            r3.riskInitialized = r0     // Catch:{ all -> 0x003e }
        L_0x003c:
            monitor-exit(r3)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.flavorauth.FoundationRiskConfig.initRisk():void");
    }

    @Deprecated
    public void sendRiskDataToDyson(String str) {
        generatePairingIdAndNotifyDyson(str);
    }

    @Deprecated
    public void setSourceApp(MagnesSource magnesSource) {
        Objects.requireNonNull(magnesSource);
        this.sourceApp = magnesSource;
    }

    public void generatePairingIdAndNotifyDyson(String str) {
        generateNewPairingId(str, (Map<String, String>) null);
    }

    @Deprecated
    public void sendRiskDataToDyson(String str, Map<String, String> map) {
        if (str != null) {
            generatePairingIdAndNotifyDyson(str, map);
        }
    }

    public void generatePairingIdAndNotifyDyson(Map<String, String> map) {
        generateNewPairingId((String) null, map);
    }

    public void generatePairingIdAndNotifyDyson(String str, Map<String, String> map) {
        generateNewPairingId(str, map);
    }
}

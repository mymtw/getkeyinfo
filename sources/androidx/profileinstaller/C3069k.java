package androidx.profileinstaller;

/* renamed from: androidx.profileinstaller.k */
public final /* synthetic */ class C3069k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6987b;

    /* renamed from: c */
    public final /* synthetic */ Object f6988c;

    public /* synthetic */ C3069k(Object obj, int i) {
        this.f6987b = i;
        this.f6988c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00dc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = r0.f20550c.f20543a;
        r4 = r0.f20548a;
        kotlin.jvm.internal.C19383o.m32794d(r4);
        r4 = r4.getContext();
        kotlin.jvm.internal.C19383o.m32796f(r4, "mWebView!!.context");
        r5 = r0.f20550c.f20545c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00f6, code lost:
        if (r5 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00f8, code lost:
        r5 = r5.getCartId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00fd, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ff, code lost:
        r1.mo31653b(413, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x010b, code lost:
        r0 = r0.f20549b;
        kotlin.jvm.internal.C19383o.m32794d(r0);
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0113, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00de */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f6987b
            r1 = 0
            switch(r0) {
                case 0: goto L_0x012f;
                case 1: goto L_0x0114;
                case 2: goto L_0x0012;
                case 3: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x013e
        L_0x0008:
            java.lang.Object r0 = r7.f6988c
            com.google.android.exoplayer2.source.hls.m$a r0 = (com.google.android.exoplayer2.source.hls.C14325m.C14326a) r0
            com.google.android.exoplayer2.source.hls.k r0 = (com.google.android.exoplayer2.source.hls.C14323k) r0
            r0.mo47735r()
            return
        L_0x0012:
            java.lang.Object r0 = r7.f6988c
            com.etsy.android.ui.cart.googlepay.f r0 = (com.etsy.android.p327ui.cart.googlepay.C9308f) r0
            java.lang.String r2 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            com.etsy.android.ui.cart.googlepay.f$a r2 = r0.f20546d
            android.view.View r2 = r2.f20549b
            kotlin.jvm.internal.C19383o.m32794d(r2)
            r2.setVisibility(r1)
            com.etsy.android.ui.cart.googlepay.f$a r0 = r0.f20546d
            r0.getClass()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.etsy.android.ui.cart.googlepay.f r2 = com.etsy.android.p327ui.cart.googlepay.C9308f.this
            xb.b r2 = r2.f20544b
            kotlin.jvm.internal.C19383o.m32794d(r2)
            xb.a r2 = r2.f30529i
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r2 == 0) goto L_0x0070
            java.lang.String r4 = r2.f30520i
            java.lang.String r5 = "billing_address[country_code]"
            r3.put(r5, r4)
            java.lang.String r4 = r2.f30512a
            java.lang.String r5 = "billing_address[name]"
            r3.put(r5, r4)
            java.lang.String r4 = r2.f30513b
            java.lang.String r5 = "billing_address[first_line]"
            r3.put(r5, r4)
            java.lang.String r4 = r2.f30514c
            java.lang.String r5 = "billing_address[second_line]"
            r3.put(r5, r4)
            java.lang.String r4 = r2.f30518g
            java.lang.String r5 = "billing_address[city]"
            r3.put(r5, r4)
            java.lang.String r4 = r2.f30519h
            java.lang.String r5 = "billing_address[state]"
            r3.put(r5, r4)
            java.lang.String r2 = r2.f30516e
            java.lang.String r4 = "billing_address[zip]"
            r3.put(r4, r2)
        L_0x0070:
            r2 = 8
            com.etsy.android.ui.cart.googlepay.f r4 = com.etsy.android.p327ui.cart.googlepay.C9308f.this     // Catch:{ JSONException -> 0x00de }
            xb.b r4 = r4.f20544b     // Catch:{ JSONException -> 0x00de }
            kotlin.jvm.internal.C19383o.m32794d(r4)     // Catch:{ JSONException -> 0x00de }
            xb.c r4 = r4.f30526f     // Catch:{ JSONException -> 0x00de }
            java.lang.String r5 = "cryptogram_message"
            java.lang.String r6 = r4.f30530a     // Catch:{ JSONException -> 0x00de }
            r1.put(r5, r6)     // Catch:{ JSONException -> 0x00de }
            java.lang.String r5 = "cryptogram_epk"
            java.lang.String r6 = r4.f30531b     // Catch:{ JSONException -> 0x00de }
            r1.put(r5, r6)     // Catch:{ JSONException -> 0x00de }
            java.lang.String r5 = "cryptogram_tag"
            java.lang.String r4 = r4.f30532c     // Catch:{ JSONException -> 0x00de }
            r1.put(r5, r4)     // Catch:{ JSONException -> 0x00de }
            java.util.Set r4 = r3.keySet()     // Catch:{ JSONException -> 0x00de }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x00de }
        L_0x0098:
            boolean r5 = r4.hasNext()     // Catch:{ JSONException -> 0x00de }
            if (r5 == 0) goto L_0x00ac
            java.lang.Object r5 = r4.next()     // Catch:{ JSONException -> 0x00de }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x00de }
            java.lang.Object r6 = r3.get(r5)     // Catch:{ JSONException -> 0x00de }
            r1.put(r5, r6)     // Catch:{ JSONException -> 0x00de }
            goto L_0x0098
        L_0x00ac:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00de }
            r3.<init>()     // Catch:{ JSONException -> 0x00de }
            java.lang.String r4 = "Etsy.GooglePay.submitOrder("
            r3.append(r4)     // Catch:{ JSONException -> 0x00de }
            r3.append(r1)     // Catch:{ JSONException -> 0x00de }
            java.lang.String r1 = ");"
            r3.append(r1)     // Catch:{ JSONException -> 0x00de }
            java.lang.String r1 = r3.toString()     // Catch:{ JSONException -> 0x00de }
            android.webkit.WebView r3 = r0.f20548a     // Catch:{ JSONException -> 0x00de }
            kotlin.jvm.internal.C19383o.m32794d(r3)     // Catch:{ JSONException -> 0x00de }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00de }
            r4.<init>()     // Catch:{ JSONException -> 0x00de }
            java.lang.String r5 = "javascript:"
            r4.append(r5)     // Catch:{ JSONException -> 0x00de }
            r4.append(r1)     // Catch:{ JSONException -> 0x00de }
            java.lang.String r1 = r4.toString()     // Catch:{ JSONException -> 0x00de }
            r3.loadUrl(r1)     // Catch:{ JSONException -> 0x00de }
            goto L_0x0102
        L_0x00dc:
            r1 = move-exception
            goto L_0x010b
        L_0x00de:
            com.etsy.android.ui.cart.googlepay.f r1 = com.etsy.android.p327ui.cart.googlepay.C9308f.this     // Catch:{ all -> 0x00dc }
            com.etsy.android.ui.cart.googlepay.a r1 = r1.f20543a     // Catch:{ all -> 0x00dc }
            r3 = 413(0x19d, float:5.79E-43)
            android.webkit.WebView r4 = r0.f20548a     // Catch:{ all -> 0x00dc }
            kotlin.jvm.internal.C19383o.m32794d(r4)     // Catch:{ all -> 0x00dc }
            android.content.Context r4 = r4.getContext()     // Catch:{ all -> 0x00dc }
            java.lang.String r5 = "mWebView!!.context"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)     // Catch:{ all -> 0x00dc }
            com.etsy.android.ui.cart.googlepay.f r5 = com.etsy.android.p327ui.cart.googlepay.C9308f.this     // Catch:{ all -> 0x00dc }
            com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract r5 = r5.f20545c     // Catch:{ all -> 0x00dc }
            if (r5 == 0) goto L_0x00fd
            long r5 = r5.getCartId()     // Catch:{ all -> 0x00dc }
            goto L_0x00ff
        L_0x00fd:
            r5 = 0
        L_0x00ff:
            r1.mo31653b(r3, r4, r5)     // Catch:{ all -> 0x00dc }
        L_0x0102:
            android.view.View r0 = r0.f20549b
            kotlin.jvm.internal.C19383o.m32794d(r0)
            r0.setVisibility(r2)
            return
        L_0x010b:
            android.view.View r0 = r0.f20549b
            kotlin.jvm.internal.C19383o.m32794d(r0)
            r0.setVisibility(r2)
            throw r1
        L_0x0114:
            java.lang.Object r0 = r7.f6988c
            androidx.room.n r0 = (androidx.room.C3244n) r0
            monitor-enter(r0)
            r0.f7547f = r1     // Catch:{ all -> 0x012c }
            androidx.room.n$b r2 = r0.f7549h     // Catch:{ all -> 0x012c }
            monitor-enter(r2)     // Catch:{ all -> 0x012c }
            boolean[] r3 = r2.f7555b     // Catch:{ all -> 0x0129 }
            java.util.Arrays.fill(r3, r1)     // Catch:{ all -> 0x0129 }
            r1 = 1
            r2.f7557d = r1     // Catch:{ all -> 0x0129 }
            monitor-exit(r2)     // Catch:{ all -> 0x0129 }
            monitor-exit(r0)     // Catch:{ all -> 0x012c }
            return
        L_0x0129:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0129 }
            throw r1     // Catch:{ all -> 0x012c }
        L_0x012c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012c }
            throw r1
        L_0x012f:
            java.lang.Object r0 = r7.f6988c
            android.content.Context r0 = (android.content.Context) r0
            androidx.profileinstaller.e r2 = new androidx.profileinstaller.e
            r2.<init>()
            androidx.profileinstaller.h$a r3 = androidx.profileinstaller.C3063h.f6980a
            androidx.profileinstaller.C3063h.m7230b(r0, r2, r3, r1)
            return
        L_0x013e:
            java.lang.Object r0 = r7.f6988c
            android.view.View r0 = (android.view.View) r0
            com.paypal.pyplcheckout.utils.AccessibilityUtilsKt.m35461requestAccessibilityFocusDelayed$lambda0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.C3069k.run():void");
    }
}

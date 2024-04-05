package p433r9;

import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.logger.C8694h;
import com.fasterxml.jackson.core.JsonParser;
import com.paypal.android.platform.authsdk.splitlogin.tracking.SplitLoginAnalyticsManagerKt;
import java.io.IOException;
import p425q9.C13254f;
import p425q9.C13255g;

@Deprecated
/* renamed from: r9.a */
public final class C13332a<Result> extends C13254f<Result> {

    /* renamed from: h */
    public String f29258h;

    public C13332a(C13255g gVar, Class<Result> cls) {
        super(gVar, cls);
        if (this.f29258h == null) {
            this.f29258h = "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x004d A[EDGE_INSN: B:38:0x004d->B:17:0x004d ?: BREAK  , SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45946f() {
        /*
            r5 = this;
            super.mo45946f()
            byte[] r0 = r5.mo46068a()
            if (r0 == 0) goto L_0x0085
            byte[] r0 = r5.mo46068a()
            java.lang.String r1 = "couldn't close JsonParser - ignoring"
            r2 = 0
            q9.i r3 = p425q9.C13258i.f29122d     // Catch:{ IOException -> 0x005b }
            com.fasterxml.jackson.core.JsonParser r2 = r3.mo45955a(r0)     // Catch:{ IOException -> 0x005b }
            r2.nextToken()     // Catch:{ IOException -> 0x005b }
        L_0x0019:
            com.fasterxml.jackson.core.JsonToken r0 = r2.nextToken()     // Catch:{ IOException -> 0x005b }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ IOException -> 0x005b }
            if (r0 == r3) goto L_0x004d
            java.lang.String r0 = r2.getCurrentName()     // Catch:{ IOException -> 0x005b }
            r2.nextToken()     // Catch:{ IOException -> 0x005b }
            java.lang.String r3 = "error"
            boolean r3 = r3.equals(r0)     // Catch:{ IOException -> 0x005b }
            if (r3 != 0) goto L_0x0045
            java.lang.String r3 = "error_message"
            boolean r3 = r3.equals(r0)     // Catch:{ IOException -> 0x005b }
            if (r3 != 0) goto L_0x0045
            java.lang.String r3 = "error_msg"
            boolean r3 = r3.equals(r0)     // Catch:{ IOException -> 0x005b }
            if (r3 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            r2.skipChildren()     // Catch:{ IOException -> 0x005b }
            goto L_0x004b
        L_0x0045:
            java.lang.String r3 = r2.getValueAsString()     // Catch:{ IOException -> 0x005b }
            r5.f29114d = r3     // Catch:{ IOException -> 0x005b }
        L_0x004b:
            if (r0 != 0) goto L_0x0019
        L_0x004d:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0085
        L_0x0053:
            r2.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x0085
        L_0x0057:
            r0 = move-exception
            goto L_0x006c
        L_0x0059:
            r0 = move-exception
            goto L_0x0072
        L_0x005b:
            r0 = move-exception
            com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.C8694h.f19097a     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = "parseResponseData NEW error"
            r3.mo21309d(r4, r0)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0085
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0085
            goto L_0x0053
        L_0x006c:
            com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.C8694h.f19097a
            r2.mo21309d(r1, r0)
            goto L_0x0085
        L_0x0072:
            if (r2 == 0) goto L_0x0084
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0084
        L_0x007e:
            r2 = move-exception
            com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.C8694h.f19097a
            r3.mo21309d(r1, r2)
        L_0x0084:
            throw r0
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p433r9.C13332a.mo45946f():void");
    }

    /* renamed from: h */
    public final void mo45948h() throws NumberFormatException {
        C13255g gVar = this.f29314b;
        if (((gVar == null || gVar.f29120c == null) ? false : true) || !BuildTarget.getAudience().isInternal()) {
            if (mo46070c("X-Total-Count").booleanValue()) {
                Integer.parseInt(mo46069b("X-Total-Count"));
            }
            if (mo46070c("Link").booleanValue()) {
                String str = null;
                String b = mo46069b("Link");
                if (b != null) {
                    for (String split : b.split(",")) {
                        String[] split2 = split.split(";");
                        if (split2.length >= 2) {
                            String trim = split2[0].trim();
                            if (trim.startsWith("<") && trim.endsWith(">")) {
                                String substring = trim.substring(1, trim.length() - 1);
                                for (int i = 1; i < split2.length; i++) {
                                    String[] split3 = split2[i].trim().split("=");
                                    if (split3.length >= 2 && "rel".equals(split3[0])) {
                                        String str2 = split3[1];
                                        if (str2.startsWith("\"") && str2.endsWith("\"")) {
                                            str2 = str2.substring(1, str2.length() - 1);
                                        }
                                        if (!"first".equals(str2) && !"last".equals(str2)) {
                                            if (SplitLoginAnalyticsManagerKt.NEXT_BUTTON.equals(str2)) {
                                                str = substring;
                                            } else {
                                                "prev".equals(str2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f29258h = str;
                C8694h.f19097a.mo21308c();
                return;
            }
            return;
        }
        C8694h.f19097a.mo21306a("NULL HEADERS IN v3");
    }

    /* renamed from: i */
    public final void mo45949i(JsonParser jsonParser, Class<Result> cls) throws IOException {
        C8694h.f19097a.mo21308c();
        mo45950j(jsonParser, cls);
        this.f29116f.size();
    }
}

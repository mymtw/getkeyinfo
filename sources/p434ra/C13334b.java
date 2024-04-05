package p434ra;

import android.content.Context;
import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.NotificationType;

/* renamed from: ra.b */
public final class C13334b extends C13339g {

    /* renamed from: f */
    public static C13334b f29260f;

    public C13334b() {
        super(NotificationType.BUYER_LEFT_REVIEW);
    }

    /* renamed from: p */
    public static synchronized C13334b m20955p() {
        C13334b bVar;
        synchronized (C13334b.class) {
            if (f29260f == null) {
                C13334b bVar2 = new C13334b();
                f29260f = bVar2;
                bVar2.mo46034h();
            }
            bVar = f29260f;
        }
        return bVar;
    }

    /* renamed from: j */
    public final String mo46022j(Context context, String str, Bundle bundle) {
        return context.getResources().getQuantityString(R.plurals.buyer_left_review_big_title, mo46032f(bundle), new Object[]{Integer.valueOf(mo46032f(bundle))});
    }

    /* renamed from: k */
    public final String mo46027k(Bundle bundle) {
        return bundle.getString(ResponseConstants.USERNAME) + "_" + bundle.getString("o");
    }

    /* renamed from: l */
    public final void mo46023l() {
    }

    /* renamed from: m */
    public final String mo46024m() {
        return ResponseConstants.USERNAME;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003b A[LOOP:0: B:7:0x0039->B:8:0x003b, LOOP_END] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo46025n(android.content.Context r6, android.os.Bundle r7) {
        /*
            r5 = this;
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            java.lang.String r0 = "rating"
            java.lang.String r0 = r7.getString(r0)
            boolean r1 = com.etsy.android.lib.util.C8885d0.m17324h(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0017
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            java.lang.String r1 = "review"
            java.lang.String r7 = r7.getString(r1)
            com.etsy.android.lib.logger.h r1 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Parsed review int: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r1.mo21310e(r3)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
        L_0x0039:
            if (r2 >= r0) goto L_0x0043
            java.lang.String r3 = "★"
            r1.append(r3)
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0043:
            r6.append(r1)
            boolean r0 = com.etsy.android.lib.util.C8885d0.m17324h(r7)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = " "
            r6.append(r0)
            r6.append(r7)
        L_0x0054:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p434ra.C13334b.mo46025n(android.content.Context, android.os.Bundle):java.lang.CharSequence");
    }

    /* renamed from: o */
    public final String mo46026o() {
        return null;
    }
}

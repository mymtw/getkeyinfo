package com.etsy.android.lib.useraction;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import p145io.reactivex.internal.operators.single.C19198c;
import p145io.reactivex.internal.operators.single.C19206h;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.internal.operators.single.SingleCreate;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p277w8.C8264b;
import p314ba.C8542a;
import p346fa.C12703a;
import p456ua.C13461f;

public final class UserActionBus {

    /* renamed from: f */
    public static final byte[] f19585f;

    /* renamed from: a */
    public final C8869d f19586a;

    /* renamed from: b */
    public final String f19587b;

    /* renamed from: c */
    public final boolean f19588c;

    /* renamed from: d */
    public final C13461f f19589d;

    /* renamed from: e */
    public final C12703a f19590e;

    static {
        byte[] bytes = "{}".getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        f19585f = bytes;
    }

    public UserActionBus(C8869d dVar, String str, boolean z, C13461f fVar, C12703a aVar) {
        C19383o.m32797g(dVar, "userActionDao");
        C19383o.m32797g(str, "userId");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(aVar, "grafana");
        this.f19586a = dVar;
        this.f19587b = str;
        this.f19588c = z;
        this.f19589d = fVar;
        this.f19590e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        kotlin.reflect.C19421p.m32917E(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        throw r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m17266a(com.etsy.android.lib.useraction.UserActionBus r4, java.util.List r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r4 = "userActions"
            kotlin.jvm.internal.C19383o.m32797g(r5, r4)
            lr.f r4 = new lr.f
            r4.<init>()
            com.squareup.moshi.s r0 = new com.squareup.moshi.s
            r0.<init>(r4)
            r1 = 0
            r0.mo68522b()     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "activity_log"
            r0.mo68529h(r2)     // Catch:{ all -> 0x0047 }
            r0.mo68521a()     // Catch:{ all -> 0x0047 }
            com.etsy.android.lib.useraction.UserActionBus$convertUserActionsToJson$1$1 r2 = com.etsy.android.lib.useraction.UserActionBus$convertUserActionsToJson$1$1.INSTANCE     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "action"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)     // Catch:{ all -> 0x0047 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0047 }
        L_0x002b:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0047 }
            r2.invoke(r0, r3)     // Catch:{ all -> 0x0047 }
            goto L_0x002b
        L_0x0039:
            r0.mo68525e()     // Catch:{ all -> 0x0047 }
            r0.mo68526f()     // Catch:{ all -> 0x0047 }
            kotlin.reflect.C19421p.m32917E(r0, r1)
            byte[] r4 = r4.mo72732d0()
            return r4
        L_0x0047:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r5 = move-exception
            kotlin.reflect.C19421p.m32917E(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.useraction.UserActionBus.m17266a(com.etsy.android.lib.useraction.UserActionBus, java.util.List):byte[]");
    }

    /* renamed from: b */
    public final C19211l mo30433b() {
        SingleCreate a = this.f19586a.mo30442a(this.f19587b);
        this.f19589d.getClass();
        return new C19211l(new C19198c(new C19208j(a.mo20660i(C13461f.m21235b()), new C8542a(this, 1)), new C8264b(this, 4)), new C8868c(0));
    }

    /* renamed from: c */
    public final void mo30434c(ActionType actionType, SubjectType subjectType, String str) {
        C19383o.m32797g(actionType, ResponseConstants.ACTION);
        C19383o.m32797g(subjectType, ResponseConstants.SUBJECT);
        C19383o.m32797g(str, "subjectId");
        if (this.f19588c) {
            C19206h hVar = new C19206h(new C8867b(this, actionType, subjectType, str));
            this.f19589d.getClass();
            SubscribersKt.m32500e(hVar.mo20660i(C13461f.m21235b()), new UserActionBus$logUserAction$2(this), new UserActionBus$logUserAction$3(this));
        }
    }
}

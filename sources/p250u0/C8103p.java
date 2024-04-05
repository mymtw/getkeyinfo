package p250u0;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: u0.p */
public final class C8103p extends C8105q {

    /* renamed from: e */
    public final ArrayList f17684e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f17685f = new ArrayList();

    /* renamed from: g */
    public C8109u f17686g;

    /* renamed from: h */
    public Boolean f17687h;

    /* renamed from: u0.p$a */
    public static final class C8104a {

        /* renamed from: a */
        public final CharSequence f17688a;

        /* renamed from: b */
        public final long f17689b;

        /* renamed from: c */
        public final C8109u f17690c;

        /* renamed from: d */
        public Bundle f17691d = new Bundle();

        public C8104a(String str, long j, C8109u uVar) {
            this.f17688a = str;
            this.f17689b = j;
            this.f17690c = uVar;
        }

        /* renamed from: a */
        public static Bundle[] m16308a(ArrayList arrayList) {
            Bundle[] bundleArr = new Bundle[arrayList.size()];
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C8104a aVar = (C8104a) arrayList.get(i);
                aVar.getClass();
                Bundle bundle = new Bundle();
                CharSequence charSequence = aVar.f17688a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", aVar.f17689b);
                C8109u uVar = aVar.f17690c;
                if (uVar != null) {
                    bundle.putCharSequence("sender", uVar.f17701a);
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", aVar.f17690c.mo20703a());
                    } else {
                        bundle.putBundle("person", aVar.f17690c.mo20704b());
                    }
                }
                Bundle bundle2 = aVar.f17691d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                bundleArr[i] = bundle;
            }
            return bundleArr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.app.Person} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.app.Notification.MessagingStyle.Message mo20701b() {
            /*
                r6 = this;
                u0.u r0 = r6.f17690c
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 28
                r3 = 0
                if (r1 < r2) goto L_0x001a
                android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                java.lang.CharSequence r2 = r6.f17688a
                long r4 = r6.f17689b
                if (r0 != 0) goto L_0x0012
                goto L_0x0016
            L_0x0012:
                android.app.Person r3 = r0.mo20703a()
            L_0x0016:
                r1.<init>(r2, r4, r3)
                goto L_0x0028
            L_0x001a:
                android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                java.lang.CharSequence r2 = r6.f17688a
                long r4 = r6.f17689b
                if (r0 != 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                java.lang.CharSequence r3 = r0.f17701a
            L_0x0025:
                r1.<init>(r2, r4, r3)
            L_0x0028:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p250u0.C8103p.C8104a.mo20701b():android.app.Notification$MessagingStyle$Message");
        }
    }

    public C8103p(C8109u uVar) {
        if (!TextUtils.isEmpty(uVar.f17701a)) {
            this.f17686g = uVar;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    /* renamed from: a */
    public final void mo20686a(Bundle bundle) {
        super.mo20686a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f17686g.f17701a);
        bundle.putBundle("android.messagingStyleUser", this.f17686g.mo20704b());
        bundle.putCharSequence("android.hiddenConversationTitle", (CharSequence) null);
        if (!this.f17684e.isEmpty()) {
            bundle.putParcelableArray("android.messages", C8104a.m16308a(this.f17684e));
        }
        if (!this.f17685f.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C8104a.m16308a(this.f17685f));
        }
        Boolean bool = this.f17687h;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r0 = r4.f17687h;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20684b(p250u0.C8106r r5) {
        /*
            r4 = this;
            u0.m r0 = r4.f17692a
            r1 = 28
            if (r0 == 0) goto L_0x0015
            android.content.Context r0 = r0.f17657a
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            if (r0 >= r1) goto L_0x0015
            java.lang.Boolean r0 = r4.f17687h
            if (r0 != 0) goto L_0x0015
            goto L_0x001e
        L_0x0015:
            java.lang.Boolean r0 = r4.f17687h
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.booleanValue()
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r4.mo20700h(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x0032
            android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
            u0.u r2 = r4.f17686g
            android.app.Person r2 = r2.mo20703a()
            r0.<init>(r2)
            goto L_0x003b
        L_0x0032:
            android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
            u0.u r2 = r4.f17686g
            java.lang.CharSequence r2 = r2.f17701a
            r0.<init>(r2)
        L_0x003b:
            java.util.ArrayList r2 = r4.f17684e
            java.util.Iterator r2 = r2.iterator()
        L_0x0041:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r2.next()
            u0.p$a r3 = (p250u0.C8103p.C8104a) r3
            android.app.Notification$MessagingStyle$Message r3 = r3.mo20701b()
            r0.addMessage(r3)
            goto L_0x0041
        L_0x0055:
            java.util.ArrayList r2 = r4.f17685f
            java.util.Iterator r2 = r2.iterator()
        L_0x005b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006f
            java.lang.Object r3 = r2.next()
            u0.p$a r3 = (p250u0.C8103p.C8104a) r3
            android.app.Notification$MessagingStyle$Message r3 = r3.mo20701b()
            r0.addHistoricMessage(r3)
            goto L_0x005b
        L_0x006f:
            java.lang.Boolean r2 = r4.f17687h
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x007b
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r1) goto L_0x007f
        L_0x007b:
            r2 = 0
            r0.setConversationTitle(r2)
        L_0x007f:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r1) goto L_0x008c
            java.lang.Boolean r1 = r4.f17687h
            boolean r1 = r1.booleanValue()
            r0.setGroupConversation(r1)
        L_0x008c:
            android.app.Notification$Builder r5 = r5.f17697b
            r0.setBuilder(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p250u0.C8103p.mo20684b(u0.r):void");
    }

    /* renamed from: c */
    public final String mo20685c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    /* renamed from: h */
    public final void mo20700h(boolean z) {
        this.f17687h = Boolean.valueOf(z);
    }
}

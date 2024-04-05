package p251u1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.p013v4.media.C0069a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: u1.a */
public final class C8115a {

    /* renamed from: f */
    public static final Object f17713f = new Object();

    /* renamed from: g */
    public static C8115a f17714g;

    /* renamed from: a */
    public final Context f17715a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<C8118c>> f17716b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<C8118c>> f17717c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<C8117b> f17718d = new ArrayList<>();

    /* renamed from: e */
    public final C8116a f17719e;

    /* renamed from: u1.a$a */
    public class C8116a extends Handler {
        public C8116a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r3 >= r1) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r4 = r2[r3];
            r5 = r4.f17722b.size();
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
            if (r6 >= r5) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r7 = r4.f17722b.get(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            if (r7.f17726d != false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
            r7.f17724b.onReceive(r11.f17715a, r4.f17721a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r11) {
            /*
                r10 = this;
                int r0 = r11.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r11)
                goto L_0x0017
            L_0x0009:
                u1.a r11 = p251u1.C8115a.this
            L_0x000b:
                java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<u1.a$c>> r0 = r11.f17716b
                monitor-enter(r0)
                java.util.ArrayList<u1.a$b> r1 = r11.f17718d     // Catch:{ all -> 0x004f }
                int r1 = r1.size()     // Catch:{ all -> 0x004f }
                if (r1 > 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
            L_0x0017:
                return
            L_0x0018:
                u1.a$b[] r2 = new p251u1.C8115a.C8117b[r1]     // Catch:{ all -> 0x004f }
                java.util.ArrayList<u1.a$b> r3 = r11.f17718d     // Catch:{ all -> 0x004f }
                r3.toArray(r2)     // Catch:{ all -> 0x004f }
                java.util.ArrayList<u1.a$b> r3 = r11.f17718d     // Catch:{ all -> 0x004f }
                r3.clear()     // Catch:{ all -> 0x004f }
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                r0 = 0
                r3 = r0
            L_0x0027:
                if (r3 >= r1) goto L_0x000b
                r4 = r2[r3]
                java.util.ArrayList<u1.a$c> r5 = r4.f17722b
                int r5 = r5.size()
                r6 = r0
            L_0x0032:
                if (r6 >= r5) goto L_0x004c
                java.util.ArrayList<u1.a$c> r7 = r4.f17722b
                java.lang.Object r7 = r7.get(r6)
                u1.a$c r7 = (p251u1.C8115a.C8118c) r7
                boolean r8 = r7.f17726d
                if (r8 != 0) goto L_0x0049
                android.content.BroadcastReceiver r7 = r7.f17724b
                android.content.Context r8 = r11.f17715a
                android.content.Intent r9 = r4.f17721a
                r7.onReceive(r8, r9)
            L_0x0049:
                int r6 = r6 + 1
                goto L_0x0032
            L_0x004c:
                int r3 = r3 + 1
                goto L_0x0027
            L_0x004f:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p251u1.C8115a.C8116a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: u1.a$b */
    public static final class C8117b {

        /* renamed from: a */
        public final Intent f17721a;

        /* renamed from: b */
        public final ArrayList<C8118c> f17722b;

        public C8117b(Intent intent, ArrayList<C8118c> arrayList) {
            this.f17721a = intent;
            this.f17722b = arrayList;
        }
    }

    /* renamed from: u1.a$c */
    public static final class C8118c {

        /* renamed from: a */
        public final IntentFilter f17723a;

        /* renamed from: b */
        public final BroadcastReceiver f17724b;

        /* renamed from: c */
        public boolean f17725c;

        /* renamed from: d */
        public boolean f17726d;

        public C8118c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f17723a = intentFilter;
            this.f17724b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder g = C0069a.m176g(128, "Receiver{");
            g.append(this.f17724b);
            g.append(" filter=");
            g.append(this.f17723a);
            if (this.f17726d) {
                g.append(" DEAD");
            }
            g.append("}");
            return g.toString();
        }
    }

    public C8115a(Context context) {
        this.f17715a = context;
        this.f17719e = new C8116a(context.getMainLooper());
    }

    /* renamed from: a */
    public static C8115a m16322a(Context context) {
        C8115a aVar;
        synchronized (f17713f) {
            if (f17714g == null) {
                f17714g = new C8115a(context.getApplicationContext());
            }
            aVar = f17714g;
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo20708b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f17716b) {
            C8118c cVar = new C8118c(broadcastReceiver, intentFilter);
            ArrayList arrayList = this.f17716b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f17716b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.f17717c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f17717c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20709c(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<u1.a$c>> r2 = r1.f17716b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x00dc }
            android.content.Context r3 = r1.f17715a     // Catch:{ all -> 0x00dc }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00dc }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00dc }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x00dc }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x00dc }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x00dc }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x00dc }
            r3 = r3 & 8
            r9 = 0
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = r9
        L_0x002f:
            if (r16 == 0) goto L_0x0034
            r23.toString()     // Catch:{ all -> 0x00dc }
        L_0x0034:
            java.util.HashMap<java.lang.String, java.util.ArrayList<u1.a$c>> r3 = r1.f17717c     // Catch:{ all -> 0x00dc }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x00dc }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00dc }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x00da
            if (r16 == 0) goto L_0x0048
            r8.toString()     // Catch:{ all -> 0x00dc }
        L_0x0048:
            r3 = 0
            r7 = r3
            r6 = r9
        L_0x004b:
            int r3 = r8.size()     // Catch:{ all -> 0x00dc }
            if (r6 >= r3) goto L_0x00aa
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x00dc }
            r5 = r3
            u1.a$c r5 = (p251u1.C8115a.C8118c) r5     // Catch:{ all -> 0x00dc }
            if (r16 == 0) goto L_0x005f
            android.content.IntentFilter r3 = r5.f17723a     // Catch:{ all -> 0x00dc }
            java.util.Objects.toString(r3)     // Catch:{ all -> 0x00dc }
        L_0x005f:
            boolean r3 = r5.f17725c     // Catch:{ all -> 0x00dc }
            if (r3 == 0) goto L_0x006e
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r10 = r7
            r11 = r9
            goto L_0x009f
        L_0x006e:
            android.content.IntentFilter r3 = r5.f17723a     // Catch:{ all -> 0x00dc }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r6
            r6 = r13
            r19 = r10
            r10 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = r9
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00dc }
            if (r3 < 0) goto L_0x009f
            if (r16 == 0) goto L_0x008f
            java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x00dc }
        L_0x008f:
            if (r10 != 0) goto L_0x0097
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00dc }
            r7.<init>()     // Catch:{ all -> 0x00dc }
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            r7.add(r15)     // Catch:{ all -> 0x00dc }
            r3 = 1
            r15.f17725c = r3     // Catch:{ all -> 0x00dc }
            goto L_0x00a0
        L_0x009f:
            r7 = r10
        L_0x00a0:
            int r6 = r18 + 1
            r9 = r11
            r10 = r19
            r8 = r20
            r11 = r21
            goto L_0x004b
        L_0x00aa:
            r10 = r7
            r11 = r9
            if (r10 == 0) goto L_0x00da
            r9 = r11
        L_0x00af:
            int r3 = r10.size()     // Catch:{ all -> 0x00dc }
            if (r9 >= r3) goto L_0x00c0
            java.lang.Object r3 = r10.get(r9)     // Catch:{ all -> 0x00dc }
            u1.a$c r3 = (p251u1.C8115a.C8118c) r3     // Catch:{ all -> 0x00dc }
            r3.f17725c = r11     // Catch:{ all -> 0x00dc }
            int r9 = r9 + 1
            goto L_0x00af
        L_0x00c0:
            java.util.ArrayList<u1.a$b> r3 = r1.f17718d     // Catch:{ all -> 0x00dc }
            u1.a$b r4 = new u1.a$b     // Catch:{ all -> 0x00dc }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00dc }
            r3.add(r4)     // Catch:{ all -> 0x00dc }
            u1.a$a r0 = r1.f17719e     // Catch:{ all -> 0x00dc }
            r3 = 1
            boolean r0 = r0.hasMessages(r3)     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00d8
            u1.a$a r0 = r1.f17719e     // Catch:{ all -> 0x00dc }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x00dc }
        L_0x00d8:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            return
        L_0x00da:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            return
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p251u1.C8115a.mo20709c(android.content.Intent):void");
    }

    /* renamed from: d */
    public final void mo20710d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f17716b) {
            ArrayList remove = this.f17716b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    C8118c cVar = (C8118c) remove.get(size);
                    cVar.f17726d = true;
                    for (int i = 0; i < cVar.f17723a.countActions(); i++) {
                        String action = cVar.f17723a.getAction(i);
                        ArrayList arrayList = this.f17717c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C8118c cVar2 = (C8118c) arrayList.get(size2);
                                if (cVar2.f17724b == broadcastReceiver) {
                                    cVar2.f17726d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f17717c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }
}

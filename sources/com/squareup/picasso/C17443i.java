package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.squareup.picasso.i */
public final class C17443i {

    /* renamed from: a */
    public final Context f38109a;

    /* renamed from: b */
    public final ExecutorService f38110b;

    /* renamed from: c */
    public final C17448j f38111c;

    /* renamed from: d */
    public final LinkedHashMap f38112d = new LinkedHashMap();

    /* renamed from: e */
    public final WeakHashMap f38113e = new WeakHashMap();

    /* renamed from: f */
    public final WeakHashMap f38114f = new WeakHashMap();

    /* renamed from: g */
    public final LinkedHashSet f38115g = new LinkedHashSet();

    /* renamed from: h */
    public final C17444a f38116h;

    /* renamed from: i */
    public final Handler f38117i;

    /* renamed from: j */
    public final C17438d f38118j;

    /* renamed from: k */
    public final C17465w f38119k;

    /* renamed from: l */
    public final ArrayList f38120l;

    /* renamed from: m */
    public final boolean f38121m;

    /* renamed from: com.squareup.picasso.i$a */
    public static class C17444a extends Handler {

        /* renamed from: a */
        public final C17443i f38122a;

        /* renamed from: com.squareup.picasso.i$a$a */
        public class C17445a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Message f38123b;

            public C17445a(Message message) {
                this.f38123b = message;
            }

            public final void run() {
                StringBuilder h = C0072d.m201h("Unknown handler message received: ");
                h.append(this.f38123b.what);
                throw new AssertionError(h.toString());
            }
        }

        public C17444a(Looper looper, C17443i iVar) {
            super(looper);
            this.f38122a = iVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: java.util.ArrayList} */
        /* JADX WARNING: type inference failed for: r1v67, types: [java.util.List] */
        /* JADX WARNING: type inference failed for: r1v72 */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x002e, code lost:
            r1 = r1;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x02ad  */
        /* JADX WARNING: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r15) {
            /*
                r14 = this;
                int r0 = r15.what
                r1 = 0
                java.lang.String r2 = "canceled"
                java.lang.String r3 = "Dispatcher"
                switch(r0) {
                    case 1: goto L_0x03b8;
                    case 2: goto L_0x0342;
                    case 3: goto L_0x000a;
                    case 4: goto L_0x02e0;
                    case 5: goto L_0x021c;
                    case 6: goto L_0x0210;
                    case 7: goto L_0x01ac;
                    case 8: goto L_0x000a;
                    case 9: goto L_0x011a;
                    case 10: goto L_0x0111;
                    case 11: goto L_0x005f;
                    case 12: goto L_0x0016;
                    default: goto L_0x000a;
                }
            L_0x000a:
                com.squareup.picasso.Picasso$a r0 = com.squareup.picasso.Picasso.f38038m
                com.squareup.picasso.i$a$a r1 = new com.squareup.picasso.i$a$a
                r1.<init>(r15)
                r0.post(r1)
                goto L_0x03c2
            L_0x0016:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.i r0 = r14.f38122a
                java.util.LinkedHashSet r2 = r0.f38115g
                boolean r2 = r2.remove(r15)
                if (r2 != 0) goto L_0x0024
                goto L_0x03c2
            L_0x0024:
                java.util.WeakHashMap r2 = r0.f38114f
                java.util.Collection r2 = r2.values()
                java.util.Iterator r2 = r2.iterator()
            L_0x002e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0050
                java.lang.Object r3 = r2.next()
                com.squareup.picasso.a r3 = (com.squareup.picasso.C17425a) r3
                java.lang.Object r4 = r3.f38065j
                boolean r4 = r4.equals(r15)
                if (r4 == 0) goto L_0x002e
                if (r1 != 0) goto L_0x0049
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L_0x0049:
                r1.add(r3)
                r2.remove()
                goto L_0x002e
            L_0x0050:
                if (r1 == 0) goto L_0x03c2
                android.os.Handler r15 = r0.f38117i
                r0 = 13
                android.os.Message r0 = r15.obtainMessage(r0, r1)
                r15.sendMessage(r0)
                goto L_0x03c2
            L_0x005f:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.i r0 = r14.f38122a
                java.util.LinkedHashSet r1 = r0.f38115g
                boolean r1 = r1.add(r15)
                if (r1 != 0) goto L_0x006d
                goto L_0x03c2
            L_0x006d:
                java.util.LinkedHashMap r1 = r0.f38112d
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L_0x0077:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x03c2
                java.lang.Object r4 = r1.next()
                com.squareup.picasso.c r4 = (com.squareup.picasso.C17431c) r4
                com.squareup.picasso.Picasso r5 = r4.f38080c
                boolean r5 = r5.f38051l
                com.squareup.picasso.a r6 = r4.f38089l
                java.util.ArrayList r7 = r4.f38090m
                if (r7 == 0) goto L_0x0095
                boolean r8 = r7.isEmpty()
                if (r8 != 0) goto L_0x0095
                r8 = 1
                goto L_0x0096
            L_0x0095:
                r8 = 0
            L_0x0096:
                if (r6 != 0) goto L_0x009b
                if (r8 != 0) goto L_0x009b
                goto L_0x0077
            L_0x009b:
                java.lang.String r9 = "' was paused"
                java.lang.String r10 = "because tag '"
                java.lang.String r11 = "paused"
                if (r6 == 0) goto L_0x00c6
                java.lang.Object r12 = r6.f38065j
                boolean r12 = r12.equals(r15)
                if (r12 == 0) goto L_0x00c6
                r4.mo68590d(r6)
                java.util.WeakHashMap r12 = r0.f38114f
                java.lang.Object r13 = r6.mo68586d()
                r12.put(r13, r6)
                if (r5 == 0) goto L_0x00c6
                com.squareup.picasso.s r6 = r6.f38057b
                java.lang.String r6 = r6.mo68630b()
                java.lang.String r12 = p504ai.C13983i.m21494m(r10, r15, r9)
                com.squareup.picasso.C17427a0.m29282e(r3, r11, r6, r12)
            L_0x00c6:
                if (r8 == 0) goto L_0x00fb
                int r6 = r7.size()
            L_0x00cc:
                int r6 = r6 + -1
                if (r6 < 0) goto L_0x00fb
                java.lang.Object r8 = r7.get(r6)
                com.squareup.picasso.a r8 = (com.squareup.picasso.C17425a) r8
                java.lang.Object r12 = r8.f38065j
                boolean r12 = r12.equals(r15)
                if (r12 != 0) goto L_0x00df
                goto L_0x00cc
            L_0x00df:
                r4.mo68590d(r8)
                java.util.WeakHashMap r12 = r0.f38114f
                java.lang.Object r13 = r8.mo68586d()
                r12.put(r13, r8)
                if (r5 == 0) goto L_0x00cc
                com.squareup.picasso.s r8 = r8.f38057b
                java.lang.String r8 = r8.mo68630b()
                java.lang.String r12 = p504ai.C13983i.m21494m(r10, r15, r9)
                com.squareup.picasso.C17427a0.m29282e(r3, r11, r8, r12)
                goto L_0x00cc
            L_0x00fb:
                boolean r6 = r4.mo68589b()
                if (r6 == 0) goto L_0x0077
                r1.remove()
                if (r5 == 0) goto L_0x0077
                java.lang.String r4 = com.squareup.picasso.C17427a0.m29279b(r4)
                java.lang.String r5 = "all actions paused"
                com.squareup.picasso.C17427a0.m29282e(r3, r2, r4, r5)
                goto L_0x0077
            L_0x0111:
                com.squareup.picasso.i r0 = r14.f38122a
                int r15 = r15.arg1
                r0.getClass()
                goto L_0x03c2
            L_0x011a:
                java.lang.Object r15 = r15.obj
                android.net.NetworkInfo r15 = (android.net.NetworkInfo) r15
                com.squareup.picasso.i r0 = r14.f38122a
                java.util.concurrent.ExecutorService r1 = r0.f38110b
                boolean r2 = r1 instanceof com.squareup.picasso.C17457r
                if (r2 == 0) goto L_0x016d
                com.squareup.picasso.r r1 = (com.squareup.picasso.C17457r) r1
                r2 = 3
                if (r15 == 0) goto L_0x016a
                r1.getClass()
                boolean r4 = r15.isConnectedOrConnecting()
                if (r4 != 0) goto L_0x0135
                goto L_0x016a
            L_0x0135:
                int r4 = r15.getType()
                if (r4 == 0) goto L_0x014e
                r5 = 1
                if (r4 == r5) goto L_0x0149
                r5 = 6
                if (r4 == r5) goto L_0x0149
                r5 = 9
                if (r4 == r5) goto L_0x0149
                r1.mo68626a(r2)
                goto L_0x016d
            L_0x0149:
                r2 = 4
                r1.mo68626a(r2)
                goto L_0x016d
            L_0x014e:
                int r4 = r15.getSubtype()
                switch(r4) {
                    case 1: goto L_0x015c;
                    case 2: goto L_0x015c;
                    case 3: goto L_0x0165;
                    case 4: goto L_0x0165;
                    case 5: goto L_0x0165;
                    case 6: goto L_0x0165;
                    default: goto L_0x0155;
                }
            L_0x0155:
                switch(r4) {
                    case 12: goto L_0x0165;
                    case 13: goto L_0x0161;
                    case 14: goto L_0x0161;
                    case 15: goto L_0x0161;
                    default: goto L_0x0158;
                }
            L_0x0158:
                r1.mo68626a(r2)
                goto L_0x016d
            L_0x015c:
                r2 = 1
                r1.mo68626a(r2)
                goto L_0x016d
            L_0x0161:
                r1.mo68626a(r2)
                goto L_0x016d
            L_0x0165:
                r2 = 2
                r1.mo68626a(r2)
                goto L_0x016d
            L_0x016a:
                r1.mo68626a(r2)
            L_0x016d:
                if (r15 == 0) goto L_0x03c2
                boolean r15 = r15.isConnected()
                if (r15 == 0) goto L_0x03c2
                java.util.WeakHashMap r15 = r0.f38113e
                boolean r15 = r15.isEmpty()
                if (r15 != 0) goto L_0x03c2
                java.util.WeakHashMap r15 = r0.f38113e
                java.util.Collection r15 = r15.values()
                java.util.Iterator r15 = r15.iterator()
            L_0x0187:
                boolean r1 = r15.hasNext()
                if (r1 == 0) goto L_0x03c2
                java.lang.Object r1 = r15.next()
                com.squareup.picasso.a r1 = (com.squareup.picasso.C17425a) r1
                r15.remove()
                com.squareup.picasso.Picasso r2 = r1.f38056a
                boolean r2 = r2.f38051l
                if (r2 == 0) goto L_0x01a7
                com.squareup.picasso.s r2 = r1.f38057b
                java.lang.String r2 = r2.mo68630b()
                java.lang.String r4 = "replaying"
                com.squareup.picasso.C17427a0.m29281d(r3, r4, r2)
            L_0x01a7:
                r2 = 0
                r0.mo68605d(r1, r2)
                goto L_0x0187
            L_0x01ac:
                com.squareup.picasso.i r15 = r14.f38122a
                r15.getClass()
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.ArrayList r1 = r15.f38120l
                r0.<init>(r1)
                java.util.ArrayList r1 = r15.f38120l
                r1.clear()
                android.os.Handler r15 = r15.f38117i
                r1 = 8
                android.os.Message r1 = r15.obtainMessage(r1, r0)
                r15.sendMessage(r1)
                boolean r15 = r0.isEmpty()
                if (r15 == 0) goto L_0x01d0
                goto L_0x03c2
            L_0x01d0:
                r15 = 0
                java.lang.Object r15 = r0.get(r15)
                com.squareup.picasso.c r15 = (com.squareup.picasso.C17431c) r15
                com.squareup.picasso.Picasso r15 = r15.f38080c
                boolean r15 = r15.f38051l
                if (r15 == 0) goto L_0x03c2
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x01e6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0205
                java.lang.Object r1 = r0.next()
                com.squareup.picasso.c r1 = (com.squareup.picasso.C17431c) r1
                int r2 = r15.length()
                if (r2 <= 0) goto L_0x01fd
                java.lang.String r2 = ", "
                r15.append(r2)
            L_0x01fd:
                java.lang.String r1 = com.squareup.picasso.C17427a0.m29279b(r1)
                r15.append(r1)
                goto L_0x01e6
            L_0x0205:
                java.lang.String r15 = r15.toString()
                java.lang.String r0 = "delivered"
                com.squareup.picasso.C17427a0.m29281d(r3, r0, r15)
                goto L_0x03c2
            L_0x0210:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.c r15 = (com.squareup.picasso.C17431c) r15
                com.squareup.picasso.i r0 = r14.f38122a
                r1 = 0
                r0.mo68604c(r15, r1)
                goto L_0x03c2
            L_0x021c:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.c r15 = (com.squareup.picasso.C17431c) r15
                com.squareup.picasso.i r0 = r14.f38122a
                r0.getClass()
                java.util.concurrent.Future<?> r2 = r15.f38092o
                if (r2 == 0) goto L_0x0231
                boolean r2 = r2.isCancelled()
                if (r2 == 0) goto L_0x0231
                r2 = 1
                goto L_0x0232
            L_0x0231:
                r2 = 0
            L_0x0232:
                if (r2 == 0) goto L_0x0236
                goto L_0x03c2
            L_0x0236:
                java.util.concurrent.ExecutorService r2 = r0.f38110b
                boolean r2 = r2.isShutdown()
                if (r2 == 0) goto L_0x0244
                r1 = 0
                r0.mo68604c(r15, r1)
                goto L_0x03c2
            L_0x0244:
                r2 = 0
                boolean r4 = r0.f38121m
                if (r4 == 0) goto L_0x0259
                android.content.Context r1 = r0.f38109a
                java.lang.StringBuilder r4 = com.squareup.picasso.C17427a0.f38069a
                java.lang.String r4 = "connectivity"
                java.lang.Object r1 = r1.getSystemService(r4)
                android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
                android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            L_0x0259:
                int r4 = r15.f38096s
                if (r4 <= 0) goto L_0x025f
                r5 = 1
                goto L_0x0260
            L_0x025f:
                r5 = r2
            L_0x0260:
                if (r5 != 0) goto L_0x0264
                r1 = r2
                goto L_0x026e
            L_0x0264:
                int r4 = r4 + -1
                r15.f38096s = r4
                com.squareup.picasso.u r4 = r15.f38088k
                boolean r1 = r4.mo68568f(r1)
            L_0x026e:
                if (r1 == 0) goto L_0x0298
                com.squareup.picasso.Picasso r1 = r15.f38080c
                boolean r1 = r1.f38051l
                if (r1 == 0) goto L_0x027f
                java.lang.String r1 = com.squareup.picasso.C17427a0.m29279b(r15)
                java.lang.String r2 = "retrying"
                com.squareup.picasso.C17427a0.m29281d(r3, r2, r1)
            L_0x027f:
                java.lang.Exception r1 = r15.f38094q
                boolean r1 = r1 instanceof com.squareup.picasso.NetworkRequestHandler.ContentLengthException
                if (r1 == 0) goto L_0x028e
                int r1 = r15.f38087j
                com.squareup.picasso.NetworkPolicy r2 = com.squareup.picasso.NetworkPolicy.NO_CACHE
                int r2 = r2.index
                r1 = r1 | r2
                r15.f38087j = r1
            L_0x028e:
                java.util.concurrent.ExecutorService r0 = r0.f38110b
                java.util.concurrent.Future r0 = r0.submit(r15)
                r15.f38092o = r0
                goto L_0x03c2
            L_0x0298:
                boolean r1 = r0.f38121m
                if (r1 == 0) goto L_0x02a7
                com.squareup.picasso.u r1 = r15.f38088k
                r1.getClass()
                boolean r1 = r1 instanceof com.squareup.picasso.NetworkRequestHandler
                if (r1 == 0) goto L_0x02a7
                r1 = 1
                goto L_0x02a8
            L_0x02a7:
                r1 = r2
            L_0x02a8:
                r0.mo68604c(r15, r1)
                if (r1 == 0) goto L_0x03c2
                com.squareup.picasso.a r1 = r15.f38089l
                if (r1 == 0) goto L_0x02bf
                java.lang.Object r3 = r1.mo68586d()
                if (r3 == 0) goto L_0x02bf
                r4 = 1
                r1.f38066k = r4
                java.util.WeakHashMap r4 = r0.f38113e
                r4.put(r3, r1)
            L_0x02bf:
                java.util.ArrayList r15 = r15.f38090m
                if (r15 == 0) goto L_0x03c2
                int r1 = r15.size()
            L_0x02c7:
                if (r2 >= r1) goto L_0x03c2
                java.lang.Object r3 = r15.get(r2)
                com.squareup.picasso.a r3 = (com.squareup.picasso.C17425a) r3
                java.lang.Object r4 = r3.mo68586d()
                if (r4 == 0) goto L_0x02dd
                r5 = 1
                r3.f38066k = r5
                java.util.WeakHashMap r5 = r0.f38113e
                r5.put(r4, r3)
            L_0x02dd:
                int r2 = r2 + 1
                goto L_0x02c7
            L_0x02e0:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.c r15 = (com.squareup.picasso.C17431c) r15
                com.squareup.picasso.i r0 = r14.f38122a
                r0.getClass()
                int r1 = r15.f38086i
                boolean r1 = com.squareup.picasso.MemoryPolicy.shouldWriteToMemoryCache(r1)
                if (r1 == 0) goto L_0x0325
                com.squareup.picasso.d r1 = r0.f38118j
                java.lang.String r2 = r15.f38084g
                android.graphics.Bitmap r4 = r15.f38091n
                com.squareup.picasso.n r1 = (com.squareup.picasso.C17452n) r1
                r1.getClass()
                if (r2 == 0) goto L_0x031d
                if (r4 == 0) goto L_0x031d
                int r5 = com.squareup.picasso.C17427a0.m29278a(r4)
                com.squareup.picasso.m r6 = r1.f38126a
                int r6 = r6.maxSize()
                if (r5 <= r6) goto L_0x0312
                com.squareup.picasso.m r1 = r1.f38126a
                r1.remove(r2)
                goto L_0x0325
            L_0x0312:
                com.squareup.picasso.m r1 = r1.f38126a
                com.squareup.picasso.n$a r6 = new com.squareup.picasso.n$a
                r6.<init>(r4, r5)
                r1.put(r2, r6)
                goto L_0x0325
            L_0x031d:
                java.lang.NullPointerException r15 = new java.lang.NullPointerException
                java.lang.String r0 = "key == null || bitmap == null"
                r15.<init>(r0)
                throw r15
            L_0x0325:
                java.util.LinkedHashMap r1 = r0.f38112d
                java.lang.String r2 = r15.f38084g
                r1.remove(r2)
                r0.mo68602a(r15)
                com.squareup.picasso.Picasso r0 = r15.f38080c
                boolean r0 = r0.f38051l
                if (r0 == 0) goto L_0x03c2
                java.lang.String r15 = com.squareup.picasso.C17427a0.m29279b(r15)
                java.lang.String r0 = "batched"
                java.lang.String r1 = "for completion"
                com.squareup.picasso.C17427a0.m29282e(r3, r0, r15, r1)
                goto L_0x03c2
            L_0x0342:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.a r15 = (com.squareup.picasso.C17425a) r15
                com.squareup.picasso.i r0 = r14.f38122a
                r0.getClass()
                java.lang.String r1 = r15.f38064i
                java.util.LinkedHashMap r4 = r0.f38112d
                java.lang.Object r4 = r4.get(r1)
                com.squareup.picasso.c r4 = (com.squareup.picasso.C17431c) r4
                if (r4 == 0) goto L_0x0374
                r4.mo68590d(r15)
                boolean r4 = r4.mo68589b()
                if (r4 == 0) goto L_0x0374
                java.util.LinkedHashMap r4 = r0.f38112d
                r4.remove(r1)
                com.squareup.picasso.Picasso r1 = r15.f38056a
                boolean r1 = r1.f38051l
                if (r1 == 0) goto L_0x0374
                com.squareup.picasso.s r1 = r15.f38057b
                java.lang.String r1 = r1.mo68630b()
                com.squareup.picasso.C17427a0.m29281d(r3, r2, r1)
            L_0x0374:
                java.util.LinkedHashSet r1 = r0.f38115g
                java.lang.Object r4 = r15.f38065j
                boolean r1 = r1.contains(r4)
                if (r1 == 0) goto L_0x0398
                java.util.WeakHashMap r1 = r0.f38114f
                java.lang.Object r4 = r15.mo68586d()
                r1.remove(r4)
                com.squareup.picasso.Picasso r1 = r15.f38056a
                boolean r1 = r1.f38051l
                if (r1 == 0) goto L_0x0398
                com.squareup.picasso.s r1 = r15.f38057b
                java.lang.String r1 = r1.mo68630b()
                java.lang.String r4 = "because paused request got canceled"
                com.squareup.picasso.C17427a0.m29282e(r3, r2, r1, r4)
            L_0x0398:
                java.util.WeakHashMap r0 = r0.f38113e
                java.lang.Object r15 = r15.mo68586d()
                java.lang.Object r15 = r0.remove(r15)
                com.squareup.picasso.a r15 = (com.squareup.picasso.C17425a) r15
                if (r15 == 0) goto L_0x03c2
                com.squareup.picasso.Picasso r0 = r15.f38056a
                boolean r0 = r0.f38051l
                if (r0 == 0) goto L_0x03c2
                com.squareup.picasso.s r15 = r15.f38057b
                java.lang.String r15 = r15.mo68630b()
                java.lang.String r0 = "from replaying"
                com.squareup.picasso.C17427a0.m29282e(r3, r2, r15, r0)
                goto L_0x03c2
            L_0x03b8:
                java.lang.Object r15 = r15.obj
                com.squareup.picasso.a r15 = (com.squareup.picasso.C17425a) r15
                com.squareup.picasso.i r0 = r14.f38122a
                r1 = 1
                r0.mo68605d(r15, r1)
            L_0x03c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C17443i.C17444a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.squareup.picasso.i$b */
    public static class C17446b extends HandlerThread {
        public C17446b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.i$c */
    public static class C17447c extends BroadcastReceiver {

        /* renamed from: a */
        public final C17443i f38124a;

        public C17447c(C17443i iVar) {
            this.f38124a = iVar;
        }

        @SuppressLint({"MissingPermission"})
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        C17443i iVar = this.f38124a;
                        boolean booleanExtra = intent.getBooleanExtra("state", false);
                        C17444a aVar = iVar.f38116h;
                        aVar.sendMessage(aVar.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    StringBuilder sb = C17427a0.f38069a;
                    C17443i iVar2 = this.f38124a;
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    C17444a aVar2 = iVar2.f38116h;
                    aVar2.sendMessage(aVar2.obtainMessage(9, activeNetworkInfo));
                }
            }
        }
    }

    public C17443i(Context context, ExecutorService executorService, Picasso.C17419a aVar, C17448j jVar, C17438d dVar, C17465w wVar) {
        C17446b bVar = new C17446b();
        bVar.start();
        Looper looper = bVar.getLooper();
        StringBuilder sb = C17427a0.f38069a;
        C17470z zVar = new C17470z(looper);
        zVar.sendMessageDelayed(zVar.obtainMessage(), 1000);
        this.f38109a = context;
        this.f38110b = executorService;
        this.f38116h = new C17444a(bVar.getLooper(), this);
        this.f38111c = jVar;
        this.f38117i = aVar;
        this.f38118j = dVar;
        this.f38119k = wVar;
        this.f38120l = new ArrayList(4);
        boolean z = true;
        try {
            int i = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f38121m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 ? false : z;
        C17447c cVar = new C17447c(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (cVar.f38124a.f38121m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        cVar.f38124a.f38109a.registerReceiver(cVar, intentFilter);
    }

    /* renamed from: a */
    public final void mo68602a(C17431c cVar) {
        Future<?> future = cVar.f38092o;
        if (!(future != null && future.isCancelled())) {
            Bitmap bitmap = cVar.f38091n;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f38120l.add(cVar);
            if (!this.f38116h.hasMessages(7)) {
                this.f38116h.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: b */
    public final void mo68603b(C17431c cVar) {
        C17444a aVar = this.f38116h;
        aVar.sendMessage(aVar.obtainMessage(4, cVar));
    }

    /* renamed from: c */
    public final void mo68604c(C17431c cVar, boolean z) {
        if (cVar.f38080c.f38051l) {
            String b = C17427a0.m29279b(cVar);
            StringBuilder h = C0072d.m201h("for error");
            h.append(z ? " (will replay)" : "");
            C17427a0.m29282e("Dispatcher", "batched", b, h.toString());
        }
        this.f38112d.remove(cVar.f38084g);
        mo68602a(cVar);
    }

    /* renamed from: d */
    public final void mo68605d(C17425a aVar, boolean z) {
        C17431c cVar;
        if (this.f38115g.contains(aVar.f38065j)) {
            this.f38114f.put(aVar.mo68586d(), aVar);
            if (aVar.f38056a.f38051l) {
                C17427a0.m29282e("Dispatcher", "paused", aVar.f38057b.mo68630b(), C0071c.m192d(C0072d.m201h("because tag '"), aVar.f38065j, "' is paused"));
                return;
            }
            return;
        }
        C17431c cVar2 = (C17431c) this.f38112d.get(aVar.f38064i);
        if (cVar2 != null) {
            boolean z2 = cVar2.f38080c.f38051l;
            C17459s sVar = aVar.f38057b;
            if (cVar2.f38089l == null) {
                cVar2.f38089l = aVar;
                if (z2) {
                    ArrayList arrayList = cVar2.f38090m;
                    if (arrayList == null || arrayList.isEmpty()) {
                        C17427a0.m29282e("Hunter", "joined", sVar.mo68630b(), "to empty hunter");
                    } else {
                        C17427a0.m29282e("Hunter", "joined", sVar.mo68630b(), C17427a0.m29280c(cVar2, "to "));
                    }
                }
            } else {
                if (cVar2.f38090m == null) {
                    cVar2.f38090m = new ArrayList(3);
                }
                cVar2.f38090m.add(aVar);
                if (z2) {
                    C17427a0.m29282e("Hunter", "joined", sVar.mo68630b(), C17427a0.m29280c(cVar2, "to "));
                }
                Picasso.Priority priority = aVar.f38057b.f38164r;
                if (priority.ordinal() > cVar2.f38097t.ordinal()) {
                    cVar2.f38097t = priority;
                }
            }
        } else if (!this.f38110b.isShutdown()) {
            Picasso picasso = aVar.f38056a;
            C17438d dVar = this.f38118j;
            C17465w wVar = this.f38119k;
            Object obj = C17431c.f38075u;
            C17459s sVar2 = aVar.f38057b;
            List<C17462u> list = picasso.f38041b;
            int i = 0;
            int size = list.size();
            while (true) {
                if (i >= size) {
                    cVar = new C17431c(picasso, this, dVar, wVar, aVar, C17431c.f38078x);
                    break;
                }
                C17462u uVar = list.get(i);
                if (uVar.mo68565b(sVar2)) {
                    cVar = new C17431c(picasso, this, dVar, wVar, aVar, uVar);
                    break;
                }
                i++;
            }
            cVar.f38092o = this.f38110b.submit(cVar);
            this.f38112d.put(aVar.f38064i, cVar);
            if (z) {
                this.f38113e.remove(aVar.mo68586d());
            }
            if (aVar.f38056a.f38051l) {
                C17427a0.m29281d("Dispatcher", "enqueued", aVar.f38057b.mo68630b());
            }
        } else if (aVar.f38056a.f38051l) {
            C17427a0.m29282e("Dispatcher", "ignored", aVar.f38057b.mo68630b(), "because shut down");
        }
    }
}

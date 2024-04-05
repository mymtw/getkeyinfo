package com.braze.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import com.braze.C5381b;
import com.braze.support.BrazeLogger;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19840y0;
import kotlinx.coroutines.CoroutineStart;
import p030bo.app.C3853k1;
import p030bo.app.C3969n;
import p506ak.C14016b;
import p506ak.C14018d;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

public final class BrazeActionReceiver extends BroadcastReceiver {

    /* renamed from: com.braze.receivers.BrazeActionReceiver$a */
    public static final class C5521a {

        /* renamed from: d */
        public static final C5522a f11864d = new C5522a();

        /* renamed from: a */
        public final Context f11865a;

        /* renamed from: b */
        public final Intent f11866b;

        /* renamed from: c */
        public final String f11867c;

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a */
        public static final class C5522a {

            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$a */
            public static final class C5523a extends Lambda implements C19846a<String> {

                /* renamed from: b */
                public final /* synthetic */ int f11868b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C5523a(int i) {
                    super(0);
                    this.f11868b = i;
                }

                /* renamed from: a */
                public final String invoke() {
                    return C19383o.m32802l(Integer.valueOf(this.f11868b), "Location Services error: ");
                }
            }

            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$b */
            public static final class C5524b extends Lambda implements C19846a<String> {

                /* renamed from: b */
                public final /* synthetic */ int f11869b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C5524b(int i) {
                    super(0);
                    this.f11869b = i;
                }

                /* renamed from: a */
                public final String invoke() {
                    return C19383o.m32802l(Integer.valueOf(this.f11869b), "Unsupported transition type received: ");
                }
            }

            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$c */
            public static final class C5525c extends Lambda implements C19846a<String> {

                /* renamed from: b */
                public static final C5525c f11870b = new C5525c();

                public C5525c() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Exception while processing location result";
                }
            }

            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$d */
            public static final class C5526d extends Lambda implements C19846a<String> {

                /* renamed from: b */
                public static final C5526d f11871b = new C5526d();

                public C5526d() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Exception while processing single location update";
                }
            }

            /* renamed from: b */
            public static final boolean m11219b(Context context, Location location) {
                C5522a aVar = C5521a.f11864d;
                try {
                    C5381b.m10964d(context, new C3969n(location));
                    return true;
                } catch (Exception e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, aVar, BrazeLogger.Priority.E, e, C5526d.f11871b, 4);
                    return false;
                }
            }

            /* renamed from: a */
            public final boolean mo16067a(Context context, C14018d dVar) {
                C19383o.m32797g(context, "applicationContext");
                int i = dVar.f30853a;
                if (i != -1) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C5523a(i), 6);
                    return false;
                }
                int i2 = dVar.f30854b;
                List<C14016b> list = dVar.f30855c;
                C19383o.m32796f(list, "geofenceEvent.triggeringGeofences");
                if (1 == i2) {
                    for (C14016b requestId : list) {
                        String requestId2 = requestId.getRequestId();
                        C19383o.m32796f(requestId2, "geofence.requestId");
                        C5381b.m10965e(context, requestId2, C3853k1.ENTER);
                    }
                    return true;
                } else if (2 == i2) {
                    for (C14016b requestId3 : list) {
                        String requestId4 = requestId3.getRequestId();
                        C19383o.m32796f(requestId4, "geofence.requestId");
                        C5381b.m10965e(context, requestId4, C3853k1.EXIT);
                    }
                    return true;
                } else {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C5524b(i2), 6);
                    return false;
                }
            }

            /* renamed from: c */
            public final boolean mo16068c(Context context, LocationResult locationResult) {
                C19383o.m32797g(context, "applicationContext");
                try {
                    Location lastLocation = locationResult.getLastLocation();
                    C19383o.m32796f(lastLocation, "locationResult.lastLocation");
                    C5381b.m10966f(context, new C3969n(lastLocation));
                    return true;
                } catch (Exception e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5525c.f11870b, 4);
                    return false;
                }
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$b */
        final class C5527b extends Lambda implements C19846a<String> {
            public C5527b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(C5521a.this.f11867c, "Received intent with action ");
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$c */
        final class C5528c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5528c f11873b = new C5528c();

            public C5528c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Received intent with null action. Doing nothing.";
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$d */
        final class C5529d extends Lambda implements C19846a<String> {
            public C5529d() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(C5521a.this.f11867c, "BrazeActionReceiver received intent with location result: ");
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$e */
        final class C5530e extends Lambda implements C19846a<String> {
            public C5530e() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(C5521a.this.f11867c, "BrazeActionReceiver received intent without location result: ");
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$f */
        final class C5531f extends Lambda implements C19846a<String> {
            public C5531f() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(C5521a.this.f11867c, "BrazeActionReceiver received intent with geofence transition: ");
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$g */
        final class C5532g extends Lambda implements C19846a<String> {
            public C5532g() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(C5521a.this.f11867c, "BrazeActionReceiver received intent with single location update: ");
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$h */
        final class C5533h extends Lambda implements C19846a<String> {
            public C5533h() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(C5521a.this.f11867c, "Unknown intent received in BrazeActionReceiver with action: ");
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$i */
        final class C5534i extends Lambda implements C19846a<String> {
            public C5534i() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Caught exception while performing the BrazeActionReceiver work. Action: ");
                h.append(C5521a.this.f11867c);
                h.append(" Intent: ");
                h.append(C5521a.this.f11866b);
                return h.toString();
            }
        }

        public C5521a(Context context, Intent intent) {
            C19383o.m32797g(intent, "intent");
            this.f11865a = context;
            this.f11866b = intent;
            this.f11867c = intent.getAction();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.location.Location} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo16066a() {
            /*
                r8 = this;
                com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.f11932a
                com.braze.receivers.BrazeActionReceiver$a$b r4 = new com.braze.receivers.BrazeActionReceiver$a$b
                r4.<init>()
                r2 = 0
                r3 = 0
                r5 = 7
                r0 = r6
                r1 = r8
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = r8.f11867c
                if (r0 == 0) goto L_0x00eb
                int r1 = r0.hashCode()
                r2 = -1382373484(0xffffffffad9aa794, float:-1.7582193E-11)
                if (r1 == r2) goto L_0x009d
                r2 = 94647129(0x5a43359, float:1.5441348E-35)
                if (r1 == r2) goto L_0x0053
                r2 = 1794335912(0x6af364a8, float:1.47122155E26)
                if (r1 == r2) goto L_0x0028
                goto L_0x00a5
            L_0x0028:
                java.lang.String r1 = "com.appboy.action.receiver.BRAZE_GEOFENCE_UPDATE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0032
                goto L_0x00a5
            L_0x0032:
                com.braze.receivers.BrazeActionReceiver$a$f r4 = new com.braze.receivers.BrazeActionReceiver$a$f
                r4.<init>()
                r2 = 0
                r3 = 0
                r5 = 7
                r0 = r6
                r1 = r8
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
                com.braze.receivers.BrazeActionReceiver$a$a r0 = f11864d
                android.content.Context r1 = r8.f11865a
                android.content.Intent r2 = r8.f11866b
                ak.d r2 = p506ak.C14018d.m21576a(r2)
                java.lang.String r3 = "fromIntent(intent)"
                kotlin.jvm.internal.C19383o.m32796f(r2, r3)
                r0.mo16067a(r1, r2)
                goto L_0x00f5
            L_0x0053:
                java.lang.String r1 = "com.appboy.action.receiver.SINGLE_LOCATION_UPDATE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x005c
                goto L_0x00a5
            L_0x005c:
                com.braze.receivers.BrazeActionReceiver$a$g r4 = new com.braze.receivers.BrazeActionReceiver$a$g
                r4.<init>()
                r7 = 0
                r3 = 0
                r5 = 7
                r0 = r6
                r1 = r8
                r2 = r7
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                java.lang.String r2 = "location"
                if (r0 < r1) goto L_0x0085
                android.content.Intent r0 = r8.f11866b
                android.os.Bundle r0 = r0.getExtras()
                if (r0 != 0) goto L_0x007b
                goto L_0x0094
            L_0x007b:
                java.lang.Class<android.location.Location> r1 = android.location.Location.class
                java.lang.Object r0 = r0.getParcelable(r2, r1)
                r7 = r0
                android.location.Location r7 = (android.location.Location) r7
                goto L_0x0094
            L_0x0085:
                android.content.Intent r0 = r8.f11866b
                android.os.Bundle r0 = r0.getExtras()
                if (r0 != 0) goto L_0x008e
                goto L_0x0092
            L_0x008e:
                java.lang.Object r7 = r0.get(r2)
            L_0x0092:
                android.location.Location r7 = (android.location.Location) r7
            L_0x0094:
                if (r7 != 0) goto L_0x0097
                goto L_0x00f5
            L_0x0097:
                android.content.Context r0 = r8.f11865a
                com.braze.receivers.BrazeActionReceiver.C5521a.C5522a.m11219b(r0, r7)
                goto L_0x00f5
            L_0x009d:
                java.lang.String r1 = "com.appboy.action.receiver.BRAZE_GEOFENCE_LOCATION_UPDATE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00b4
            L_0x00a5:
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.W
                com.braze.receivers.BrazeActionReceiver$a$h r4 = new com.braze.receivers.BrazeActionReceiver$a$h
                r4.<init>()
                r3 = 0
                r5 = 6
                r0 = r6
                r1 = r8
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
                goto L_0x00f5
            L_0x00b4:
                android.content.Intent r0 = r8.f11866b
                boolean r0 = com.google.android.gms.location.LocationResult.hasResult(r0)
                if (r0 == 0) goto L_0x00dc
                com.braze.receivers.BrazeActionReceiver$a$d r4 = new com.braze.receivers.BrazeActionReceiver$a$d
                r4.<init>()
                r2 = 0
                r3 = 0
                r5 = 7
                r0 = r6
                r1 = r8
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
                com.braze.receivers.BrazeActionReceiver$a$a r0 = f11864d
                android.content.Context r1 = r8.f11865a
                android.content.Intent r2 = r8.f11866b
                com.google.android.gms.location.LocationResult r2 = com.google.android.gms.location.LocationResult.extractResult(r2)
                java.lang.String r3 = "extractResult(intent)"
                kotlin.jvm.internal.C19383o.m32796f(r2, r3)
                r0.mo16068c(r1, r2)
                goto L_0x00ea
            L_0x00dc:
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.W
                com.braze.receivers.BrazeActionReceiver$a$e r4 = new com.braze.receivers.BrazeActionReceiver$a$e
                r4.<init>()
                r3 = 0
                r5 = 6
                r0 = r6
                r1 = r8
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
            L_0x00ea:
                return
            L_0x00eb:
                com.braze.receivers.BrazeActionReceiver$a$c r4 = com.braze.receivers.BrazeActionReceiver.C5521a.C5528c.f11873b
                r2 = 0
                r3 = 0
                r5 = 7
                r0 = r6
                r1 = r8
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
            L_0x00f5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.receivers.BrazeActionReceiver.C5521a.mo16066a():void");
        }
    }

    /* renamed from: com.braze.receivers.BrazeActionReceiver$b */
    public static final class C5535b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5535b f11880b = new C5535b();

        public C5535b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "BrazeActionReceiver received null intent. Doing nothing.";
        }
    }

    /* renamed from: com.braze.receivers.BrazeActionReceiver$c */
    public static final class C5536c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5536c f11881b = new C5536c();

        public C5536c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "BrazeActionReceiver received null context. Doing nothing.";
        }
    }

    @C19060c(mo70540c = "com.braze.receivers.BrazeActionReceiver$onReceive$3", mo70541f = "BrazeActionReceiver.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.receivers.BrazeActionReceiver$d */
    public static final class C5537d extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f11882b;

        /* renamed from: c */
        public final /* synthetic */ C5521a f11883c;

        /* renamed from: d */
        public final /* synthetic */ BroadcastReceiver.PendingResult f11884d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5537d(C5521a aVar, BroadcastReceiver.PendingResult pendingResult, C19340c<? super C5537d> cVar) {
            super(2, cVar);
            this.f11883c = aVar;
            this.f11884d = pendingResult;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C5537d) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5537d(this.f11883c, this.f11884d, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11882b == 0) {
                C0761x.m1684O0(obj);
                C5521a aVar = this.f11883c;
                aVar.getClass();
                try {
                    aVar.mo16066a();
                } catch (Exception e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, aVar, BrazeLogger.Priority.E, e, new C5521a.C5534i(), 4);
                }
                this.f11884d.finish();
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5535b.f11880b, 6);
        } else if (context == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5536c.f11881b, 6);
        } else {
            Context applicationContext = context.getApplicationContext();
            BroadcastReceiver.PendingResult goAsync = goAsync();
            C19383o.m32796f(applicationContext, "applicationContext");
            C19697g.m33468f(C19840y0.f43848b, C19760n0.f43720b, (CoroutineStart) null, new C5537d(new C5521a(applicationContext, intent), goAsync, (C19340c<? super C5537d>) null), 2);
        }
    }
}

package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.MediaBrowserCompat;
import android.support.p013v4.media.session.IMediaSession;
import android.support.p013v4.media.session.MediaSessionCompat;
import android.support.p013v4.p014os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.C19421p;
import p077d1.C6619c;
import p193o.C7494b;
import p261v1.C8192a;

public abstract class MediaBrowserServiceCompat extends Service {
    public static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final float EPSILON = 1.0E-5f;
    public static final String KEY_MEDIA_ITEM = "media_item";
    public static final String KEY_SEARCH_RESULTS = "search_results";
    public static final int RESULT_ERROR = -1;
    public static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    public static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    public static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    public static final String TAG = "MBServiceCompat";
    public final C2909f mConnectionFromFwk = new C2909f("android.media.session.MediaController", -1, -1, (Bundle) null, (C2923o) null);
    public final C7494b<IBinder, C2909f> mConnections = new C7494b<>();
    public C2909f mCurConnection;
    public final C2925q mHandler = new C2925q(this);
    private C2911g mImpl;
    public final ArrayList<C2909f> mPendingConnections = new ArrayList<>();
    public MediaSessionCompat.Token mSession;

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    public class C2904a extends C2920l<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: e */
        public final /* synthetic */ C2909f f6556e;

        /* renamed from: f */
        public final /* synthetic */ String f6557f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f6558g;

        /* renamed from: h */
        public final /* synthetic */ Bundle f6559h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2904a(Object obj, C2909f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f6556e = fVar;
            this.f6557f = str;
            this.f6558g = bundle;
            this.f6559h = bundle2;
        }

        /* renamed from: c */
        public final void mo10892c() {
            List<MediaBrowserCompat.MediaItem> list = null;
            if (MediaBrowserServiceCompat.this.mConnections.getOrDefault(((C2924p) this.f6556e.f6571f).mo10913a(), null) == this.f6556e) {
                if ((this.f6591d & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.applyOptions((List<MediaBrowserCompat.MediaItem>) null, this.f6558g);
                }
                try {
                    ((C2924p) this.f6556e.f6571f).mo10914b(this.f6557f, list, this.f6558g, this.f6559h);
                } catch (RemoteException unused) {
                    StringBuilder h = C0072d.m201h("Calling onLoadChildren() failed for id=");
                    h.append(this.f6557f);
                    h.append(" package=");
                    h.append(this.f6556e.f6566a);
                    Log.w(MediaBrowserServiceCompat.TAG, h.toString());
                }
            } else if (MediaBrowserServiceCompat.DEBUG) {
                StringBuilder h2 = C0072d.m201h("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                h2.append(this.f6556e.f6566a);
                h2.append(" id=");
                h2.append(this.f6557f);
                Log.d(MediaBrowserServiceCompat.TAG, h2.toString());
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    public class C2905b extends C2920l<MediaBrowserCompat.MediaItem> {

        /* renamed from: e */
        public final /* synthetic */ ResultReceiver f6561e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2905b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f6561e = resultReceiver;
        }

        /* renamed from: c */
        public final void mo10892c() {
            if ((this.f6591d & 2) != 0) {
                this.f6561e.send(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, (Parcelable) null);
            this.f6561e.send(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    public class C2906c extends C2920l<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: e */
        public final /* synthetic */ ResultReceiver f6562e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2906c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f6562e = resultReceiver;
        }

        /* renamed from: c */
        public final void mo10892c() {
            int i = this.f6591d & 4;
            this.f6562e.send(-1, (Bundle) null);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    public class C2907d extends C2920l<Bundle> {

        /* renamed from: e */
        public final /* synthetic */ ResultReceiver f6563e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2907d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f6563e = resultReceiver;
        }

        /* renamed from: b */
        public final void mo10893b() {
            this.f6563e.send(-1, (Bundle) null);
        }

        /* renamed from: c */
        public final void mo10892c() {
            this.f6563e.send(0, (Bundle) null);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C2908e {

        /* renamed from: a */
        public final String f6564a;

        /* renamed from: b */
        public final Bundle f6565b;

        public C2908e(String str, Bundle bundle) {
            if (str != null) {
                this.f6564a = str;
                this.f6565b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    public class C2909f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f6566a;

        /* renamed from: b */
        public final int f6567b;

        /* renamed from: c */
        public final int f6568c;

        /* renamed from: d */
        public final C8192a f6569d;

        /* renamed from: e */
        public final Bundle f6570e;

        /* renamed from: f */
        public final C2923o f6571f;

        /* renamed from: g */
        public final HashMap<String, List<C6619c<IBinder, Bundle>>> f6572g = new HashMap<>();

        /* renamed from: h */
        public C2908e f6573h;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        public class C2910a implements Runnable {
            public C2910a() {
            }

            public final void run() {
                C2909f fVar = C2909f.this;
                MediaBrowserServiceCompat.this.mConnections.remove(((C2924p) fVar.f6571f).mo10913a());
            }
        }

        public C2909f(String str, int i, int i2, Bundle bundle, C2923o oVar) {
            this.f6566a = str;
            this.f6567b = i;
            this.f6568c = i2;
            this.f6569d = new C8192a(str, i, i2);
            this.f6570e = bundle;
            this.f6571f = oVar;
        }

        public final void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new C2910a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    public interface C2911g {
        /* renamed from: a */
        void mo10896a();

        /* renamed from: b */
        void mo10897b(C8192a aVar, String str, Bundle bundle);

        /* renamed from: c */
        C8192a mo10898c();

        /* renamed from: d */
        void mo10899d(String str, Bundle bundle);

        /* renamed from: e */
        void mo10900e(MediaSessionCompat.Token token);

        /* renamed from: f */
        Bundle mo10901f();

        /* renamed from: g */
        IBinder mo10902g(Intent intent);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    public class C2912h implements C2911g {

        /* renamed from: a */
        public final ArrayList f6576a = new ArrayList();

        /* renamed from: b */
        public C2914b f6577b;

        /* renamed from: c */
        public Messenger f6578c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        public class C2913a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ MediaSessionCompat.Token f6580b;

            public C2913a(MediaSessionCompat.Token token) {
                this.f6580b = token;
            }

            public final void run() {
                if (!C2912h.this.f6576a.isEmpty()) {
                    IMediaSession extraBinder = this.f6580b.getExtraBinder();
                    if (extraBinder != null) {
                        Iterator it = C2912h.this.f6576a.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", extraBinder.asBinder());
                        }
                    }
                    C2912h.this.f6576a.clear();
                }
                C2912h.this.f6577b.setSessionToken((MediaSession.Token) this.f6580b.getToken());
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$b */
        public class C2914b extends MediaBrowserService {
            public C2914b(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                attachBaseContext(mediaBrowserServiceCompat);
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
            /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
            @android.annotation.SuppressLint({"SyntheticAccessor"})
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String r12, int r13, android.os.Bundle r14) {
                /*
                    r11 = this;
                    android.support.p013v4.media.session.MediaSessionCompat.ensureClassLoader(r14)
                    androidx.media.MediaBrowserServiceCompat$h r0 = androidx.media.MediaBrowserServiceCompat.C2912h.this
                    r1 = 0
                    if (r14 != 0) goto L_0x000a
                    r2 = r1
                    goto L_0x000f
                L_0x000a:
                    android.os.Bundle r2 = new android.os.Bundle
                    r2.<init>(r14)
                L_0x000f:
                    r14 = -1
                    if (r2 == 0) goto L_0x006b
                    r0.getClass()
                    r3 = 0
                    java.lang.String r4 = "extra_client_version"
                    int r3 = r2.getInt(r4, r3)
                    if (r3 == 0) goto L_0x006b
                    r2.remove(r4)
                    android.os.Messenger r3 = new android.os.Messenger
                    androidx.media.MediaBrowserServiceCompat r4 = androidx.media.MediaBrowserServiceCompat.this
                    androidx.media.MediaBrowserServiceCompat$q r4 = r4.mHandler
                    r3.<init>(r4)
                    r0.f6578c = r3
                    android.os.Bundle r3 = new android.os.Bundle
                    r3.<init>()
                    r4 = 2
                    java.lang.String r5 = "extra_service_version"
                    r3.putInt(r5, r4)
                    android.os.Messenger r4 = r0.f6578c
                    android.os.IBinder r4 = r4.getBinder()
                    java.lang.String r5 = "extra_messenger"
                    r3.putBinder(r5, r4)
                    androidx.media.MediaBrowserServiceCompat r4 = androidx.media.MediaBrowserServiceCompat.this
                    android.support.v4.media.session.MediaSessionCompat$Token r4 = r4.mSession
                    if (r4 == 0) goto L_0x005a
                    android.support.v4.media.session.IMediaSession r4 = r4.getExtraBinder()
                    if (r4 != 0) goto L_0x0050
                    r4 = r1
                    goto L_0x0054
                L_0x0050:
                    android.os.IBinder r4 = r4.asBinder()
                L_0x0054:
                    java.lang.String r5 = "extra_session_binder"
                    r3.putBinder(r5, r4)
                    goto L_0x005f
                L_0x005a:
                    java.util.ArrayList r4 = r0.f6576a
                    r4.add(r3)
                L_0x005f:
                    java.lang.String r4 = "extra_calling_pid"
                    int r14 = r2.getInt(r4, r14)
                    r2.remove(r4)
                    r6 = r14
                    r14 = r3
                    goto L_0x006d
                L_0x006b:
                    r6 = r14
                    r14 = r1
                L_0x006d:
                    androidx.media.MediaBrowserServiceCompat$f r10 = new androidx.media.MediaBrowserServiceCompat$f
                    androidx.media.MediaBrowserServiceCompat r4 = androidx.media.MediaBrowserServiceCompat.this
                    r9 = 0
                    r3 = r10
                    r5 = r12
                    r7 = r13
                    r8 = r2
                    r3.<init>(r5, r6, r7, r8, r9)
                    androidx.media.MediaBrowserServiceCompat r3 = androidx.media.MediaBrowserServiceCompat.this
                    r3.mCurConnection = r10
                    androidx.media.MediaBrowserServiceCompat$e r12 = r3.onGetRoot(r12, r13, r2)
                    androidx.media.MediaBrowserServiceCompat r13 = androidx.media.MediaBrowserServiceCompat.this
                    r13.mCurConnection = r1
                    if (r12 != 0) goto L_0x0089
                    r13 = r1
                    goto L_0x00a5
                L_0x0089:
                    android.os.Messenger r0 = r0.f6578c
                    if (r0 == 0) goto L_0x0092
                    java.util.ArrayList<androidx.media.MediaBrowserServiceCompat$f> r13 = r13.mPendingConnections
                    r13.add(r10)
                L_0x0092:
                    if (r14 != 0) goto L_0x0097
                    android.os.Bundle r14 = r12.f6565b
                    goto L_0x009e
                L_0x0097:
                    android.os.Bundle r13 = r12.f6565b
                    if (r13 == 0) goto L_0x009e
                    r14.putAll(r13)
                L_0x009e:
                    androidx.media.MediaBrowserServiceCompat$e r13 = new androidx.media.MediaBrowserServiceCompat$e
                    java.lang.String r12 = r12.f6564a
                    r13.<init>(r12, r14)
                L_0x00a5:
                    if (r13 != 0) goto L_0x00a8
                    goto L_0x00b1
                L_0x00a8:
                    android.service.media.MediaBrowserService$BrowserRoot r1 = new android.service.media.MediaBrowserService$BrowserRoot
                    java.lang.String r12 = r13.f6564a
                    android.os.Bundle r13 = r13.f6565b
                    r1.<init>(r12, r13)
                L_0x00b1:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media.MediaBrowserServiceCompat.C2912h.C2914b.onGetRoot(java.lang.String, int, android.os.Bundle):android.service.media.MediaBrowserService$BrowserRoot");
            }

            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                C2912h hVar = C2912h.this;
                C2921m mVar = new C2921m(result);
                hVar.getClass();
                C2926a aVar = new C2926a(str, mVar);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
                mediaBrowserServiceCompat.onLoadChildren(str, aVar);
                MediaBrowserServiceCompat.this.mCurConnection = null;
            }
        }

        public C2912h() {
        }

        /* renamed from: b */
        public final void mo10897b(C8192a aVar, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new C2928c(this, aVar, str, bundle));
        }

        /* renamed from: c */
        public C8192a mo10898c() {
            C2909f fVar = MediaBrowserServiceCompat.this.mCurConnection;
            if (fVar != null) {
                return fVar.f6569d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        /* renamed from: d */
        public final void mo10899d(String str, Bundle bundle) {
            mo10904i(bundle, str);
            MediaBrowserServiceCompat.this.mHandler.post(new C2927b(this, str, bundle));
        }

        /* renamed from: e */
        public final void mo10900e(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2913a(token));
        }

        /* renamed from: g */
        public final IBinder mo10902g(Intent intent) {
            return this.f6577b.onBind(intent);
        }

        /* renamed from: h */
        public final void mo10903h(C2909f fVar, String str, Bundle bundle) {
            List<C6619c> list = fVar.f6572g.get(str);
            if (list != null) {
                for (C6619c cVar : list) {
                    if (C19421p.m32923M(bundle, (Bundle) cVar.f14607b)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, fVar, (Bundle) cVar.f14607b, bundle);
                    }
                }
            }
        }

        /* renamed from: i */
        public void mo10904i(Bundle bundle, String str) {
            this.f6577b.notifyChildrenChanged(str);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    public class C2915i extends C2912h {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        public class C2916a extends C2912h.C2914b {
            public C2916a(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                super(mediaBrowserServiceCompat);
            }

            public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                C2915i iVar = C2915i.this;
                C2921m mVar = new C2921m(result);
                iVar.getClass();
                C2929d dVar = new C2929d(str, mVar);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
                mediaBrowserServiceCompat.onLoadItem(str, dVar);
                MediaBrowserServiceCompat.this.mCurConnection = null;
            }
        }

        public C2915i() {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    public class C2917j extends C2915i {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        public class C2918a extends C2915i.C2916a {
            public C2918a(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                super(mediaBrowserServiceCompat);
            }

            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                C2917j jVar = C2917j.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
                C2921m mVar = new C2921m(result);
                jVar.getClass();
                C2930e eVar = new C2930e(jVar, str, mVar, bundle);
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.mCurConnection = mediaBrowserServiceCompat2.mConnectionFromFwk;
                mediaBrowserServiceCompat2.onLoadChildren(str, eVar, bundle);
                MediaBrowserServiceCompat.this.mCurConnection = null;
                MediaBrowserServiceCompat.this.mCurConnection = null;
            }
        }

        public C2917j() {
            super();
        }

        /* renamed from: a */
        public final void mo10896a() {
            C2918a aVar = new C2918a(MediaBrowserServiceCompat.this);
            this.f6577b = aVar;
            aVar.onCreate();
        }

        /* renamed from: f */
        public final Bundle mo10901f() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            C2909f fVar = mediaBrowserServiceCompat.mCurConnection;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (fVar == mediaBrowserServiceCompat.mConnectionFromFwk) {
                return this.f6577b.getBrowserRootHints();
            } else {
                if (fVar.f6570e == null) {
                    return null;
                }
                return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.f6570e);
            }
        }

        /* renamed from: i */
        public final void mo10904i(Bundle bundle, String str) {
            if (bundle != null) {
                this.f6577b.notifyChildrenChanged(str, bundle);
            } else {
                super.mo10904i(bundle, str);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    public class C2919k extends C2917j {
        public C2919k() {
            super();
        }

        /* renamed from: c */
        public final C8192a mo10898c() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            C2909f fVar = mediaBrowserServiceCompat.mCurConnection;
            if (fVar != null) {
                return fVar == mediaBrowserServiceCompat.mConnectionFromFwk ? new C8192a(this.f6577b.getCurrentBrowserInfo()) : fVar.f6569d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    public static class C2920l<T> {

        /* renamed from: a */
        public final Object f6588a;

        /* renamed from: b */
        public boolean f6589b;

        /* renamed from: c */
        public boolean f6590c;

        /* renamed from: d */
        public int f6591d;

        public C2920l(Object obj) {
            this.f6588a = obj;
        }

        /* renamed from: a */
        public final boolean mo10910a() {
            return this.f6589b || this.f6590c;
        }

        /* renamed from: b */
        public void mo10893b() {
            StringBuilder h = C0072d.m201h("It is not supported to send an error for ");
            h.append(this.f6588a);
            throw new UnsupportedOperationException(h.toString());
        }

        /* renamed from: c */
        public void mo10892c() {
            throw null;
        }

        /* renamed from: d */
        public final void mo10911d() {
            if (this.f6589b || this.f6590c) {
                StringBuilder h = C0072d.m201h("sendResult() called when either sendResult() or sendError() had already been called for: ");
                h.append(this.f6588a);
                throw new IllegalStateException(h.toString());
            }
            this.f6589b = true;
            mo10892c();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public static class C2921m<T> {

        /* renamed from: a */
        public MediaBrowserService.Result f6592a;

        public C2921m(MediaBrowserService.Result result) {
            this.f6592a = result;
        }

        /* renamed from: a */
        public final void mo10912a(T t) {
            ArrayList arrayList = null;
            if (t instanceof List) {
                MediaBrowserService.Result result = this.f6592a;
                List<Parcel> list = (List) t;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Parcel parcel : list) {
                        parcel.setDataPosition(0);
                        arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                result.sendResult(arrayList);
            } else if (t instanceof Parcel) {
                Parcel parcel2 = (Parcel) t;
                parcel2.setDataPosition(0);
                this.f6592a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            } else {
                this.f6592a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    public class C2922n {
        public C2922n() {
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    public interface C2923o {
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    public static class C2924p implements C2923o {

        /* renamed from: a */
        public final Messenger f6594a;

        public C2924p(Messenger messenger) {
            this.f6594a = messenger;
        }

        /* renamed from: a */
        public final IBinder mo10913a() {
            return this.f6594a.getBinder();
        }

        /* renamed from: b */
        public final void mo10914b(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            mo10915c(3, bundle3);
        }

        /* renamed from: c */
        public final void mo10915c(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f6594a.send(obtain);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$q */
    public final class C2925q extends Handler {

        /* renamed from: a */
        public final C2922n f6595a;

        public C2925q(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f6595a = new C2922n();
        }

        /* renamed from: a */
        public final void mo10916a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            Bundle data = message.getData();
            switch (message2.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    C2922n nVar = this.f6595a;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    C2924p pVar = new C2924p(message2.replyTo);
                    if (MediaBrowserServiceCompat.this.isValidPackage(string, i2)) {
                        MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2931f(i, i2, bundle, nVar, pVar, string));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
                case 2:
                    C2922n nVar2 = this.f6595a;
                    MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2932g(nVar2, new C2924p(message2.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    C2922n nVar3 = this.f6595a;
                    String string2 = data.getString("data_media_item_id");
                    IBinder binder = data.getBinder("data_callback_token");
                    MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2933h(nVar3, new C2924p(message2.replyTo), string2, binder, bundle2));
                    return;
                case 4:
                    C2922n nVar4 = this.f6595a;
                    String string3 = data.getString("data_media_item_id");
                    IBinder binder2 = data.getBinder("data_callback_token");
                    MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2934i(nVar4, new C2924p(message2.replyTo), string3, binder2));
                    return;
                case 5:
                    C2922n nVar5 = this.f6595a;
                    String string4 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C2924p pVar2 = new C2924p(message2.replyTo);
                    nVar5.getClass();
                    if (!TextUtils.isEmpty(string4) && resultReceiver != null) {
                        MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2935j(nVar5, pVar2, string4, resultReceiver));
                        return;
                    }
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    C2922n nVar6 = this.f6595a;
                    C2924p pVar3 = new C2924p(message2.replyTo);
                    String string5 = data.getString("data_package_name");
                    int i3 = data.getInt("data_calling_pid");
                    MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2936k(data.getInt("data_calling_uid"), i3, bundle3, nVar6, pVar3, string5));
                    return;
                case 7:
                    C2922n nVar7 = this.f6595a;
                    MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2937l(nVar7, new C2924p(message2.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    C2922n nVar8 = this.f6595a;
                    String string6 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C2924p pVar4 = new C2924p(message2.replyTo);
                    nVar8.getClass();
                    if (!TextUtils.isEmpty(string6) && resultReceiver2 != null) {
                        MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2938m(nVar8, pVar4, string6, bundle4, resultReceiver2));
                        return;
                    }
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    C2922n nVar9 = this.f6595a;
                    String string7 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C2924p pVar5 = new C2924p(message2.replyTo);
                    nVar9.getClass();
                    if (!TextUtils.isEmpty(string7) && resultReceiver3 != null) {
                        MediaBrowserServiceCompat.this.mHandler.mo10916a(new C2939n(nVar9, pVar5, string7, bundle5, resultReceiver3));
                        return;
                    }
                    return;
                default:
                    Log.w(MediaBrowserServiceCompat.TAG, "Unhandled message: " + message2 + "\n  Service version: " + 2 + "\n  Client version: " + message2.arg1);
                    return;
            }
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public void addSubscription(String str, C2909f fVar, IBinder iBinder, Bundle bundle) {
        List<C6619c> list = fVar.f6572g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C6619c cVar : list) {
            if (iBinder == cVar.f14606a && C19421p.m32960y(bundle, (Bundle) cVar.f14607b)) {
                return;
            }
        }
        list.add(new C6619c(iBinder, bundle));
        fVar.f6572g.put(str, list);
        performLoadChildren(str, fVar, bundle, (Bundle) null);
        this.mCurConnection = fVar;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }

    public List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Bundle getBrowserRootHints() {
        return this.mImpl.mo10901f();
    }

    public final C8192a getCurrentBrowserInfo() {
        return this.mImpl.mo10898c();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.mSession;
    }

    public boolean isValidPackage(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void notifyChildrenChanged(String str) {
        if (str != null) {
            this.mImpl.mo10899d(str, (Bundle) null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public IBinder onBind(Intent intent) {
        return this.mImpl.mo10902g(intent);
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new C2919k();
        } else {
            this.mImpl = new C2917j();
        }
        this.mImpl.mo10896a();
    }

    public void onCustomAction(String str, Bundle bundle, C2920l<Bundle> lVar) {
        if (lVar.f6589b || lVar.f6590c) {
            StringBuilder h = C0072d.m201h("sendError() called when either sendResult() or sendError() had already been called for: ");
            h.append(lVar.f6588a);
            throw new IllegalStateException(h.toString());
        }
        lVar.f6590c = true;
        lVar.mo10893b();
    }

    public abstract C2908e onGetRoot(String str, int i, Bundle bundle);

    public abstract void onLoadChildren(String str, C2920l<List<MediaBrowserCompat.MediaItem>> lVar);

    public void onLoadChildren(String str, C2920l<List<MediaBrowserCompat.MediaItem>> lVar, Bundle bundle) {
        lVar.f6591d = 1;
        onLoadChildren(str, lVar);
    }

    public void onLoadItem(String str, C2920l<MediaBrowserCompat.MediaItem> lVar) {
        lVar.f6591d = 2;
        lVar.mo10911d();
    }

    public void onSearch(String str, Bundle bundle, C2920l<List<MediaBrowserCompat.MediaItem>> lVar) {
        lVar.f6591d = 4;
        lVar.mo10911d();
    }

    public void onSubscribe(String str, Bundle bundle) {
    }

    public void onUnsubscribe(String str) {
    }

    public void performCustomAction(String str, Bundle bundle, C2909f fVar, ResultReceiver resultReceiver) {
        C2907d dVar = new C2907d(str, resultReceiver);
        this.mCurConnection = fVar;
        onCustomAction(str, bundle, dVar);
        this.mCurConnection = null;
        if (!dVar.mo10910a()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    public void performLoadChildren(String str, C2909f fVar, Bundle bundle, Bundle bundle2) {
        C2904a aVar = new C2904a(str, fVar, str, bundle, bundle2);
        this.mCurConnection = fVar;
        if (bundle == null) {
            onLoadChildren(str, aVar);
        } else {
            onLoadChildren(str, aVar, bundle);
        }
        this.mCurConnection = null;
        if (!aVar.mo10910a()) {
            throw new IllegalStateException(C0070b.m184f(C0072d.m201h("onLoadChildren must call detach() or sendResult() before returning for package="), fVar.f6566a, " id=", str));
        }
    }

    public void performLoadItem(String str, C2909f fVar, ResultReceiver resultReceiver) {
        C2905b bVar = new C2905b(str, resultReceiver);
        this.mCurConnection = fVar;
        onLoadItem(str, bVar);
        this.mCurConnection = null;
        if (!bVar.mo10910a()) {
            throw new IllegalStateException(C0326j.m864i("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }

    public void performSearch(String str, Bundle bundle, C2909f fVar, ResultReceiver resultReceiver) {
        C2906c cVar = new C2906c(str, resultReceiver);
        this.mCurConnection = fVar;
        onSearch(str, bundle, cVar);
        this.mCurConnection = null;
        if (!cVar.mo10910a()) {
            throw new IllegalStateException(C0326j.m864i("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }

    public boolean removeSubscription(String str, C2909f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.f6572g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.mCurConnection = fVar;
                onUnsubscribe(str);
                this.mCurConnection = null;
            }
        } else {
            List list = fVar.f6572g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C6619c) it.next()).f14606a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f6572g.remove(str);
                }
            }
            this.mCurConnection = fVar;
            onUnsubscribe(str);
            this.mCurConnection = null;
            return z2;
        }
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.mSession == null) {
            this.mSession = token;
            this.mImpl.mo10900e(token);
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }

    public void notifyChildrenChanged(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.mImpl.mo10899d(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    public void notifyChildrenChanged(C8192a aVar, String str, Bundle bundle) {
        if (aVar == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        } else if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.mImpl.mo10897b(aVar, str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }
}

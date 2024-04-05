package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.C0165m;
import androidx.appcompat.app.C0172o;
import androidx.appcompat.view.C0194a;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0317g;
import androidx.appcompat.widget.C0323i0;
import androidx.appcompat.widget.C0353t0;
import androidx.appcompat.widget.C0357w;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.core.view.C2330s0;
import androidx.core.view.C2332t0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.google.android.play.core.assetpacks.C15588c1;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19382n;
import org.apache.commons.lang3.time.DateUtils;
import p075d.C6614a;
import p193o.C7498f;
import p193o.C7506i;
import p250u0.C8090f;
import p628nj.C18263b;

public final class AppCompatDelegateImpl extends C0156f implements MenuBuilder.C0200a, LayoutInflater.Factory2 {

    /* renamed from: k1 */
    public static final C7506i<String, Integer> f290k1 = new C7506i<>();

    /* renamed from: l1 */
    public static final int[] f291l1 = {16842836};

    /* renamed from: m1 */
    public static final boolean f292m1 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: n1 */
    public static final boolean f293n1 = true;

    /* renamed from: A */
    public boolean f294A;

    /* renamed from: B */
    public boolean f295B;

    /* renamed from: C */
    public boolean f296C;

    /* renamed from: D */
    public boolean f297D;

    /* renamed from: E */
    public boolean f298E;

    /* renamed from: F */
    public boolean f299F;

    /* renamed from: G */
    public boolean f300G;

    /* renamed from: H */
    public PanelFeatureState[] f301H;

    /* renamed from: I */
    public PanelFeatureState f302I;

    /* renamed from: J */
    public boolean f303J;

    /* renamed from: K */
    public boolean f304K;

    /* renamed from: L */
    public boolean f305L;

    /* renamed from: M */
    public boolean f306M;

    /* renamed from: N */
    public Configuration f307N;

    /* renamed from: O */
    public int f308O = -100;

    /* renamed from: P */
    public int f309P;

    /* renamed from: Q */
    public boolean f310Q;

    /* renamed from: R */
    public boolean f311R;

    /* renamed from: S */
    public C0147i f312S;

    /* renamed from: T */
    public C0144g f313T;

    /* renamed from: V */
    public boolean f314V;

    /* renamed from: W */
    public int f315W;

    /* renamed from: X */
    public final C0137a f316X = new C0137a();

    /* renamed from: Y */
    public boolean f317Y;

    /* renamed from: Z */
    public Rect f318Z;

    /* renamed from: e */
    public final Object f319e;

    /* renamed from: f */
    public final Context f320f;

    /* renamed from: g */
    public Window f321g;

    /* renamed from: h */
    public C0143f f322h;

    /* renamed from: i */
    public final C0155e f323i;

    /* renamed from: j */
    public ActionBar f324j;

    /* renamed from: j1 */
    public C0162k f325j1;

    /* renamed from: k */
    public SupportMenuInflater f326k;

    /* renamed from: k0 */
    public Rect f327k0;

    /* renamed from: l */
    public CharSequence f328l;

    /* renamed from: m */
    public C0357w f329m;

    /* renamed from: n */
    public C0140d f330n;

    /* renamed from: o */
    public C0149k f331o;

    /* renamed from: p */
    public C0194a f332p;

    /* renamed from: q */
    public ActionBarContextView f333q;

    /* renamed from: r */
    public PopupWindow f334r;

    /* renamed from: s */
    public C0159i f335s;

    /* renamed from: t */
    public C2330s0 f336t = null;

    /* renamed from: u */
    public boolean f337u = true;

    /* renamed from: v */
    public boolean f338v;

    /* renamed from: w */
    public ViewGroup f339w;

    /* renamed from: x */
    public TextView f340x;

    /* renamed from: y */
    public View f341y;

    /* renamed from: z */
    public boolean f342z;

    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f343a;

        /* renamed from: b */
        public int f344b;

        /* renamed from: c */
        public int f345c;

        /* renamed from: d */
        public int f346d;

        /* renamed from: e */
        public C0148j f347e;

        /* renamed from: f */
        public View f348f;

        /* renamed from: g */
        public View f349g;

        /* renamed from: h */
        public MenuBuilder f350h;

        /* renamed from: i */
        public ListMenuPresenter f351i;

        /* renamed from: j */
        public ContextThemeWrapper f352j;

        /* renamed from: k */
        public boolean f353k;

        /* renamed from: l */
        public boolean f354l;

        /* renamed from: m */
        public boolean f355m;

        /* renamed from: n */
        public boolean f356n = false;

        /* renamed from: o */
        public boolean f357o;

        /* renamed from: p */
        public Bundle f358p;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0136a();

            /* renamed from: b */
            public int f359b;

            /* renamed from: c */
            public boolean f360c;

            /* renamed from: d */
            public Bundle f361d;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            public class C0136a implements Parcelable.ClassLoaderCreator<SavedState> {
                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m471a(parcel, classLoader);
                }

                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.m471a(parcel, (ClassLoader) null);
                }
            }

            /* renamed from: a */
            public static SavedState m471a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f359b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f360c = z;
                if (z) {
                    savedState.f361d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f359b);
                parcel.writeInt(this.f360c ? 1 : 0);
                if (this.f360c) {
                    parcel.writeBundle(this.f361d);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f343a = i;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    public class C0137a implements Runnable {
        public C0137a() {
        }

        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f315W & 1) != 0) {
                appCompatDelegateImpl.mo1298L(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f315W & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                appCompatDelegateImpl2.mo1298L(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f314V = false;
            appCompatDelegateImpl3.f315W = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    public class C0138b implements C0151a {
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    public interface C0139c {
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    public final class C0140d implements C0218f.C0219a {
        public C0140d() {
        }

        /* renamed from: a */
        public final boolean mo1342a(MenuBuilder menuBuilder) {
            Window.Callback Q = AppCompatDelegateImpl.this.mo1303Q();
            if (Q == null) {
                return true;
            }
            Q.onMenuOpened(108, menuBuilder);
            return true;
        }

        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.mo1295H(menuBuilder);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    public class C0141e implements C0194a.C0195a {

        /* renamed from: a */
        public C0194a.C0195a f364a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e$a */
        public class C0142a extends C19382n {
            public C0142a() {
            }

            public final void onAnimationEnd() {
                AppCompatDelegateImpl.this.f333q.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f334r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f333q.getParent() instanceof View) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2372h.m5253c((View) AppCompatDelegateImpl.this.f333q.getParent());
                }
                AppCompatDelegateImpl.this.f333q.killMode();
                AppCompatDelegateImpl.this.f336t.mo8921d((C2332t0) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f336t = null;
                ViewGroup viewGroup = appCompatDelegateImpl2.f339w;
                WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                C2364y.C2372h.m5253c(viewGroup);
            }
        }

        public C0141e(C0194a.C0195a aVar) {
            this.f364a = aVar;
        }

        /* renamed from: a */
        public final void mo1344a(C0194a aVar) {
            this.f364a.mo1344a(aVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f334r != null) {
                appCompatDelegateImpl.f321g.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f335s);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f333q != null) {
                C2330s0 s0Var = appCompatDelegateImpl2.f336t;
                if (s0Var != null) {
                    s0Var.mo8919b();
                }
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                C2330s0 a = C2364y.m5186a(appCompatDelegateImpl3.f333q);
                a.mo8918a(0.0f);
                appCompatDelegateImpl3.f336t = a;
                AppCompatDelegateImpl.this.f336t.mo8921d(new C0142a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            C0155e eVar = appCompatDelegateImpl4.f323i;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(appCompatDelegateImpl4.f332p);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f332p = null;
            ViewGroup viewGroup = appCompatDelegateImpl5.f339w;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2372h.m5253c(viewGroup);
        }

        /* renamed from: b */
        public final boolean mo1345b(C0194a aVar, MenuBuilder menuBuilder) {
            return this.f364a.mo1345b(aVar, menuBuilder);
        }

        /* renamed from: c */
        public final boolean mo1346c(C0194a aVar, MenuItem menuItem) {
            return this.f364a.mo1346c(aVar, menuItem);
        }

        /* renamed from: d */
        public final boolean mo1347d(C0194a aVar, MenuBuilder menuBuilder) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.f339w;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2372h.m5253c(viewGroup);
            return this.f364a.mo1347d(aVar, menuBuilder);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    public class C0143f extends WindowCallbackWrapper {

        /* renamed from: b */
        public C0139c f367b;

        public C0143f(Window.Callback callback) {
            super(callback);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo1297K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
            if (r6 != false) goto L_0x0048;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004d
                androidx.appcompat.app.AppCompatDelegateImpl r0 = androidx.appcompat.app.AppCompatDelegateImpl.this
                int r3 = r6.getKeyCode()
                r0.mo1304R()
                androidx.appcompat.app.ActionBar r4 = r0.f324j
                if (r4 == 0) goto L_0x001c
                boolean r3 = r4.mo1183l(r3, r6)
                if (r3 == 0) goto L_0x001c
                goto L_0x0048
            L_0x001c:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.f302I
                if (r3 == 0) goto L_0x0031
                int r4 = r6.getKeyCode()
                boolean r3 = r0.mo1307U(r3, r4, r6)
                if (r3 == 0) goto L_0x0031
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r6 = r0.f302I
                if (r6 == 0) goto L_0x0048
                r6.f354l = r2
                goto L_0x0048
            L_0x0031:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.f302I
                if (r3 != 0) goto L_0x004a
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.mo1302P(r1)
                r0.mo1308V(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.mo1307U(r3, r4, r6)
                r3.f353k = r1
                if (r6 == 0) goto L_0x004a
            L_0x0048:
                r6 = r2
                goto L_0x004b
            L_0x004a:
                r6 = r1
            L_0x004b:
                if (r6 == 0) goto L_0x004e
            L_0x004d:
                r1 = r2
            L_0x004e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.C0143f.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public final void onContentChanged() {
        }

        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public final View onCreatePanelView(int i) {
            C0139c cVar = this.f367b;
            if (cVar != null) {
                View view = i == 0 ? new View(C0165m.this.f399a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i);
        }

        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.mo1304R();
                ActionBar actionBar = appCompatDelegateImpl.f324j;
                if (actionBar != null) {
                    actionBar.mo1174c(true);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
            return true;
        }

        public final void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.mo1304R();
                ActionBar actionBar = appCompatDelegateImpl.f324j;
                if (actionBar != null) {
                    actionBar.mo1174c(false);
                }
            } else if (i == 0) {
                PanelFeatureState P = appCompatDelegateImpl.mo1302P(i);
                if (P.f355m) {
                    appCompatDelegateImpl.mo1296I(P, false);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            C0139c cVar = this.f367b;
            if (cVar != null) {
                C0165m.C0170e eVar = (C0165m.C0170e) cVar;
                if (i == 0) {
                    C0165m mVar = C0165m.this;
                    if (!mVar.f402d) {
                        mVar.f399a.f914m = true;
                        mVar.f402d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            MenuBuilder menuBuilder = AppCompatDelegateImpl.this.mo1302P(0).f350h;
            if (menuBuilder != null) {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f337u || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            SupportActionModeWrapper.C0191a aVar = new SupportActionModeWrapper.C0191a(appCompatDelegateImpl.f320f, callback);
            C0194a D = AppCompatDelegateImpl.this.mo1291D(aVar);
            if (D != null) {
                return aVar.mo1609e(D);
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    public class C0144g extends C0145h {

        /* renamed from: c */
        public final PowerManager f369c;

        public C0144g(Context context) {
            super();
            this.f369c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* renamed from: b */
        public final IntentFilter mo1360b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public final int mo1361c() {
            return this.f369c.isPowerSaveMode() ? 2 : 1;
        }

        /* renamed from: d */
        public final void mo1362d() {
            AppCompatDelegateImpl.this.mo1313d();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    public abstract class C0145h {

        /* renamed from: a */
        public C0146a f371a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h$a */
        public class C0146a extends BroadcastReceiver {
            public C0146a() {
            }

            public final void onReceive(Context context, Intent intent) {
                C0145h.this.mo1362d();
            }
        }

        public C0145h() {
        }

        /* renamed from: a */
        public final void mo1363a() {
            C0146a aVar = this.f371a;
            if (aVar != null) {
                try {
                    AppCompatDelegateImpl.this.f320f.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f371a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo1360b();

        /* renamed from: c */
        public abstract int mo1361c();

        /* renamed from: d */
        public abstract void mo1362d();

        /* renamed from: e */
        public final void mo1364e() {
            mo1363a();
            IntentFilter b = mo1360b();
            if (b != null && b.countActions() != 0) {
                if (this.f371a == null) {
                    this.f371a = new C0146a();
                }
                AppCompatDelegateImpl.this.f320f.registerReceiver(this.f371a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    public class C0147i extends C0145h {

        /* renamed from: c */
        public final C0172o f374c;

        public C0147i(C0172o oVar) {
            super();
            this.f374c = oVar;
        }

        /* renamed from: b */
        public final IntentFilter mo1360b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public final int mo1361c() {
            boolean z;
            Location location;
            long j;
            Location location2;
            C0172o oVar = this.f374c;
            C0172o.C0173a aVar = oVar.f420c;
            boolean z2 = false;
            if (aVar.f422b > System.currentTimeMillis()) {
                z = aVar.f421a;
            } else {
                Location location3 = null;
                if (C15588c1.m25294N(oVar.f418a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    try {
                        if (oVar.f419b.isProviderEnabled("network")) {
                            location2 = oVar.f419b.getLastKnownLocation("network");
                            location = location2;
                        }
                    } catch (Exception e) {
                        Log.d("TwilightManager", "Failed to get last known location", e);
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (C15588c1.m25294N(oVar.f418a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (oVar.f419b.isProviderEnabled("gps")) {
                            location3 = oVar.f419b.getLastKnownLocation("gps");
                        }
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                }
                if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                    location = location3;
                }
                if (location != null) {
                    C0172o.C0173a aVar2 = oVar.f420c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C0171n.f413d == null) {
                        C0171n.f413d = new C0171n();
                    }
                    C0171n nVar = C0171n.f413d;
                    C0171n nVar2 = nVar;
                    nVar2.mo1426a(location.getLatitude(), location.getLongitude(), currentTimeMillis - DateUtils.MILLIS_PER_DAY);
                    nVar2.mo1426a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                    if (nVar.f416c == 1) {
                        z2 = true;
                    }
                    long j2 = nVar.f415b;
                    long j3 = nVar.f414a;
                    long j4 = j2;
                    nVar.mo1426a(location.getLatitude(), location.getLongitude(), currentTimeMillis + DateUtils.MILLIS_PER_DAY);
                    long j5 = nVar.f415b;
                    if (j4 == -1 || j3 == -1) {
                        j = 43200000 + currentTimeMillis;
                    } else {
                        j = (currentTimeMillis > j3 ? j5 + 0 : currentTimeMillis > j4 ? j3 + 0 : j4 + 0) + DateUtils.MILLIS_PER_MINUTE;
                    }
                    aVar2.f421a = z2;
                    aVar2.f422b = j;
                    z = aVar.f421a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z2 = true;
                    }
                    z = z2;
                }
            }
            return z ? 2 : 1;
        }

        /* renamed from: d */
        public final void mo1362d() {
            AppCompatDelegateImpl.this.mo1313d();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    public class C0148j extends ContentFrameLayout {
        public C0148j(ContextThemeWrapper contextThemeWrapper) {
            super(contextThemeWrapper);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo1297K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.mo1296I(appCompatDelegateImpl.mo1302P(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C6614a.m12981a(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    public final class C0149k implements C0218f.C0219a {
        public C0149k() {
        }

        /* renamed from: a */
        public final boolean mo1342a(MenuBuilder menuBuilder) {
            Window.Callback Q;
            if (menuBuilder != menuBuilder.getRootMenu()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f295B || (Q = appCompatDelegateImpl.mo1303Q()) == null || AppCompatDelegateImpl.this.f306M) {
                return true;
            }
            Q.onMenuOpened(108, menuBuilder);
            return true;
        }

        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            PanelFeatureState panelFeatureState;
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            int i = 0;
            boolean z2 = rootMenu != menuBuilder;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = rootMenu;
            }
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.f301H;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.f350h == menuBuilder) {
                        break;
                    }
                    i++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo1294G(panelFeatureState.f343a, panelFeatureState, rootMenu);
                AppCompatDelegateImpl.this.mo1296I(panelFeatureState, true);
                return;
            }
            AppCompatDelegateImpl.this.mo1296I(panelFeatureState, z);
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, C0155e eVar, Object obj) {
        C7506i<String, Integer> iVar;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.f320f = context;
        this.f323i = eVar;
        this.f319e = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.f308O = appCompatActivity.getDelegate().mo1317h();
            }
        }
        if (this.f308O == -100 && (orDefault = iVar.getOrDefault(this.f319e.getClass().getName(), null)) != null) {
            this.f308O = orDefault.intValue();
            (iVar = f290k1).remove(this.f319e.getClass().getName());
        }
        if (window != null) {
            mo1293F(window);
        }
        C0317g.m822d();
    }

    /* renamed from: J */
    public static Configuration m424J(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: A */
    public final void mo1288A(Toolbar toolbar) {
        if (this.f319e instanceof Activity) {
            mo1304R();
            ActionBar actionBar = this.f324j;
            if (!(actionBar instanceof C0174p)) {
                this.f326k = null;
                if (actionBar != null) {
                    actionBar.mo1182k();
                }
                this.f324j = null;
                if (toolbar != null) {
                    Object obj = this.f319e;
                    C0165m mVar = new C0165m(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f328l, this.f322h);
                    this.f324j = mVar;
                    this.f322h.f367b = mVar.f401c;
                } else {
                    this.f322h.f367b = null;
                }
                mo1321l();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: B */
    public final void mo1289B(int i) {
        this.f309P = i;
    }

    /* renamed from: C */
    public final void mo1290C(CharSequence charSequence) {
        this.f328l = charSequence;
        C0357w wVar = this.f329m;
        if (wVar != null) {
            wVar.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f324j;
        if (actionBar != null) {
            actionBar.mo1169F(charSequence);
            return;
        }
        TextView textView = this.f340x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0144, code lost:
        if (androidx.core.view.C2364y.C2371g.m5246c(r8) != false) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.appcompat.view.C0194a mo1291D(androidx.appcompat.view.C0194a.C0195a r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x01ab
            androidx.appcompat.view.a r0 = r7.f332p
            if (r0 == 0) goto L_0x0009
            r0.mo1432c()
        L_0x0009:
            androidx.appcompat.app.AppCompatDelegateImpl$e r0 = new androidx.appcompat.app.AppCompatDelegateImpl$e
            r0.<init>(r8)
            r7.mo1304R()
            androidx.appcompat.app.ActionBar r8 = r7.f324j
            if (r8 == 0) goto L_0x0024
            androidx.appcompat.view.a r8 = r8.mo1171H(r0)
            r7.f332p = r8
            if (r8 == 0) goto L_0x0024
            androidx.appcompat.app.e r1 = r7.f323i
            if (r1 == 0) goto L_0x0024
            r1.onSupportActionModeStarted(r8)
        L_0x0024:
            androidx.appcompat.view.a r8 = r7.f332p
            if (r8 != 0) goto L_0x01a8
            androidx.core.view.s0 r8 = r7.f336t
            if (r8 == 0) goto L_0x002f
            r8.mo8919b()
        L_0x002f:
            androidx.appcompat.view.a r8 = r7.f332p
            if (r8 == 0) goto L_0x0036
            r8.mo1432c()
        L_0x0036:
            androidx.appcompat.app.e r8 = r7.f323i
            r1 = 0
            if (r8 == 0) goto L_0x0044
            boolean r2 = r7.f306M
            if (r2 != 0) goto L_0x0044
            androidx.appcompat.view.a r8 = r8.onWindowStartingSupportActionMode(r0)     // Catch:{ AbstractMethodError -> 0x0044 }
            goto L_0x0045
        L_0x0044:
            r8 = r1
        L_0x0045:
            if (r8 == 0) goto L_0x004b
            r7.f332p = r8
            goto L_0x0199
        L_0x004b:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333q
            r2 = 1
            r3 = 0
            if (r8 != 0) goto L_0x0107
            boolean r8 = r7.f298E
            if (r8 == 0) goto L_0x00da
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.Context r4 = r7.f320f
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130968587(0x7f04000b, float:1.7545832E38)
            r4.resolveAttribute(r5, r8, r2)
            int r5 = r8.resourceId
            if (r5 == 0) goto L_0x008b
            android.content.Context r5 = r7.f320f
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r8.resourceId
            r5.applyStyle(r4, r2)
            androidx.appcompat.view.ContextThemeWrapper r4 = new androidx.appcompat.view.ContextThemeWrapper
            android.content.Context r6 = r7.f320f
            r4.<init>((android.content.Context) r6, (int) r3)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x008d
        L_0x008b:
            android.content.Context r4 = r7.f320f
        L_0x008d:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f333q = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            r6 = 2130968602(0x7f04001a, float:1.7545862E38)
            r5.<init>(r4, r1, r6)
            r7.f334r = r5
            r6 = 2
            androidx.core.widget.C2403g.m5358d(r5, r6)
            android.widget.PopupWindow r5 = r7.f334r
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f333q
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f334r
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            r6 = 2130968581(0x7f040005, float:1.754582E38)
            r5.resolveAttribute(r6, r8, r2)
            int r8 = r8.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r8 = android.util.TypedValue.complexToDimensionPixelSize(r8, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f333q
            r4.setContentHeight(r8)
            android.widget.PopupWindow r8 = r7.f334r
            r4 = -2
            r8.setHeight(r4)
            androidx.appcompat.app.i r8 = new androidx.appcompat.app.i
            r8.<init>(r7)
            r7.f335s = r8
            goto L_0x0107
        L_0x00da:
            android.view.ViewGroup r8 = r7.f339w
            r4 = 2131427400(0x7f0b0048, float:1.8476415E38)
            android.view.View r8 = r8.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r8 = (androidx.appcompat.widget.ViewStubCompat) r8
            if (r8 == 0) goto L_0x0107
            r7.mo1304R()
            androidx.appcompat.app.ActionBar r4 = r7.f324j
            if (r4 == 0) goto L_0x00f3
            android.content.Context r4 = r4.mo1178g()
            goto L_0x00f4
        L_0x00f3:
            r4 = r1
        L_0x00f4:
            if (r4 != 0) goto L_0x00f8
            android.content.Context r4 = r7.f320f
        L_0x00f8:
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8.setLayoutInflater(r4)
            android.view.View r8 = r8.inflate()
            androidx.appcompat.widget.ActionBarContextView r8 = (androidx.appcompat.widget.ActionBarContextView) r8
            r7.f333q = r8
        L_0x0107:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333q
            if (r8 == 0) goto L_0x0199
            androidx.core.view.s0 r8 = r7.f336t
            if (r8 == 0) goto L_0x0112
            r8.mo8919b()
        L_0x0112:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333q
            r8.killMode()
            androidx.appcompat.view.b r8 = new androidx.appcompat.view.b
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f333q
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f333q
            r8.<init>(r4, r5, r0)
            androidx.appcompat.view.menu.MenuBuilder r4 = r8.f551i
            boolean r0 = r0.mo1345b(r8, r4)
            if (r0 == 0) goto L_0x0197
            r8.mo1438i()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f333q
            r0.initForMode(r8)
            r7.f332p = r8
            boolean r8 = r7.f338v
            if (r8 == 0) goto L_0x0147
            android.view.ViewGroup r8 = r7.f339w
            if (r8 == 0) goto L_0x0147
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r0 = androidx.core.view.C2364y.f5646a
            boolean r8 = androidx.core.view.C2364y.C2371g.m5246c(r8)
            if (r8 == 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r2 = r3
        L_0x0148:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0166
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f333q
            r1 = 0
            r0.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f333q
            androidx.core.view.s0 r0 = androidx.core.view.C2364y.m5186a(r0)
            r0.mo8918a(r8)
            r7.f336t = r0
            androidx.appcompat.app.j r8 = new androidx.appcompat.app.j
            r8.<init>(r7)
            r0.mo8921d(r8)
            goto L_0x0187
        L_0x0166:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f333q
            r0.setAlpha(r8)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333q
            r8.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333q
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0187
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333q
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r0 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2372h.m5253c(r8)
        L_0x0187:
            android.widget.PopupWindow r8 = r7.f334r
            if (r8 == 0) goto L_0x0199
            android.view.Window r8 = r7.f321g
            android.view.View r8 = r8.getDecorView()
            androidx.appcompat.app.i r0 = r7.f335s
            r8.post(r0)
            goto L_0x0199
        L_0x0197:
            r7.f332p = r1
        L_0x0199:
            androidx.appcompat.view.a r8 = r7.f332p
            if (r8 == 0) goto L_0x01a4
            androidx.appcompat.app.e r0 = r7.f323i
            if (r0 == 0) goto L_0x01a4
            r0.onSupportActionModeStarted(r8)
        L_0x01a4:
            androidx.appcompat.view.a r8 = r7.f332p
            r7.f332p = r8
        L_0x01a8:
            androidx.appcompat.view.a r8 = r7.f332p
            return r8
        L_0x01ab:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ActionMode callback can not be null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1291D(androidx.appcompat.view.a$a):androidx.appcompat.view.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0156  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1292E(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.f306M
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r11.f308O
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            int r0 = androidx.appcompat.app.C0156f.f386b
        L_0x000f:
            android.content.Context r2 = r11.f320f
            int r2 = r11.mo1305S(r2, r0)
            android.content.Context r3 = r11.f320f
            r4 = 0
            android.content.res.Configuration r3 = m424J(r3, r2, r4)
            boolean r5 = r11.f311R
            r6 = 1
            if (r5 != 0) goto L_0x0065
            java.lang.Object r5 = r11.f319e
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0065
            android.content.Context r5 = r11.f320f
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            if (r5 != 0) goto L_0x0031
            r5 = r1
            goto L_0x0069
        L_0x0031:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x005b }
            r8 = 29
            if (r7 < r8) goto L_0x003a
            r7 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x003c
        L_0x003a:
            r7 = 786432(0xc0000, float:1.102026E-39)
        L_0x003c:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005b }
            android.content.Context r9 = r11.f320f     // Catch:{ NameNotFoundException -> 0x005b }
            java.lang.Object r10 = r11.f319e     // Catch:{ NameNotFoundException -> 0x005b }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x005b }
            r8.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x005b }
            android.content.pm.ActivityInfo r5 = r5.getActivityInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x005b }
            if (r5 == 0) goto L_0x0057
            int r5 = r5.configChanges     // Catch:{ NameNotFoundException -> 0x005b }
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0057
            r5 = r6
            goto L_0x0058
        L_0x0057:
            r5 = r1
        L_0x0058:
            r11.f310Q = r5     // Catch:{ NameNotFoundException -> 0x005b }
            goto L_0x0065
        L_0x005b:
            r5 = move-exception
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r8 = "Exception while getting ActivityInfo"
            android.util.Log.d(r7, r8, r5)
            r11.f310Q = r1
        L_0x0065:
            r11.f311R = r6
            boolean r5 = r11.f310Q
        L_0x0069:
            android.content.res.Configuration r7 = r11.f307N
            if (r7 != 0) goto L_0x0077
            android.content.Context r7 = r11.f320f
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
        L_0x0077:
            int r7 = r7.uiMode
            r7 = r7 & 48
            int r3 = r3.uiMode
            r3 = r3 & 48
            if (r7 == r3) goto L_0x00b9
            if (r12 == 0) goto L_0x00b9
            if (r5 != 0) goto L_0x00b9
            boolean r12 = r11.f304K
            if (r12 == 0) goto L_0x00b9
            boolean r12 = f292m1
            if (r12 != 0) goto L_0x0091
            boolean r12 = r11.f305L
            if (r12 == 0) goto L_0x00b9
        L_0x0091:
            java.lang.Object r12 = r11.f319e
            boolean r8 = r12 instanceof android.app.Activity
            if (r8 == 0) goto L_0x00b9
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L_0x00b9
            java.lang.Object r12 = r11.f319e
            android.app.Activity r12 = (android.app.Activity) r12
            int r1 = p250u0.C8077a.f17593c
            int r1 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r1 < r8) goto L_0x00af
            r12.recreate()
            goto L_0x00b8
        L_0x00af:
            boolean r1 = p250u0.C8080b.m16264a(r12)
            if (r1 != 0) goto L_0x00b8
            r12.recreate()
        L_0x00b8:
            r1 = r6
        L_0x00b9:
            if (r1 != 0) goto L_0x011f
            if (r7 == r3) goto L_0x011f
            android.content.Context r12 = r11.f320f
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Configuration r7 = r12.getConfiguration()
            r1.<init>(r7)
            android.content.res.Configuration r7 = r12.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & -49
            r3 = r3 | r7
            r1.uiMode = r3
            r12.updateConfiguration(r1, r4)
            int r12 = r11.f309P
            if (r12 == 0) goto L_0x00ee
            android.content.Context r3 = r11.f320f
            r3.setTheme(r12)
            android.content.Context r12 = r11.f320f
            android.content.res.Resources$Theme r12 = r12.getTheme()
            int r3 = r11.f309P
            r12.applyStyle(r3, r6)
        L_0x00ee:
            if (r5 == 0) goto L_0x0120
            java.lang.Object r12 = r11.f319e
            boolean r3 = r12 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0120
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r3 = r12 instanceof androidx.lifecycle.C2887s
            if (r3 == 0) goto L_0x0113
            r3 = r12
            androidx.lifecycle.s r3 = (androidx.lifecycle.C2887s) r3
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r3 = r3.mo10734b()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r3 = r3.isAtLeast(r4)
            if (r3 == 0) goto L_0x0120
            r12.onConfigurationChanged(r1)
            goto L_0x0120
        L_0x0113:
            boolean r3 = r11.f305L
            if (r3 == 0) goto L_0x0120
            boolean r3 = r11.f306M
            if (r3 != 0) goto L_0x0120
            r12.onConfigurationChanged(r1)
            goto L_0x0120
        L_0x011f:
            r6 = r1
        L_0x0120:
            if (r6 == 0) goto L_0x012d
            java.lang.Object r12 = r11.f319e
            boolean r1 = r12 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L_0x012d
            androidx.appcompat.app.AppCompatActivity r12 = (androidx.appcompat.app.AppCompatActivity) r12
            r12.onNightModeChanged(r2)
        L_0x012d:
            if (r0 != 0) goto L_0x0139
            android.content.Context r12 = r11.f320f
            androidx.appcompat.app.AppCompatDelegateImpl$h r12 = r11.mo1301O(r12)
            r12.mo1364e()
            goto L_0x0140
        L_0x0139:
            androidx.appcompat.app.AppCompatDelegateImpl$i r12 = r11.f312S
            if (r12 == 0) goto L_0x0140
            r12.mo1363a()
        L_0x0140:
            r12 = 3
            if (r0 != r12) goto L_0x0156
            android.content.Context r12 = r11.f320f
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = r11.f313T
            if (r0 != 0) goto L_0x0150
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = new androidx.appcompat.app.AppCompatDelegateImpl$g
            r0.<init>(r12)
            r11.f313T = r0
        L_0x0150:
            androidx.appcompat.app.AppCompatDelegateImpl$g r12 = r11.f313T
            r12.mo1364e()
            goto L_0x015d
        L_0x0156:
            androidx.appcompat.app.AppCompatDelegateImpl$g r12 = r11.f313T
            if (r12 == 0) goto L_0x015d
            r12.mo1363a()
        L_0x015d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1292E(boolean):boolean");
    }

    /* renamed from: F */
    public final void mo1293F(Window window) {
        int resourceId;
        Drawable f;
        if (this.f321g == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0143f)) {
                C0143f fVar = new C0143f(callback);
                this.f322h = fVar;
                window.setCallback(fVar);
                Context context = this.f320f;
                Drawable drawable = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f291l1);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    C0317g a = C0317g.m820a();
                    synchronized (a) {
                        f = a.f803a.mo3066f(context, resourceId, true);
                    }
                    drawable = f;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f321g = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: G */
    public final void mo1294G(int i, PanelFeatureState panelFeatureState, MenuBuilder menuBuilder) {
        if (menuBuilder == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f301H;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menuBuilder = panelFeatureState.f350h;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f355m) && !this.f306M) {
            this.f322h.getWrapped().onPanelClosed(i, menuBuilder);
        }
    }

    /* renamed from: H */
    public final void mo1295H(MenuBuilder menuBuilder) {
        if (!this.f300G) {
            this.f300G = true;
            this.f329m.dismissPopups();
            Window.Callback Q = mo1303Q();
            if (Q != null && !this.f306M) {
                Q.onPanelClosed(108, menuBuilder);
            }
            this.f300G = false;
        }
    }

    /* renamed from: I */
    public final void mo1296I(PanelFeatureState panelFeatureState, boolean z) {
        C0148j jVar;
        C0357w wVar;
        if (!z || panelFeatureState.f343a != 0 || (wVar = this.f329m) == null || !wVar.isOverflowMenuShowing()) {
            WindowManager windowManager = (WindowManager) this.f320f.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f355m || (jVar = panelFeatureState.f347e) == null)) {
                windowManager.removeView(jVar);
                if (z) {
                    mo1294G(panelFeatureState.f343a, panelFeatureState, (MenuBuilder) null);
                }
            }
            panelFeatureState.f353k = false;
            panelFeatureState.f354l = false;
            panelFeatureState.f355m = false;
            panelFeatureState.f348f = null;
            panelFeatureState.f356n = true;
            if (this.f302I == panelFeatureState) {
                this.f302I = null;
                return;
            }
            return;
        }
        mo1295H(panelFeatureState.f350h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1297K(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f319e
            boolean r1 = r0 instanceof androidx.core.view.C2303g.C2304a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof androidx.appcompat.app.AppCompatDialog
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f321g
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = androidx.core.view.C2303g.m5027a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002f
            androidx.appcompat.app.AppCompatDelegateImpl$f r0 = r6.f322h
            android.view.Window$Callback r0 = r0.getWrapped()
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002f
            return r2
        L_0x002f:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003c
            r3 = r2
            goto L_0x003d
        L_0x003c:
            r3 = r4
        L_0x003d:
            r5 = 4
            if (r3 == 0) goto L_0x0067
            if (r0 == r5) goto L_0x0059
            if (r0 == r1) goto L_0x0046
            goto L_0x011e
        L_0x0046:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x011f
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo1302P(r4)
            boolean r1 = r0.f355m
            if (r1 != 0) goto L_0x011f
            r6.mo1308V(r0, r7)
            goto L_0x011f
        L_0x0059:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r2 = r4
        L_0x0063:
            r6.f303J = r2
            goto L_0x011e
        L_0x0067:
            if (r0 == r5) goto L_0x00f1
            if (r0 == r1) goto L_0x006d
            goto L_0x011e
        L_0x006d:
            androidx.appcompat.view.a r0 = r6.f332p
            if (r0 == 0) goto L_0x0073
            goto L_0x011f
        L_0x0073:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo1302P(r4)
            androidx.appcompat.widget.w r1 = r6.f329m
            if (r1 == 0) goto L_0x00ad
            boolean r1 = r1.canShowOverflowMenu()
            if (r1 == 0) goto L_0x00ad
            android.content.Context r1 = r6.f320f
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00ad
            androidx.appcompat.widget.w r1 = r6.f329m
            boolean r1 = r1.isOverflowMenuShowing()
            if (r1 != 0) goto L_0x00a6
            boolean r1 = r6.f306M
            if (r1 != 0) goto L_0x00cd
            boolean r7 = r6.mo1308V(r0, r7)
            if (r7 == 0) goto L_0x00cd
            androidx.appcompat.widget.w r7 = r6.f329m
            boolean r7 = r7.showOverflowMenu()
            goto L_0x00d3
        L_0x00a6:
            androidx.appcompat.widget.w r7 = r6.f329m
            boolean r7 = r7.hideOverflowMenu()
            goto L_0x00d3
        L_0x00ad:
            boolean r1 = r0.f355m
            if (r1 != 0) goto L_0x00cf
            boolean r3 = r0.f354l
            if (r3 == 0) goto L_0x00b6
            goto L_0x00cf
        L_0x00b6:
            boolean r1 = r0.f353k
            if (r1 == 0) goto L_0x00cd
            boolean r1 = r0.f357o
            if (r1 == 0) goto L_0x00c5
            r0.f353k = r4
            boolean r1 = r6.mo1308V(r0, r7)
            goto L_0x00c6
        L_0x00c5:
            r1 = r2
        L_0x00c6:
            if (r1 == 0) goto L_0x00cd
            r6.mo1306T(r0, r7)
            r7 = r2
            goto L_0x00d3
        L_0x00cd:
            r7 = r4
            goto L_0x00d3
        L_0x00cf:
            r6.mo1296I(r0, r2)
            r7 = r1
        L_0x00d3:
            if (r7 == 0) goto L_0x011f
            android.content.Context r7 = r6.f320f
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e9
            r7.playSoundEffect(r4)
            goto L_0x011f
        L_0x00e9:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x011f
        L_0x00f1:
            boolean r7 = r6.f303J
            r6.f303J = r4
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo1302P(r4)
            boolean r1 = r0.f355m
            if (r1 == 0) goto L_0x0103
            if (r7 != 0) goto L_0x011f
            r6.mo1296I(r0, r2)
            goto L_0x011f
        L_0x0103:
            androidx.appcompat.view.a r7 = r6.f332p
            if (r7 == 0) goto L_0x010b
            r7.mo1432c()
            goto L_0x0118
        L_0x010b:
            r6.mo1304R()
            androidx.appcompat.app.ActionBar r7 = r6.f324j
            if (r7 == 0) goto L_0x011a
            boolean r7 = r7.mo1173b()
            if (r7 == 0) goto L_0x011a
        L_0x0118:
            r7 = r2
            goto L_0x011b
        L_0x011a:
            r7 = r4
        L_0x011b:
            if (r7 == 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r2 = r4
        L_0x011f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1297K(android.view.KeyEvent):boolean");
    }

    /* renamed from: L */
    public final void mo1298L(int i) {
        PanelFeatureState P = mo1302P(i);
        if (P.f350h != null) {
            Bundle bundle = new Bundle();
            P.f350h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                P.f358p = bundle;
            }
            P.f350h.stopDispatchingItemsChanged();
            P.f350h.clear();
        }
        P.f357o = true;
        P.f356n = true;
        if ((i == 108 || i == 0) && this.f329m != null) {
            PanelFeatureState P2 = mo1302P(0);
            P2.f353k = false;
            mo1308V(P2, (KeyEvent) null);
        }
    }

    /* renamed from: M */
    public final void mo1299M() {
        ViewGroup viewGroup;
        if (!this.f338v) {
            TypedArray obtainStyledAttributes = this.f320f.obtainStyledAttributes(C18263b.f40080q);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    mo1332v(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    mo1332v(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    mo1332v(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    mo1332v(10);
                }
                this.f298E = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                mo1300N();
                this.f321g.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f320f);
                if (this.f299F) {
                    viewGroup = this.f297D ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.f298E) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f296C = false;
                    this.f295B = false;
                } else if (this.f295B) {
                    TypedValue typedValue = new TypedValue();
                    this.f320f.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(this.f320f, typedValue.resourceId) : this.f320f).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    C0357w wVar = (C0357w) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f329m = wVar;
                    wVar.setWindowCallback(mo1303Q());
                    if (this.f296C) {
                        this.f329m.initFeature(109);
                    }
                    if (this.f342z) {
                        this.f329m.initFeature(2);
                    }
                    if (this.f294A) {
                        this.f329m.initFeature(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    C0157g gVar = new C0157g(this);
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2373i.m5274u(viewGroup, gVar);
                    if (this.f329m == null) {
                        this.f340x = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = C0353t0.f934a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (IllegalAccessException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f321g.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f321g.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C0158h(this));
                    this.f339w = viewGroup;
                    Object obj = this.f319e;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f328l;
                    if (!TextUtils.isEmpty(title)) {
                        C0357w wVar2 = this.f329m;
                        if (wVar2 != null) {
                            wVar2.setWindowTitle(title);
                        } else {
                            ActionBar actionBar = this.f324j;
                            if (actionBar != null) {
                                actionBar.mo1169F(title);
                            } else {
                                TextView textView = this.f340x;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f339w.findViewById(16908290);
                    View decorView = this.f321g.getDecorView();
                    contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    TypedArray obtainStyledAttributes2 = this.f320f.obtainStyledAttributes(C18263b.f40080q);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f338v = true;
                    PanelFeatureState P = mo1302P(0);
                    if (!this.f306M && P.f350h == null) {
                        this.f315W |= RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;
                        if (!this.f314V) {
                            View decorView2 = this.f321g.getDecorView();
                            C0137a aVar = this.f316X;
                            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                            C2364y.C2368d.m5223m(decorView2, aVar);
                            this.f314V = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder h = C0072d.m201h("AppCompat does not support the current theme features: { windowActionBar: ");
                h.append(this.f295B);
                h.append(", windowActionBarOverlay: ");
                h.append(this.f296C);
                h.append(", android:windowIsFloating: ");
                h.append(this.f298E);
                h.append(", windowActionModeOverlay: ");
                h.append(this.f297D);
                h.append(", windowNoTitle: ");
                h.append(this.f299F);
                h.append(" }");
                throw new IllegalArgumentException(h.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: N */
    public final void mo1300N() {
        if (this.f321g == null) {
            Object obj = this.f319e;
            if (obj instanceof Activity) {
                mo1293F(((Activity) obj).getWindow());
            }
        }
        if (this.f321g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: O */
    public final C0145h mo1301O(Context context) {
        if (this.f312S == null) {
            if (C0172o.f417d == null) {
                Context applicationContext = context.getApplicationContext();
                C0172o.f417d = new C0172o(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f312S = new C0147i(C0172o.f417d);
        }
        return this.f312S;
    }

    /* renamed from: P */
    public final PanelFeatureState mo1302P(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.f301H;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f301H = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: Q */
    public final Window.Callback mo1303Q() {
        return this.f321g.getCallback();
    }

    /* renamed from: R */
    public final void mo1304R() {
        mo1299M();
        if (this.f295B && this.f324j == null) {
            Object obj = this.f319e;
            if (obj instanceof Activity) {
                this.f324j = new C0174p((Activity) this.f319e, this.f296C);
            } else if (obj instanceof Dialog) {
                this.f324j = new C0174p((Dialog) this.f319e);
            }
            ActionBar actionBar = this.f324j;
            if (actionBar != null) {
                actionBar.mo1189r(this.f317Y);
            }
        }
    }

    /* renamed from: S */
    public final int mo1305S(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.f313T == null) {
                            this.f313T = new C0144g(context);
                        }
                        return this.f313T.mo1361c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return mo1301O(context).mo1361c();
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0134, code lost:
        if (r15 != null) goto L_0x0136;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013b  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1306T(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f355m
            if (r0 != 0) goto L_0x01b3
            boolean r0 = r13.f306M
            if (r0 == 0) goto L_0x000a
            goto L_0x01b3
        L_0x000a:
            int r0 = r14.f343a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.f320f
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.mo1303Q()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f343a
            androidx.appcompat.view.menu.MenuBuilder r4 = r14.f350h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.mo1296I(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.f320f
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.mo1308V(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            androidx.appcompat.app.AppCompatDelegateImpl$j r15 = r14.f347e
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006b
            boolean r5 = r14.f356n
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r15 = r14.f349g
            if (r15 == 0) goto L_0x0190
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x0190
            int r15 = r15.width
            if (r15 != r3) goto L_0x0190
            r6 = r3
            goto L_0x0191
        L_0x006b:
            if (r15 != 0) goto L_0x00e6
            r13.mo1304R()
            androidx.appcompat.app.ActionBar r15 = r13.f324j
            if (r15 == 0) goto L_0x0079
            android.content.Context r15 = r15.mo1178g()
            goto L_0x007a
        L_0x0079:
            r15 = 0
        L_0x007a:
            if (r15 != 0) goto L_0x007e
            android.content.Context r15 = r13.f320f
        L_0x007e:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources r5 = r15.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r15.getTheme()
            r5.setTo(r6)
            r6 = 2130968580(0x7f040004, float:1.7545818E38)
            r5.resolveAttribute(r6, r3, r2)
            int r6 = r3.resourceId
            if (r6 == 0) goto L_0x009f
            r5.applyStyle(r6, r2)
        L_0x009f:
            r6 = 2130969713(0x7f040471, float:1.7548116E38)
            r5.resolveAttribute(r6, r3, r2)
            int r3 = r3.resourceId
            if (r3 == 0) goto L_0x00ad
            r5.applyStyle(r3, r2)
            goto L_0x00b3
        L_0x00ad:
            r3 = 2132018106(0x7f1403ba, float:1.967451E38)
            r5.applyStyle(r3, r2)
        L_0x00b3:
            androidx.appcompat.view.ContextThemeWrapper r3 = new androidx.appcompat.view.ContextThemeWrapper
            r3.<init>((android.content.Context) r15, (int) r1)
            android.content.res.Resources$Theme r15 = r3.getTheme()
            r15.setTo(r5)
            r14.f352j = r3
            int[] r15 = p628nj.C18263b.f40080q
            android.content.res.TypedArray r15 = r3.obtainStyledAttributes(r15)
            r3 = 86
            int r3 = r15.getResourceId(r3, r1)
            r14.f344b = r3
            int r3 = r15.getResourceId(r2, r1)
            r14.f346d = r3
            r15.recycle()
            androidx.appcompat.app.AppCompatDelegateImpl$j r15 = new androidx.appcompat.app.AppCompatDelegateImpl$j
            androidx.appcompat.view.ContextThemeWrapper r3 = r14.f352j
            r15.<init>(r3)
            r14.f347e = r15
            r15 = 81
            r14.f345c = r15
            goto L_0x00f5
        L_0x00e6:
            boolean r3 = r14.f356n
            if (r3 == 0) goto L_0x00f5
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00f5
            androidx.appcompat.app.AppCompatDelegateImpl$j r15 = r14.f347e
            r15.removeAllViews()
        L_0x00f5:
            android.view.View r15 = r14.f349g
            if (r15 == 0) goto L_0x00fc
            r14.f348f = r15
            goto L_0x0136
        L_0x00fc:
            androidx.appcompat.view.menu.MenuBuilder r15 = r14.f350h
            if (r15 != 0) goto L_0x0101
            goto L_0x0138
        L_0x0101:
            androidx.appcompat.app.AppCompatDelegateImpl$k r15 = r13.f331o
            if (r15 != 0) goto L_0x010c
            androidx.appcompat.app.AppCompatDelegateImpl$k r15 = new androidx.appcompat.app.AppCompatDelegateImpl$k
            r15.<init>()
            r13.f331o = r15
        L_0x010c:
            androidx.appcompat.app.AppCompatDelegateImpl$k r15 = r13.f331o
            androidx.appcompat.view.menu.ListMenuPresenter r3 = r14.f351i
            if (r3 != 0) goto L_0x0128
            androidx.appcompat.view.menu.ListMenuPresenter r3 = new androidx.appcompat.view.menu.ListMenuPresenter
            androidx.appcompat.view.ContextThemeWrapper r5 = r14.f352j
            r6 = 2131623952(0x7f0e0010, float:1.887507E38)
            r3.<init>((android.content.Context) r5, (int) r6)
            r14.f351i = r3
            r3.setCallback(r15)
            androidx.appcompat.view.menu.MenuBuilder r15 = r14.f350h
            androidx.appcompat.view.menu.ListMenuPresenter r3 = r14.f351i
            r15.addMenuPresenter(r3)
        L_0x0128:
            androidx.appcompat.view.menu.ListMenuPresenter r15 = r14.f351i
            androidx.appcompat.app.AppCompatDelegateImpl$j r3 = r14.f347e
            androidx.appcompat.view.menu.g r15 = r15.getMenuView(r3)
            android.view.View r15 = (android.view.View) r15
            r14.f348f = r15
            if (r15 == 0) goto L_0x0138
        L_0x0136:
            r15 = r2
            goto L_0x0139
        L_0x0138:
            r15 = r1
        L_0x0139:
            if (r15 == 0) goto L_0x01b1
            android.view.View r15 = r14.f348f
            if (r15 != 0) goto L_0x0140
            goto L_0x0153
        L_0x0140:
            android.view.View r15 = r14.f349g
            if (r15 == 0) goto L_0x0145
            goto L_0x0151
        L_0x0145:
            androidx.appcompat.view.menu.ListMenuPresenter r15 = r14.f351i
            android.widget.ListAdapter r15 = r15.getAdapter()
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x0153
        L_0x0151:
            r15 = r2
            goto L_0x0154
        L_0x0153:
            r15 = r1
        L_0x0154:
            if (r15 != 0) goto L_0x0157
            goto L_0x01b1
        L_0x0157:
            android.view.View r15 = r14.f348f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x0164
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x0164:
            int r3 = r14.f344b
            androidx.appcompat.app.AppCompatDelegateImpl$j r5 = r14.f347e
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f348f
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x017c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f348f
            r3.removeView(r5)
        L_0x017c:
            androidx.appcompat.app.AppCompatDelegateImpl$j r3 = r14.f347e
            android.view.View r5 = r14.f348f
            r3.addView(r5, r15)
            android.view.View r15 = r14.f348f
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x0190
            android.view.View r15 = r14.f348f
            r15.requestFocus()
        L_0x0190:
            r6 = r4
        L_0x0191:
            r14.f354l = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            r8 = 0
            r9 = 0
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f345c
            r15.gravity = r1
            int r1 = r14.f346d
            r15.windowAnimations = r1
            androidx.appcompat.app.AppCompatDelegateImpl$j r1 = r14.f347e
            r0.addView(r1, r15)
            r14.f355m = r2
            return
        L_0x01b1:
            r14.f356n = r2
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1306T(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    /* renamed from: U */
    public final boolean mo1307U(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f353k || mo1308V(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.f350h) != null) {
            return menuBuilder.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: V */
    public final boolean mo1308V(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        C0357w wVar;
        C0357w wVar2;
        C0357w wVar3;
        Resources.Theme theme;
        C0357w wVar4;
        if (this.f306M) {
            return false;
        }
        if (panelFeatureState.f353k) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f302I;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo1296I(panelFeatureState2, false);
        }
        Window.Callback Q = mo1303Q();
        if (Q != null) {
            panelFeatureState.f349g = Q.onCreatePanelView(panelFeatureState.f343a);
        }
        int i = panelFeatureState.f343a;
        boolean z = i == 0 || i == 108;
        if (z && (wVar4 = this.f329m) != null) {
            wVar4.setMenuPrepared();
        }
        if (panelFeatureState.f349g == null && (!z || !(this.f324j instanceof C0165m))) {
            MenuBuilder menuBuilder = panelFeatureState.f350h;
            if (menuBuilder == null || panelFeatureState.f357o) {
                if (menuBuilder == null) {
                    Context context = this.f320f;
                    int i2 = panelFeatureState.f343a;
                    if ((i2 == 0 || i2 == 108) && this.f329m != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(theme);
                            context = contextThemeWrapper;
                        }
                    }
                    MenuBuilder menuBuilder2 = new MenuBuilder(context);
                    menuBuilder2.setCallback(this);
                    MenuBuilder menuBuilder3 = panelFeatureState.f350h;
                    if (menuBuilder2 != menuBuilder3) {
                        if (menuBuilder3 != null) {
                            menuBuilder3.removeMenuPresenter(panelFeatureState.f351i);
                        }
                        panelFeatureState.f350h = menuBuilder2;
                        ListMenuPresenter listMenuPresenter = panelFeatureState.f351i;
                        if (listMenuPresenter != null) {
                            menuBuilder2.addMenuPresenter(listMenuPresenter);
                        }
                    }
                    if (panelFeatureState.f350h == null) {
                        return false;
                    }
                }
                if (z && (wVar3 = this.f329m) != null) {
                    if (this.f330n == null) {
                        this.f330n = new C0140d();
                    }
                    wVar3.setMenu(panelFeatureState.f350h, this.f330n);
                }
                panelFeatureState.f350h.stopDispatchingItemsChanged();
                if (!Q.onCreatePanelMenu(panelFeatureState.f343a, panelFeatureState.f350h)) {
                    MenuBuilder menuBuilder4 = panelFeatureState.f350h;
                    if (menuBuilder4 != null) {
                        if (menuBuilder4 != null) {
                            menuBuilder4.removeMenuPresenter(panelFeatureState.f351i);
                        }
                        panelFeatureState.f350h = null;
                    }
                    if (z && (wVar2 = this.f329m) != null) {
                        wVar2.setMenu((Menu) null, this.f330n);
                    }
                    return false;
                }
                panelFeatureState.f357o = false;
            }
            panelFeatureState.f350h.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.f358p;
            if (bundle != null) {
                panelFeatureState.f350h.restoreActionViewStates(bundle);
                panelFeatureState.f358p = null;
            }
            if (!Q.onPreparePanel(0, panelFeatureState.f349g, panelFeatureState.f350h)) {
                if (z && (wVar = this.f329m) != null) {
                    wVar.setMenu((Menu) null, this.f330n);
                }
                panelFeatureState.f350h.startDispatchingItemsChanged();
                return false;
            }
            panelFeatureState.f350h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            panelFeatureState.f350h.startDispatchingItemsChanged();
        }
        panelFeatureState.f353k = true;
        panelFeatureState.f354l = false;
        this.f302I = panelFeatureState;
        return true;
    }

    /* renamed from: W */
    public final void mo1309W() {
        if (this.f338v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    public final boolean mo1310a(MenuBuilder menuBuilder, MenuItem menuItem) {
        int i;
        int i2;
        PanelFeatureState panelFeatureState;
        Window.Callback Q = mo1303Q();
        if (Q != null && !this.f306M) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            PanelFeatureState[] panelFeatureStateArr = this.f301H;
            if (panelFeatureStateArr != null) {
                i2 = panelFeatureStateArr.length;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
            while (true) {
                if (i < i2) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.f350h == rootMenu) {
                        break;
                    }
                    i++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                return Q.onMenuItemSelected(panelFeatureState.f343a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo1311b(MenuBuilder menuBuilder) {
        C0357w wVar = this.f329m;
        if (wVar == null || !wVar.canShowOverflowMenu() || (ViewConfiguration.get(this.f320f).hasPermanentMenuKey() && !this.f329m.isOverflowMenuShowPending())) {
            PanelFeatureState P = mo1302P(0);
            P.f356n = true;
            mo1296I(P, false);
            mo1306T(P, (KeyEvent) null);
            return;
        }
        Window.Callback Q = mo1303Q();
        if (this.f329m.isOverflowMenuShowing()) {
            this.f329m.hideOverflowMenu();
            if (!this.f306M) {
                Q.onPanelClosed(108, mo1302P(0).f350h);
            }
        } else if (Q != null && !this.f306M) {
            if (this.f314V && (1 & this.f315W) != 0) {
                this.f321g.getDecorView().removeCallbacks(this.f316X);
                this.f316X.run();
            }
            PanelFeatureState P2 = mo1302P(0);
            MenuBuilder menuBuilder2 = P2.f350h;
            if (menuBuilder2 != null && !P2.f357o && Q.onPreparePanel(0, P2.f349g, menuBuilder2)) {
                Q.onMenuOpened(108, P2.f350h);
                this.f329m.showOverflowMenu();
            }
        }
    }

    /* renamed from: c */
    public final void mo1312c(View view, ViewGroup.LayoutParams layoutParams) {
        mo1299M();
        ((ViewGroup) this.f339w.findViewById(16908290)).addView(view, layoutParams);
        this.f322h.getWrapped().onContentChanged();
    }

    /* renamed from: d */
    public final boolean mo1313d() {
        return mo1292E(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0184  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Context mo1314e(android.content.Context r9) {
        /*
            r8 = this;
            r0 = 1
            r8.f304K = r0
            int r1 = r8.f308O
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            int r1 = androidx.appcompat.app.C0156f.f386b
        L_0x000c:
            int r1 = r8.mo1305S(r9, r1)
            boolean r2 = f293n1
            r3 = 0
            if (r2 == 0) goto L_0x0024
            boolean r2 = r9 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0024
            android.content.res.Configuration r2 = m424J(r9, r1, r3)
            r4 = r9
            android.view.ContextThemeWrapper r4 = (android.view.ContextThemeWrapper) r4     // Catch:{ IllegalStateException -> 0x0024 }
            r4.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0024 }
            return r9
        L_0x0024:
            boolean r2 = r9 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0033
            android.content.res.Configuration r2 = m424J(r9, r1, r3)
            r4 = r9
            androidx.appcompat.view.ContextThemeWrapper r4 = (androidx.appcompat.view.ContextThemeWrapper) r4     // Catch:{ IllegalStateException -> 0x0033 }
            r4.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0033 }
            return r9
        L_0x0033:
            boolean r2 = f292m1
            if (r2 != 0) goto L_0x0038
            return r9
        L_0x0038:
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>()
            r4 = -1
            r2.uiMode = r4
            r4 = 0
            r2.fontScale = r4
            android.content.Context r2 = r9.createConfigurationContext(r2)
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.content.res.Resources r5 = r9.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r6 = r5.uiMode
            r2.uiMode = r6
            boolean r6 = r2.equals(r5)
            if (r6 != 0) goto L_0x0168
            android.content.res.Configuration r6 = new android.content.res.Configuration
            r6.<init>()
            r6.fontScale = r4
            int r4 = r2.diff(r5)
            if (r4 != 0) goto L_0x0070
            goto L_0x0169
        L_0x0070:
            float r4 = r2.fontScale
            float r7 = r5.fontScale
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x007a
            r6.fontScale = r7
        L_0x007a:
            int r4 = r2.mcc
            int r7 = r5.mcc
            if (r4 == r7) goto L_0x0082
            r6.mcc = r7
        L_0x0082:
            int r4 = r2.mnc
            int r7 = r5.mnc
            if (r4 == r7) goto L_0x008a
            r6.mnc = r7
        L_0x008a:
            android.os.LocaleList r4 = r2.getLocales()
            android.os.LocaleList r7 = r5.getLocales()
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x009f
            r6.setLocales(r7)
            java.util.Locale r4 = r5.locale
            r6.locale = r4
        L_0x009f:
            int r4 = r2.touchscreen
            int r7 = r5.touchscreen
            if (r4 == r7) goto L_0x00a7
            r6.touchscreen = r7
        L_0x00a7:
            int r4 = r2.keyboard
            int r7 = r5.keyboard
            if (r4 == r7) goto L_0x00af
            r6.keyboard = r7
        L_0x00af:
            int r4 = r2.keyboardHidden
            int r7 = r5.keyboardHidden
            if (r4 == r7) goto L_0x00b7
            r6.keyboardHidden = r7
        L_0x00b7:
            int r4 = r2.navigation
            int r7 = r5.navigation
            if (r4 == r7) goto L_0x00bf
            r6.navigation = r7
        L_0x00bf:
            int r4 = r2.navigationHidden
            int r7 = r5.navigationHidden
            if (r4 == r7) goto L_0x00c7
            r6.navigationHidden = r7
        L_0x00c7:
            int r4 = r2.orientation
            int r7 = r5.orientation
            if (r4 == r7) goto L_0x00cf
            r6.orientation = r7
        L_0x00cf:
            int r4 = r2.screenLayout
            r4 = r4 & 15
            int r7 = r5.screenLayout
            r7 = r7 & 15
            if (r4 == r7) goto L_0x00de
            int r4 = r6.screenLayout
            r4 = r4 | r7
            r6.screenLayout = r4
        L_0x00de:
            int r4 = r2.screenLayout
            r4 = r4 & 192(0xc0, float:2.69E-43)
            int r7 = r5.screenLayout
            r7 = r7 & 192(0xc0, float:2.69E-43)
            if (r4 == r7) goto L_0x00ed
            int r4 = r6.screenLayout
            r4 = r4 | r7
            r6.screenLayout = r4
        L_0x00ed:
            int r4 = r2.screenLayout
            r4 = r4 & 48
            int r7 = r5.screenLayout
            r7 = r7 & 48
            if (r4 == r7) goto L_0x00fc
            int r4 = r6.screenLayout
            r4 = r4 | r7
            r6.screenLayout = r4
        L_0x00fc:
            int r4 = r2.screenLayout
            r4 = r4 & 768(0x300, float:1.076E-42)
            int r7 = r5.screenLayout
            r7 = r7 & 768(0x300, float:1.076E-42)
            if (r4 == r7) goto L_0x010b
            int r4 = r6.screenLayout
            r4 = r4 | r7
            r6.screenLayout = r4
        L_0x010b:
            int r4 = r2.colorMode
            r4 = r4 & 3
            int r7 = r5.colorMode
            r7 = r7 & 3
            if (r4 == r7) goto L_0x011a
            int r4 = r6.colorMode
            r4 = r4 | r7
            r6.colorMode = r4
        L_0x011a:
            int r4 = r2.colorMode
            r4 = r4 & 12
            int r7 = r5.colorMode
            r7 = r7 & 12
            if (r4 == r7) goto L_0x0129
            int r4 = r6.colorMode
            r4 = r4 | r7
            r6.colorMode = r4
        L_0x0129:
            int r4 = r2.uiMode
            r4 = r4 & 15
            int r7 = r5.uiMode
            r7 = r7 & 15
            if (r4 == r7) goto L_0x0138
            int r4 = r6.uiMode
            r4 = r4 | r7
            r6.uiMode = r4
        L_0x0138:
            int r4 = r2.uiMode
            r4 = r4 & 48
            int r7 = r5.uiMode
            r7 = r7 & 48
            if (r4 == r7) goto L_0x0147
            int r4 = r6.uiMode
            r4 = r4 | r7
            r6.uiMode = r4
        L_0x0147:
            int r4 = r2.screenWidthDp
            int r7 = r5.screenWidthDp
            if (r4 == r7) goto L_0x014f
            r6.screenWidthDp = r7
        L_0x014f:
            int r4 = r2.screenHeightDp
            int r7 = r5.screenHeightDp
            if (r4 == r7) goto L_0x0157
            r6.screenHeightDp = r7
        L_0x0157:
            int r4 = r2.smallestScreenWidthDp
            int r7 = r5.smallestScreenWidthDp
            if (r4 == r7) goto L_0x015f
            r6.smallestScreenWidthDp = r7
        L_0x015f:
            int r2 = r2.densityDpi
            int r4 = r5.densityDpi
            if (r2 == r4) goto L_0x0169
            r6.densityDpi = r4
            goto L_0x0169
        L_0x0168:
            r6 = r3
        L_0x0169:
            android.content.res.Configuration r1 = m424J(r9, r1, r6)
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r4 = 2132018118(0x7f1403c6, float:1.9674534E38)
            r2.<init>((android.content.Context) r9, (int) r4)
            r2.applyOverrideConfiguration(r1)
            r1 = 0
            android.content.res.Resources$Theme r9 = r9.getTheme()     // Catch:{ NullPointerException -> 0x0181 }
            if (r9 == 0) goto L_0x0181
            r9 = r0
            goto L_0x0182
        L_0x0181:
            r9 = r1
        L_0x0182:
            if (r9 == 0) goto L_0x01ce
            android.content.res.Resources$Theme r9 = r2.getTheme()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x0192
            r9.rebase()
            goto L_0x01ce
        L_0x0192:
            java.lang.Object r4 = p280x0.C8298i.f18183a
            monitor-enter(r4)
            boolean r5 = p280x0.C8298i.f18185c     // Catch:{ all -> 0x01cb }
            if (r5 != 0) goto L_0x01b3
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x01a9 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01a9 }
            p280x0.C8298i.f18184b = r5     // Catch:{ NoSuchMethodException -> 0x01a9 }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01a9 }
            goto L_0x01b1
        L_0x01a9:
            r5 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x01cb }
        L_0x01b1:
            p280x0.C8298i.f18185c = r0     // Catch:{ all -> 0x01cb }
        L_0x01b3:
            java.lang.reflect.Method r0 = p280x0.C8298i.f18184b     // Catch:{ all -> 0x01cb }
            if (r0 == 0) goto L_0x01c9
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x01bf, InvocationTargetException -> 0x01bd }
            r0.invoke(r9, r1)     // Catch:{ IllegalAccessException -> 0x01bf, InvocationTargetException -> 0x01bd }
            goto L_0x01c9
        L_0x01bd:
            r9 = move-exception
            goto L_0x01c0
        L_0x01bf:
            r9 = move-exception
        L_0x01c0:
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r0, r1, r9)     // Catch:{ all -> 0x01cb }
            p280x0.C8298i.f18184b = r3     // Catch:{ all -> 0x01cb }
        L_0x01c9:
            monitor-exit(r4)     // Catch:{ all -> 0x01cb }
            goto L_0x01ce
        L_0x01cb:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01cb }
            throw r9
        L_0x01ce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1314e(android.content.Context):android.content.Context");
    }

    /* renamed from: f */
    public final <T extends View> T mo1315f(int i) {
        mo1299M();
        return this.f321g.findViewById(i);
    }

    /* renamed from: g */
    public final C0138b mo1316g() {
        return new C0138b();
    }

    /* renamed from: h */
    public final int mo1317h() {
        return this.f308O;
    }

    /* renamed from: i */
    public final MenuInflater mo1318i() {
        if (this.f326k == null) {
            mo1304R();
            ActionBar actionBar = this.f324j;
            this.f326k = new SupportMenuInflater(actionBar != null ? actionBar.mo1178g() : this.f320f);
        }
        return this.f326k;
    }

    /* renamed from: j */
    public final ActionBar mo1319j() {
        mo1304R();
        return this.f324j;
    }

    /* renamed from: k */
    public final void mo1320k() {
        LayoutInflater from = LayoutInflater.from(this.f320f);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: l */
    public final void mo1321l() {
        if (this.f324j != null) {
            mo1304R();
            if (!this.f324j.mo1180i()) {
                this.f315W |= 1;
                if (!this.f314V) {
                    View decorView = this.f321g.getDecorView();
                    C0137a aVar = this.f316X;
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2368d.m5223m(decorView, aVar);
                    this.f314V = true;
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo1322m(Configuration configuration) {
        if (this.f295B && this.f338v) {
            mo1304R();
            ActionBar actionBar = this.f324j;
            if (actionBar != null) {
                actionBar.mo1181j();
            }
        }
        C0317g a = C0317g.m820a();
        Context context = this.f320f;
        synchronized (a) {
            C0323i0 i0Var = a.f803a;
            synchronized (i0Var) {
                C7498f fVar = i0Var.f818b.get(context);
                if (fVar != null) {
                    fVar.mo19885b();
                }
            }
        }
        this.f307N = new Configuration(this.f320f.getResources().getConfiguration());
        mo1292E(false);
    }

    /* renamed from: n */
    public final void mo1323n() {
        this.f304K = true;
        mo1292E(false);
        mo1300N();
        Object obj = this.f319e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = C8090f.m16272c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f324j;
                if (actionBar == null) {
                    this.f317Y = true;
                } else {
                    actionBar.mo1189r(true);
                }
            }
            synchronized (C0156f.f388d) {
                C0156f.m489u(this);
                C0156f.f387c.add(new WeakReference(this));
            }
        }
        this.f307N = new Configuration(this.f320f.getResources().getConfiguration());
        this.f305L = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1324o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f319e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = androidx.appcompat.app.C0156f.f388d
            monitor-enter(r0)
            androidx.appcompat.app.C0156f.m489u(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f314V
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f321g
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.AppCompatDelegateImpl$a r1 = r3.f316X
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.f306M = r0
            int r0 = r3.f308O
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f319e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            o.i<java.lang.String, java.lang.Integer> r0 = f290k1
            java.lang.Object r1 = r3.f319e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f308O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            o.i<java.lang.String, java.lang.Integer> r0 = f290k1
            java.lang.Object r1 = r3.f319e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            androidx.appcompat.app.ActionBar r0 = r3.f324j
            if (r0 == 0) goto L_0x0063
            r0.mo1182k()
        L_0x0063:
            androidx.appcompat.app.AppCompatDelegateImpl$i r0 = r3.f312S
            if (r0 == 0) goto L_0x006a
            r0.mo1363a()
        L_0x006a:
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = r3.f313T
            if (r0 == 0) goto L_0x0071
            r0.mo1363a()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1324o():void");
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f325j1 == null) {
            String string = this.f320f.obtainStyledAttributes(C18263b.f40080q).getString(116);
            if (string == null) {
                this.f325j1 = new C0162k();
            } else {
                try {
                    this.f325j1 = (C0162k) this.f320f.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f325j1 = new C0162k();
                }
            }
        }
        return this.f325j1.createView(view, str, context, attributeSet, false, false, true, VectorEnabledTintResources.shouldBeUsed());
    }

    /* renamed from: p */
    public final void mo1327p() {
        mo1299M();
    }

    /* renamed from: q */
    public final void mo1328q() {
        mo1304R();
        ActionBar actionBar = this.f324j;
        if (actionBar != null) {
            actionBar.mo1166C(true);
        }
    }

    /* renamed from: r */
    public final void mo1329r() {
    }

    /* renamed from: s */
    public final void mo1330s() {
        mo1313d();
    }

    /* renamed from: t */
    public final void mo1331t() {
        mo1304R();
        ActionBar actionBar = this.f324j;
        if (actionBar != null) {
            actionBar.mo1166C(false);
        }
    }

    /* renamed from: v */
    public final boolean mo1332v(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f299F && i == 108) {
            return false;
        }
        if (this.f295B && i == 1) {
            this.f295B = false;
        }
        if (i == 1) {
            mo1309W();
            this.f299F = true;
            return true;
        } else if (i == 2) {
            mo1309W();
            this.f342z = true;
            return true;
        } else if (i == 5) {
            mo1309W();
            this.f294A = true;
            return true;
        } else if (i == 10) {
            mo1309W();
            this.f297D = true;
            return true;
        } else if (i == 108) {
            mo1309W();
            this.f295B = true;
            return true;
        } else if (i != 109) {
            return this.f321g.requestFeature(i);
        } else {
            mo1309W();
            this.f296C = true;
            return true;
        }
    }

    /* renamed from: w */
    public final void mo1333w(int i) {
        mo1299M();
        ViewGroup viewGroup = (ViewGroup) this.f339w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f320f).inflate(i, viewGroup);
        this.f322h.getWrapped().onContentChanged();
    }

    /* renamed from: x */
    public final void mo1334x(View view) {
        mo1299M();
        ViewGroup viewGroup = (ViewGroup) this.f339w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f322h.getWrapped().onContentChanged();
    }

    /* renamed from: y */
    public final void mo1335y(View view, ViewGroup.LayoutParams layoutParams) {
        mo1299M();
        ViewGroup viewGroup = (ViewGroup) this.f339w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f322h.getWrapped().onContentChanged();
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}

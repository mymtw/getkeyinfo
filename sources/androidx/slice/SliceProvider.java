package androidx.slice;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.os.Process;
import android.support.p013v4.media.C0072d;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.core.app.CoreComponentFactory;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.compat.SliceProviderWrapperContainer$SliceProviderWrapper;
import androidx.versionedparcelable.ParcelImpl;
import com.etsy.android.R;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p022b2.C3469a;
import p022b2.C3471c;
import p022b2.C3472d;
import p089e2.C6706a;
import p089e2.C6708b;
import p089e2.C6709c;
import p193o.C7496d;
import p193o.C7500h;
import p205p2.C7654d;

public abstract class SliceProvider extends ContentProvider implements CoreComponentFactory.C2251a {
    private static final boolean DEBUG = false;
    private static final String TAG = "SliceProvider";
    private static C3469a sClock;
    private static Set<SliceSpec> sSpecs;
    private final String[] mAutoGrantPermissions;
    private C6709c mCompat;
    private List<Uri> mPinnedSliceUris;

    public SliceProvider(String... strArr) {
        this.mAutoGrantPermissions = strArr;
    }

    public static PendingIntent createPermissionIntent(Context context, Uri uri, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), "androidx.slice.compat.SlicePermissionActivity"));
        intent.putExtra("slice_uri", uri);
        intent.putExtra("pkg", str);
        intent.putExtra("provider_pkg", context.getPackageName());
        intent.setData(uri.buildUpon().appendQueryParameter("package", str).build());
        return PendingIntent.getActivity(context, 0, intent, 0);
    }

    public static Slice createPermissionSlice(Context context, Uri uri, String str) {
        PendingIntent createPermissionIntent = createPermissionIntent(context, uri, str);
        Slice.C3273a aVar = new Slice.C3273a(uri);
        Slice.C3273a aVar2 = new Slice.C3273a(aVar);
        aVar2.mo12103c(IconCompat.m4960b(context, R.drawable.abc_ic_permission), new String[0]);
        List asList = Arrays.asList(new String[]{"title", "shortcut"});
        aVar2.mo12102b((String[]) asList.toArray(new String[asList.size()]));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Uri.Builder appendPath = aVar.f7603a.buildUpon().appendPath("_gen");
        int i = aVar.f7607e;
        aVar.f7607e = i + 1;
        aVar2.mo12101a(createPermissionIntent, new Slice(arrayList, (String[]) arrayList2.toArray(new String[arrayList2.size()]), appendPath.appendPath(String.valueOf(i)).build(), (SliceSpec) null));
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(context, 16974123).getTheme().resolveAttribute(16843829, typedValue, true);
        int i2 = typedValue.data;
        Slice.C3273a aVar3 = new Slice.C3273a(uri.buildUpon().appendPath("permission").build());
        aVar3.mo12103c(IconCompat.m4960b(context, R.drawable.abc_ic_arrow_forward), new String[0]);
        aVar3.mo12107g(getPermissionString(context, str), (String) null, new String[0]);
        aVar3.mo12104d(i2, "color", new String[0]);
        aVar3.mo12106f(aVar2.mo12108h());
        aVar.mo12106f(aVar3.mo12108h());
        List asList2 = Arrays.asList(new String[]{"permission_request"});
        aVar.mo12102b((String[]) asList2.toArray(new String[asList2.size()]));
        return aVar.mo12108h();
    }

    public static C3469a getClock() {
        return sClock;
    }

    public static Set<SliceSpec> getCurrentSpecs() {
        return sSpecs;
    }

    public static CharSequence getPermissionString(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return context.getString(R.string.abc_slices_permission_request, new Object[]{packageManager.getApplicationInfo(str, 0).loadLabel(packageManager), context.getApplicationInfo().loadLabel(packageManager)});
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unknown calling app", e);
        }
    }

    public static void setClock(C3469a aVar) {
        sClock = aVar;
    }

    public static void setSpecs(Set<SliceSpec> set) {
        sSpecs = set;
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2;
        boolean isEmpty;
        C6709c cVar = this.mCompat;
        Parcelable parcelable = null;
        if (cVar == null) {
            return null;
        }
        if (str.equals("bind_slice")) {
            Slice c = cVar.mo18898c((Uri) bundle.getParcelable("slice_uri"), cVar.f14797d.getCallingPackage(), C6709c.m13101b(bundle));
            Bundle bundle3 = new Bundle();
            if ("supports_versioned_parcelable".equals(str2)) {
                if (c != null) {
                    parcelable = new ParcelImpl((C7654d) c);
                }
                bundle3.putParcelable("slice", parcelable);
            } else {
                if (c != null) {
                    parcelable = c.mo12098e();
                }
                bundle3.putParcelable("slice", parcelable);
            }
            return bundle3;
        } else if (str.equals("map_slice")) {
            Uri onMapIntentToUri = cVar.f14797d.onMapIntentToUri((Intent) bundle.getParcelable("slice_intent"));
            Bundle bundle4 = new Bundle();
            if (onMapIntentToUri != null) {
                Slice c2 = cVar.mo18898c(onMapIntentToUri, cVar.f14797d.getCallingPackage(), C6709c.m13101b(bundle));
                if ("supports_versioned_parcelable".equals(str2)) {
                    if (c2 != null) {
                        parcelable = new ParcelImpl((C7654d) c2);
                    }
                    bundle4.putParcelable("slice", parcelable);
                } else {
                    if (c2 != null) {
                        parcelable = c2.mo12098e();
                    }
                    bundle4.putParcelable("slice", parcelable);
                }
            } else {
                bundle4.putParcelable("slice", (Parcelable) null);
            }
            return bundle4;
        } else {
            if (str.equals("map_only")) {
                Uri onMapIntentToUri2 = cVar.f14797d.onMapIntentToUri((Intent) bundle.getParcelable("slice_intent"));
                bundle2 = new Bundle();
                bundle2.putParcelable("slice", onMapIntentToUri2);
            } else if (str.equals("pin_slice")) {
                Uri uri = (Uri) bundle.getParcelable("slice_uri");
                C7496d b = C6709c.m13101b(bundle);
                String string = bundle.getString("pkg");
                C6708b bVar = cVar.f14798e;
                synchronized (bVar) {
                    Set<String> a = bVar.mo18893a(uri);
                    isEmpty = a.isEmpty();
                    a.add(string);
                    bVar.mo18896e(uri, a);
                    if (isEmpty) {
                        bVar.mo18897f(uri, new C7496d((Set) b));
                    } else {
                        C7496d<SliceSpec> c3 = bVar.mo18895c(uri);
                        C6708b.m13094d(c3, b);
                        bVar.mo18897f(uri, c3);
                    }
                }
                if (!isEmpty) {
                    return null;
                }
                cVar.f14796c = "onSlicePinned";
                cVar.f14794a.postDelayed(cVar.f14800g, NetworkRetryInterceptor.DEFAULT_RETRY_DELAY);
                try {
                    cVar.f14797d.onSlicePinned(uri);
                    cVar.f14797d.handleSlicePinned(uri);
                    return null;
                } finally {
                    cVar.f14794a.removeCallbacks(cVar.f14800g);
                }
            } else {
                boolean z = true;
                boolean z2 = false;
                if (str.equals("unpin_slice")) {
                    Uri uri2 = (Uri) bundle.getParcelable("slice_uri");
                    String string2 = bundle.getString("pkg");
                    C6708b bVar2 = cVar.f14798e;
                    synchronized (bVar2) {
                        Set<String> a2 = bVar2.mo18893a(uri2);
                        if (!a2.isEmpty()) {
                            if (a2.contains(string2)) {
                                a2.remove(string2);
                                bVar2.mo18896e(uri2, a2);
                                bVar2.mo18897f(uri2, new C7496d());
                                if (a2.size() != 0) {
                                    z = false;
                                }
                                z2 = z;
                            }
                        }
                    }
                    if (!z2) {
                        return null;
                    }
                    cVar.f14796c = "onSliceUnpinned";
                    cVar.f14794a.postDelayed(cVar.f14800g, NetworkRetryInterceptor.DEFAULT_RETRY_DELAY);
                    try {
                        cVar.f14797d.onSliceUnpinned(uri2);
                        cVar.f14797d.handleSliceUnpinned(uri2);
                        return null;
                    } finally {
                        cVar.f14794a.removeCallbacks(cVar.f14800g);
                    }
                } else if (str.equals("get_specs")) {
                    Uri uri3 = (Uri) bundle.getParcelable("slice_uri");
                    bundle2 = new Bundle();
                    C7496d<SliceSpec> c4 = cVar.f14798e.mo18895c(uri3);
                    if (c4.f16715d != 0) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<SliceSpec> it = c4.iterator();
                        while (true) {
                            C7500h.C7501a aVar = (C7500h.C7501a) it;
                            if (!aVar.hasNext()) {
                                break;
                            }
                            SliceSpec sliceSpec = (SliceSpec) aVar.next();
                            arrayList.add(sliceSpec.f7618a);
                            arrayList2.add(Integer.valueOf(sliceSpec.f7619b));
                        }
                        bundle2.putStringArrayList("specs", arrayList);
                        bundle2.putIntegerArrayList("revs", arrayList2);
                    } else {
                        throw new IllegalStateException(uri3 + " is not pinned");
                    }
                } else if (str.equals("get_descendants")) {
                    bundle2 = new Bundle();
                    cVar.f14796c = "onGetSliceDescendants";
                    bundle2.putParcelableArrayList("slice_descendants", new ArrayList(cVar.f14797d.onGetSliceDescendants((Uri) bundle.getParcelable("slice_uri"))));
                } else if (str.equals("check_perms")) {
                    bundle.getString("pkg");
                    int i = bundle.getInt("pid");
                    int i2 = bundle.getInt("uid");
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt("result", cVar.f14799f.mo18887a((Uri) bundle.getParcelable("slice_uri"), i, i2));
                    return bundle5;
                } else if (str.equals("grant_perms")) {
                    Uri uri4 = (Uri) bundle.getParcelable("slice_uri");
                    String string3 = bundle.getString("pkg");
                    if (Binder.getCallingUid() == Process.myUid()) {
                        cVar.f14799f.mo18889c(uri4, string3);
                        return null;
                    }
                    throw new SecurityException("Only the owning process can manage slice permissions");
                } else if (!str.equals("revoke_perms")) {
                    return null;
                } else {
                    Uri uri5 = (Uri) bundle.getParcelable("slice_uri");
                    String string4 = bundle.getString("pkg");
                    if (Binder.getCallingUid() == Process.myUid()) {
                        C6706a aVar2 = cVar.f14799f;
                        aVar2.getClass();
                        C6706a.C6707a b2 = aVar2.mo18888b(string4, uri5.getAuthority());
                        List<String> pathSegments = uri5.getPathSegments();
                        String[] strArr = (String[]) pathSegments.toArray(new String[pathSegments.size()]);
                        for (int i3 = b2.f14790a.f16715d - 1; i3 >= 0; i3--) {
                            if (C6706a.C6707a.m13091b(strArr, (String[]) b2.f14790a.f16714c[i3])) {
                                b2.f14790a.mo19876l(i3);
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            return null;
                        }
                        aVar2.mo18890d(b2);
                        return null;
                    }
                    throw new SecurityException("Only the owning process can manage slice permissions");
                }
            }
            return bundle2;
        }
    }

    public final Uri canonicalize(Uri uri) {
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public List<Uri> getPinnedSlices() {
        return this.mPinnedSliceUris;
    }

    public final String getType(Uri uri) {
        return "vnd.android.slice";
    }

    public Object getWrapper() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new SliceProviderWrapperContainer$SliceProviderWrapper(this, this.mAutoGrantPermissions);
        }
        return null;
    }

    public void handleSlicePinned(Uri uri) {
        if (!this.mPinnedSliceUris.contains(uri)) {
            this.mPinnedSliceUris.add(uri);
        }
    }

    public void handleSliceUnpinned(Uri uri) {
        if (this.mPinnedSliceUris.contains(uri)) {
            this.mPinnedSliceUris.remove(uri);
        }
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public abstract Slice onBindSlice(Uri uri);

    public final boolean onCreate() {
        int i = Build.VERSION.SDK_INT;
        Context context = getContext();
        this.mPinnedSliceUris = new ArrayList((i >= 28 ? new C3472d(context) : new C3471c(context)).mo12984a());
        if (i < 28) {
            this.mCompat = new C6709c(this, onCreatePermissionManager(this.mAutoGrantPermissions), getContext());
        }
        return onCreateSliceProvider();
    }

    public C6706a onCreatePermissionManager(String[] strArr) {
        Context context = getContext();
        StringBuilder h = C0072d.m201h("slice_perms_");
        h.append(getClass().getName());
        return new C6706a(context, h.toString(), Process.myUid(), strArr);
    }

    public abstract boolean onCreateSliceProvider();

    public Collection<Uri> onGetSliceDescendants(Uri uri) {
        return Collections.emptyList();
    }

    public Uri onMapIntentToUri(Intent intent) {
        throw new UnsupportedOperationException("This provider has not implemented intent to uri mapping");
    }

    public void onSlicePinned(Uri uri) {
    }

    public void onSliceUnpinned(Uri uri) {
    }

    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public SliceProvider() {
        this.mAutoGrantPermissions = new String[0];
    }
}

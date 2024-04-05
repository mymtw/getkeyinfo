package p089e2;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import androidx.slice.Slice;
import androidx.slice.SliceProvider;
import androidx.slice.SliceSpec;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import p193o.C7496d;

/* renamed from: e2.c */
public final class C6709c {

    /* renamed from: a */
    public final Handler f14794a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Context f14795b;

    /* renamed from: c */
    public String f14796c;

    /* renamed from: d */
    public final SliceProvider f14797d;

    /* renamed from: e */
    public C6708b f14798e;

    /* renamed from: f */
    public C6706a f14799f;

    /* renamed from: g */
    public final C6710a f14800g = new C6710a();

    /* renamed from: e2.c$a */
    public class C6710a implements Runnable {
        public C6710a() {
        }

        public final void run() {
            Process.sendSignal(Process.myPid(), 3);
            Log.wtf("SliceProviderCompat", "Timed out while handling slice callback " + C6709c.this.f14796c);
        }
    }

    /* renamed from: e2.c$b */
    public static class C6711b implements AutoCloseable {

        /* renamed from: b */
        public final ContentProviderClient f14802b;

        public C6711b(ContentProviderClient contentProviderClient) {
            this.f14802b = contentProviderClient;
        }

        public final void close() {
            ContentProviderClient contentProviderClient = this.f14802b;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public C6709c(SliceProvider sliceProvider, C6706a aVar, Context context) {
        this.f14797d = sliceProvider;
        this.f14795b = context;
        String g = C0326j.m862g(C6709c.class, C0072d.m201h("slice_data_"));
        SharedPreferences sharedPreferences = context.getSharedPreferences("slice_data_all_slice_files", 0);
        Set<String> stringSet = sharedPreferences.getStringSet("slice_data_all_slice_files", Collections.emptySet());
        if (!stringSet.contains(g)) {
            C7496d dVar = new C7496d((Set) stringSet);
            dVar.add(g);
            sharedPreferences.edit().putStringSet("slice_data_all_slice_files", dVar).commit();
        }
        this.f14798e = new C6708b(context, g);
        this.f14799f = aVar;
    }

    /* renamed from: a */
    public static C6711b m13100a(ContentResolver contentResolver, Uri uri) {
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            return new C6711b(acquireUnstableContentProviderClient);
        }
        throw new IllegalArgumentException(C0073e.m206f("No provider found for ", uri));
    }

    /* renamed from: b */
    public static C7496d m13101b(Bundle bundle) {
        C7496d dVar = new C7496d();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("specs");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("revs");
        if (!(stringArrayList == null || integerArrayList == null)) {
            for (int i = 0; i < stringArrayList.size(); i++) {
                dVar.add(new SliceSpec(stringArrayList.get(i), integerArrayList.get(i).intValue()));
            }
        }
        return dVar;
    }

    /* renamed from: c */
    public final Slice mo18898c(Uri uri, String str, C7496d dVar) {
        if (str == null) {
            str = this.f14795b.getPackageManager().getNameForUid(Binder.getCallingUid());
        }
        if (this.f14799f.mo18887a(uri, Binder.getCallingPid(), Binder.getCallingUid()) != 0) {
            return SliceProvider.createPermissionSlice(this.f14795b, uri, str);
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        this.f14796c = "onBindSlice";
        this.f14794a.postDelayed(this.f14800g, NetworkRetryInterceptor.DEFAULT_RETRY_DELAY);
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyDeath().build());
            SliceProvider.setSpecs(dVar);
            try {
                Slice onBindSlice = this.f14797d.onBindSlice(uri);
                SliceProvider.setSpecs((Set<SliceSpec>) null);
                this.f14794a.removeCallbacks(this.f14800g);
                StrictMode.setThreadPolicy(threadPolicy);
                return onBindSlice;
            } catch (Exception e) {
                Log.wtf("SliceProviderCompat", "Slice with URI " + uri.toString() + " is invalid.", e);
                SliceProvider.setSpecs((Set<SliceSpec>) null);
                this.f14794a.removeCallbacks(this.f14800g);
                StrictMode.setThreadPolicy(threadPolicy);
                return null;
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}

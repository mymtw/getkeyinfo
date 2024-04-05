package p022b2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p013v4.media.C0073e;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p089e2.C6708b;
import p089e2.C6709c;
import p193o.C7496d;

/* renamed from: b2.c */
public final class C3471c extends C3470b {

    /* renamed from: a */
    public final Context f8092a;

    public C3471c(Context context) {
        this.f8092a = context;
    }

    /* renamed from: a */
    public final List<Uri> mo12984a() {
        Context context = this.f8092a;
        ArrayList arrayList = new ArrayList();
        for (String bVar : context.getSharedPreferences("slice_data_all_slice_files", 0).getStringSet("slice_data_all_slice_files", Collections.emptySet())) {
            C6708b bVar2 = new C6708b(context, bVar);
            ArrayList arrayList2 = new ArrayList();
            for (String next : bVar2.mo18894b().getAll().keySet()) {
                if (next.startsWith("pinned_")) {
                    Uri parse = Uri.parse(next.substring(7));
                    if (!bVar2.mo18893a(parse).isEmpty()) {
                        arrayList2.add(parse);
                    }
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C7496d mo12985b(Uri uri) {
        C6709c.C6711b a = C6709c.m13100a(this.f8092a.getContentResolver(), uri);
        if (a.f14802b != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("slice_uri", uri);
                Bundle call = a.f14802b.call("get_specs", "supports_versioned_parcelable", bundle);
                if (call != null) {
                    return C6709c.m13101b(call);
                }
            } catch (RemoteException e) {
                Log.e("SliceProviderCompat", "Unable to get pinned specs", e);
            }
            return null;
        }
        throw new IllegalArgumentException(C0073e.m206f("Unknown URI ", uri));
    }
}

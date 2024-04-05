package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.appupdate.o */
public final class C15573o extends C15571m {

    /* renamed from: d */
    public final /* synthetic */ C15574p f35048d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15573o(C15574p pVar, C18614l lVar, String str) {
        super(pVar, new C15032m3("OnRequestInstallCallback"), lVar);
        this.f35048d = pVar;
    }

    public final void zzc(Bundle bundle) throws RemoteException {
        Bundle bundle2 = bundle;
        super.zzc(bundle);
        if (bundle2.getInt("error.code", -2) != 0) {
            this.f35046b.mo70125a(new InstallException(bundle2.getInt("error.code", -2)));
            return;
        }
        C18614l lVar = this.f35046b;
        C15574p pVar = this.f35048d;
        bundle2.getInt("version.code", -1);
        int i = bundle2.getInt("update.availability");
        int i2 = bundle2.getInt("install.status", 0);
        if (bundle2.getInt("client.version.staleness", -1) != -1) {
            bundle2.getInt("client.version.staleness");
        }
        int i3 = bundle2.getInt("in.app.update.priority", 0);
        bundle2.getLong("bytes.downloaded");
        bundle2.getLong("total.bytes.to.download");
        long j = bundle2.getLong("additional.size.required");
        C15576r rVar = pVar.f35054d;
        rVar.getClass();
        lVar.mo70126b(new C15559a(i, i2, i3, j, C15576r.m25231a(new File(rVar.f35057a.getFilesDir(), "assetpacks")), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent")));
    }
}

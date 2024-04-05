package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzv;
import java.util.List;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.m */
public class C15626m extends zzv {

    /* renamed from: a */
    public final C18614l f35237a;

    /* renamed from: b */
    public final /* synthetic */ C15662v f35238b;

    public C15626m(C15662v vVar, C18614l lVar) {
        this.f35238b = vVar;
        this.f35237a = lVar;
    }

    public final void zzb(int i, Bundle bundle) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onCancelDownload(%d)", Integer.valueOf(i));
    }

    public final void zzc(Bundle bundle) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onCancelDownloads()", new Object[0]);
    }

    public void zzd(Bundle bundle) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        int i = bundle.getInt("error_code");
        C15662v.f35359g.mo52243c("onError(%d)", Integer.valueOf(i));
        this.f35237a.mo70125a(new AssetPackException(i));
    }

    public void zze(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onGetChunkFileDescriptor", new Object[0]);
    }

    public final void zzf(int i, Bundle bundle) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onGetSession(%d)", Integer.valueOf(i));
    }

    public void zzg(List list) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onGetSessionStates", new Object[0]);
    }

    public void zzh(Bundle bundle, Bundle bundle2) {
        this.f35238b.f35365e.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    public final void zzi(Bundle bundle, Bundle bundle2) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    public final void zzj(Bundle bundle, Bundle bundle2) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    public final void zzk(Bundle bundle, Bundle bundle2) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    public final void zzl(Bundle bundle, Bundle bundle2) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onRemoveModule()", new Object[0]);
    }

    public void zzm(Bundle bundle, Bundle bundle2) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onRequestDownloadInfo()", new Object[0]);
    }

    public void zzn(int i, Bundle bundle) {
        this.f35238b.f35364d.mo55524c(this.f35237a);
        C15662v.f35359g.mo52245e("onStartDownload(%d)", Integer.valueOf(i));
    }
}

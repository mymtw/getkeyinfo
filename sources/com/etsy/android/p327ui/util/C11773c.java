package com.etsy.android.p327ui.util;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.contentproviders.EtsyProvider;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.datatypes.EtsyId;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.util.c */
public final class C11773c {

    /* renamed from: a */
    public final Context f26226a;

    public C11773c(FragmentActivity fragmentActivity) {
        Context applicationContext = fragmentActivity.getApplicationContext();
        C19383o.m32796f(applicationContext, "context.applicationContext");
        this.f26226a = applicationContext;
    }

    /* renamed from: a */
    public final void mo38017a(EtsyId etsyId, boolean z) {
        Context context = this.f26226a;
        C8694h.f19097a.mo21310e(String.format("updateUserFollowState userId:%s isFollowed:%b", new Object[]{String.valueOf(etsyId), Boolean.valueOf(z)}));
        ContentValues contentValues = new ContentValues();
        contentValues.put("followed", Boolean.valueOf(z));
        String[] strArr = {String.valueOf(etsyId)};
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newUpdate(EtsyProvider.C6432e.f14250a).withValues(contentValues).withSelection("user_id = ?", strArr).build());
        try {
            context.getContentResolver().applyBatch(EtsyProvider.AUTHORITY, arrayList);
        } catch (RemoteException e) {
            C8694h.f19097a.mo21309d("RemoteException on applyBatch", e);
        } catch (OperationApplicationException e2) {
            C8694h.f19097a.mo21309d("OperationApplicationException on applyBatch", e2);
        }
    }
}

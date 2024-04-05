package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import androidx.room.C3225d;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.C6546j;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.utils.DialogMaker;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.o */
public final /* synthetic */ class C6597o implements C6599q.C6600a, DialogMaker.PositiveClickListener {

    /* renamed from: b */
    public final /* synthetic */ Object f14564b;

    /* renamed from: c */
    public final /* synthetic */ Object f14565c;

    /* renamed from: d */
    public final /* synthetic */ Object f14566d;

    public /* synthetic */ C6597o(Object obj, Object obj2, Object obj3) {
        this.f14564b = obj;
        this.f14565c = obj2;
        this.f14566d = obj3;
    }

    public final Object apply(Object obj) {
        C6599q qVar = (C6599q) this.f14564b;
        List list = (List) this.f14565c;
        C6556p pVar = (C6556p) this.f14566d;
        Cursor cursor = (Cursor) obj;
        qVar.getClass();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            C6547k.C6548a uptimeMillis = C6547k.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                uptimeMillis.setEncodedPayload(new C6546j(string == null ? C6599q.f14568g : new C6493a(string), cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                uptimeMillis.setEncodedPayload(new C6546j(string2 == null ? C6599q.f14568g : new C6493a(string2), (byte[]) C6599q.m12957j(qVar.mo18791f().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), new C3225d(2))));
            }
            if (!cursor.isNull(6)) {
                uptimeMillis.setCode(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C6590h.create(j, pVar, uptimeMillis.build()));
        }
        return null;
    }

    public final void onPositiveClick(DialogMaker dialogMaker) {
        PayPalSnappingRecyclerView.m35369showOfferDialog$lambda23((PEnums.TransitionName) this.f14564b, (PayPalSnappingRecyclerView) this.f14565c, (PYPLCheckoutUtils.FallbackScenario) this.f14566d, dialogMaker);
    }
}

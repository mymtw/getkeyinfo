package androidx.room;

import android.database.Cursor;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalLogoutView;
import com.paypal.pyplcheckout.utils.DialogMaker;
import java.util.ArrayList;
import p112g2.C6831a;
import p146j.C7096a;
import p594jh.C17909f;

/* renamed from: androidx.room.d */
public final /* synthetic */ class C3225d implements C7096a, C6599q.C6600a, C17909f, DialogMaker.NegativeClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f7498b;

    public /* synthetic */ C3225d(int i) {
        this.f7498b = i;
    }

    public final Object apply(Object obj) {
        switch (this.f7498b) {
            case 0:
                C6831a aVar = (C6831a) obj;
                return null;
            case 1:
                C6493a aVar2 = C6599q.f14568g;
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            default:
                Cursor cursor = (Cursor) obj;
                C6493a aVar3 = C6599q.f14568g;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    i += blob.length;
                }
                byte[] bArr = new byte[i];
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i3);
                    System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                    i2 += bArr2.length;
                }
                return bArr;
        }
    }

    public final void onNegativeClick(DialogMaker dialogMaker) {
        PayPalLogoutView.m35450handleLogoutClicked$lambda2(dialogMaker);
    }
}

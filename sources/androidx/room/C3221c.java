package androidx.room;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.google.android.exoplayer2.source.C14368p;
import com.paypal.pyplcheckout.utils.DialogMaker;
import com.paypal.pyplcheckout.utils.DialogPresets;
import p112g2.C6831a;
import p146j.C7096a;
import p513bj.C14052d;
import p594jh.C17909f;

/* renamed from: androidx.room.c */
public final /* synthetic */ class C3221c implements C7096a, C6599q.C6600a, C17909f, C14052d, DialogMaker.NegativeClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f7490b;

    public /* synthetic */ C3221c(int i) {
        this.f7490b = i;
    }

    public final void accept(Object obj) {
        ((C14368p.C14370b) obj).f32312b.release();
    }

    public final Object apply(Object obj) {
        switch (this.f7490b) {
            case 0:
                return ((C6831a) obj).mo18965p();
            default:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
        }
    }

    public final void onNegativeClick(DialogMaker dialogMaker) {
        DialogPresets.m35464showExitSurveyDialog$lambda1(dialogMaker);
    }
}

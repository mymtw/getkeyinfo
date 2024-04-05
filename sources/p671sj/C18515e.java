package p671sj;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.base.zaf;

/* renamed from: sj.e */
public final class C18515e extends Drawable.ConstantState {

    /* renamed from: a */
    public int f40777a;

    /* renamed from: b */
    public int f40778b;

    public C18515e(C18515e eVar) {
        if (eVar != null) {
            this.f40777a = eVar.f40777a;
            this.f40778b = eVar.f40778b;
        }
    }

    public final int getChangingConfigurations() {
        return this.f40777a;
    }

    public final Drawable newDrawable() {
        return new zaf(this);
    }
}

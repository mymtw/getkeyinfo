package p704wk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.floatingactionbutton.C15333d;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import p629nk.C18268a;
import p629nk.C18269b;

/* renamed from: wk.b */
public abstract class C18718b implements C15333d {

    /* renamed from: a */
    public final Context f41471a;

    /* renamed from: b */
    public final ExtendedFloatingActionButton f41472b;

    /* renamed from: c */
    public final ArrayList<Animator.AnimatorListener> f41473c = new ArrayList<>();

    /* renamed from: d */
    public final C18717a f41474d;

    /* renamed from: e */
    public C18269b f41475e;

    /* renamed from: f */
    public C18269b f41476f;

    /* renamed from: wk.b$a */
    public class C18719a extends Property<ExtendedFloatingActionButton, Float> {
        public C18719a() {
            super(Float.class, "LABEL_OPACITY_PROPERTY");
        }

        public final Object get(Object obj) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
            float alpha = (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), C18718b.this.f41472b.originalTextCsl.getDefaultColor())));
            LinearInterpolator linearInterpolator = C18268a.f40091a;
            return Float.valueOf((alpha * 1.0f) + 0.0f);
        }

        public final void set(Object obj, Object obj2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
            Float f = (Float) obj2;
            int colorForState = extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), C18718b.this.f41472b.originalTextCsl.getDefaultColor());
            float floatValue = f.floatValue();
            LinearInterpolator linearInterpolator = C18268a.f40091a;
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (((((((float) Color.alpha(colorForState)) / 255.0f) - 0.0f) * floatValue) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
            } else {
                extendedFloatingActionButton.silentlyUpdateTextColor(valueOf);
            }
        }
    }

    public C18718b(ExtendedFloatingActionButton extendedFloatingActionButton, C18717a aVar) {
        this.f41472b = extendedFloatingActionButton;
        this.f41471a = extendedFloatingActionButton.getContext();
        this.f41474d = aVar;
    }

    /* renamed from: d */
    public void mo53957d() {
        this.f41474d.f41470a = null;
    }

    /* renamed from: f */
    public AnimatorSet mo53954f() {
        C18269b bVar = this.f41476f;
        if (bVar == null) {
            if (this.f41475e == null) {
                this.f41475e = C18269b.m30886b(this.f41471a, mo53953e());
            }
            bVar = this.f41475e;
            bVar.getClass();
        }
        return mo70199g(bVar);
    }

    /* renamed from: g */
    public final AnimatorSet mo70199g(C18269b bVar) {
        ArrayList arrayList = new ArrayList();
        if (bVar.mo69813g("opacity")) {
            arrayList.add(bVar.mo69809d("opacity", this.f41472b, View.ALPHA));
        }
        if (bVar.mo69813g(ResponseConstants.SCALE)) {
            arrayList.add(bVar.mo69809d(ResponseConstants.SCALE, this.f41472b, View.SCALE_Y));
            arrayList.add(bVar.mo69809d(ResponseConstants.SCALE, this.f41472b, View.SCALE_X));
        }
        if (bVar.mo69813g(ResponseConstants.WIDTH)) {
            arrayList.add(bVar.mo69809d(ResponseConstants.WIDTH, this.f41472b, ExtendedFloatingActionButton.WIDTH));
        }
        if (bVar.mo69813g(ResponseConstants.HEIGHT)) {
            arrayList.add(bVar.mo69809d(ResponseConstants.HEIGHT, this.f41472b, ExtendedFloatingActionButton.HEIGHT));
        }
        if (bVar.mo69813g("paddingStart")) {
            arrayList.add(bVar.mo69809d("paddingStart", this.f41472b, ExtendedFloatingActionButton.PADDING_START));
        }
        if (bVar.mo69813g("paddingEnd")) {
            arrayList.add(bVar.mo69809d("paddingEnd", this.f41472b, ExtendedFloatingActionButton.PADDING_END));
        }
        if (bVar.mo69813g("labelOpacity")) {
            arrayList.add(bVar.mo69809d("labelOpacity", this.f41472b, new C18719a()));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C15588c1.m25289K0(animatorSet, arrayList);
        return animatorSet;
    }
}

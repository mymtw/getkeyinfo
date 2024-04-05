package p726zi;

import android.view.View;
import com.google.android.exoplayer2.p526ui.StyledPlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C14389c;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import java.util.HashMap;
import java.util.Map;
import p513bj.C14049b0;

/* renamed from: zi.e */
public final /* synthetic */ class C18910e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f42127b;

    /* renamed from: c */
    public final /* synthetic */ Object f42128c;

    /* renamed from: d */
    public final /* synthetic */ Object f42129d;

    public /* synthetic */ C18910e(int i, Object obj, Object obj2) {
        this.f42127b = i;
        this.f42128c = obj;
        this.f42129d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f42127b) {
            case 0:
                StyledPlayerControlView.C14408k kVar = (StyledPlayerControlView.C14408k) this.f42128c;
                StyledPlayerControlView.C14407j jVar = (StyledPlayerControlView.C14407j) this.f42129d;
                if (kVar.f32439d != null && StyledPlayerControlView.this.trackSelector != null) {
                    DefaultTrackSelector.C14378c buildUpon = StyledPlayerControlView.this.trackSelector.mo47858d().buildUpon();
                    for (int i = 0; i < kVar.f32437b.size(); i++) {
                        int intValue = kVar.f32437b.get(i).intValue();
                        if (intValue == jVar.f32432a) {
                            C14389c.C14390a aVar = kVar.f32439d;
                            aVar.getClass();
                            TrackGroupArray trackGroupArray = aVar.f32406c[intValue];
                            DefaultTrackSelector.SelectionOverride selectionOverride = new DefaultTrackSelector.SelectionOverride(jVar.f32433b, jVar.f32434c);
                            Map map = buildUpon.f32341H.get(intValue);
                            if (map == null) {
                                map = new HashMap();
                                buildUpon.f32341H.put(intValue, map);
                            }
                            if (!map.containsKey(trackGroupArray) || !C14049b0.m21628a(map.get(trackGroupArray), selectionOverride)) {
                                map.put(trackGroupArray, selectionOverride);
                            }
                            buildUpon.mo47884e(intValue, false);
                        } else {
                            buildUpon.mo47882c(intValue);
                            buildUpon.mo47884e(intValue, true);
                        }
                    }
                    DefaultTrackSelector access$4800 = StyledPlayerControlView.this.trackSelector;
                    access$4800.getClass();
                    access$4800.mo47859i(buildUpon);
                    kVar.mo48075m(jVar.f32435d);
                    StyledPlayerControlView.this.settingsWindow.dismiss();
                    return;
                }
                return;
            default:
                PayPalPoliciesAndRightsLinkView.m35349setupOfferLink$lambda12((String) this.f42128c, (PayPalPoliciesAndRightsLinkView) this.f42129d, view);
                return;
        }
    }
}

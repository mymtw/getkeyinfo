package com.paypal.pyplcheckout.threeds;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.play.core.assetpacks.C15588c1;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;

public final class ThreeDS20Activity extends AppCompatActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String THREE_DS_20_PAYMENT_AUTH_REQUEST = "THREE_DS_20_PAYMENT_AUTH_REQUEST";
    public static final String THREE_DS_20_TRANSACTION_ID = "THREE_DS_20_TRANSACTION_ID";
    public static final String THREE_DS_20_VALIDATE_RESPONSE = "THREE_DS_20_VALIDATE_RESPONSE";
    public static final String THREE_DS_20_VALIDATE_RESPONSE_ERROR_DESCRIPTION = "THREE_DS_20_VALIDATE_RESPONSE_DESCRIPTION";
    public static final String THREE_DS_20_VALIDATE_RESPONSE_ERROR_NUMBER = "THREE_DS_20_VALIDATE_RESPONSE_ERROR_NUMBER";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public Events events;
    public ThreeDS20 threeDS20;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Events getEvents() {
        Events events2 = this.events;
        if (events2 != null) {
            return events2;
        }
        C19383o.m32805o("events");
        throw null;
    }

    public final ThreeDS20 getThreeDS20() {
        ThreeDS20 threeDS202 = this.threeDS20;
        if (threeDS202 != null) {
            return threeDS202;
        }
        C19383o.m32805o("threeDS20");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SdkComponentKt.inject(this);
        Bundle extras = getIntent().getExtras();
        String string = extras == null ? null : extras.getString(THREE_DS_20_TRANSACTION_ID);
        String string2 = extras == null ? null : extras.getString(THREE_DS_20_PAYMENT_AUTH_REQUEST);
        if (extras != null) {
            boolean z = false;
            if (!(string == null || C19457k.m33020X0(string))) {
                if (string2 == null || C19457k.m33020X0(string2)) {
                    z = true;
                }
                if (!z) {
                    C15588c1.m25329i0(this).mo10833b(new ThreeDS20Activity$onCreate$1(this, string, string2, (C19340c<? super ThreeDS20Activity$onCreate$1>) null));
                    return;
                }
            }
        }
        PLog pLog = PLog.INSTANCE;
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E612, "ThreeDS20Activity required fields are null or blank", (String) null, (Throwable) null, PEnums.TransitionName.THREE_DS_CONTINGENCY_FLOW_FINISHED, PEnums.StateName.THREE_DS, "Required 3DS fields are null or blank", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1816, (Object) null);
        getEvents().fire(PayPalEventTypes.CONTINGENCY_EVENT, new Success(new ContingencyEventsModel(ContingencyType.THREE_DS_V2_CONTINGENCY, ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE, (Exception) null, (String) null, (ThreeDSSource) null, 28, (DefaultConstructorMarker) null)));
    }

    public final void setEvents(Events events2) {
        C19383o.m32797g(events2, "<set-?>");
        this.events = events2;
    }

    public final void setThreeDS20(ThreeDS20 threeDS202) {
        C19383o.m32797g(threeDS202, "<set-?>");
        this.threeDS20 = threeDS202;
    }
}

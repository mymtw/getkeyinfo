package com.paypal.pyplcheckout.addcard;

import android.app.Activity;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsException;
import com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState;
import com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase;
import kotlin.C19394m;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19689x1;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addcard.AddCardViewModel$launch3DS$1", mo70541f = "AddCardViewModel.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class AddCardViewModel$launch3DS$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ String $fundingInstrumentId;
    public int label;
    public final /* synthetic */ AddCardViewModel this$0;

    @C19060c(mo70540c = "com.paypal.pyplcheckout.addcard.AddCardViewModel$launch3DS$1$1", mo70541f = "AddCardViewModel.kt", mo70542l = {222, 222}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.pyplcheckout.addcard.AddCardViewModel$launch3DS$1$1 */
    public static final class C171741 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C171741(addCardViewModel, activity, str2, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C171741) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                StartAddCardThreeDsUseCase access$getStartAddCardThreeDs$p = addCardViewModel.startAddCardThreeDs;
                Activity activity = activity;
                String str = str2;
                this.label = 1;
                obj = access$getStartAddCardThreeDs$p.invoke(activity, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C0761x.m1684O0(obj);
                throw new KotlinNothingValueException();
            }
            final AddCardViewModel addCardViewModel = addCardViewModel;
            C171751 r1 = new C19600e() {
                public final Object emit(AddCardThreeDsState addCardThreeDsState, C19340c<? super C19394m> cVar) {
                    if (addCardThreeDsState instanceof AddCardThreeDsState.Loading) {
                        addCardViewModel.events.fire(PayPalEventTypes.CTA_LOADING_SPINNER, new Success(Boolean.TRUE));
                    } else if (!(addCardThreeDsState instanceof AddCardThreeDsState.ResolvingThreeDs)) {
                        if (addCardThreeDsState instanceof AddCardThreeDsState.Error) {
                            addCardViewModel.events.fire(PayPalEventTypes.CTA_LOADING_SPINNER, new Success(Boolean.FALSE));
                            addCardViewModel.clearLoadingState();
                            AddCardThreeDsState.Error error = (AddCardThreeDsState.Error) addCardThreeDsState;
                            PLog.decision$default(PEnums.TransitionName.NATIVE_ADD_CARD_THREE_DS_RESPONSE, PEnums.Outcome.FAILED, (PEnums.EventCode) null, PEnums.StateName.NATIVE_ADD_CARD, (String) null, (String) null, error.getError().getMessage(), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1972, (Object) null);
                            addCardViewModel.refreshCarousel();
                            if (!(error.getError() instanceof AddCardThreeDsException)) {
                                AddCardViewModel addCardViewModel = addCardViewModel;
                                String string = addCardViewModel.context.getString(C17165R.string.add_card_replan_error_header);
                                C19383o.m32796f(string, "context.getString(R.stri…card_replan_error_header)");
                                String string2 = addCardViewModel.context.getString(C17165R.string.add_card_replan_error_desc);
                                C19383o.m32796f(string2, "context.getString(R.stri…d_card_replan_error_desc)");
                                addCardViewModel.showAddCardError(new AddCardViewModel.AddCardAlertUiModel.Error.Three_Ds_Replan(string, string2, C17165R.color.add_card_red, C17165R.color.add_card_red_bg));
                            }
                        } else if (addCardThreeDsState instanceof AddCardThreeDsState.Success) {
                            PLog.decision$default(PEnums.TransitionName.NATIVE_ADD_CARD_THREE_DS_RESPONSE, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, PEnums.StateName.NATIVE_ADD_CARD, (String) null, (String) null, "native add card three ds success", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1972, (Object) null);
                            addCardViewModel.showEmptyState();
                            addCardViewModel.refreshCarousel();
                            C19846a<C19394m> nativeAddCardListener = addCardViewModel.getNativeAddCardListener();
                            if (nativeAddCardListener != null) {
                                nativeAddCardListener.invoke();
                            }
                            addCardViewModel.handleThreeDSAddCardSuccess();
                        }
                    }
                    return C19394m.f43287a;
                }
            };
            this.label = 2;
            if (((C19689x1) obj).collect(r1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardViewModel$launch3DS$1(String str, AddCardViewModel addCardViewModel, Activity activity, C19340c<? super AddCardViewModel$launch3DS$1> cVar) {
        super(2, cVar);
        this.$fundingInstrumentId = str;
        this.this$0 = addCardViewModel;
        this.$activity = activity;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddCardViewModel$launch3DS$1(this.$fundingInstrumentId, this.this$0, this.$activity, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AddCardViewModel$launch3DS$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            String str = this.$fundingInstrumentId;
            if (str == null || str.length() == 0) {
                this.this$0.fallbackToWeb("3DS add card - got null fundingInstrumentId", ErrorReason.CONTINGENCIES_ERROR);
                return C19394m.f43287a;
            }
            PLog pLog = PLog.INSTANCE;
            PLog.status$default(PEnums.TransitionName.NATIVE_ADD_CARD_THREE_DS_STARTED, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E608, PEnums.StateName.NATIVE_ADD_CARD, "Native add card 3DS started", (InstrumentationEvent.InstrumentationEventBuilder) null, 32, (Object) null);
            C19525d0 i0 = C19388s.m32866i0(this.this$0);
            final AddCardViewModel addCardViewModel = this.this$0;
            final Activity activity = this.$activity;
            final String str2 = this.$fundingInstrumentId;
            C19697g.m33468f(i0, (CoroutineContext) null, (CoroutineStart) null, new C171741((C19340c<? super C171741>) null), 3);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

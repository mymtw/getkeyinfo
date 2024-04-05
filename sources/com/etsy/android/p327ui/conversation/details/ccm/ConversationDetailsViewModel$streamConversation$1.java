package com.etsy.android.p327ui.conversation.details.ccm;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.Status;
import com.etsy.android.p327ui.conversation.details.C9527i;
import com.etsy.android.p327ui.conversation.details.ccm.C9502k;
import com.etsy.android.p327ui.conversation.details.models.ImageDatabaseModel;
import com.etsy.android.p327ui.conversation.details.models.ImageSourceDatabaseModel;
import com.etsy.android.p327ui.conversation.details.models.ListingPartialDatabaseModel;
import com.etsy.android.p327ui.conversation.details.models.MessageSource;
import com.etsy.android.p327ui.conversation.models.MessageType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19665q1;
import org.apache.commons.lang3.StringEscapeUtils;
import p348fc.C12715a;
import p348fc.C12716b;
import p354gc.C12763b;
import p354gc.C12764c;
import p354gc.C12766d;
import p354gc.C12772f;
import p354gc.C12774h;
import p354gc.C12775i;
import p354gc.C12783l;
import p354gc.C12784m;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel$streamConversation$1", mo70541f = "ConversationDetailsViewModel.kt", mo70542l = {146}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel$streamConversation$1 */
final class ConversationDetailsViewModel$streamConversation$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ long $otherUserId;
    public int label;
    public final /* synthetic */ ConversationDetailsViewModel this$0;

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel$streamConversation$1$a */
    public static final class C9489a implements C19600e<Map<C12715a, ? extends List<? extends C12716b>>> {

        /* renamed from: b */
        public final /* synthetic */ ConversationDetailsViewModel f21044b;

        public C9489a(ConversationDetailsViewModel conversationDetailsViewModel) {
            this.f21044b = conversationDetailsViewModel;
        }

        public final Object emit(Object obj, C19340c cVar) {
            ConversationDetailsViewModel conversationDetailsViewModel;
            MessageType messageType;
            MessageSource messageSource;
            String str;
            Map map = (Map) obj;
            if (!map.isEmpty()) {
                Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                ConversationDetailsViewModel conversationDetailsViewModel2 = this.f21044b;
                C12763b a = ((C12715a) entry.getKey()).mo45484a();
                Iterable iterable = (Iterable) entry.getValue();
                ConversationDetailsViewModel conversationDetailsViewModel3 = this.f21044b;
                ArrayList arrayList = new ArrayList(C19322o.m32624F0(iterable));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    C12716b bVar = (C12716b) it.next();
                    C8630b bVar2 = conversationDetailsViewModel3.f21020c;
                    bVar.getClass();
                    C19383o.m32797g(bVar2, "etsyMoneyFactory");
                    long j = bVar.f28023a;
                    long j2 = bVar.f28024b;
                    long j3 = bVar.f28026d;
                    C12763b bVar3 = a;
                    Iterator it2 = it;
                    long j4 = bVar.f28025c * ((long) 1000);
                    String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(bVar.f28027e);
                    String str2 = bVar.f28028f;
                    boolean z = bVar.f28029g;
                    long j5 = bVar.f28030h;
                    ConversationDetailsViewModel conversationDetailsViewModel4 = conversationDetailsViewModel3;
                    List<ListingPartialDatabaseModel> list = bVar.f28031i;
                    long j6 = j3;
                    ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(list));
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        conversationDetailsViewModel = conversationDetailsViewModel2;
                        if (!it3.hasNext()) {
                            break;
                        }
                        ListingPartialDatabaseModel listingPartialDatabaseModel = (ListingPartialDatabaseModel) it3.next();
                        C19383o.m32797g(listingPartialDatabaseModel, "<this>");
                        Iterator<T> it4 = it3;
                        ArrayList arrayList3 = arrayList;
                        long j7 = listingPartialDatabaseModel.f21186a;
                        String str3 = listingPartialDatabaseModel.f21187b;
                        boolean z2 = z;
                        String str4 = str2;
                        if (C12764c.C12765a.f28215a[Status.Companion.fromInt(listingPartialDatabaseModel.f21192g).ordinal()] == 1) {
                            String str5 = listingPartialDatabaseModel.f21190e;
                            if (!(str5 == null || (str = bVar2.mo21248a(str5, listingPartialDatabaseModel.f21191f).format()) == null)) {
                                arrayList2.add(new C12775i(Long.valueOf(j7), str3, str, listingPartialDatabaseModel.f21189d, listingPartialDatabaseModel.f21188c));
                                it3 = it4;
                                conversationDetailsViewModel2 = conversationDetailsViewModel;
                                arrayList = arrayList3;
                                z = z2;
                                str2 = str4;
                            }
                        } else {
                            str = listingPartialDatabaseModel.f21193h;
                            if (str != null) {
                                arrayList2.add(new C12775i(Long.valueOf(j7), str3, str, listingPartialDatabaseModel.f21189d, listingPartialDatabaseModel.f21188c));
                                it3 = it4;
                                conversationDetailsViewModel2 = conversationDetailsViewModel;
                                arrayList = arrayList3;
                                z = z2;
                                str2 = str4;
                            }
                        }
                        str = "";
                        arrayList2.add(new C12775i(Long.valueOf(j7), str3, str, listingPartialDatabaseModel.f21189d, listingPartialDatabaseModel.f21188c));
                        it3 = it4;
                        conversationDetailsViewModel2 = conversationDetailsViewModel;
                        arrayList = arrayList3;
                        z = z2;
                        str2 = str4;
                    }
                    String str6 = str2;
                    boolean z3 = z;
                    ArrayList arrayList4 = arrayList;
                    List<ImageDatabaseModel> list2 = bVar.f28032j;
                    ArrayList arrayList5 = new ArrayList(C19322o.m32624F0(list2));
                    Iterator<T> it5 = list2.iterator();
                    while (it5.hasNext()) {
                        ImageDatabaseModel imageDatabaseModel = (ImageDatabaseModel) it5.next();
                        C19383o.m32797g(imageDatabaseModel, "<this>");
                        List<ImageSourceDatabaseModel> list3 = imageDatabaseModel.f21182a;
                        ArrayList arrayList6 = new ArrayList(C19322o.m32624F0(list3));
                        for (ImageSourceDatabaseModel imageSourceDatabaseModel : list3) {
                            Iterator<T> it6 = it5;
                            int i = imageSourceDatabaseModel.f21183a;
                            arrayList6.add(new C12772f(i, i, imageSourceDatabaseModel.f21185c));
                            it5 = it6;
                        }
                        arrayList5.add(new C12774h(arrayList6));
                        it5 = it5;
                    }
                    String str7 = bVar.f28033k;
                    MessageSource.C9557a aVar = MessageSource.Companion;
                    String str8 = bVar.f28035m;
                    aVar.getClass();
                    MessageSource[] values = MessageSource.values();
                    int length = values.length;
                    int i2 = 0;
                    while (true) {
                        messageType = null;
                        if (i2 >= length) {
                            messageSource = null;
                            break;
                        }
                        messageSource = values[i2];
                        if (C19383o.m32792b(messageSource.getSource(), str8)) {
                            break;
                        }
                        i2++;
                    }
                    MessageSource messageSource2 = messageSource == null ? MessageSource.NONE : messageSource;
                    String str9 = bVar.f28036n;
                    MessageType.C9603a aVar2 = MessageType.Companion;
                    int i3 = bVar.f28034l;
                    aVar2.getClass();
                    MessageType[] values2 = MessageType.values();
                    int length2 = values2.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            break;
                        }
                        MessageType messageType2 = values2[i4];
                        MessageType[] messageTypeArr = values2;
                        if (messageType2.getRawType() == i3) {
                            messageType = messageType2;
                            break;
                        }
                        i4++;
                        values2 = messageTypeArr;
                    }
                    if (messageType == null) {
                        messageType = MessageType.USER;
                    }
                    C19383o.m32796f(unescapeHtml4, "unescapeHtml4(this.text)");
                    ArrayList arrayList7 = arrayList4;
                    arrayList7.add(new C12783l(unescapeHtml4, j2, j, j5, messageType, j6, 0, str7, j4, str6, z3, arrayList5, arrayList2, messageSource2, str9, 64));
                    a = bVar3;
                    arrayList = arrayList7;
                    it = it2;
                    conversationDetailsViewModel3 = conversationDetailsViewModel4;
                    conversationDetailsViewModel2 = conversationDetailsViewModel;
                }
                ConversationDetailsViewModel conversationDetailsViewModel5 = conversationDetailsViewModel2;
                ArrayList arrayList8 = arrayList;
                C12763b bVar4 = a;
                C12766d dVar = new C12766d(bVar4, arrayList8);
                conversationDetailsViewModel5.getClass();
                ConversationDetailsViewModel conversationDetailsViewModel6 = conversationDetailsViewModel5;
                conversationDetailsViewModel6.f21018K = Long.valueOf(((C12783l) C19327t.m32645a1(arrayList8)).f28249f - 1);
                conversationDetailsViewModel6.f21017J = dVar;
                if (arrayList8.isEmpty()) {
                    conversationDetailsViewModel6.f21026i.setValue(new C9502k.C9503a(conversationDetailsViewModel6.f21013F));
                } else {
                    C12784m mVar = bVar4.f28208b;
                    String str10 = mVar.f28259a;
                    conversationDetailsViewModel6.f21013F = str10;
                    conversationDetailsViewModel6.f21026i.setValue(new C9502k.C9506d(str10, C9527i.m17909a(dVar, mVar.f28262d)));
                }
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModel$streamConversation$1(ConversationDetailsViewModel conversationDetailsViewModel, long j, C19340c<? super ConversationDetailsViewModel$streamConversation$1> cVar) {
        super(2, cVar);
        this.this$0 = conversationDetailsViewModel;
        this.$otherUserId = j;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ConversationDetailsViewModel$streamConversation$1(this.this$0, this.$otherUserId, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ConversationDetailsViewModel$streamConversation$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C9510o oVar = this.this$0.f21023f;
            C19665q1 c = oVar.f21087b.mo31971c(this.$otherUserId, true);
            C9489a aVar = new C9489a(this.this$0);
            this.label = 1;
            if (c.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}

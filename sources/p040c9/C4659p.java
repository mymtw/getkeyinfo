package p040c9;

import android.content.Context;
import androidx.room.C3259y;
import androidx.room.RoomDatabase;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.details.ConversationDatabase;
import com.etsy.android.p327ui.favorites.C9742a;
import com.etsy.android.p327ui.favorites.add.FavoriteAndCollectionRepository;
import com.squareup.moshi.C17414y;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p346fa.C12703a;
import p389lc.C13011b;
import p425q9.C13265p;
import p740eq.C19011a;

/* renamed from: c9.p */
public final class C4659p implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10469a;

    /* renamed from: b */
    public final C19011a f10470b;

    /* renamed from: c */
    public final C19011a f10471c;

    /* renamed from: d */
    public final Object f10472d;

    public /* synthetic */ C4659p(Object obj, C19011a aVar, C19011a aVar2, int i) {
        this.f10469a = i;
        this.f10472d = obj;
        this.f10470b = aVar;
        this.f10471c = aVar2;
    }

    public final Object get() {
        switch (this.f10469a) {
            case 0:
                ((C4479c) this.f10472d).getClass();
                return new C9742a((FavoriteAndCollectionRepository) this.f10470b.get(), (C13265p) this.f10471c.get());
            case 1:
                Context context = (Context) this.f10470b.get();
                C17414y yVar = (C17414y) this.f10471c.get();
                ((C19421p) this.f10472d).getClass();
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                C19383o.m32797g(yVar, "moshi");
                RoomDatabase.C3213a<ConversationDatabase> a = C3259y.m7913a(context, ConversationDatabase.class, "Conversations");
                a.mo11986a(ConversationDatabase.f20964n);
                a.mo11986a(ConversationDatabase.f20965o);
                a.mo11986a(ConversationDatabase.f20966p);
                a.mo11986a(ConversationDatabase.f20967q);
                a.mo11986a(ConversationDatabase.f20968r);
                a.mo11986a(ConversationDatabase.f20969s);
                a.mo11986a(ConversationDatabase.f20970t);
                a.mo11986a(ConversationDatabase.f20971u);
                a.mo11986a(ConversationDatabase.f20972v);
                a.mo11986a(ConversationDatabase.f20973w);
                ConversationDatabase b = a.mo11987b();
                ConversationDatabase.f20963m = yVar;
                return b;
            default:
                return new C13011b((C8694h) this.f10470b.get(), (C12703a) this.f10471c.get(), (C8672b) ((C19011a) this.f10472d).get());
        }
    }

    public C4659p(C19011a aVar, C17553b bVar, C19011a aVar2) {
        this.f10469a = 2;
        this.f10470b = aVar;
        this.f10471c = bVar;
        this.f10472d = aVar2;
    }
}

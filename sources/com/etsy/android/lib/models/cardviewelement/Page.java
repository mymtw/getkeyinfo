package com.etsy.android.lib.models.cardviewelement;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.SignedOutMessageCard;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p415of.C13185n;

public class Page extends BaseFieldModel implements C13185n {
    private static final long serialVersionUID = -1681648073126542330L;
    public List<ListSection> mListSections = new ArrayList();
    public MessageCard mMessageCard;
    public String mTitle;
    public SignedOutMessageCard signedOutMessageCard;

    public void addListSection(ListSection listSection) {
        this.mListSections.add(listSection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Page page = (Page) obj;
        return Objects.equals(this.mTitle, page.mTitle) && Objects.equals(this.mListSections, page.mListSections) && Objects.equals(this.mMessageCard, page.mMessageCard) && Objects.equals(this.signedOutMessageCard, page.signedOutMessageCard);
    }

    public List<ListSection> getListSections() {
        return this.mListSections;
    }

    public MessageCard getMessageCard() {
        return this.mMessageCard;
    }

    public SignedOutMessageCard getSignedOutMessageCard() {
        return this.signedOutMessageCard;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mTitle, this.mListSections, this.mMessageCard, this.signedOutMessageCard});
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
        } else if (MessageCard.ITEM_TYPE.equals(str)) {
            List<MessageCard> parseArray = BaseModel.parseArray(jsonParser, MessageCard.class);
            if (parseArray.size() > 0) {
                this.mMessageCard = parseArray.get(0);
            }
        } else if (ResponseConstants.LIST.equals(str)) {
            this.mListSections = BaseModel.parseArray(jsonParser, ListSection.class);
        } else if (!SignedOutMessageCard.SIGNED_OUT_CART_MESSAGE_CARD_TYPE.equals(str)) {
            return false;
        } else {
            List<SignedOutMessageCard> parseArray2 = BaseModel.parseArray(jsonParser, SignedOutMessageCard.class);
            if (parseArray2.size() > 0) {
                this.signedOutMessageCard = parseArray2.get(0);
            }
        }
        return true;
    }

    public void setMessageCard(MessageCard messageCard) {
        this.mMessageCard = messageCard;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Page{mTitle='");
        h.append(this.mTitle);
        h.append('\'');
        h.append(", mListSections=");
        h.append(this.mListSections);
        h.append(", mMessageCard=");
        h.append(this.mMessageCard);
        h.append(", signedOutMessageCard=");
        h.append(this.signedOutMessageCard);
        h.append('}');
        return h.toString();
    }
}

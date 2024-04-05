package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class FAQ extends BaseModel {
    public static String STATE_ACTIVE = "active";
    public static String STATE_DELETED = "deleted";
    private static final long serialVersionUID = -4592502502388303727L;
    public String answerTranslated = null;
    public String mAnswer = "";
    public EtsyId mFaqId = new EtsyId();
    public String mLanguage = "";
    public String mQuestion = "";
    public int mRank;
    public boolean mShowTranslatedFAQ = false;
    public String mState = "";
    public String mTranslatedAnswer = "";
    public String mTranslatedQuestion = "";
    public String questionTranslated = null;

    public String getAnswer() {
        return (!this.mShowTranslatedFAQ || !C8885d0.m17323g(this.mTranslatedAnswer)) ? this.mAnswer : this.mTranslatedAnswer;
    }

    public String getAnswerTranslated() {
        return this.answerTranslated;
    }

    public EtsyId getFaqId() {
        return this.mFaqId;
    }

    public String getLanguage() {
        return this.mLanguage;
    }

    public String getQuestion() {
        return (!this.mShowTranslatedFAQ || !C8885d0.m17323g(this.mTranslatedQuestion)) ? this.mQuestion : this.mTranslatedQuestion;
    }

    public String getQuestionTranslated() {
        return this.questionTranslated;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            currentName.getClass();
            char c = 65535;
            switch (currentName.hashCode()) {
                case -1629262649:
                    if (currentName.equals("question_machine_translated")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1613589672:
                    if (currentName.equals("language")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1412808770:
                    if (currentName.equals(ResponseConstants.ANSWER)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1364497937:
                    if (currentName.equals("answer_machine_translated")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1281751324:
                    if (currentName.equals(ResponseConstants.FAQ_ID)) {
                        c = 4;
                        break;
                    }
                    break;
                case -1165870106:
                    if (currentName.equals(ResponseConstants.QUESTION)) {
                        c = 5;
                        break;
                    }
                    break;
                case 3492908:
                    if (currentName.equals(ResponseConstants.RANK)) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (currentName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.questionTranslated = BaseModel.parseString(jsonParser);
                    break;
                case 1:
                    this.mLanguage = BaseModel.parseString(jsonParser);
                    break;
                case 2:
                    this.mAnswer = BaseModel.parseString(jsonParser);
                    break;
                case 3:
                    this.answerTranslated = BaseModel.parseString(jsonParser);
                    break;
                case 4:
                    this.mFaqId.setId(BaseModel.parseString(jsonParser));
                    break;
                case 5:
                    this.mQuestion = BaseModel.parseString(jsonParser);
                    break;
                case 6:
                    this.mRank = jsonParser.getValueAsInt();
                    break;
                case 7:
                    this.mState = BaseModel.parseString(jsonParser);
                    break;
                default:
                    jsonParser.skipChildren();
                    break;
            }
        }
    }

    public void setAnswer(String str) {
        this.mAnswer = str;
    }

    public void setFaqId(EtsyId etsyId) {
        this.mFaqId = etsyId;
    }

    public void setLanguage(String str) {
        this.mLanguage = str;
    }

    public void setQuestion(String str) {
        this.mQuestion = str;
    }

    public void setShowTranslatedFAQ(boolean z) {
        this.mShowTranslatedFAQ = z;
    }

    public void setTranslatedAnswer(String str) {
        this.mTranslatedAnswer = str;
    }

    public void setTranslatedQuestion(String str) {
        this.mTranslatedQuestion = str;
    }
}

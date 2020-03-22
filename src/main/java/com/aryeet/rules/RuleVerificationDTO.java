package com.aryeet.rules;

import com.aryeet.model.ReviewFilter;
import org.springframework.stereotype.Component;

@Component
public class RuleVerificationDTO {

    private String ruleIndex;
    private ReviewFilter reviewFilter;

    public String getRuleIndex() {
        return ruleIndex;
    }

    public void setRuleIndex(String ruleIndex) {
        this.ruleIndex = ruleIndex;
    }

    public ReviewFilter getReviewFilter() {
        return reviewFilter;
    }

    public void setReviewFilter(ReviewFilter reviewFilter) {
        this.reviewFilter = reviewFilter;
    }

    public void clean(){
        ruleIndex="";
        reviewFilter =null;

    }
}

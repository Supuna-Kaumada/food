
package com.uwu.ans.foodsafty.new_record_food_preperation.domains;

@SuppressWarnings("unused")
public class Cleaning {


    private String mAdequate;
    private String mAppropriate;
    private String mDaily;
    private String mNoAccumilation;
    private String mMarks;
    private String mRemark;

    public Cleaning(String mAdequate, String mAppropriate, String mDaily, String mNoAccumilation, String mMarks, String mRemark) {
        this.mAdequate = mAdequate;
        this.mAppropriate = mAppropriate;
        this.mDaily = mDaily;
        this.mNoAccumilation = mNoAccumilation;
        this.mMarks = mMarks;
        this.mRemark = mRemark;
    }

    public String getAdequate() {
        return mAdequate;
    }

    public void setAdequate(String adequate) {
        mAdequate = adequate;
    }

    public String getAppropriate() {
        return mAppropriate;
    }

    public void setAppropriate(String appropriate) {
        mAppropriate = appropriate;
    }

    public String getDaily() {
        return mDaily;
    }

    public void setDaily(String daily) {
        mDaily = daily;
    }

    public String getMarks() {
        return mMarks;
    }

    public void setMarks(String marks) {
        mMarks = marks;
    }

    public String getNoAccumilation() {
        return mNoAccumilation;
    }

    public void setNoAccumilation(String noAccumilation) {
        mNoAccumilation = noAccumilation;
    }

    public String getRemark() {
        return mRemark;
    }

    public void setRemark(String remark) {
        mRemark = remark;
    }

}

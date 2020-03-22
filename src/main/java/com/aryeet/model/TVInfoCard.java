package com.aryeet.model;

public class TVInfoCard {
    private ImportantFeature importantFeature;
    private String manufacturer;
    private String model;
    private String productImage;
    private String testscore;
    private String productScoreValue;
    private String productScoreLabel;
    private String productAmount;
    private String productpercentage;
    private String reviewDate;
    private String viewRetailer ;
    private String compareText ;
    private boolean compareCheckBox ;

    public ImportantFeature getImportantFeature() {
        return importantFeature;
    }

    public void setImportantFeature(ImportantFeature importantFeature) {
        this.importantFeature = importantFeature;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getTestscore() {
        return testscore;
    }

    public void setTestscore(String testscore) {
        this.testscore = testscore;
    }

    public String getProductScoreValue() {
        return productScoreValue;
    }

    public void setProductScoreValue(String productScoreValue) {
        this.productScoreValue = productScoreValue;
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getViewRetailer() {
        return viewRetailer;
    }

    public void setViewRetailer(String viewRetailer) {
        this.viewRetailer = viewRetailer;
    }

    public String getProductScoreLabel() {
        return productScoreLabel;
    }

    public void setProductScoreLabel(String productScoreLabel) {
        this.productScoreLabel = productScoreLabel;
    }

    public String getProductpercentage() {
        return productpercentage;
    }

    public void setProductpercentage(String productpercentage) {
        this.productpercentage = productpercentage;
    }

    public String getCompareText() {
        return compareText;
    }

    public void setCompareText(String compareText) {
        this.compareText = compareText;
    }

    public boolean isCompareCheckBox() {
        return compareCheckBox;
    }

    public void setCompareCheckBox(boolean compareCheckBox) {
        this.compareCheckBox = compareCheckBox;
    }

    @Override
    public String toString() {
        return "TVInfoCard{" +
                "importantFeature=" + importantFeature +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", productImage='" + productImage + '\'' +
                ", testscore='" + testscore + '\'' +
                ", productScoreValue='" + productScoreValue + '\'' +
                ", productScoreLabel='" + productScoreLabel + '\'' +
                ", productAmount='" + productAmount + '\'' +
                ", productpercentage='" + productpercentage + '\'' +
                ", reviewDate='" + reviewDate + '\'' +
                ", viewRetailer='" + viewRetailer + '\'' +
                ", compareText='" + compareText + '\'' +
                ", compareCheckBox=" + compareCheckBox +
                '}';
    }
}

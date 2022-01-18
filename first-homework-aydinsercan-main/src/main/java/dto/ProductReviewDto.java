package dto;

import java.math.BigDecimal;

public class ProductReviewDto {

    private String productName;
    private String kategoryName;
    private BigDecimal productCost;


    public ProductReviewDto() {
    }

    public ProductReviewDto(String productName, String kategoryName, BigDecimal productCost) {
        this.productName = productName;
        this.kategoryName = kategoryName;
        this.productCost = productCost;
    }

    public String getUrunAdi() {
        return productName;
    }

    public void setUrunAdi(String productName) {
        this.productName = productName;
    }

    public String getKategoriAdi() {
        return kategoryName;
    }

    public void setKategoriAdi(String kategoryName) {
        this.kategoryName = kategoryName;
    }

    public BigDecimal getUrunFiyati() {
        return productCost;
    }

    public void setUrunFiyati(BigDecimal productCost) {
        this.productCost = productCost;
    }

    @Override
    public String toString() {
        return "ProductReviewDto{" +
                "urunAdi='" + productName + '\'' +
                ", kategoriAdi='" + kategoryName + '\'' +
                ", urunFiyati=" + productCost +
                '}';
    }
}
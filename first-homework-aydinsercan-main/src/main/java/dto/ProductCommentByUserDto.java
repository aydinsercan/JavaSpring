package dto;

import java.util.Date;

public class ProductCommentByUserDto {
    private Long userId;
    private String userName;
    private String productName;
    private String comment;
    private Date commentDate;

    public ProductCommentByUserDto(Long kullaniciId, String kullaniciAdi, String urunAdi, String yorum, Date yorumTarihi) {
        this.userId = kullaniciId;
        this.userName = kullaniciAdi;
        this.productName = urunAdi;
        this.comment = yorum;
        this.commentDate = yorumTarihi;
    }

    public Long getKullaniciId() {
        return userId;
    }

    public void setKullaniciId(Long kullaniciId) {
        this.userId = kullaniciId;
    }

    public String getKullaniciAdi() {
        return userName;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.userName = kullaniciAdi;
    }

    public String getUrunAdi() {return productName;}

    public void setUrunAdi(String urunAdi) {
        this.productName = urunAdi;
    }

    public String getYorum() {
        return comment;
    }

    public void setYorum(String yorum) {
        this.comment = yorum;
    }

    public Date getYorumTarihi() {
        return commentDate;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.commentDate = yorumTarihi;
    }

    @Override
    public String toString() {
        return "UrunYorumByKullanici{" +
                "kullaniciId=" + userId +
                ", kullaniciAdi='" + userName + '\'' +
                ", urunAdi='" +  + '\'' +
                ", yorum='" + comment + '\'' +
                ", yorumTarihi=" + commentDate +
                '}';
    }
}

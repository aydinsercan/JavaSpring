package entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "URUN")
public class Product {
    @SequenceGenerator(name ="generator", sequenceName = "URUN_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(length = 50,name = "ADI")
    private String adi;

    @Column(name = "FIYAT", precision = 19, scale = 2)
    private BigDecimal fiyat;

    @Column(name = "KAYIT_TARIHI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kayittarihi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_KATEGORI", foreignKey = @ForeignKey(name = "FK_URUN_KATEGORI_ID"))
    private Kategory kategory;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Date getKayittarihi() {
        return kayittarihi;
    }

    public void setKayittarihi(Date kayittarihi) {
        this.kayittarihi = kayittarihi;
    }

    public Kategory getKategori() {
        return kategory;
    }

    public void setKategori(Kategory kategory) {
        this.kategory = kategory;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", fiyat=" + fiyat +
                ", kayittarihi=" + kayittarihi +
                ", kategory=" + kategory +
                '}';
    }
}

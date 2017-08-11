package LibrarySoftware;

public abstract class Item {
    private int literatureId;
    private String literatureType;
    private int qty;
    private String subject;

    public int getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(int literatureId) {
        this.literatureId = literatureId;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public void setLiteratureType(String literatureType) {
        this.literatureType = literatureType;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

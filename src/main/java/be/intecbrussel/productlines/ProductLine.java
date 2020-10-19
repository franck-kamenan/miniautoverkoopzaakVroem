package be.intecbrussel.productlines;

import javax.persistence.*;

@Entity
@Table(name = "productlines")
public class ProductLine {

    @Id
    private int productLine;
    private String textDescription;
    private String htmlDescription;
    private String image;

    public ProductLine() {}

    public ProductLine(int productLine, String textDescription, String htmlDescription) {
        this.productLine = productLine;
        this.textDescription = textDescription;
        this.htmlDescription = htmlDescription;
    }

    public int getProductLine() {
        return productLine;
    }

    public void setProductLine(int productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }
}

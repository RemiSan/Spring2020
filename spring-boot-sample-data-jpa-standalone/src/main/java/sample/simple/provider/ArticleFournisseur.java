package sample.simple.provider;

public class ArticleFournisseur {

	String refArticle;

	float price;

	public ArticleFournisseur(String refArticle, float price) {
		super();
		this.refArticle = refArticle;
		this.price = price;
	}

	public String getRefArticle() {
		return refArticle;
	}

	public void setRefArticle(String refArticle) {
		this.refArticle = refArticle;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

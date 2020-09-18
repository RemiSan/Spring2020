package sample.simple.store;

public class Article {

	String refArticle;

	int quantite;
	
	float price;

	public Article(String refArticle, int quantite, float price) {
		super();
		this.refArticle = refArticle;
		this.quantite = quantite;
		this.price = price;
	}

	public void reduceQuantity(int reduction) {
		quantite -= reduction;
	}

	public void increaseQuantity(int increase) {
		quantite += increase;
	}

	public String getRefArticle() {
		return refArticle;
	}

	public void setRefArticle(String refArticle) {
		this.refArticle = refArticle;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

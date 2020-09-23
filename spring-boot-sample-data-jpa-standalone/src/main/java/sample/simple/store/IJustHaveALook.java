package sample.simple.store;

public interface IJustHaveALook {

	float getPrice(String refArticle);
	boolean isAvailable(String refArticle, int quantite);

}

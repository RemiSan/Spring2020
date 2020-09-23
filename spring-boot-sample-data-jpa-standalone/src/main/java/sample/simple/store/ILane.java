package sample.simple.store;

public interface ILane {

	void addItemToCart(String refArticle, int quantite);
	void pay(String numCB);
}

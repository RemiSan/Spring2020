package sample.simple.provider;

import sample.simple.store.Article;

public interface IProvider {

	float getPrice(String refArticle);
	
	Article order(String refArticle, int quantite);
	
}

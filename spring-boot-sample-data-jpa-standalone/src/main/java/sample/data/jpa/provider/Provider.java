package sample.simple.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import sample.simple.store.Article;

@Component
public class Provider implements IProvider{

	static List<ArticleFournisseur> articles = new ArrayList<ArticleFournisseur>();
	static {
		articles.add(new ArticleFournisseur("ref1", 3.0f));
		articles.add(new ArticleFournisseur("ref2", 5.0f));
		articles.add(new ArticleFournisseur("ref3", 6.0f));
	}
	
	@Override
	public float getPrice(String refArticle) {
		return findArticle(refArticle).getPrice();
	}

	@Override
	public Article order(String refArticle, int quantite) {
		return new Article(refArticle, quantite, (findArticle(refArticle).getPrice() * 1.2f));
	}
	
	private ArticleFournisseur findArticle(String id) {
		for (ArticleFournisseur a : articles) {
			if (a.getRefArticle().equals(id))
				return a;
		}
		return null;
	}

}

package sample.simple.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.simple.bank.IBank;
import sample.simple.provider.IProvider;

@Component
public class Store implements IJustHaveALook, ILane, IFastLane{

	@Autowired
	IBank ibank;
	@Autowired
	IProvider iprovider;
	
	String numCB = "compteStore";
	
	static List<Article> articles = new ArrayList<Article>();
	static {
		articles.add(new Article("ref1", 3, 5.0f));
		articles.add(new Article("ref2", 4, 6.0f));
		articles.add(new Article("ref3", 6, 3.0f));		
	}
	
	List<Article> cart = new ArrayList<Article>();
	
	
	@Override
	public void oneShotOrder(String refArticle, int quantite, String numCB) {
		addItemToCart(refArticle, quantite);
		pay(numCB);
	}
	@Override
	public void addItemToCart(String refArticle, int quantite) {
		if (isAvailable(refArticle, quantite)) {
			cart.add(new Article(refArticle, quantite, findArticle(refArticle).price));
		}else {
			System.out.println("not available");
		}
	}
	@Override
	public void pay(String numCB) {
		float price = 0f;
		for (Article a : cart) {
			Article article = findArticle(a.getRefArticle());
			article.reduceQuantity(a.getQuantite());
			price += a.getPrice() * a.getQuantite();
		}
		ibank.transfert(numCB, this.numCB, price);
	}
	@Override
	public float getPrice(String refArticle) {
		return findArticle(refArticle).getPrice();
	}
	@Override
	public boolean isAvailable(String refArticle, int quantite) {
		return findArticle(refArticle).quantite >= quantite;
	}
	
	private Article findArticle(String ref) {
		for(Article a : articles) {
			if (a.getRefArticle().equals(ref)) {
				return a;
			}
		}
		return null;
	}
	
	
}

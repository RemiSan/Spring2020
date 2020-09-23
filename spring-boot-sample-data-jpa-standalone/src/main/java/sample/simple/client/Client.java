package sample.simple.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.simple.store.IFastLane;
import sample.simple.store.IJustHaveALook;
import sample.simple.store.ILane;

@Component
public class Client implements IRun {

	@Autowired
	IFastLane ifast;
	@Autowired
	ILane ilane;
	@Autowired
	IJustHaveALook ijustlook;
	
	String numCB = "compte1";
	
	@Override
	public void run() {		
		ifast.oneShotOrder("ref1", 2, numCB);
		ijustlook.isAvailable("ref1", 2);
	}

}

package br.com.jmsstudio.tddJava.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Auction {

	private String description;
	private List<Bid> bids;
	
	public Auction(String description) {
		this.description = description;
		this.bids = new ArrayList<Bid>();
	}
	
	public void propoe(Bid bid) {
		bids.add(bid);
	}

	public String getDescription() {
		return description;
	}

	public List<Bid> getBids() {
		return Collections.unmodifiableList(bids);
	}

	
	
}

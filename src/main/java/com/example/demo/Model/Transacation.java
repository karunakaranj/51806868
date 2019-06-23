package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transacation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Transid;
	private Long ToAccount;
	private Long FromAccount;
	private long Amount;
	public int getTransid() {
		return Transid;
	}
	public void setTransid(int transid) {
		Transid = transid;
	}
	public Long getToAccount() {
		return ToAccount;
	}
	public void setToAccount(Long toAccount) {
		ToAccount = toAccount;
	}
	public Long getFromAccount() {
		return FromAccount;
	}
	public void setFromAccount(Long fromAccount) {
		FromAccount = fromAccount;
	}
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long amount) {
		Amount = amount;
	}
	public Transacation() {
		super();
	}
	@Override
	public String toString() {
		return "Transacation [Transid=" + Transid + ", ToAccount=" + ToAccount + ", FromAccount=" + FromAccount
				+ ", Amount=" + Amount + "]";
	}
	
	
	
}

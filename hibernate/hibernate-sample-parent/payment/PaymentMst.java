package com.pack;

import javax.persistence.*;

@Entity
@Table(name = "pay_ment")
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name = "type", discriminatorType =
// DiscriminatorType.STRING)
// @DiscriminatorValue(value = "payment")
public class PaymentMst {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id")
	private int id;
	@Column(name = "bank")
	private String bank;
	@Column(name = "card")
	private String card;
	@Column(name = "ccv")
	private int ccv;
	@Column(name = "email")
	private String email;

	public PaymentMst() {
		setId(id);
		setBank(bank);
		setCcv(ccv);
		setCard(card);
		setEmail(email);

	}

	// public PaymentMst(int i, String string, String string2, int j, String
	// string3) {
	// TODO Auto-generated constructor stub
	// }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getCcv() {
		return ccv;
	}

	public void setCcv(int ccv) {
		this.ccv = ccv;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "PaymentMst [id=" + id + ", bank=" + bank + ", card=" + card + ", ccv=" + ccv + ", email=" + email + "]";
	}

}

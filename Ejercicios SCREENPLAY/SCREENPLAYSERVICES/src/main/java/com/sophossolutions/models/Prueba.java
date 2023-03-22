package com.sophossolutions.models;

public class Prueba {
        private double amount;
        private String base,date;
        
        private Rates rates;
        
        
		public Prueba() {
			super();
		}
		public Prueba(double amount, String base, String date, Rates rates) {
			super();
			this.amount = amount;
			this.base = base;
			this.date = date;
			this.rates = rates;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getBase() {
			return base;
		}
		public void setBase(String base) {
			this.base = base;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public Rates getRates() {
			return rates;
		}
		public void setRates(Rates rates) {
			this.rates = rates;
		}
        
        
}

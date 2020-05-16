package Suthakaran;

class InvoiceItem{
		private String id;
		private String desc;
		private int qty;
		private double unitPrice;
		
		public InvoiceItem(String id, String desc, int qty, double unitPrice) {
			this.id = id;
			this.desc = desc;
			this.qty = qty;
			this.unitPrice = unitPrice;
		}

		public String getId() {
			return id;
		}
		public String getDesc() {
			return desc;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}

		public double getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public double getTotal() {
			return unitPrice*qty;
		}
		public String toString() {
			return "InvoiceItem[id="+this.id+", desc="+this.desc+", qty="+this.qty+", unitPrice"+this.unitPrice+"]";
		}
	}

class Invoice{
	public static void main(String args[]) {
		InvoiceItem invoice=new InvoiceItem("1", "Orange", 25, 30.0);
		System.out.println("Item ID : " + invoice.getId());
		System.out.println("Item Description : " + invoice.getDesc());
		System.out.println("Item Quantity : " + invoice.getQty());
		System.out.println("Item Unit Price : " + invoice.getUnitPrice());
		System.out.println("Total Value of items : " + invoice.getTotal());
		System.out.println("All Details : " + invoice.toString());
		
		
	}
}
package model;

public enum StatusCompra {
	ABERTO(1,"Em Aberto"),
	NEGOCIACAO(2,"Negociacao"),
	VENDIDO(3,"Vendido");
	private int value;
	private String label;

	StatusCompra (int value, String label) {
		this.value = value;
		this.label = label;
	}

	public int getValue() {
		return value;
	}

	public String getLabel() {
		return label;
	}
}

package model;

public enum Funcao {
	ADMIN(1,"Administrador"),
	USUARIO(2,"Usuario");
	private int value;
	private String label;

	Funcao (int value, String label) {
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

package com.condominio.resource;

public interface IFabrica {

	<TTipo>  TTipo crie(Class<TTipo> tipo);
}

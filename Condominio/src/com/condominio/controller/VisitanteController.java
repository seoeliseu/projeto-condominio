package com.condominio.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.condominio.dao.VisitanteDAO;
import com.condominio.entity.VisitanteEntity;
import com.condominio.resource.ConnectionFactory;
import com.condominio.resource.FactoryUtil;

@WebServlet({ "/VisitanteController", "/visitante" })
public class VisitanteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VisitanteController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		VisitanteDAO vsDao = FactoryUtil.getInstance().crie(VisitanteDAO.class);
		
		VisitanteEntity visitante = FactoryUtil.getInstance().crie(VisitanteEntity.class)
		.setNome(request.getParameter("nome"))
		.setBairro(request.getParameter("bairro"))
		.setCep(Float.parseFloat(request.getParameter("cep")))
		.setCpf(Float.parseFloat(request.getParameter("cpf")))
		.setIdParente(Integer.parseInt(request.getParameter("parente")))
		.setNumero(Integer.parseInt(request.getParameter("numero")))
		.setRg(Float.parseFloat(request.getParameter("rg")))
		.setRua(request.getParameter("rua"))
		.setTelefone(request.getParameter("celular"))
		.setUf(request.getParameter("uf"));
		
		vsDao.GraveDados(visitante);
	}

}

package com.condominio.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		RequestDispatcher rd = null;
		VisitanteEntity visitante = FactoryUtil.getInstance().crie(VisitanteEntity.class)
		.setNome(convertaEmString(request.getParameter("nome")))
		.setBairro(convertaEmString(request.getParameter("bairro")))
		.setCep(Long.parseLong(request.getParameter("cep")))
		.setCpf(Long.parseLong(request.getParameter("cpf")))
		.setIdParente(Integer.parseInt(request.getParameter("parente")))
		.setNumero(Integer.parseInt(request.getParameter("numero")))
		.setRg(Long.parseLong(request.getParameter("rg")))
		.setRua(convertaEmString(request.getParameter("rua")))
		.setTelefone(convertaEmString(request.getParameter("celular")))
		.setUf(convertaEmString(request.getParameter("estado")));
	
		if(vsDao.GraveDados(visitante)){
			request.setAttribute("retorno", "Sucesso");
		  rd = request.getRequestDispatcher("/CadastroVisitante.jsp");
		}else{
			request.setAttribute("retorno", "Falha ao gravar o visitante");
			rd = request.getRequestDispatcher("/CadastroVisitante.jsp");
		}
		rd.forward(request, response);
	}

	private String convertaEmString(Object valor){
		return String.valueOf(valor);
	}
}

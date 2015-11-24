package com.condominio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.condominio.entity.VisitanteEntity;
import com.condominio.resource.ConnectionFactory;
import com.condominio.resource.FactoryUtil;
import com.condominio.resource.IPersistencia;

public class VisitanteDAO implements IPersistencia<VisitanteEntity> {

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	@Override
	public boolean GraveDados(VisitanteEntity objeto) {
		conn = FactoryUtil.getInstance().crie(ConnectionFactory.class).getConnection();

		String sql = INSERT + INTO +
				" visitante (VSNOME, VSMOTIVO, VSIDPARENT, VSTEL, VSCPF, VSRUA, VSBAIRRO, VSNUMERO, VSCEP, VSUF, VSRG) " +
				VALUES + " (?,?,?,?,?,?,?,?,?,?,?)";

		try {

			stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, objeto.getNome());
			stmt.setString(2, objeto.getMotivo());
			stmt.setInt(3, objeto.getIdParente());
			stmt.setString(4, objeto.getTelefone());
			stmt.setFloat(5, objeto.getCpf());
			stmt.setString(6, objeto.getRua());
			stmt.setString(7, objeto.getBairro());
			stmt.setInt(8, objeto.getNumero());
			stmt.setFloat(9, objeto.getCep());
			stmt.setString(10, objeto.getUf());
			stmt.setFloat(11, objeto.getRg());


			return this.stmt.execute();

		} catch (SQLException e) {
			throw new RuntimeException();
		}finally{
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public List<VisitanteEntity> ObtenhaDados(VisitanteEntity objeto) {
		List<VisitanteEntity> visitantes = null;
		
		try{
			
			String sql = SELECT + " * " + FROM + " visitante" + WHERE + "vsid = ?";
			stmt = this.conn.prepareStatement(sql);
			stmt.setInt(1, objeto.getId());
			rs = stmt.executeQuery();
			visitantes = new ArrayList<>();
			
			while(rs.next()){
				VisitanteEntity visitante = new VisitanteEntity();
				
				visitante
				.setNome(rs.getString("VSNOME"))
				.setBairro(rs.getString("VSBAIRRO"))
				.setCep(rs.getFloat("VSCEP"))
				.setCpf(rs.getFloat("VSCPF"))
				.setId(rs.getInt("VSID"))
				.setIdParente(rs.getInt("VSIDPARENT"))
				.setMotivo(rs.getString("VSMOTIVO"))
				.setNumero(rs.getInt("VSNUMERO"))
				.setRg(rs.getFloat("VSRG"))
				.setRua(rs.getString("VSRUA"))
				.setTelefone(rs.getString("VSTEL"))
				.setUf(rs.getString("VSUF"));

				visitantes.add(visitante);
			}
			return visitantes;
		}catch(SQLException e){
			throw new RuntimeException();
		}finally{
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}

	@Override
	public boolean AtualizeDados(VisitanteEntity objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Desative(VisitanteEntity objeto) {
		// TODO Auto-generated method stub
		return false;
	}

}

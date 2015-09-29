package com.btrs.dao;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.btrs.model.City;
import com.btrs.model.SourceDestination;
import com.btrs.util.DBUtil;

public class SourceDestDAO implements Serializable {

	
	public List<SourceDestination> getList() throws SQLException {
		String query ="Select * from src-dest ";
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		List<SourceDestination> list = new ArrayList<>();
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			SourceDestination sd = new SourceDestination();
			City source = new City();
			City dest = new City();
			sd.setId(rs.getInt(1));
			source.setId(rs.getInt(2));
			sd.setSource(source);
			dest.setId(rs.getInt(3));
			sd.setDestination(dest);
			list.add(sd);
		}
		return list;
	}
	
	
	public void save(SourceDestination sd) throws SQLException {
		String query = "Insert into src-dest(source,destination) values(?,?)";
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		ps.setInt(1, sd.getSource().getId());
		ps.setInt(2, sd.getDestination().getId());
		ps.executeUpdate();
	}
	
	public void delete(SourceDestination sd) throws SQLException {
		String query ="Delete from src-dest where sd_id = ?";
		PreparedStatement ps =DBUtil.getPreparedStatement(query);
		ps.setInt(1, sd.getId());
		ps.executeUpdate();
	}
	
  }

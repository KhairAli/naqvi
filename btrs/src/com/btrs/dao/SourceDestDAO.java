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
	
	
	
	
  }

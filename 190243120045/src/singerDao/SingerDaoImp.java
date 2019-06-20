package singerDao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dBConnection.DbConnection;
import singClass.Singer;

public class SingerDaoImp implements SingerDao {

	@Override
	public boolean insert(Singer s) {

		Connection con=DbConnection.getConnection();
		String q="insert into singer values(default,?,?,?,?);";
		
		
		try {
		
			
			PreparedStatement prs=con.prepareStatement(q);
		  
			prs.setString(1,s.getFirstname() );
		   prs.setString(2,s.getLastname());
		   prs.setString(3,s.getDob());
		   prs.setString(4,s.getAddress());
		   
		   int rec=prs.executeUpdate();
		   
		   
		    if(rec==1)
		    {
		    	return true;
		    }
		
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			  try {
				con.close();
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			
		  }
		
		return false;
	}

		
}

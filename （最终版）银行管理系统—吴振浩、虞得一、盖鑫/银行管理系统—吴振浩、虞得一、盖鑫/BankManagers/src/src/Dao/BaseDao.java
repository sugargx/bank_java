package src.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
 Connection con;
 PreparedStatement pst;
 ResultSet rs;
 
 public Connection getConn() throws ClassNotFoundException, SQLException
 {
  // 1 加载驱动
  Class.forName("com.mysql.jdbc.Driver");
  // 2 获得数据库的连接
  Connection con =
    DriverManager.getConnection
    ("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf-8", "root", "");
  return con;
 }
 
 public void closeAll() throws SQLException
 {
  if(rs!=null)
  {
   rs.close();
  }
  if(pst!=null)
  {
   pst.close();
  }
  if(con!=null)
  {
   pst.close();
  }
 }
}
package src.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import src.po.Account;

import src.po.Account_record;

public class BankDao extends BaseDao {

    //�ж��˺ź������Ƿ���ȷ
    public int accountExist(int id, String password)  throws ClassNotFoundException, SQLException {
        con = getConn();
        // ����˻���Ϣ
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            int id1 = rs.getInt("id");
            String password1 = rs.getString("password");
            if (id1 == id && password.equals(password1)) {
                return 1;
            }
        }
        return 0;
    }
    
    //�ж��˺��Ƿ����
    public int idExist(int id)  throws ClassNotFoundException, SQLException {
        con = getConn();
        // ����˻���Ϣ
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            int id1 = rs.getInt("id");
            
            if (id1 == id) {
                return 1;
            }
        }
        return 0;
    }
    
    //���֤�ݴ�
        public int id_CardExist(int id_Card)  throws ClassNotFoundException, SQLException {
        con = getConn();
        // ����˻���Ϣ
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            int id_Card1 = rs.getInt("id_Card");
            
            if (id_Card1 == id_Card) {
                return 1;
            }
        }
        return 0;
    }
        
        
        public int id_CardName(int id_Card, String name)  throws ClassNotFoundException, SQLException {
        con = getConn();
        // ����˻���Ϣ
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            int id_Card1 = rs.getInt("id_Card");
            
            if (id_Card1 == id_Card && rs.getString("name").equals(name)) {
                return 1;
            }
        }
        return 0;
    }
    
    //ȡ�����
    public double getMoney(int id)  throws ClassNotFoundException, SQLException {
        con = getConn();
        // ����˻���Ϣ
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            int id1 = rs.getInt("id");
            String password1 = rs.getString("password");
            if (id1 == id) {
                return rs.getDouble("money");
            }
        }
        return -1;
    }

    // ����
    public Account addAccount(Account account) throws ClassNotFoundException, SQLException {
        con = getConn();
        // ��1
        String insertSQL = "insert into account values(null,?,?,'000000',?,?)";
        pst = con.prepareStatement(insertSQL);
        pst.setString(1, account.getName());
        pst.setInt(2, account.getId_Card());
        pst.setDouble(3, account.getMoney());
        
        
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        pst.setString(4, df.format(date));
        int result = pst.executeUpdate();

        // ȡ�÷���id
        int id_default = 0;
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            id_default = rs.getInt("id");
        }
        account.setId(id_default);
        account.setPassword("000000");
        account.setDate(df.format(date));

        // ��2
        if (result == 1) {
            String insertSQL2 = "insert into account_record values(?,null,'addAccount',?,?,'000000','000000')";
            pst = con.prepareStatement(insertSQL2);
            pst.setInt(1, id_default);
            pst.setDouble(2, account.getMoney());
            pst.setString(3, df.format(date));
            pst.executeUpdate();
            closeAll();
            return account;
        }
        return null;

    }

    // ����
    public double delAccount(int id, String password) throws ClassNotFoundException, SQLException {

        con = getConn();
        // ����˻���Ϣ
        Account account = new Account();
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            int id1 = rs.getInt("id");
            String password1 = rs.getString("password");
            if (id1 == id && password.equals(password1)) {
                account.setName(rs.getString("name"));
                account.setId(id);
                account.setMoney(rs.getDouble("money"));
                account.setPassword(password);
            }
        }

        // ȡ�����
        double money_remain = account.getMoney();
        double result2 = reduceMoney(id, account.getMoney(), password);

        // ��1
        String sqldel = "delete from account where id=? AND password=?";
        pst = con.prepareStatement(sqldel);
        pst.setInt(1, account.getId());
        pst.setString(2, account.getPassword());
        int result = pst.executeUpdate();
        // ��2
        if (result == 1) {
            String insertSQL2 = "insert into account_record values(?,null,'delAccount',0,?,?,?)";
            pst = con.prepareStatement(insertSQL2);
            pst.setInt(1, id);
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            pst.setString(2, df.format(date));
            pst.setString(3, account.getPassword());
            pst.setString(4, account.getPassword());
            pst.executeUpdate();
            return money_remain;
        }

        closeAll();
        return -1;
    }

    // �޸�����
    public int changePass(int id, String password, String newPassword1, String newPassword2)
            throws ClassNotFoundException, SQLException {
        con = getConn();

        // ����˻���Ϣ
        Account account = new Account();
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            int id1 = rs.getInt("id");
            String password1 = rs.getString("password");
            if (id1 == id && password.equals(password1)) {
                account.setName(rs.getString("name"));
                account.setId(id);
                account.setMoney(rs.getDouble("money"));
                account.setPassword(password);
            }
        }

        // ��1
        String sqlupdate = "update account set password=? where id=? AND password=? ";
        pst = con.prepareStatement(sqlupdate);
        pst.setString(1, newPassword1);
        pst.setInt(2, id);
        pst.setString(3, password);
        int result = pst.executeUpdate();
        //��2
        if (result == 1) {

            String insertSQL2 = "insert into account_record values(?,null,'changePass',0,?,?,?)";
            pst = con.prepareStatement(insertSQL2);
            pst.setInt(1, account.getId());
            pst.setDouble(2, account.getMoney());
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            pst.setString(2, df.format(date));
            pst.setString(3, password);
            pst.setString(4, newPassword1);
            pst.executeUpdate();
        }

        closeAll();
        return result;
    }

    //��Ǯ
    public double addMoney(int id, double money) throws ClassNotFoundException, SQLException {
        con = getConn();
        //��1
        String updateSQL = "update account set money = ? where id = ?";
        pst = con.prepareStatement(updateSQL);
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            int id1 = rs.getInt("id");
            if (id1 == id) {
                double money1 = rs.getDouble("money");
                pst.setInt(2, id);
                money1 += money;
                pst.setDouble(1, money1);
                int result = pst.executeUpdate();
                //��2
                if (result == 1) {
                    String insertSQL2 = "insert into account_record values(?,null,'addMoney',?,?,?,?)";
                    pst = con.prepareStatement(insertSQL2);
                    pst.setInt(1, id);
                    pst.setDouble(2, money);
                    Date date = new Date();
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    pst.setString(3, df.format(date));
                    pst.setString(4, rs.getString("password"));
                    pst.setString(5, rs.getString("password"));

                    pst.executeUpdate();
                    return money1;

                }
            }
        }

        closeAll();

        return -1;
    }

    //ȡǮ
    public double reduceMoney(int id, double money, String password) throws ClassNotFoundException, SQLException {
        con = getConn();
        //��1
        String updateSQL = "update account set money = ? where id = ? AND password = ?";
        pst = con.prepareStatement(updateSQL);
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        while (rs.next()) {
            int id1 = rs.getInt("id");
            String pas1 = rs.getString("password");
            if (id1 == id && pas1.equals(password)) {
                double money1 = rs.getDouble("money");
                pst.setString(3, password);
                pst.setInt(2, id);
                money1 -= money;
                pst.setDouble(1, money1);
                int result = pst.executeUpdate();
                //��2
                if (result == 1) {
                    String insertSQL2 = "insert into account_record values(?,null,'reduceMoney',?,?,?,?)";
                    pst = con.prepareStatement(insertSQL2);
                    pst.setInt(1, id);
                    pst.setDouble(2, money);
                    Date date = new Date();
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    pst.setString(3, df.format(date));
                    pst.setString(4, rs.getString("password"));
                    pst.setString(5, rs.getString("password"));

                    pst.executeUpdate();
                    return money1;
                }
            }
        }

        closeAll();

        return -1;
    }

    // ת��
    public double transMoney(int id1, double money, String password, int id2) throws ClassNotFoundException, SQLException {
        con = getConn();
        //id1-
        String updateSQL = "update account set money = ? where id = ? AND password = ?";
        pst = con.prepareStatement(updateSQL);
        String sql = "select * from account";
        PreparedStatement pst1 = con.prepareStatement(sql);
        ResultSet rs = pst1.executeQuery();
        int flag = 0;
        while (rs.next()) {
            int tout = rs.getInt("id");
            String pasout = rs.getString("password");
            if (tout == id1 && pasout.equals(password)) {
                double moneyout = rs.getDouble("money");
                pst.setString(3, password);
                pst.setInt(2, id1);
                moneyout -= money;
                pst.setDouble(1, moneyout);
                pst.executeUpdate();

                String insertSQL2 = "insert into account_record values(?,?,'transMoney',?,?,?,?)";
                pst = con.prepareStatement(insertSQL2);
                pst.setInt(1, id1);
                pst.setInt(2, id2);
                pst.setDouble(3, money);
                Date date = new Date();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                pst.setString(4, df.format(date));
                pst.setString(5, rs.getString("password"));
                pst.setString(6, rs.getString("password"));
                pst.executeUpdate();

                //id2+
                String updateSQL2 = "update account set money = ? where id = ?";
                pst = con.prepareStatement(updateSQL2);
                String sql2 = "select * from account";
                PreparedStatement pst2 = con.prepareStatement(sql2);
                ResultSet rs2 = pst2.executeQuery();
                while (rs2.next()) {
                    int tin = rs2.getInt("id");
                    if (tin == id2) {
                        double moneyin = rs2.getDouble("money");
                        pst.setInt(2, id2);
                        moneyin += money;
                        pst.setDouble(1, moneyin);
                        pst.executeUpdate();
                        return moneyout;
                    }
                }

            }

        }

        closeAll();
        return -1;

    }

    //��ѯ��1
    public List<Account> displayInfo(int id, String password) throws ClassNotFoundException, SQLException {
        con = getConn();
        String sql = "select * from account";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        List<Account> accList = new ArrayList<Account>();
        while (rs.next()) {

            if (rs.getInt("id") == id) {
                String pasword1 = rs.getString("password");
                if (password.equals(pasword1)) {
                    //��1
                    Account acc = new Account();
                    acc.setId(rs.getInt("id"));
                    acc.setName(rs.getString("name"));
                    acc.setId_Card(rs.getInt("id_Card"));
                    acc.setMoney(rs.getDouble("money"));
                    acc.setDate(rs.getString("date"));
                    accList.add(acc);
                    //��2
                    String sql2 = "select * from account_record";
                    PreparedStatement pst2 = con.prepareStatement(sql2);
                    ResultSet rs2 = pst2.executeQuery();
                    while (rs2.next()) {
                        if (rs2.getInt("id") == id) {
                            String qtype2 = rs2.getString("type");
                            double qmoney2 = rs2.getDouble("money");
                            String qdate2 = rs2.getString("date");
                            String qpasswordp = rs2.getString("password_past");
                            String qpasswordn = rs2.getString("password_new");
//								System.out.println("��������  �� "+qtype2+"  "+"������� : "+qmoney2+"  "+"����ʱ�� : "+qdate2+"������ : "+qpasswordp+"������ : "+qpasswordn);

                        }
                    }
                    break;
                }
            }
        }
        closeAll();
        return accList;
    }

    //��ѯ��2����Ӧ��1 id�Ĳ�����¼��
    public List<Account_record> displayInfo2(int id, String password) throws ClassNotFoundException, SQLException {
        con = getConn();
        String sql = "select * from account";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        List<Account_record> accrList = new ArrayList<Account_record>();
        while (rs.next()) {
            if (rs.getInt("id") == id) {
                String pasword1 = rs.getString("password");
                if (password.equals(pasword1)) {
                    String sql2 = "select * from account_record";
                    PreparedStatement pst2 = con.prepareStatement(sql2);
                    ResultSet rs2 = pst2.executeQuery();
                    while (rs2.next()) {
                        if (rs2.getInt("id") == id) {
                            Account_record accr = new Account_record();
                            accr.setType(rs2.getString("type"));
                            accr.setMoney(rs2.getDouble("money"));
                            accr.setDate(rs2.getString("date"));
                            accr.setPassword_past(rs2.getString("password_past"));
                            accr.setPassword_new(rs2.getString("password_new"));
                            accrList.add(accr);
                        }
                    }
                    break;
                }
            }
        }
        closeAll();
        return accrList;
    }

    //��ѯ
//	 public void displayInfo(int id, String password) throws SQLException, ClassNotFoundException
//	 {
//		     con = getConn();
//		     String sql = "select * from account";
//		     PreparedStatement pst1 = con.prepareStatement(sql);
//			 ResultSet rs = pst1.executeQuery();
//			 while (rs.next()) {
//				 if(rs.getInt("id") == id)
//				 {
//					 String pasword1 = rs.getString("password");
//					 if(password.equals(pasword1))
//					 {
//						 //��1
//						 int qid = rs.getInt("id");
//						 String qname = rs.getString("name");
//						 double qmoney = rs.getDouble("money");
//						 String qdate = rs.getString("date");
//						 System.out.println("�˺� �� "+qid+"  "+"���� �� "+qname+"  "+"���н�� : "+qmoney+"  "+"�������� : "+qdate);
//						 
//						 //��2
//						 String sql2 = "select * from account_record";
//					     PreparedStatement pst2 = con.prepareStatement(sql2);
//						 ResultSet rs2 = pst2.executeQuery();
//						 while (rs2.next()) {
//							 if(rs2.getInt("id") == id)
//							 {
//								String qtype2 = rs2.getString("type");
//								double qmoney2 = rs2.getDouble("money");
//								String qdate2 = rs2.getString("date");
//								String qpasswordp = rs2.getString("password_past");
//								String qpasswordn = rs2.getString("password_new");
//								System.out.println("��������  �� "+qtype2+"  "+"������� : "+qmoney2+"  "+"����ʱ�� : "+qdate2+"������ : "+qpasswordp+"������ : "+qpasswordn);
//
//							 }
//					     }
//						 break;
//					 }
//				 }
//		     }
//			 
//	}
}

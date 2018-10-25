package db;

/**
 *
 * @author PCPL
 */
import java.util.logging.Level;
import java.util.logging.Logger;



import java.sql.*;
public class conn
{
Connection cn=null;
ResultSet rs=null;
Statement st=null;
public conn()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
cn=DriverManager.getConnection("jdbc:mysql://localhost/db_mobilegallery","root","root");
}
catch(Exception ex)
{
    System.out.println(ex);
}
}
public boolean  insert(String str)
{
    boolean b = false;
try
{
    st=cn.createStatement();
st.executeUpdate(str);
b = true;
}
catch(Exception e)
{

}
    return b;
}
public ResultSet select(String selQry)
{
try
{
 st=cn.createStatement();
 rs=st.executeQuery(selQry);
}
catch (Exception e)
{
}
return rs;
}
    public static void main(String[] args) {
        conn ss= new conn();
        
    }

}

    
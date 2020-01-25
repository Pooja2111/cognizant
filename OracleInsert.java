package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class OracleInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");
	PreparedStatement st=con.prepareStatement("insert into REGIONS values(?,?)");
	st.setInt(1,101);
	st.setString(2, "abc");
	//st.setString(2, "xyz");
	//st.setString(2, "xyz");
	//st.setInt(3,101);
	//st.setString(2, "xyz");
	int i=st.executeUpdate();
	System.out.println(i+"records inserted");
con.close();	
}
catch (Exception e)
{
	System.out.println(e);
}
	}

}
